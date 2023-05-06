package com.example.webstudy.controller;

import com.example.webstudy.domain.LoanVO;
import com.example.webstudy.dto.LoanDTO;
import com.example.webstudy.dto.PageRequestDTO;
import com.example.webstudy.dto.TodoDTO;
import com.example.webstudy.houseloan.Loan;
import com.example.webstudy.service.LoanServicempl;
import com.example.webstudy.service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("/todo")
@Log4j2
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;
    private final LoanServicempl loanService;


    @GetMapping("/loan")
    public void loanGet(LoanDTO loanDTO) {

        log.info("{}",loanDTO);

    }

    @PostMapping("/loan")
    public String loanPost(LoanDTO loanDTO, RedirectAttributes redirectAttributes) {
        log.info("Post loan todo register....");

        log.info(loanDTO);
        loanService.register(loanDTO);

        return "redirect:/todo/loanconfig";

    }

//    @GetMapping("/loanresult")
//    public void loanResultGet(LoanDTO loanDTO) {
//
//        log.info("{}",loanDTO);
//
//    }

    @GetMapping("/loanresult")
    public void loanResultGet(@RequestParam (value = "jumin") String jumin, Model model) {
        log.info("Post loan todo register....");

        log.info(jumin);
        LoanDTO loanDTO = loanService.select2(jumin);
        log.info(loanDTO);

        model.addAttribute("loanDTO", loanDTO);

    }


    @GetMapping("/loanconfig")
    public void loanConfigGet(LoanDTO loanDTO) {

        log.info("{}",loanDTO);

    }

    @PostMapping("/loanconfig")
    public String loanConfigPost(@ModelAttribute("loanDTO") LoanDTO loanDTO, RedirectAttributes redirectAttributes) {
        log.info("Post loan todo register....");

//        log.info(loanDTO);
//        loanService.config(loanDTO);
//
//        redirectAttributes.addAttribute("jumin", loanDTO.getJumin());
        return "redirect:/todo/loanresult?jumin=" + loanDTO.getJumin();
    }


//    @PostMapping("/loanconfig")
//    public String loanConfigPost(LoanDTO loanDTO, RedirectAttributes redirectAttributes) {
//        log.info("Post loan todo register....");
//
//        log.info(loanDTO);
//        loanService.config(loanDTO);
//
//        return "redirect:/todo/loanresult";
//    }






    @GetMapping("/list")
    public void list(@Valid PageRequestDTO pageRequestDTO, BindingResult bindingResult, Model model) {
        log.info(pageRequestDTO);

        if(bindingResult.hasErrors()) {
            pageRequestDTO = PageRequestDTO.builder().build();

        }
        model.addAttribute("responseDTO", todoService.getList(pageRequestDTO));
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

    @GetMapping({"/read", "/modify"})
    public void read (Long tno, Model model) {
        TodoDTO todoDTO = todoService.getOne(tno);
        log.info(todoDTO);

        model.addAttribute("dto", todoDTO);
    }

    @PostMapping("/remove")
    public String remove(Long tno, RedirectAttributes redirectAttributes) {
        log.info("------remove------");
        log.info("tno: " + tno);

        todoService.remove(tno);

        return "redirect:/todo/list";
    }

    @PostMapping("/modify")
    public String modify(@Valid TodoDTO todoDTO,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            log.info("has errors....");
            redirectAttributes.addFlashAttribute("errors", bindingResult.getAllErrors());
            redirectAttributes.addAttribute("tno", todoDTO.getTno());
            return "redirect:/todo/modify";
        }

        log.info(todoDTO);

        todoService.modify(todoDTO);

        return "redirect:/todo/list";
    }


}
