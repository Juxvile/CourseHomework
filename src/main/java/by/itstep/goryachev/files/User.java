package by.itstep.goryachev.files;


import java.io.Serializable;

public class User implements Serializable{
    private String firstname;
    private String lastname;
    private int age;
    private transient Adress adress;

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public User(Adress adress) {
        this.adress = adress;
    }

    public User() {
    }

    public User(String firstname, String lastname, int age, Adress adress) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.adress = adress;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
