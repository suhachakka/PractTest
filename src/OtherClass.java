import MethodsWithObjects.Car;

public class OtherClass {
    public static void main(String args[]){
        Car myCar = new Car(); //myCar is object
        myCar.fullThrottle(); // call methods with obj.method name and print the result
        myCar.speed(200);
    }
}
