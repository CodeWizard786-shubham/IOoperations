import java.io.FileOutputStream;

public class WriteDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream f1 = new FileOutputStream("C:\\Users\\Shubham\\IdeaProjects\\IOOperations\\src\\demo.txt");
            String s = "Welcome";
            byte[] b = s.getBytes();
            f1.write(b);
            f1.close();
            System.out.println("File written");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
