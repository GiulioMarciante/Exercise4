package com.exercise4.exercise4.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class NameController {
    @GetMapping("/getName")
    public String getName(@RequestParam String name){
        return "Nome: " + name;
    }
    @PostMapping("/postName")
    public String reverseName(@RequestParam String name) {
        StringBuilder stringReverse = new StringBuilder(name).reverse();
        return "Nome al contrario: " + stringReverse.toString();
    }
}
