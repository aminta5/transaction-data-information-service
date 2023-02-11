package io.betterbaniking.transactiondatainformationservice.dtos;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class TransactionDto {

  private String type;
  private LocalDateTime date;
  private long accountNumber;
  private String currency;
  private int amount;
  private String merchantName;
  private String merchantLogo;
}
