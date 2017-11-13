package rpc.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by laiwenqiang on 2017/11/13.
 */
public class RmiService {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("rmi-rpc-server.xml");
    }
}
