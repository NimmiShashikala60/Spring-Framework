package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/seven")
public class GController {

    //character mapping

    @GetMapping(params = {"id","name"})
    public String testOne(@RequestParam String id,@RequestParam String name){
        return "Method One Invoked"+id+" "+name;
    }

//    @GetMapping(params = {"address","salary"})
//    public String testTwo(HttpServletRequest request){
//        String address=request.getParameter("address");
//        return "Method Two Invoked"+address;
//    }
@GetMapping(params = {"address","salary"})
public String testTwo(@RequestParam String address,@RequestParam String salary){
    return "Method Two Invoked"+address+" "+salary;
   }
}
