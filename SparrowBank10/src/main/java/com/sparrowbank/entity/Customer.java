package com.sparrowbank.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native", strategy = "native")
    @Column(name = "customer_id")
    private int id;
    private String name;
    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;

    private String pwd;

    private String role;

    @Column(name = "create_dt")
    private Date createDt;

}
