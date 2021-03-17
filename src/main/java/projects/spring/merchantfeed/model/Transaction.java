package projects.spring.merchantfeed.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class Transaction {
    private String type;
    private Date date;
    private Long accountNumber;
    private String currency;
    private double amount;
    private String merchantName;
    private String merchantLogo;

}
