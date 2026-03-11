import java.io.Serializable;
import java.io.*;

public class deserialisation {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("C:/Users/dell/Desktop/UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        User user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }
}

//                                  Steps to deserialize
//                                  --------------------------------------------------------------------------------------------
//                                  1. Declare your object (don't instantiate)
//                                  2. Your class should implement Serializable interface
//                                  3. add import java.io.Serializable;
//                                  4. FileInputStream fileIn = new FileInputStream(file path)
//                                  5. ObjectInputStream In = new ObjectInputStream(fileIn);
//                                  6. objectName = (Class)In.readObject();
//                                  7. in.close(); fileIn.close();
//                                  --------------------------------------------------------------------------------------------