package com.example.webstudy.dto;

import lombok.Builder;

import java.util.List;

public class PageResponseDTO {

    private int page;
    private int size;
    private int total;

    //시작페이지번호
    private int start;
    //끝페이지번호
    private int end;
    //이전페이지존재여부
    private boolean prev;
    //다음페이지존재여부
    private boolean next;
    private List dtoList;

//    @Builder(bilderMethodName = "withAll")
//    public PageResponseDTO(PageRequestDTO pageRequestDTO, List dtoList, int total) {
//
//    }
}
