package com.example.webstudy.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoanVO {

    private String number;
    private String address;
    private int 대출일;
    private int 상환예정일;
}
