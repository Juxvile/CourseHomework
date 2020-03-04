package by.itstep.goryachev.oop;


public class Main {
    public static void main(String[] args) {
//        Patient tanya = new Patient();
//        tanya.setFirstname("Татьяна");
//        tanya.setLastname("Ивановна");
//        tanya.setSurname("Иванова");
//        tanya.setSex("female");
//        tanya.setAge(-30);
//
//        System.out.println(tanya.getFirstname());
//        System.out.println(tanya.getAge());
//        tanya.sayHello();
//
//        Patient vasia = new Patient();
//        vasia.setFirstname("Вася");
//        vasia.setLastname("Петрович");
//        vasia.setSurname("Васильев");
//        vasia.setSex("male");
//        vasia.setAge(27);
//
//        System.out.println(vasia.getLastname());
//        System.out.println(vasia.getAge());
//        System.out.println(tanya.getLastname());
//
//        Patient petya = new Patient("Petya", "Ivanovich", "Petrov", "male", 37);
//        petya.setFirstname("dfghh");
//
//        System.out.println(petya.getFirstname());
//
//        petya.sayHello();
//
//        Patient rtrt = new Patient();
//
//
//        Patient masha = new Patient("Masha", "Ivanova");
//        masha.sayHello();
//        System.out.println(masha.getSurname());
//
//
//        Adress adr = new Adress("Grodno", "Sovetskaya", 75, 31);
//
//
//        masha.setAdress(adr);
//        System.out.println(masha.getAdress().getStreet());

//
//        Employee tanya = new Employee("Таня", "Иванова", "Ивановна", 27);
//        System.out.println(tanya.getFirstname());
//
//        Client vitia = new Client();
//        vitia.setFirstname("Viktoriv");
//        System.out.println(vitia.getFirstname());
//
//        Client sasha = new Client("Sasha", "Ivanov", "Alexandrovich", 25, 523523523);
//        System.out.println(sasha.getNumber());
//        sasha.sayHi();


        Client cl1 = new Client("alex", "ad", "fdfdfs", 25, 21313123);
        Client cl2 = new Client("alex", "ad", "fdfdfs", 25, 21313123);

//        System.out.println(cl1.getFirstname());
//        System.out.println(cl2.getFirstname());
//        cl1.setFirstname("Alex2");
//        System.out.println(cl1.getFirstname() + " " + cl2.getFirstname());

//        System.out.println(cl1.equals(cl2));
//        System.out.println(cl1.hashCode());
//        System.out.println(cl2.hashCode());
//        System.out.println(cl1.getClass());

        Client alex = new Client("alex", "ad", "fdfdfs", 25, 21313123);
        alex.sayHi();
        Client.sayOlolo(2133197897);

        Client client = new Client();
        System.out.println(Client.count);
        System.out.println(alex.getFirstname());
        changedFirstname(alex);
        System.out.println(alex.getFirstname());

        Client masha = new Client();
        masha.setFirstname("Masha");
        System.out.println(masha.getFirstname());
        changedFirstname(masha);
        System.out.println(masha.getFirstname());
    }

    public static Client changedFirstname(Client client){
        client.setFirstname("Petenka");
    return client;
    }

}
