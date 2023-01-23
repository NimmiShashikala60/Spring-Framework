package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBConnection implements InitializingBean {
    @Value("${os.name}")
    private String myOSName;

    @Value("${user}")
    private String myUserName;

    @Value("${db.user.name}")
    private String dbUserName;

    @Value("${db.user.password}")
    private String dbPassword;

    @Value("${user.email}")
    private String userEmail;

    public DBConnection(){
        System.out.println("DBConnection:Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(myOSName);
        System.out.println(myUserName);
        System.out.println("===============");
        System.out.println(dbUserName);
        System.out.println(dbPassword);
        System.out.println(userEmail);
    }
}
