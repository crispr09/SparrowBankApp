package com.sparrowbank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Accounts {
    @Column(name = "customer_id")
    private int customerId;

    @Id
    @Column(name = "account_number")
    private int id;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "branch_address")
    private String branchAdd;

    //todo - fix date later
    @Column(name = "create_dt")
    private String createDt;

}
