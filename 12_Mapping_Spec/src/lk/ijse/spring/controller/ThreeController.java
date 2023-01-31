package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/three")
public class ThreeController {


//    @GetMapping("/id/{C001}/{Dasun}")
//    public String testOne11(@PathVariable("C001") String id,@PathVariable("Dasun") String name){
//        System.out.println(id+" "+name);
//        return "Post Method Invoked";
//    }
    @GetMapping("/id/{id}/{name}")
    public String testOne12(@PathVariable String id,@PathVariable String name){
        return "Post Method Invoked 2"+id+" "+name;
    }
}
