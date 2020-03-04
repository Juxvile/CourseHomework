package by.itstep.goryachev.generic;



public class Main {
    public static void main(String[] args) {
        BoxNoObject boxNoObject1 = new BoxNoObject(65456);
        BoxNoObject boxNoObject2 = new BoxNoObject(21312);
//        System.out.println(boxNoObject1.getO());
//        System.out.println(boxNoObject2.getO());
//
//        BoxNoObject boxNoObject3 = new BoxNoObject("fdfsdfsdfsfdsffsdf");
//        System.out.println(boxNoObject3.getO());
//
//        BoxNoObject boxNoObject4 = new BoxNoObject(true);
//
//
//        int a = (Integer) boxNoObject1.getO();
//
//        Boolean bool = true;
//        boolean bool2 = bool;


        BoxGeneric <Integer> boxGeneric1 = new BoxGeneric<>(423423);
        BoxGeneric <String> boxGeneric2 = new BoxGeneric<>("fdsdfdfdsf");

        int a = boxGeneric1.getId();

        boxNoObject1.print("dfsdfsdfs");
        boxNoObject1.print(242342);

    }
}
