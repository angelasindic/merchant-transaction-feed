package projects.spring.merchantfeed.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import projects.spring.merchantfeed.client.TransactionApiClient;
import projects.spring.merchantfeed.model.Transaction;

import java.sql.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class TransactionService {

    private TransactionApiClient transactionApiClient;


    public List<Transaction> findAllByAccountNumber(Integer accountNumber) {
        return transactionApiClient.findByAccountNumber(accountNumber);
//        return List.of(new Transaction(123,"type", Date.valueOf("2020-02-02"), "EURO",
//                100.0, "m1", "m1_logo"));
    }
}
