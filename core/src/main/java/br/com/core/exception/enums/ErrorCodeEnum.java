package br.com.core.exception.enums;

public enum ErrorCodeEnum {
    ON0001("Tax Number inválido", "ON-0001"),
    TR0001("Função não disponível para usuário lojista", "TR-0001"),
    TR0002("Saldo indisponível", "TR-0002"),
    TRP001("Pin inválido", "TR-TRP001");


    private String message;
    private String code;

    ErrorCodeEnum(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
