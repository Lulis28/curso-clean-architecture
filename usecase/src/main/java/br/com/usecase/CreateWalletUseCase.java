package br.com.usecase;

import br.com.core.domain.User;
import br.com.core.domain.Wallet;

public interface CreateWalletUseCase {
    void create(Wallet wallet);
}
