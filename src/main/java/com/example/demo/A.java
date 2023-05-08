package com.example.demo;

import lombok.Data;

@Data
public class A {

    public A(){
        for(int i=0;i<200;i++){
            System.out.println(i);
        }
    }
}
