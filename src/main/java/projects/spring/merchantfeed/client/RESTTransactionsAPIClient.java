package projects.spring.merchantfeed.client;

import com.acme.banking.model.OBReadTransaction6;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import projects.spring.merchantfeed.model.Transaction;
import projects.spring.merchantfeed.service.OBTransactionAdapter;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class RESTTransactionsAPIClient implements TransactionApiClient {

    private WebClient webClient;
    private final OBTransactionAdapter adapter = new OBTransactionAdapter();


    @Override
    public List<Transaction> findByAccountNumber(Integer accountNumber) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .pathSegment("accounts")
                        .pathSegment(accountNumber.toString())
                        .pathSegment("transactions")
                        .build())
                .retrieve()
                .bodyToMono(OBReadTransaction6.class)
                .map(this::apply)
                .timeout(Duration.ofSeconds(5))
                //.onErrorReturn(Collections.emptyList())
                .block();
    }

    private List<Transaction> apply(OBReadTransaction6 t) {
        return t.getData().getTransaction().stream().map(adapter::adapt).collect(Collectors.toList());
    }

    ///accounts/{AccountId}/transactions
}
