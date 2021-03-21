package projects.spring.merchantfeed.model;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Transaction {
    private Integer accountNumber;
    private String type;
    private Date date;
    private String currency;
    private Double amount;
    private String merchantName;
    private String merchantLogo;

}
