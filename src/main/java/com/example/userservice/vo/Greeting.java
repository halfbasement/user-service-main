package com.example.userservice.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
public class Greeting {

    @Value("${greeting.message}")
    private String message;
}