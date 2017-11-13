package rpc.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by laiwenqiang on 2017/11/13.
 */
public class RmiInvokerClient {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("rmi-rpc-client.xml");
        UserService userService = (UserService) context.getBean("userRmiServiceProxy");
        User user = userService.findByName("kongxuan");
        System.out.println(user.getName() + " " + user.getEmail());

    }
}
