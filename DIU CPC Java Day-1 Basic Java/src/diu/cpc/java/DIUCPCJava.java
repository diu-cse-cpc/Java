package diu.cpc.java;

public class DIUCPCJava {

    public static void main(String[] args) {
        //==========================Print Hello world===============================
        System.out.println("Hello world");

//      -==========================Java Basic Calculation ===================================
        System.out.println('T');
        System.out.println(2 + 3);
        System.out.println(10.5 + 3);
        System.out.println(10.5 - 3);
        System.out.println(5 * 3);
        System.out.println(9 / 3);
//============================primitive type and Variable example===========================
        int number1 = 50;
        int number2 = 20;
        float num1 = 30.6f;
        double num2 = 45.038;
        boolean isChacked = true;

        int result = number1 + number2;
        System.out.println(result);

//========================Non-Premitive type variable=====================================
        Person person1 = new Person();
        person1.name = "Test";
        person1.age = 23;
        person1.nid = "D69375";

        Person person2 = new Person();
        person2.name = "Test2";
        person2.age = 30;
        person2.nid = "D695645";

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person2.name);
        System.out.println(person2.age);

        //--------------Unary Operator------------
        int a, b, c, d;
        a = 8 + 6;

        b = 10;
        --b;
        System.out.println(--b);

        c = 15;
        System.out.println(c--);
        System.out.println(c);//14

        //==========================Assignemnt Operator============================
        int x = 30;
        x += 60;
        System.out.println(x);

        int y = 30;
        y += 60;
        System.out.println(y);

        int z = 30;
        z *= 65;
        System.out.println(z);

    }
}
