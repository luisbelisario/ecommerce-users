package com.belisario.ecommerceusers.controller;

import com.belisario.ecommerceusers.domain.dto.MessageDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<MessageDto> testController() {
        MessageDto dto = new MessageDto("Users API");

        return  ResponseEntity.ok(dto);
    }
}
