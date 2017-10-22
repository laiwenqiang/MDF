import org.apache.commons.lang3.reflect.MethodUtils;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by laiwenqiang on 2017/10/21.
 */
public class ProviderReflect {
    public static final ExecutorService executorService = Executors.newCachedThreadPool();

    public static void provider(final Object service, int port) {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                final Socket socket = serverSocket.accept();
                executorService.execute(new Runnable() {
                    public void run() {
                        try {
                            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
                            String methodName = inputStream.readUTF();
                            Object[] args = (Object[]) inputStream.readObject();
                            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                            Object result = MethodUtils.invokeExactMethod(service, methodName, args);
                            outputStream.writeObject(result);
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        } catch (NoSuchMethodException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                socket.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
