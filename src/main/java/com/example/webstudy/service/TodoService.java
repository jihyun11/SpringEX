package com.example.webstudy.service;

import com.example.webstudy.dto.TodoDTO;
import com.sun.tools.javac.comp.Todo;

import java.util.List;

public interface TodoService {

    void register (TodoDTO todoDTO);

    List<TodoDTO> getAll();

    TodoDTO getOne(Long tno);

    void remove(Long tno);

    void modify(TodoDTO todoDTO);


}
