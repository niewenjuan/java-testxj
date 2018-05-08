package com.service.javatestxj.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-05-08T08:36:03.349Z")

@RestSchema(schemaId = "javatestxj")
@RequestMapping(path = "/java-testxj", produces = MediaType.APPLICATION_JSON)
public class JavatestxjImpl {

    @Autowired
    private JavatestxjDelegate userJavatestxjDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userJavatestxjDelegate.helloworld(name);
    }

}
