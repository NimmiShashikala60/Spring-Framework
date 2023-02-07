package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements BeanNameAware, BeanFactoryAware, InitializingBean, ApplicationContextAware, DisposableBean {
    public  SpringBeanOne(){
        System.out.println("SpringBeanOne:Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory:Instantiated");

    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanName:Instantiated");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy:Instantiated");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties:Instantiated");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext:Instantiated");

    }
}
