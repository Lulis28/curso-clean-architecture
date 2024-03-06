package br.com.usecase;

import br.com.core.domain.Transaction;

public interface CreateTransationUseCase {
    void create(Transaction transaction);
}
