package serializer;

/**
 * Created by laiwenqiang on 2017/10/29.
 */
public class HessianSerializer implements ISerializer{

    public <T> byte[] serialize(T obj) {
        return new byte[0];
    }

    public <T> T deserialize(byte[] data, Class<T> clazz) {
        return null;
    }
}
