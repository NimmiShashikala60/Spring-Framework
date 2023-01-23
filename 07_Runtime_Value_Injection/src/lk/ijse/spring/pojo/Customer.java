package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
//    public Customer(){
//        System.out.println("Default Constructor: Customer:Instantiated");
//    }


//    public Customer(@Value("IJSE") String name){
//        System.out.println("Customer:Instantiated" + name);
//    }

    public Customer(@Value("Dasun,Kasun,Hansi") String names[]){
        System.out.println("Customer:Instantiated" + names);
        for (String name: names){
            System.out.println(name);
        }
    }
}



