package br.com.usecase;

import br.com.core.domain.Wallet;

import java.math.BigDecimal;

public interface ConsulteBalanceUseCase {
    BigDecimal consult(Wallet wallet);
}
