package com.example.webstudy.service;

import com.example.webstudy.dto.TodoDTO;

import java.util.List;

public interface TodoService {

    void register (TodoDTO todoDTO);

    List<TodoDTO> getAll();

    TodoDTO getOne(Long tno);
}
