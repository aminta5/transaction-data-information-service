package io.betterbaniking.transactiondatainformationservice.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TransactionServiceTest {

  private TransactionService transactionService;

  @BeforeEach
  void setUp() {
    transactionService = new TransactionService();
  }

  @Test
  void findAllByAccountNumber() {
    var resultList = transactionService.findAllByAccountNumber(1L);
    assertFalse(resultList.isEmpty());
    assertEquals(3, resultList.get().size());
  }
}