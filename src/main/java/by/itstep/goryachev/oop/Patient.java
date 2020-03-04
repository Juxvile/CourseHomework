package by.itstep.goryachev.oop;


public class Patient {
    private String firstname;
    private String lastname;
    private String surname;
    private String sex;

    private int age;

    private Adress adress;


    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Ne vernyi vozrast");;
        }
    }

    public void sayHello(){
        System.out.println("Hi, my name is " + firstname);
    }

    public Patient() {
    }

    public Patient(String firstname, String lastname, String surname, String sex, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
    }

    public Patient(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
