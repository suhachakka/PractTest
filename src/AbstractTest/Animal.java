package AbstractTest;

abstract class Animal {    //abstract class and even cant apply final for abstract class which cannot inherit
    abstract void sound(); //abstract method
    //abstract final void sound(); //abstract + final should not use both at a time
    //abstract static void sound(); abstract + static should not use at a time both
    abstract void eat();

    void display() {        //concrete method
        System.out.println("Iam from Animal class");
    }
    Animal() //constructor
        {
            System.out.println("Constructor");
        }
}


