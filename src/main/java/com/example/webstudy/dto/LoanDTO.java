package com.example.webstudy.dto;

import lombok.*;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoanDTO {
    @NotEmpty
    private String jumin;
    private String address;
    private int loanMoney;
    private String exDate;
}
