package com.company;

import org.ietf.jgss.GSSManager;

import javax.swing.*;

interface forCamera{
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
interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String networkName);
}
class CellPhone{
    void callNumber(int number){
        System.out.println("Calling the Number " + number + "...");
    }
    void pickCallNumber(int number1){
        System.out.println("Attending the Number " + number1);
        System.out.println("Connecting....");
    }

}
// inheritance
class SmartPhone extends CellPhone implements forCamera, Wifi {
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
public class CH14_defaultMethods {
    public static void main(String[] args) {
        SmartPhone sm = new SmartPhone();
       String[] array =  sm.getNetworks();
        System.out.println("Networks available are: ");
       for(String element : array){
           System.out.println( element + " ");
       }
       sm.record4kVideo();
//       sm.greet(); // wrong bcx it is a private accessor & only accessed n another method under interface
        sm.connectToNetwork("Tenda");
    }
}
