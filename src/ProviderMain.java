import service.HelloService;
import service.HelloServiceImpl;

/**
 * Created by laiwenqiang on 2017/10/22.
 */
public class ProviderMain {
    public static void main(String[] args) {
        HelloService service = new HelloServiceImpl();
        ProviderReflect.provider(service, 8083);
    }
}
