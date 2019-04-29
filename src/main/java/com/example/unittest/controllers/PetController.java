package com.example.unittest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {
   @GetMapping("/pets")
   public String getPet() {
      return "Pet";
   }
}
