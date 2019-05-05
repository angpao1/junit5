package com.example.unittest.controllers;

import com.example.unittest.MessageComponent;
import com.example.unittest.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {

    @Autowired
   private MessageService messageService;

   @GetMapping(path = "/pets", produces = "application/json")
   public String getPet() {
      String response = messageService.getMessage();
      return response;
   }
}
