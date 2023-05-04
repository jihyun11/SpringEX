package com.example.webstudy.mapper;

import com.example.webstudy.domain.LoanVO;
import com.example.webstudy.domain.TodoVO;

public interface LoanMapper {

    void insert(LoanVO LoanVO);

    void select(LoanVO loanVO);

    LoanVO getjumin(String jumin);
}
