package com.example.springbootproject.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class IndexController {

    @GetMapping("/")
    public fun indexController() : String {
        return "index.html"
    }

    @GetMapping("/jsp")
    public fun jspTest() : String {
        return "home"
    }

}