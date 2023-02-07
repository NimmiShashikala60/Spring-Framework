package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    public CustomerController(){
        System.out.println("CustomerController");
    }
    public void callMe(){
        System.out.println("Call Me Method invoked by the web");
    }
}
