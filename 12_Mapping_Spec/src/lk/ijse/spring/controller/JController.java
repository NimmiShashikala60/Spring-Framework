package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/ten")
public class JController {


    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public String testOne(){
        return "Method One Invoked";
    }
    @GetMapping(headers = {"Content-Type=application/json","Accept=text/html"})
    public String testTwo(){
        return "Method Two Invoked";
    }
}
