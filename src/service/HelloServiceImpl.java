package service;

/**
 * Created by laiwenqiang on 2017/10/21.
 */
public class HelloServiceImpl implements HelloService {

    public String sayHello(String content) {
        return "hello " + content;
    }

}
