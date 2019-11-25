package ConstructorTest;


//child class
public class PrintNumber extends FirstClass{
    PrintNumber(){
    //super();
        /**accessed parent class constructor using super and also
        by default jvm apply super so, without this also we can call parent class constructor**/
        System.out.println("child");
    }
    int x=20; // instance variable
    void num(){
        int x= 10; //local variable
        System.out.println(x);
        System.out.println(this.x); //it is used if instance and local var named as same field
        //System.out.println(y);
        //System.out.println(x);// it will prints by default local var value with out using this keyword
        System.out.println(super.x); //access parent class instance var using "super" which has same var names for both classes

    }
    @Override
    void m1(){
        //super.m1();//accessed from parent class with same method names using "super" to save memory
        System.out.println("Hello from Child");
    }
    public static void main(String[] args){
        PrintNumber p1 = new PrintNumber();
        p1.num();
        p1.m1();
        /*FirstClass p2 = new FirstClass();//we can also print creating parent class object method value but uses more memory
        p2.m1();*/
        //FirstClass p2 = new FirstClass();//print constructor using object creation for parent class
    }
}
