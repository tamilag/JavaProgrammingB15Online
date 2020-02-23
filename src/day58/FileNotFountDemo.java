package day58;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFountDemo {
// =======  HANDLING EXCEPTION ==========
//    public static void main(String[] args) {
//        try {
//            Files.readAllLines(Paths.get("file.txt"));
//        }catch (IOException e){
//            System.out.println("Exception happened and caught");
//        }
//    }
// ======== DECLARING EXCEPTION ==========
public static void main(String[] args) throws Exception {

    Files.readAllLines(Paths.get("file.txt"));
}
}
