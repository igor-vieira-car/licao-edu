package com.example.demo;

package com.example.multiplicacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplicacaoController {

    @Autowired
    private MultiplicacaoService multiplicacaoService;

    @GetMapping("/multiplicar")
    public int multiplicar(@RequestParam int numero1, @RequestParam int numero2) {
        return multiplicacaoService.multiplicar(numero1, numero2);
    }
}
