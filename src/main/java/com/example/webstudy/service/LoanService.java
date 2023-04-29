package com.example.webstudy.service;

import com.example.webstudy.domain.TodoVO;
import com.example.webstudy.dto.LoanDTO;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    public double loan(LoanDTO loanDTO) {
        /**
         * 1. 사용자 주민번호랑 inputbox (화면에 뜬 상자)에 친 주민번호랑 같은지
         * 2. 주소가 이미 대출이 되어있는 주택인지
         */

        //대출금을 적으면 -> 그 대출금의 60퍼센트만 대출이 되었다고 나오게 하기
        //loanDTO에 있는 대출금 * 0.6만큼을 대출한다

        double money = loanDTO.getLoanMoney() * 0.6;
        return money;







    }
}
