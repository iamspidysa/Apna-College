import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputOutput {
    public static void main(String[] args) throws IOException {
        // System.err.println("error mesaage");
        // System.err.println();
        // //int i = System.in.read();
        // System.out.println();

        // try {
        //     FileOutputStream fout = new FileOutputStream("C:\\Users\\snipe\\Documents\\testout.txt");
        //     fout.write(65);
        //     byte[] myArray = { 65, 66, 77, 65, 33, 56, 54, 67 };
        //     fout.write(myArray);
        //     String s = "Welcome to javaTpoint.";
        //     byte b[] = s.getBytes();// converting string into byte array
        //     fout.write(b);
        //     fout.close();
        //     fout.close();
        //     System.out.println("success...");
        // } catch (Exception e) {
        //     System.out.println(e);
        // }


        // Reading from source file
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\snipe\\Documents\\testout.txt\\");
            int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }


        //BufferedOutputStram Class Example
        FileOutputStream f = new FileOutputStream("C:\\JavaProg\\buffer.txt");
        BufferedOutputStream b = new BufferedOutputStream(f);
        String s = "Saurabh is Iron man";
        byte bb[] = s.getBytes();
        b.write(bb);
        b.flush();
        b.close();
        f.close();
        System.out.println("Success");


        //BufferedInputStream Class Example
        try {
            FileInputStream file = new FileInputStream("C:\\JavaProg\\buffer.txt");
        BufferedInputStream bf = new BufferedInputStream(file);
        int i;
        while((i=bf.read())!=-1){
            System.out.print((char)i);
        }
        bf.close();
        file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
}
