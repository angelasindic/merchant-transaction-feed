package projects.spring.merchantfeed.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

@SpringBootTest
public class TransactionServiceTests {

    @Autowired
    private TransactionService transactionService;

    @Test
    public void transactionTest() {
        assertThat(transactionService.findAllByAccountNumber(1), hasSize(1));
    }
}
