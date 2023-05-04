package com.example.webstudy.service;

import com.example.webstudy.dto.LoanDTO;
import com.example.webstudy.dto.TodoDTO;

public interface LoanService {

    void register(LoanDTO loanDTO);

    void config(LoanDTO loanDTO);

    LoanDTO getJumin (String jumin);
}
