package com.example.webstudy.controller;

import com.example.webstudy.dto.TodoDTO;
import com.example.webstudy.service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/todo")
@Log4j2
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @RequestMapping("/list")
    public void list(Model model) {

        log.info("todo list....");
        model.addAttribute("dtoList", todoService.getAll());
    }

    @GetMapping("/register")
    public void registerGET() {
        log.info("GET todo register....");
    }


    @PostMapping("/register")
    public String registerPost(@Valid TodoDTO todoDTO,
                               BindingResult bindingResult,
                               RedirectAttributes redirectAttributes) {
        log.info("POST todo register....");

        if (bindingResult.hasErrors()) {
            log.info("has errors....");
            return "redirect:/todo/register";
        }

        log.info(todoDTO);

        todoService.register(todoDTO);

        return "redirect:/todo/list";


    }

    @GetMapping("/read")
    public void read (Long tno, Model model) {
        TodoDTO todoDTO = todoService.getOne(tno);
        log.info(todoDTO);

        model.addAttribute("dto", todoDTO);
    }

}
