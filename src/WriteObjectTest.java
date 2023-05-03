
import java.io.*;

public class WriteObjectTest implements Serializable {
    int a = 10;
    int b = 20;
    String s="reading object using streams";

    public String toString() {
        return ("a:" + this.a + " b:" + this.b+"\n"+"String:"+s);
    }

    public static void main(String[] args) {
        WriteObjectTest obj = new WriteObjectTest();
        try {
            FileOutputStream fileOut = new FileOutputStream("object.ser");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(obj);
            objOut.close();
            fileOut.close();

            FileInputStream fileIn = new FileInputStream("object.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            WriteObjectTest newObj = (WriteObjectTest) in.readObject();
            in.close();
            fileIn.close();
            System.out.println(newObj.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
