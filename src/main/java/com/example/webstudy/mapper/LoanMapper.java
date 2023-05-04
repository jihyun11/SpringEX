package com.example.webstudy.mapper;

import com.example.webstudy.domain.LoanVO;
import com.example.webstudy.domain.TodoVO;
import com.example.webstudy.houseloan.Loan;

import java.util.List;

public interface LoanMapper {

    void insert(LoanVO LoanVO);

    void select2(LoanVO loanVO);

}
