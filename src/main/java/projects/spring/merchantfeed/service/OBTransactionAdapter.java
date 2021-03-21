package projects.spring.merchantfeed.service;


import com.acme.banking.model.OBTransaction6;
import projects.spring.merchantfeed.model.Transaction;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.function.Function;

public class OBTransactionAdapter {

    public Transaction adaptOld(OBTransaction6 transaction) {
      Transaction tr = new Transaction();
      tr.setAccountNumber(Integer.valueOf(transaction.getTransactionId()));
      tr.setType(transaction.getCreditDebitIndicator().getValue());
      BigDecimal amount = new BigDecimal(transaction.getAmount().getAmount()).multiply(transaction.getCurrencyExchange().getExchangeRate());
      tr.setCurrency(transaction.getCurrencyExchange().getUnitCurrency());
      tr.setAmount(amount.doubleValue());
      tr.setMerchantName(transaction.getMerchantDetails().getMerchantName());
      return tr;
    }

    public Transaction adapt(final OBTransaction6 transaction6) {
        return transactionFunction.apply(transaction6);
    }

    private Function<OBTransaction6, Transaction> transactionFunction = obTransaction6 -> {
        var t = new Transaction();
        t.setAccountNumber(Integer.valueOf(obTransaction6.getAccountId()));

        var amount = lift(obTransaction6, o -> Double.valueOf(o.getAmount().getAmount()));
        var fx = lift(obTransaction6, o -> o.getCurrencyExchange().getExchangeRate().doubleValue());
        t.setAmount(amount.orElse(0.0) * fx.orElse(1.0));

        lift(obTransaction6, o -> obTransaction6.getCurrencyExchange().getUnitCurrency())
                .ifPresent(t::setCurrency);
        lift(obTransaction6, o -> obTransaction6.getCreditDebitIndicator().toString())
                .ifPresent(t::setType);
        lift(obTransaction6, o -> obTransaction6.getMerchantDetails().getMerchantName())
                .ifPresent(t::setMerchantName);
        return t;
    };

    private <T> Optional<T> lift(final OBTransaction6 transaction6, Function<OBTransaction6, T> func) {
        try {
            return Optional.of(func.apply(transaction6));
        } catch (Exception ex) {
            return Optional.empty();
        }
    }

}