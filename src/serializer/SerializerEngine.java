package serializer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by laiwenqiang on 2017/10/29.
 */
public class SerializerEngine {
    public static final Map<SerializeType, ISerializer> serializerMap = new ConcurrentHashMap<SerializeType, ISerializer>();

}
