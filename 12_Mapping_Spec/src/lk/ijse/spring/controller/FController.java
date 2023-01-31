package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/six")
public class FController {

    //character mapping

    @GetMapping(path = "/path/**/A/B")
    public String testOne(){
        return "Method One Invoked";
    }

    @GetMapping(path = "/**/myPath/A/C")
    public String testTwo(){
        return "Method One Invoked";
    }
}
