package com.example.mySpringProject.controllers;
 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



 


@RestController
public class StockController {
 
  

  @GetMapping("/greeting")
  public String greeting() {
    return "Hello, Casey!";


    

  }

    

    
  

}

