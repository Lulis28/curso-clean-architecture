package br.com.core.domain;

import br.com.core.domain.enums.UserTypeEnum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class User {

    private UUID id;
    private String email;
    private String password;
    private TaxNumber taxNumber;
    private String fullname;
    private UserTypeEnum type;
    private TransactionPin transactionPin;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

public User(UUID id, String email, String password, TaxNumber taxNumber, String fullname, UserTypeEnum type, TransactionPin transactionPin, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.taxNumber = taxNumber;
        this.fullname = fullname;
        this.type = type;
        this.transactionPin = transactionPin;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public User(String email, String password, TaxNumber taxNumber, String fullname, UserTypeEnum type, TransactionPin transactionPin, LocalDate createdAt) {
        this.email = email;
        this.password = password;
        this.taxNumber = taxNumber;
        this.fullname = fullname;
        this.type = type;
        this.transactionPin = transactionPin;
    }

    public User() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TaxNumber getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(TaxNumber taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public UserTypeEnum getType() {
        return type;
    }

    public void setType(UserTypeEnum type) {
        this.type = type;
    }

    public TransactionPin getTransactionPin() {
        return transactionPin;
    }

    public void setTransactionPin(TransactionPin transactionPin) {
        this.transactionPin = transactionPin;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }


    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;

        if (getId() != null ? !getId().equals(user.getId()) : user.getId() != null) return false;
        if (getEmail() != null ? !getEmail().equals(user.getEmail()) : user.getEmail() != null) return false;
        if (getPassword() != null ? !getPassword().equals(user.getPassword()) : user.getPassword() != null)
            return false;
        if (getTaxNumber() != null ? !getTaxNumber().equals(user.getTaxNumber()) : user.getTaxNumber() != null)
            return false;
        if (getFullname() != null ? !getFullname().equals(user.getFullname()) : user.getFullname() != null)
            return false;
        if (getType() != user.getType()) return false;
        if (getTransactionPin() != null ? !getTransactionPin().equals(user.getTransactionPin()) : user.getTransactionPin() != null)
            return false;
        if (getCreatedAt() != null ? !getCreatedAt().equals(user.getCreatedAt()) : user.getCreatedAt() != null)
            return false;
        return getUpdatedAt() != null ? getUpdatedAt().equals(user.getUpdatedAt()) : user.getUpdatedAt() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        result = 31 * result + (getTaxNumber() != null ? getTaxNumber().hashCode() : 0);
        result = 31 * result + (getFullname() != null ? getFullname().hashCode() : 0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getTransactionPin() != null ? getTransactionPin().hashCode() : 0);
        result = 31 * result + (getCreatedAt() != null ? getCreatedAt().hashCode() : 0);
        result = 31 * result + (getUpdatedAt() != null ? getUpdatedAt().hashCode() : 0);
        return result;
    }
}
