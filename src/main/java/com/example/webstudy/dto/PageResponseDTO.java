package com.example.webstudy.dto;

import lombok.Builder;

import java.util.List;

public class PageResponseDTO<E> {

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
    private List<E> dtoList;

    @Builder(builderMethodName = "withAll")
    public PageResponseDTO(PageRequestDTO pageRequestDTO, List<E> dtoList, int total) {
        this.page = pageRequestDTO.getPage();
        this.size = pageRequestDTO.getSize();

        this.total = total;
        this.dtoList = dtoList;

        this.end = (int)(Math.ceil(this.page/ 10.0)) * 10;

        this.start = this.end - 9;

        int last = (int)(Math.ceil((total/(double)size)));

        this.end = end > last ? last : end;

        this.prev = this.start > 1;

        this.next = total > this.end * this.size;


    }

    public List<E> getDtoList() {
        return dtoList;
    }







}
