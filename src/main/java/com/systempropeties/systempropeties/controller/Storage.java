package com.systempropeties.systempropeties.controller;

import com.systempropeties.systempropeties.Response;
import com.systempropeties.systempropeties.model.StorageModel;
import com.systempropeties.systempropeties.services.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("key-value")
public class Storage {

    @Autowired
    StorageService storageService;

    @PostMapping
    public ResponseEntity<Response> create(@RequestBody @Validated StorageModel storageModel) {
        Response response = new Response();

        response.setSuccess(true);
        response.setMessage("Created");
        response.setData(storageService.create(storageModel));

        return ResponseEntity
                .status(201)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Response> findById(@PathVariable("id") String id) {
        Response response = new Response();

        response.setData(storageService.findById(id));
        response.setMessage("");
        response.setSuccess(true);

        return ResponseEntity
                .status(200)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }
}
