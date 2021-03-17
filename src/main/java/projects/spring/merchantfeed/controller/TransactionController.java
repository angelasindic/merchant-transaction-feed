package projects.spring.merchantfeed.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import projects.spring.merchantfeed.model.Transaction;
import projects.spring.merchantfeed.service.TransactionService;

import java.util.List;

@RestController
@RequestMapping(path="/transactions", produces = "application/json")
@AllArgsConstructor
public class TransactionController {

    private TransactionService transactionService;

    @GetMapping("/{accountNumber}")
    List<Transaction> transactionsByAccountNumber(@PathVariable("accountNumber") Long accountNumber) {
        return transactionService.findAllByAccountNumber(accountNumber);
    }
}
