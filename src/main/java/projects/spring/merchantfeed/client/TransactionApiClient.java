package projects.spring.merchantfeed.client;

import projects.spring.merchantfeed.model.Transaction;

import java.util.List;

public interface TransactionApiClient {

    List<Transaction> findByAccountNumber(Integer accountNumber);
}
