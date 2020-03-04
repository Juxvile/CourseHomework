package by.itstep.goryachev.oop;



public final class Client extends Person{
    @Override
    public void sayHi() {
        System.out.println("HELLOOOOOOOOOOOOOOOOOOO");
    }

    private int number;
    public static int count = 0;
    public int getNumber() {
        return number;
    }

    public static void sayOlolo(int variab){
        System.out.println(variab);
    }
    public static String olo = "Olololololololo";


    public void setNumber(int number) {
        this.number = number;

    }

    public Client() {
        count++;
    }


    public Client (String firstname, String lastname, String surname, int age, int number){
        super.setFirstname(firstname);
        super.setLastname(lastname);
        super.setSurname(surname);
        super.setAge(age);
        this.number = number;
        count++;

    }

}

