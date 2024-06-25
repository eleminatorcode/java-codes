import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
public class createFile {
    public static void main(String[] args) {
        try {
            File MyFile = new File("TextMe.txt");
            if (MyFile.createNewFile()) {
                System.out.println("created");
            } else {
                System.out.println("already created");
            }
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
        try {
            FileWriter WriteIn = new FileWriter("TextMe.txt");
            WriteIn.write("This File Have Information of Teachers:");
            WriteIn.write("Name: Ramashish,Age:23");
            WriteIn.write("Name: Ram,Age:23");
            WriteIn.write("Name: Manish,Age:23");
            WriteIn.write("Name: Deepak,Age:23");
            WriteIn.close();
        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
        try
        {
            File MyRead=new File("TextMe.txt");
            Scanner readme=new Scanner(MyRead);
            while(readme.hasNextLine()){
                String data = readme.nextLine();
                System.out.println(data);
            }
            readme.close();
        }catch (IOException e){
            System.out.println("ERror");
            e.printStackTrace();
        }
    }
}
