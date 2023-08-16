package com.znyar.pastebox.controller;

import com.znyar.pastebox.api.request.PasteboxRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class PasteboxController {

    @GetMapping("/{hash}")
    public String getByHash(@PathVariable String hash) {
        return hash;
    }

    @GetMapping("/")
    public List<String> getPublicPasteBox() {
        return Collections.emptyList();
    }

    @PostMapping("/")
    public String add(@RequestBody PasteboxRequest request) {
        return request.getData();
    }

}
