package com.service.javatestxj.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestJavatestxj {

        JavatestxjDelegate javatestxjDelegate = new JavatestxjDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = javatestxjDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}