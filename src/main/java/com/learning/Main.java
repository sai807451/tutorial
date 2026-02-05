package com.learning;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//
//        //Calculator Class Example
//        Calculator calculator = new Calculator();
//        int add = calculator.divide(2,7);
//        calculator.printXValue();
//
//
//        Calculator calculator2 = new Calculator(123);
//        int add2 = calculator2.divide(2,7);
//        System.out.println(add2);
//        calculator2.printXValue();
//
//
//        double radius = calculator.radius( 7);
//        System.out.println(radius);

        //Student Class example

        Student ria = new Student();
        ria.setStudentId(111);
        System.out.println(ria.getStudentId());
//        ria.firstName="RIA";
//        ria.lastName="EPPALAPELLI";
        ria.printName();

        Student sai = new Student(123, "Sai Prasad", "Aluvala");
        //sai.address="63146";
        sai.printName();


        Student srini = new Student(124, "Srinivas", "Eppalapelli", "st charles");
        srini.printName();

       staticMethod1();
//        Main poornima = new Main();
//        poornima.nonstaticmethod1();
    }


    public static void staticMethod1() {
        System.out.println("am in static method1");
    }

    public void nonstaticmethod1() {
        System.out.println("am in non static method1");
    }
}