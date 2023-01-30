package lk.ijse.spring;

import lk.ijse.spring.config.WebAppconfig;
import lk.ijse.spring.config.WebRootconfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebRootconfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppconfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
