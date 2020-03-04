package by.itstep.goryachev.files;


import java.io.*;

public class Main {
    public static void main(String[] args) {
//        String str = "Hello world";
//
//        try {
//            FileInputStream fileInputStream = new FileInputStream("hello.txt");
//            int os = 0;
//            while (os != -1) {
//                os = fileInputStream.read();
//                System.out.println((char) os);
//            }
//            fileInputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        File file = new File ("D://GOR//hello.txt");
        if (!file.exists()){
            file.mkdirs();

        }
        try {
            FileWriter fileWriter = new FileWriter(file,true);
            String str2 = "New data for our file TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT";
            fileWriter.write(str2);
            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader = new FileReader("hello.txt");
            int c;
            while ((c = fileReader.read()) != -1){
                System.out.print((char)c);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
