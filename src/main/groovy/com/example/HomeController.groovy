package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.views.View

@Controller("/")
class HomeController {

    @Get
    @View("index")
    Map<String, Object> index() {
        ["title": "Groovy Web Server", "body": "Welcome to your new Groovy web server!"]
    }
}