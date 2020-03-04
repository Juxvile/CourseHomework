package by.itstep.goryachev.filehomework;

public class User {
    private String name;
    private String surname;
    private String nickname;
    private int homenumber;
    private int jobnumber;
    private int mobilenumber;
    private int fax;
    private String email;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getHomenumber() {
        return homenumber;
    }

    public void setHomenumber(int homenumber) {
        this.homenumber = homenumber;
    }

    public int getJobnumber() {
        return jobnumber;
    }

    public void setJobnumber(int jobnumber) {
        this.jobnumber = jobnumber;
    }

    public int getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(int mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, String surname, String nickname, int homenumber, int jobnumber, int mobilenumber, int fax, String email, int age) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.homenumber = homenumber;
        this.jobnumber = jobnumber;
        this.mobilenumber = mobilenumber;
        this.fax = fax;
        this.email = email;
        this.age = age;
    }

    public User() {
    }
}
