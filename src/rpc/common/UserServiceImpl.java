package rpc.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by laiwenqiang on 2017/11/11.
 */
public class UserServiceImpl implements UserService {

    private static final Map<String, User> userMap = new HashMap<String, User>();

    static {
        userMap.put("kongxuan", new User("kongxuan", "kongxuan@163.com"));
        userMap.put("liyebing", new User("liyebing", "liyebing@163.com"));
    }

    public User findByName(String userName) {
        return userMap.get(userName);
    }
}
