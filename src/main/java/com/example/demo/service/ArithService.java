package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ArithService {
    public void isPositive(long a,long b){
       if (a < 0 || b < 0){
           throw new IllegalArgumentException("les nombres doivent être positifs");
        }
    }

    public long add(long a,long b){
        isPositive(a, b);
        return a + b;
    }

    public long substract(long a, long b){
        isPositive(a, b);

        if (a < b){
            throw new IllegalArgumentException("le premier nombre doit être supérieur ou égal au second nombre");
        }
        return a - b;
    }

    public long multiply (long a, long b){
        isPositive(a, b);
        return a * b;
    }

    public long divide(long a, long b){
        isPositive(a, b);

        if (a == 0){
            throw new IllegalArgumentException("0 ne peut-être divisible");
        } else if (b == 0) {
            throw new IllegalArgumentException("la division par 0 est anormale");
        }
        return a / b;
    }
}
