package serializer;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by laiwenqiang on 2017/10/29.
 */
public enum SerializeType {

    DefaultJavaSerializer("DefaultJavaSerializer"),
    HessianSerializer("HessianSerializer");

    private String serializeType;

    SerializeType(String serializeType) {
        this.serializeType = serializeType;
    }

    public static SerializeType quaryByType(String serializeType) {
        if (StringUtils.isBlank(serializeType)) {
            return null;
        }
        for (SerializeType serialize : SerializeType.values()) {
            if (StringUtils.equals(serialize.getSerializeType(), serializeType)) {
               return serialize;
            }
        }
        return null;
    }

    public String getSerializeType() {
        return serializeType;
    }


}
