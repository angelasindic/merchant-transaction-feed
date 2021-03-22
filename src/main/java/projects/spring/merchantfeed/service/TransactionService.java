package projects.spring.merchantfeed.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import projects.spring.merchantfeed.client.TransactionApiClient;
import projects.spring.merchantfeed.model.Transaction;
import projects.spring.merchantfeed.repository.MerchantDetailsRepository;

import java.sql.Date;
import java.util.List;
@Slf4j
@Service
@AllArgsConstructor
public class TransactionService {

    private TransactionApiClient transactionApiClient;
    private MerchantDetailsRepository merchantDetailsRepository;


    @CircuitBreaker(name="transactionService", fallbackMethod = "foundNone")
    public List<Transaction> findAllByAccountNumber(Integer accountNumber) {
        var transactions = transactionApiClient.findByAccountNumber(accountNumber);
        transactions.forEach(t -> merchantDetailsRepository.findMerchantLogo(t.getMerchantName()).ifPresent(t::setMerchantLogo));
        return transactions;
    }

    private List<Transaction> foundNone(Integer accountNumber, Throwable throwable) {
        log.info("fallback foundNone called");
        var transaction = new Transaction();
        transaction.setType("ERROR");
        transaction.setAccountNumber(accountNumber);
        return List.of(transaction);
    }
}
