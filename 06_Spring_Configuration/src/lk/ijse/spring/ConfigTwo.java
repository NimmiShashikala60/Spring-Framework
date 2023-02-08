package lk.ijse.spring;

import lk.ijse.spring.pojo.PojoThree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigTwo {
    public ConfigTwo(){
        System.out.println("ConfigTwo:Instantiated");
    }

    @Bean
    public PojoThree pojoThree(){
        return new PojoThree();
    }
}
