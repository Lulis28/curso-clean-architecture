package br.com.application.usecaseimpl;

import br.com.application.gateway.CreateUserGateway;
import br.com.core.domain.TransactionPin;
import br.com.core.domain.User;
import br.com.core.domain.Wallet;
import br.com.core.exception.EmailException;
import br.com.core.exception.TaxNumberException;
import br.com.core.exception.TransactionPinException;
import br.com.core.exception.enums.ErrorCodeEnum;
import br.com.usecase.*;

import java.math.BigDecimal;

public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private TaxNumberAvaliableUseCase taxNumberAvaliableUseCase;
    private EmailAvaliableUseCase emailAvaliableUseCase;
    private CreateUserGateway createUserGateway;
    private CreateWalletUseCase createWalletUseCase;
    private CreateTransactionPinUseCase createTransactionPinUseCase;

    public CreateUserUseCaseImpl(TaxNumberAvaliableUseCase taxNumberAvaliableUseCase, EmailAvaliableUseCase emailAvaliableUseCase, CreateUserGateway createUserGateway, CreateWalletUseCase createWalletUseCase, CreateTransactionPinUseCase createTransactionPinUseCase) {
        this.taxNumberAvaliableUseCase = taxNumberAvaliableUseCase;
        this.emailAvaliableUseCase = emailAvaliableUseCase;
        this.createUserGateway = createUserGateway;
        this.createWalletUseCase = createWalletUseCase;
        this.createTransactionPinUseCase = createTransactionPinUseCase;
    }

    @Override
    public void create(User user, String pin) throws TaxNumberException, EmailException, TransactionPinException {
        if(!taxNumberAvaliableUseCase.TaxNumberAvaliable((user.getTaxNumber().getValue()))) {
            throw new TaxNumberException(ErrorCodeEnum.ON0002.getMessage(), ErrorCodeEnum.ON0002.getCode());
        }
        if(!emailAvaliableUseCase.emailAvailableEmail(user.getEmail())) {
            throw new EmailException(ErrorCodeEnum.ON0003.getMessage(), ErrorCodeEnum.ON0003.getCode());
        }
        var userSaved = createUserGateway.create(user);

        createWalletUseCase.create(new Wallet(BigDecimal.ZERO, userSaved));
        createTransactionPinUseCase.create(new TransactionPin(userSaved, pin));

    }
}
