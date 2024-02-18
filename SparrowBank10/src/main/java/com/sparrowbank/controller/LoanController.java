package com.sparrowbank.controller;

import com.sparrowbank.entity.Loans;
import com.sparrowbank.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/myLoan")
public class LoanController {
    @Autowired
    private LoanRepository loanRepository;

    @GetMapping("/myLoans")
    public List<Loans> getLoanDetails(@RequestParam int id) {
        List<Loans> loans = loanRepository.findByCustomerIdOrderByStartDtDesc(id);
        if (loans != null ) {
            return loans;
        }else {
            return null;
        }
    }

}