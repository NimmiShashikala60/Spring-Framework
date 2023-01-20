package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class GirlOne implements GoodGirl {
    public GirlOne(){
        System.out.println("GirlOne:Instantiated");
    }
    public void chat(){
        System.out.println("hello hello hii");
    }


}
