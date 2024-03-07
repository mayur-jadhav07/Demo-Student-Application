package com.mayur.demostudentmanagementsystem.Entities;


import com.mayur.demostudentmanagementsystem.Service.AccountId;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(AccountId.class)
public class Account {
    //1st way
    @Id
    private String accountNumber;

    @Id
    private String accountType;

    //2nd way
//    @EmbeddedId
//    private AccountId accountId;
}

