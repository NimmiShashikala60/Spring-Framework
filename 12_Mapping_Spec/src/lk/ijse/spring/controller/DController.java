package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/four")
public class DController {

   //character mapping

    @GetMapping(path = "/C?DEF")
    public String testOne(){
        return "Method One Invoked";
    }

    @GetMapping(path = "/C??DEF")
    public String testTwo(){
        return "Method One Invoked";
    }
}
