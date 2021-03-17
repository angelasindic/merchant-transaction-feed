package projects.spring.merchantfeed.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import projects.spring.merchantfeed.model.Transaction;
import projects.spring.merchantfeed.service.TransactionService;

import java.sql.Date;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
public class TransactionControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TransactionService transactionService;

    @Test
    public void transactionsShouldReturnTransactionsByAccountNumber() throws Exception {
        List<Transaction> mockResult = List.of(new Transaction("type", Date.valueOf("2020-01-01"), 123L, "EURO",
                100.0, "m1", "m1_logo"));
        when(transactionService.findAllByAccountNumber(123L)).thenReturn(mockResult);
        this.mockMvc.perform(get("/transactions/123"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("type")));
    }


}
