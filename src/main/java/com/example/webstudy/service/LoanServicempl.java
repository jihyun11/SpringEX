package com.example.webstudy.service;

import com.example.webstudy.domain.LoanVO;
import com.example.webstudy.dto.LoanDTO;
import com.example.webstudy.mapper.LoanMapper;
import com.example.webstudy.mapper.TodoMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class LoanServicempl implements LoanService{

    private final LoanMapper loanMapper;

    private final ModelMapper modelMapper;


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

    @Override
    public void register(LoanDTO loanDTO) {
        log.info(modelMapper);
        LoanVO loanVO = modelMapper.map(loanDTO, LoanVO.class);
        log.info(loanVO);

        loanMapper.insert(loanVO);

    }

    @Override
    public void config(LoanDTO loanDTO) {
        log.info(modelMapper);
        LoanVO loanVO = modelMapper.map(loanDTO, LoanVO.class);
        log.info(loanDTO);

        loanMapper.select(loanVO);
    }
}
