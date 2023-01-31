package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/eight")
public class HController {


  @GetMapping(consumes = {"application/json"})
   public String testOne(){
       return "Method One Invoked";
   }
   @GetMapping(consumes = {"text/html"})
    public String testTwo(){
        return "Method Two Invoked";
    }
}
