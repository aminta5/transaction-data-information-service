package io.betterbaniking.transactiondatainformationservice.services;

import io.betterbaniking.transactiondatainformationservice.dtos.TransactionDto;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

  public Optional<List<TransactionDto>> findAllByAccountNumber(long accountNumber) {
    return Optional.of(List.of(new TransactionDto(), new TransactionDto(), new TransactionDto()));
  }
}
