package serializer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by laiwenqiang on 2017/10/29.
 */
public class SerializerEngine implements ISerializer{
    public static final Map<SerializeType, ISerializer> serializerMap = new ConcurrentHashMap<SerializeType, ISerializer>();

    static {
        serializerMap.put(SerializeType.DefaultJavaSerializer, new DefaultJavaSerializer());
        serializerMap.put(SerializeType.HessianSerializer, new HessianSerializer());
    }

    public <T> byte[] serialize(T obj) {
        return new byte[0];
    }

    public <T> T deserialize(byte[] data, Class<T> clazz) {
        return null;
    }
}
