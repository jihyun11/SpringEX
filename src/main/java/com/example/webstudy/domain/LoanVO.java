package com.example.webstudy.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoanVO {

    private String jumin;
    private String address;
    private int loanMoney;
    private String exDate;
}
