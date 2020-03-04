package by.itstep.goryachev.oop;


public class Employee extends Person {

    @Override
    public void sayHi() {
        System.out.println("HELLOOOOOOOOOOOOOOOOOOO");
    }

    public Employee(){

    }

    public Employee(String firstname, String lastname, String surname, int age) {
        super.setFirstname(firstname);
        super.setLastname(lastname);
        super.setSurname(surname);
        super.setAge(age);
    }
}
