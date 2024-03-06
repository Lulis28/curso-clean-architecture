package br.com.core.exception;

public class NotFoundException extends Exception{
    private String message;
    private String code;

    public NotFoundException(String message, String code) {
        super(message);
        this.code = code;
    }


}
