package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
@Qualifier("girlOne")
public class Boy {

    @Autowired
    GoodGirl girlOne;
    public Boy(){
        System.out.println("Boy:Instantiated");
    }
    public void chatWithGirl(){
        //Girl girl = new Girl();
        girlOne.chat();
    }

}
