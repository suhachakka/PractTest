package InterfaceTest;

interface MyInterface { //interface
    //int x = 15; //by default it is static and final variable
    int x=8; //or we can do as below or up both r same
    public static final int y=8;
    public abstract void m1(); // abstract method
    public abstract void m6();


static void m5(){
    System.out.println("from static MyInterface");
}

}
//interface MyInterface1 extends MyInterface{ //interface
interface MyInterface2{
    public static final int z=20; //variable
    void m6(); // abstract method
    default void m3(){ // default method which will created if not override method in subclass and prints this stmt
        System.out.println("from default");

    }
    static void m4(){ //static method
        System.out.println("From static method");

}


}
interface MyInterface1 extends MyInterface,MyInterface2{ //interface
    public static final int s=25; //variable
    public void m6();
    public abstract void m2(); // abstract method
}
