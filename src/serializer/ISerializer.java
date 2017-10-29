package serializer;

/**
 * Created by laiwenqiang on 2017/10/29.
 */
public interface ISerializer {
    public <T> byte[] serialize(T obj);

    public <T> T deserialize(byte[] data, Class<T> clazz);
}
