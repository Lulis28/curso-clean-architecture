package br.com.application.gateway;

import br.com.core.domain.User;

public interface CreateUserGateway {
    User create(User user);
}
