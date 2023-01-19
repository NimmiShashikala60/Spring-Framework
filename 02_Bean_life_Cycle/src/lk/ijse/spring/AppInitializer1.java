package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.Pojo1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        Pojo1 bean = ctx.getBean(Pojo1.class);
        System.out.println(bean);

    }
}