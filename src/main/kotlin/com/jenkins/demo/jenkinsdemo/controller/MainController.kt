package com.jenkins.demo.jenkinsdemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {

    @GetMapping("/")
    fun hello() = "hello"
}