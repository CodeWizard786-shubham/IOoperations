import java.io.FileInputStream;

public class ReadDemo{
    public static void main(String[] args) {
        try{
            FileInputStream f1=new FileInputStream("C:\\Users\\Shubham\\IdeaProjects\\IOOperations\\src\\demo.txt");
            int i=0;
            while((i=f1.read())!=-1){
                System.out.print((char)i);
            }
            f1.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
