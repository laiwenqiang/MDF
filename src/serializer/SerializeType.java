package serializer;

/**
 * Created by laiwenqiang on 2017/10/29.
 */
public enum SerializeType {

    DefaultJavaSerializer("DefaultJavaSerializer"),
    HessianSerializer("HessianSerializer"),
    JSONSerializer("JSONSerializer"),
    XmlSerializer("XmlSerializer"),
    AvroSerializer("AvroSerializer"),
    ProtocoBufferSerializer("ProtocoBufferSerializer"),
    ThriftSerializer("ThriftSerializer");

    private String serializeType;

    private SerializeType(String serializeType) {
        this.serializeType = serializeType;
    }

}
