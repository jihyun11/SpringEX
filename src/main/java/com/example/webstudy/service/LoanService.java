package com.example.webstudy.service;

import com.example.webstudy.dto.LoanDTO;
import org.springframework.stereotype.Service;

public interface LoanService {

    void register(LoanDTO loanDTO);
}
