//package chap1.item9;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//
//public class SimpleTry {
//
//    public int countCharactersInFile(String path) {
//
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(path));
//            return reader.read();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } finally {
//
//        }
//    }
//}
