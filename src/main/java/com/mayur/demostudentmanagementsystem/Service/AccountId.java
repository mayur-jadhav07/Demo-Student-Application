package com.mayur.demostudentmanagementsystem.Service;

import jakarta.persistence.Embeddable;
import jakarta.persistence.IdClass;

import java.io.Serializable;
import java.util.Objects;

//@Embeddable

public class AccountId implements Serializable {
    private String accountNumber;
    private String accountType;

    // default constructor

    public AccountId(String accountNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    // equals() method

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AccountId accountId = (AccountId) obj;
        return Objects.equals(accountNumber, accountId.accountNumber) &&
                Objects.equals(accountType, accountId.accountType);
    }

    // hashCode() method

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountType);
    }
}
