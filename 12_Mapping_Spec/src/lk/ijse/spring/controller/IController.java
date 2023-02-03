package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/nine")
public class IController {


    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public String testOne(){
        return "Method One Invoked";
    }
    @GetMapping(produces = {"text/html"})
    public String testTwo(){
        return "Method Two Invoked";
    }
}
