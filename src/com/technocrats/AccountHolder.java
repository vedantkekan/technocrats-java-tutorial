package com.technocrats;

import java.io.Serializable;

public class AccountHolder implements Serializable {

    private static final long serialVersionUID = 1L;

    String name;
    transient String accountNumber;
    String balance;

    public AccountHolder(String name, String accountNumber, String balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
       return "AccountHolder{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
