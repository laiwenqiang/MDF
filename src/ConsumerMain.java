import service.HelloService;

/**
 * Created by laiwenqiang on 2017/10/22.
 */
public class ConsumerMain {
    public static void main(String[] args) {
        HelloService service = ConsumerProxy.consume(HelloService.class, "127.0.0.1", 8083);
        String result = service.sayHello("laiwenwqiang");
        System.out.println(result);
    }
}
