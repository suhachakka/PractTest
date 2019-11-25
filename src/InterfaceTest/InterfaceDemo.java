package InterfaceTest;


//class InterfaceDemo implements MyInterface,MyInterface1{ //class can implement any no of interfaces
class InterfaceDemo implements MyInterface1{
    @Override
   public void m1() {
       System.out.println("Welcome to first interface");
   }
   @Override
   public void m2(){
       System.out.println("Created second Interface");
       }
   @Override
   public void m3(){
       System.out.println("Added one more interface and extended  first two interfaces from class");
   }

    @Override
    public void m6() {
        System.out.println("Multiple inheritance with all 3 interfaces");
    }

    public static void main(String args[]){
        InterfaceDemo id = new InterfaceDemo();
        //we can also use and create reference var as below but cant create object
        //MyInterface id = new InterfaceDemo();
        id.m1();
        MyInterface.m5();
        //x=x+5; we can't change the var value which is declared from interface
        System.out.println("print as default value:"+ id.x);
        System.out.println("Act/behave as default value:"+ y);
        //MyInterface1 id1 = new InterfaceDemo();
        //id1.m2();
        id.m2();
        System.out.println(z);
        id.m3();
        System.out.println(s);
        MyInterface2.m4();
        id.m6();//multiple inheritance with same method signature and name
    }
}
