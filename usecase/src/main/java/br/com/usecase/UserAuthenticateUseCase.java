package br.com.usecase;

public interface UserAuthenticateUseCase {
    Boolean authenticate(String username, String password);
}
