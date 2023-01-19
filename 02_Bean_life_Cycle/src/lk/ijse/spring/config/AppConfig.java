package lk.ijse.spring.config;


import lk.ijse.spring.pojo.Pojo3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {

    @Bean
    public Pojo3 pojo3(){
        return new Pojo3();
    }

}



