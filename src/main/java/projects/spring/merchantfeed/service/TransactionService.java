package projects.spring.merchantfeed.service;

import org.springframework.stereotype.Service;
import projects.spring.merchantfeed.model.Transaction;

import java.sql.Date;
import java.util.List;

@Service
public class TransactionService {

    public List<Transaction> findAllByAccountNumber(Long accountNumber) {
        return List.of(new Transaction("type", Date.valueOf("2020-01-01"), accountNumber, "EURO",
                100.0, "m1", "m1_logo"));
    }
}
