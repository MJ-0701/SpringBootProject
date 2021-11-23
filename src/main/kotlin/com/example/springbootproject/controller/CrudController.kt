package com.example.springbootproject.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class CrudController {

    @GetMapping("/c/create")
    public fun createController() : String {

        return "c/create"
    }
}