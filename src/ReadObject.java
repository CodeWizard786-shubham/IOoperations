import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream f1 = new FileInputStream("test.txt");
            ObjectInputStream ObjIn=new ObjectInputStream(f1);
            WriteObject s=(WriteObject)ObjIn.readObject();
            System.out.println(s);
            ObjIn.close();
        } catch (Exception e) {
          e.printStackTrace();
        }
    }
}
