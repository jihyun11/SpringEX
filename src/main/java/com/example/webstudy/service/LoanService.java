package com.example.webstudy.service;

import com.example.webstudy.domain.TodoVO;
import com.example.webstudy.dto.LoanDTO;

public class LoanService {

    public double 대출() {

        LoanDTO loanDTO1 = new LoanDTO();
        String number = loanDTO1.getNumber();
        if (number.equals("1234")) {
            return 10000;
        } else return -1;


    }
}
