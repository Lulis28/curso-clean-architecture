package br.com.usecase;

import br.com.core.domain.Transaction;

public interface UserNotificationUseCase {
    Boolean notifyUser(Transaction transaction, String email);
}
