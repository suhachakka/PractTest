package AbstractTest;

class Dog extends Animal { //Inheritance
   @Override
    void sound(){ //method overriding from parent class abstract method
        System.out.println("Barking");
    }
    void eat(){
        System.out.println("Dog eats food when it feels hungry");
    }
    public static void main(String args[]){
        //Dog d = new Dog();
        //Animal a = new Animal(); //class can't be instantiated / create a object
        Animal a = new Dog();//  but can create class reference variable "Animal a"
        a.display();
        //d.sound();
        //d.display();
        //d.eat();
    }
}
