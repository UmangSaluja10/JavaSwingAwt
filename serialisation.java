import java.io.Serializable;
import java.io.*;

// Serialisation = the process of converting an object into a byte stream.
//                 persists (saves the state) the object after program exits.This byte stream 
// can be saved as a file or sent over a network. Can be sent to a different machine. Byte stream can be saved as a file (.ser)
// which is platform independent. (Think of this as if you're saving a file with the object's information)

// Deserialisation = The reverse process of converting a byte stream into an object.
// (Think of this as if you're loading a saved file).



// notes: 1. childern classes of a parent class that implements Srializable will do so as well
//        2. static fields are not serialized (they belong to the class, not an individual object)
//        3. the class's defination ("class file") itself is not recorded, cast it as th object type 
//        4. Fields declared as "transient" aren't serialized, they're ignored
//        5. serialVersionUID is a unique version ID
public class serialisation {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.name = "Bro";
        user.password = "I<3Pizza";

        FileOutputStream fileOut = new FileOutputStream("C:/Users/dell/Desktop/UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Object Info saved");
    }
}

//                                  Steps to Serialize
//                                  --------------------------------------------------------------------------------------------
//                                  1. Your object class should implement Serializable interface
//                                  2. add import java.io.Serializable;
//                                  3. FileOutputStream fileOut = new FileOutputStream(file path)
//                                  4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
//                                  5. out.writeObject(objectName);
//                                  6. out.close(); fileOut.close();
//                                  --------------------------------------------------------------------------------------------