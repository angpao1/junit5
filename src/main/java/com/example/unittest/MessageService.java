package com.example.unittest;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String getMessage() {
        return "{\"message\":\"Hello\"}";
    }
}
