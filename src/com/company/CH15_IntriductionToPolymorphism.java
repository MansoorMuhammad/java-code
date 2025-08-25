package com.company;
// Polymorphism = poly (many) + morphs (forms)
// 1. Compile time polymorphism = method overloading (static binding)
// 2. Runtime polymorphism = method overriding (dynamic binding)

interface forCamera1{
    void takingSnap();
    void recordSnap();
    private void greet(){
        System.out.println("H i there i am the private default method");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording at 4K Resolution....");
    }
}
interface Wifi1{
    String[] getNetworks();
    void connectToNetwork(String networkName);
}
class CellPhone1{
    void callNumber(int number){
        System.out.println("Calling the Number " + number + "...");
    }
    void pickCallNumber(int number1){
        System.out.println("Attending the Number " + number1);
        System.out.println("Connecting....");
    }

}
// inheritance
class SmartPhone1 extends CellPhone1 implements forCamera1, Wifi1 {
    public void takingSnap(){
        System.out.println("Taking Snap....");
    }
    public void recordSnap(){
        System.out.println("Recording Snap....");
    }

    @Override
    public String[] getNetworks() {
        String[] networkList = {"PTCL-BB","Fiber-Storm","Tenda"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("Connecting to the network " + networkName);
    }

//    @Override
//    public void record4kVideo() {
//        System.out.println("Recoriding(4k)..");
//    }
}

public class CH15_IntriductionToPolymorphism {
    public static void main(String[] args) {

//        forCamera1 camera = new SmartPhone1(); // this is a SmartPhone but use it as a camera only
//        camera.record4kVideo();
//        camera.recordSnap();

        SmartPhone sp = new SmartPhone();
        System.out.println("Recording a video: ");
        sp.record4kVideo();
        System.out.println("Calling a number: ");
        sp.callNumber(454545);
        System.out.println("Taking a snap: ");
        sp.recordSnap();
        System.out.println("Getting the networks: ");
        String[] ar = sp.getNetworks();
        for(String item : ar) {
            System.out.println(item);
        }
    }
}
