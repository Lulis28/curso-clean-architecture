package br.com.usecase;

import br.com.core.domain.User;
import br.com.core.exception.EmailException;
import br.com.core.exception.TaxNumberException;
import br.com.core.exception.TransactionPinException;

public interface CreateUserUseCase {
    void create(User user, String pin) throws TaxNumberException, EmailException, TransactionPinException;
}
