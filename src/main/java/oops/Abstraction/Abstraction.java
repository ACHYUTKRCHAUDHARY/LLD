package oops.Abstraction;
/*
Car Interface --> Act as an interface for Outsiude world to operate the car.
This interface tells 'WHAT' all it can do rather then 'HOW' it does that.
Since this is an interface we cannot directly create Objects of this. We
need to implement it first and then that child class will have the responsibility to
provide implementation details of all the methods in the interface.

In our real world example of Car, imagine you sitting in the car and able to operate
the car (startEngine, accelerate, brake, turn) just by pressing or moving some
pedals/buttons/stearing wheel etc. You dont need to know how these things work, and
also they are hidden under thre hood.
This Interface 'Car' denotes that (pedals/buttons/stearing wheel etc).
in this is doesnot enforce
*/


interface Car{
    void startEngine();
    void stopEngine();
    void accelerate();
    void brake();
    void changeGear(int gear);
}

/*
This is a Concrete class (A class that provide implementation details of an interface/abstract class).
Now anyone can make an Object of 'SportsCar' and can assign it to 'Car' reference.
(See main method for this)

In our real world example of Car, as you cannot have a real car by just having its body only
(all these buttons or pedals). You need to have the actual implementation of 'What' happens
when we press these buttons. 'SportsCar' class denotes that actual implementation.

Hence we can concude, to denote a real world car in programming we created 2 classes.
One to deonte all the user-interface like pedals, buttons, stearing wheels etc ('Car' interface).
And another one to denote the actual car with all the implementations of these buttons (SportsCar' class).
 */

//class SportsCar implements Car{
//    String brand;
//
//}
//public class Abstraction {
//}
