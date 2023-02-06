package src.lk.ijse.spring;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import src.lk.ijse.spring.config.WebAppConfig;
import src.lk.ijse.spring.config.WebRootConfig;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
