package com.platzi.market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class HolaMundoController {

    @GetMapping("/hola")
    private String HolaMundo(){
        return "Hola Mundo";
    }
}
