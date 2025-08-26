package com.company;

// Qno1 write an abbstract class for a pen having methods of write() and refill()
abstract class Pen{
   abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Wrting......");
    }
    void refill(){
        System.out.println("Refilling......");
    }
    void changeNib(){
        System.out.println("Changing the Nib.....");
    }
}

    // problem 02
    // create a monkey class with jump() & bite() which after inherits a human class.
    // also implement a basic interface with eat & sleep methods

    interface basicAnimal{
    void eat();
    void sleep();
}
class Monkey {
    void jump(){
        System.out.println("The monkey is jumping....");
    }
    void bite(){
        System.out.println("The monkey is biting....");
    }
}
class human extends Monkey implements basicAnimal{
    public void eat(){
        System.out.println("The human is eating....");
    }
    public void sleep(){
        System.out.println("The human is sleeping....");
    }
    @Override
    void bite(){
        System.out.println("The Human is biting....");
    }
}

// problem 03
// create a class named telephone with methods ring(), lift(), disconnect().
// create another class smartTelephone and  demonstrate polymorphism

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    void ring(){
        System.out.println("Ringing....");
    }
    void lift(){
        System.out.println("Lifting....");
    }
    void disconnect(){
        System.out.println("Disconnecting....");
    }
}

public class CH14_PracticeSet {
    public static void main(String[] args) {
        // problem 01
//        FountainPen pen = new FountainPen();
//        pen.changeNib();
//        pen.write();
//        pen.refill();

        //problem 02
//        human person = new human();
//        person.eat();
//        person.bite();
//        person.jump();
//        person.sleep();

////         probblem 03
////         demonstrate polymorphism
//        Telephone tp = new SmartTelephone();
//        tp.lift();
//        tp.ring();
//        tp.disconnect();

        // problem 04
        // demonstrate polymorphism for monkey class from problem 02
        Monkey mk  = new human();
        mk.bite();
        mk.jump();
//        mk.sleep(); // this will give an error bcz sleep is not in monkey class
        System.out.println();
        basicAnimal ba = new human();
//        ba.jump(); // this will give an error bcz jump is not in basicAnimal interface
        ba.eat();
        ba.sleep();

    }
}
