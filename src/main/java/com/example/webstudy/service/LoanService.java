package com.example.webstudy.service;

import com.example.webstudy.dto.LoanDTO;
import com.example.webstudy.dto.TodoDTO;

import java.util.List;

public interface LoanService {

    void register(LoanDTO loanDTO);

    void config(LoanDTO loanDTO);

    LoanDTO select2(String jumin);
}
