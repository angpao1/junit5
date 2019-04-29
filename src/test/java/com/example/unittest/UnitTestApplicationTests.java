package com.example.unittest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.test.util.AssertionErrors.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UnitTestApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testGetPet() {

    }
}
