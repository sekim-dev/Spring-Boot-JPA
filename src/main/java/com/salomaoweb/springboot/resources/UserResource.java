package com.salomaoweb.springboot.resources;

import com.salomaoweb.springboot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
@GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "salomao", "salomao@me.com.br", "1111111111", "123456");
                return ResponseEntity.ok().body(u);
    }
}
