package projects.spring.merchantfeed.service;

import com.acme.banking.model.OBActiveOrHistoricCurrencyAndAmount9;
import com.acme.banking.model.OBCreditDebitCode1;
import com.acme.banking.model.OBMerchantDetails1;
import com.acme.banking.model.OBTransaction6;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OBTransactionAdapterTests {


    final OBTransactionAdapter adapter = new OBTransactionAdapter();

    @Test
    public void testNullMerchant() {
        var ob = new OBTransaction6();
        ob.setAccountId("1234567");
        ob.setCreditDebitIndicator(OBCreditDebitCode1.DEBIT);
        ob.setAmount(amount());
        var t = adapter.adapt(ob);
        assertEquals(null, t.getMerchantName());
    }

    @Test
    public void testMerchant() {
        var ob = new OBTransaction6();
        ob.setAccountId("1234567");
        ob.setCreditDebitIndicator(OBCreditDebitCode1.DEBIT);
        ob.setAmount(amount());
        ob.setMerchantDetails(merchantDetails());
        var t = adapter.adapt(ob);
        assertEquals("acme", t.getMerchantName());
    }

    @Test
    public void testInvalidAmount() {
        var ob = new OBTransaction6();
        ob.setAccountId("1234567");
        ob.setCreditDebitIndicator(OBCreditDebitCode1.DEBIT);
        ob.setAmount(invalidAmount());
        var t = adapter.adapt(ob);
        assertEquals(0.0d, t.getAmount());
    }

    @Test
    public void testAmount() {
        var ob = new OBTransaction6();
        ob.setAccountId("1234567");
        ob.setCreditDebitIndicator(OBCreditDebitCode1.DEBIT);
        ob.setAmount(amount());
        var t = adapter.adapt(ob);
        assertEquals(100.0d, t.getAmount());
    }

    private OBActiveOrHistoricCurrencyAndAmount9 amount() {
        var amount = new OBActiveOrHistoricCurrencyAndAmount9();
        amount.setAmount("100.00");
        amount.setCurrency("USD");
        return amount;
    }

    private OBActiveOrHistoricCurrencyAndAmount9 invalidAmount() {
        var amount = new OBActiveOrHistoricCurrencyAndAmount9();
        amount.setCurrency("100.00");
        amount.setAmount("USD");
        return amount;
    }

    private OBMerchantDetails1 merchantDetails() {
        var m = new OBMerchantDetails1();
        m.setMerchantName("acme");
        m.setMerchantCategoryCode("25");
        return m;
    }
}

