package com.example.movie.controller;

import org.springframework.stereotype.Controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
@RequestMapping("/movie")
public class MovieController {

    @GetMapping("/list")
    public void getList() {
        log.info("영화 리스트 요청");
    }

}
