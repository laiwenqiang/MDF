package framework;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by laiwenqiang on 2017/11/15.
 */
public class ProviderFactoryBean implements FactoryBean, InitializingBean {

    // 服务接口
    private Class<?> serviceItf;
    // 服务实现
    private Object serviceObject;
    // 服务端口
    private String serverPort;
    // 服务超时时间
    private long timeout;
    // 服务代理对象，暂时没有用到
    private Object serviceProxyObject;
    // 服务提供者唯一标示
    private String appKey;
    // 服务分组组名
    private String groupName = "default";
    // 服务提供者权重，默认为1， 范围【1-100】
    private int weight = 1;
    // 服务端线程数，默认为10个
    private int workerThreads = 10;


    public Object getObject() throws Exception {
        return serviceProxyObject;
    }

    public Class<?> getObjectType() {
        return serviceItf;
    }

    public boolean isSingleton() {
        return true;
    }

    public void afterPropertiesSet() throws Exception {
        // 启动Netty服务器


    }
}
