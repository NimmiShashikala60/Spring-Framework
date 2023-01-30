package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/two")
public class TwoController {

    @GetMapping
    public String testOne1(){
        return "Get Method Invoked 1";
    }
    @GetMapping(path = "/a")
    public String testOne2(){
        return "Get Method Invoked 2";
    }

}
