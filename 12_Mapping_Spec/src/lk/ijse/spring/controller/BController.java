package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/three")
public class BController {


//    @GetMapping("/id/{C001}/{Dasun}")
//    public String testOne11(@PathVariable("C001") String id,@PathVariable("Dasun") String name){
//        System.out.println(id+" "+name);
//        return "Post Method Invoked";
//    }
    @GetMapping("/id/{id:[C]{1}[0-9]{3}}/{name:[A-Z]{4}}")
    public String testOne12(@PathVariable String id,@PathVariable String name){
        return "Post Method 1 Invoked 2"+id+" "+name;
    }

    @GetMapping("/id/{id:[B]{2}[0-9]{3}}/{name:[a-z]{5}}")
    public String testOne123(@PathVariable String id,@PathVariable String name){
        return "Post Method 1 Invoked 2"+id+" "+name;
    }
}

