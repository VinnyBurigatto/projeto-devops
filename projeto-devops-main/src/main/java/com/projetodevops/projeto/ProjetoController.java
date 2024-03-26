package com.projetodevops.projeto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProjetoController {
    @RequestMapping("/Projeto")
    public String Projeto() {
        return "Hello World";
    }
    



}
