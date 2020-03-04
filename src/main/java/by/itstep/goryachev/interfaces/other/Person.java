package by.itstep.goryachev.interfaces.other;


import by.itstep.goryachev.oop.Adress;

public class Person {
    private String name;
    Account account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void displayPerson() {
        System.out.println("persons name: " + name + " ");
    }

    public Person (String name, String password){
        this.name = name;
        account = new Account(password);
    }

    class Account {
        private String password;

        public void displayAccount (){
            System.out.println("Account's name: " + Person.this.name + " password: " + password);

        }
        public Account(String password) {
            this.password = password;
        }
    }


}
