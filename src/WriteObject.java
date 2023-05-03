import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class WriteObject implements Serializable {
    int a = 10;
    int b = 20;
    String s="reading object using streams";

    public String toString() {
        return ("a:" + this.a + " b:" + this.b+"\n"+"String:"+s);
    }
    public static void main(String[] args) {
        WriteObject obj = new WriteObject();
        try {
            FileOutputStream fout = new FileOutputStream("test.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fout);
            objOut.writeObject(obj);
            objOut.close();
            System.out.println("Done");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
