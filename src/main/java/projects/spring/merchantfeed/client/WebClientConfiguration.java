package projects.spring.merchantfeed.client;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@ConfigurationProperties(prefix = "banking.webclient")
@Getter
@Setter
public class WebClientConfiguration {
    private String baseUrl;

    @Bean
    public WebClient webClient(@Autowired WebClient.Builder webClientBuilder) {
        return webClientBuilder.clone()
                .baseUrl(baseUrl)
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }
}

