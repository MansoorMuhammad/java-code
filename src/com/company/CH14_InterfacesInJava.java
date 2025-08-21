package com.company;

interface biCycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface eCycle{

    void blowHorn();
    void Beamer();
}
class myCycle implements biCycle , eCycle{

   public void applyBrake(int decrement){
        System.out.println("Applying brake.....");
    }
    public void speedUp(int increment){
        System.out.println("Speeding up the biCycle......");
    }
    public void blowHorn(){
        System.out.println("Peep peep pop pop");
    }
    public void Beamer(){
        System.out.println("The caution has been delivered");
    }
}

public class CH14_InterfacesInJava {
    public static void main(String[] args) {
        myCycle cycle = new myCycle();
        cycle.applyBrake(56);
        cycle.speedUp(56);
        cycle.blowHorn();
        cycle.Beamer();
        // if i do
//        cycle.a = 454; // this is restricted in java bcz it is final in Interface
        System.out.println("The value of a is: "  + cycle.a);

    }
}
