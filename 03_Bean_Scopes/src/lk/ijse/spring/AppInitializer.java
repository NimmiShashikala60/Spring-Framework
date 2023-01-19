package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.Pojo1;
import lk.ijse.spring.pojo.Pojo2;
import lk.ijse.spring.pojo.Pojo3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        Pojo1 pojo1 = ctx.getBean(Pojo1.class);
        System.out.println(pojo1);
        Pojo2 pojo2 = ctx.getBean(Pojo2.class);
        System.out.println(pojo2);
        Pojo3 pojo3 = ctx.getBean(Pojo3.class);
        System.out.println(pojo3);
    }
}
