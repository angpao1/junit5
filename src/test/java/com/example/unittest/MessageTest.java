package com.example.unittest;

import com.example.unittest.controllers.PetController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {UnitTestApplication.class})
public class MessageTest {

    @Autowired
    private MessageComponent messageComponent;
    @Autowired
    private PetController petController;

    @Test
    void getMessage() {
        assertEquals("Hello", this.messageComponent.getMessage());
    }

    @Test
    void getPet() {
        assertEquals("Hello", petController.getPet());
    }
}
