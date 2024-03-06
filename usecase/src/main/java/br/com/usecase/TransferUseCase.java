package br.com.usecase;

import br.com.core.domain.Transaction;

public interface TransferUseCase {
    Boolean transfer(Transaction transaction);
}
