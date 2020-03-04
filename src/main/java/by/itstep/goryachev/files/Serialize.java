package by.itstep.goryachev.files;



import java.io.*;

public class Serialize {
    public static void main(String[] args) {
        User user1 = new User ("Ilya", "Boris", 25, new Adress("Grodno", "sovetskaya"));
        User user2 = new User ("Mikalai", "Viarzilin", 39, new Adress("Grodno", "sovetskaya"));

            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream (new FileOutputStream("serialize.txt"));
                objectOutputStream.writeObject(user1);
                objectOutputStream.writeObject(user2);
            } catch (IOException e) {
                e.printStackTrace();
            }
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("serialize.txt"));
            User ilya = (User)objectInputStream.readObject();
            User mikalai = (User)objectInputStream.readObject();
            System.out.println(ilya.getFirstname() + " " + ilya.getLastname() + " " + ilya.getAge());
            System.out.println(mikalai.getFirstname());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
