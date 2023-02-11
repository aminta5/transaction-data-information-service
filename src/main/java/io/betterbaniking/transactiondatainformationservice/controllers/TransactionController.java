package io.betterbaniking.transactiondatainformationservice.controllers;

import io.betterbaniking.transactiondatainformationservice.dtos.TransactionDto;
import io.betterbaniking.transactiondatainformationservice.services.TransactionService;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class TransactionController {

  private final TransactionService transactionService;

  @GetMapping(value = "/transactions/{account-number}", produces = "application/json")
  public ResponseEntity<List<TransactionDto>> getAllTransactions(@PathVariable("account-number") long accountNumber) {

    Optional<List<TransactionDto>> resultList = transactionService.findAllByAccountNumber(accountNumber);

    return resultList.map(dtoList -> new ResponseEntity<>(dtoList, HttpStatus.OK))
        .orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
  }
}
