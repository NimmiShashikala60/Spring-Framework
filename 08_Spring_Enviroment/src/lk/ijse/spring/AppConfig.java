package lk.ijse.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
@PropertySource("classpath:application.properties")
@PropertySource("classpath:private.properties")
//@PropertySource("filepath:D:/a/d/private.properties")
public class AppConfig {

}
