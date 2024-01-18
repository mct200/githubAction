package com.groupeisi.githubaction.controller;

import com.groupeisi.githubaction.Ga;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "Ga",produces = MediaType.APPLICATION_JSON_VALUE)
public class ActionController {
    @GetMapping
    public List<Object> search(){
        return List.of(new Ga(1,"GL",1));
    }
    @PutMapping
    public ResponseEntity<String> create(@RequestBody Ga ga) {

        return new ResponseEntity<>("La ressource a été créée avec succès.", HttpStatus.CREATED);
    }
}
