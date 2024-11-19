package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MultiplicacaoService {

    public int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }
}
