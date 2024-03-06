package br.com.core.exception;

public class TaxNumberException extends Exception{
    private String message;
    private String code;

    public TaxNumberException(String message, String code) {
        super(message);
        this.code = code;
    }


}
