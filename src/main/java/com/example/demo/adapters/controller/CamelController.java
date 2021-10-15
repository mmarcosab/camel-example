package com.example.demo.adapters.controller;

import com.example.demo.adapters.camel.CamelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CamelController {

    private final CamelService camelService;

    @GetMapping
    private ResponseEntity testeArquivos(){
        try {
            camelService.transferir();
            return ResponseEntity.ok().body("Deu bom");
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("test-http")
    private ResponseEntity testeHttp(){
        try {
            camelService.getHttp();
            return ResponseEntity.ok().body("Deu bom tbm");
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

}
