package com.example.webstudy.service;

import com.example.webstudy.dto.PageRequestDTO;
import com.example.webstudy.dto.PageResponseDTO;
import com.example.webstudy.dto.TodoDTO;
import com.sun.tools.javac.comp.Todo;

import java.util.List;

public interface TodoService {

    void register (TodoDTO todoDTO);

//    List<TodoDTO> getAll();

    PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);

    TodoDTO getOne(Long tno);

    void remove(Long tno);

    void modify(TodoDTO todoDTO);



}
