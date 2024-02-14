package Oops.Inheritance;


class Demo {
    
    Demo(){
        System.out.println("Demo contructor called");
    }
}


class Hello extends Demo{

    Hello(){
        System.out.println("Hello contructor called");
    }
}

public class Starter{

    public static void main(String[] args){

        Hello obj = new Hello();

    }
}
