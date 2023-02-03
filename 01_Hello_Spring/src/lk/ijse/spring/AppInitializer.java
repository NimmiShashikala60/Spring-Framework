package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.BasicDataSource;
import lk.ijse.spring.pojo.Customer;
import lk.ijse.spring.pojo.DBConnection;
import lk.ijse.spring.pojo.Pojo1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static <Customer> void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Customer c1= ctx.getBean(Customer.class);
        System.out.println(c1);
        Customer c2= ctx.getBean(Customer.class);
        System.out.println(c2);
        c1.getCustomerName();


        DBConnection db1 = ctx.getBean(DBConnection.class);
        DBConnection db2 = ctx.getBean(DBConnection.class);
        System.out.println(db1);
        System.out.println(db2);

        BasicDataSource bean1 = ctx.getBean(BasicDataSource.class);
        BasicDataSource bean2 = ctx.getBean(BasicDataSource.class);
        System.out.println(bean1);
        System.out.println(bean2);

        System.out.println("========Bean ID=======");

        Customer customer = (Customer) ctx.getBean("customer");//cast
        System.out.println(customer);

        Pojo1 pojoOne = (Pojo1) ctx.getBean("pojoOne");
        System.out.println(pojoOne);
        BasicDataSource dd = (BasicDataSource) ctx.getBean("dd");
        System.out.println(dd);


//        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("JVM is about to shad down");
//            }
//        }));


       // ctx.close();
        ctx.registerShutdownHook();

        Customer bean = ctx.getBean(Customer.class);
        System.out.println(bean);


    }
}
