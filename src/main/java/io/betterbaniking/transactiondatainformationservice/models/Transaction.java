package io.betterbaniking.transactiondatainformationservice.models;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Transaction {

  private String type;
  private LocalDateTime date;
  private long accountNumber;
  private Currency currency;
  private int amount;
  private String merchantName;
  private String merchantLogo;

  private enum Currency {
    EUR
  }
}
