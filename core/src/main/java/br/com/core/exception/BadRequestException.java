package br.com.core.exception;

public class BadRequestException extends Exception{
    private String message;
    private String code;

    public BadRequestException(String message, String code) {
        super(message);
        this.code = code;
    }


}
