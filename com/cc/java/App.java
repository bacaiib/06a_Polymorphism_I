package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
       Queen queen = new Queen();
       Worker worker = new Worker();
       Drone drone = new Drone();
       
        // ---- 1.Iteration Super-/Subklassen ----//

       pollObj(queen);
       pollObj(worker);
       pollObj(drone);
        

       // ---- 2. Iteration Overloading ---/
       output(worker.doYourJob());
       output(worker.fly());
       output("-----------------");

       output(drone.doYourJob());
       output(drone.fly());
       output("-----------------");





    }

    private static void pollObj(worker obj){
        output(obj.doYourJob());
        output(obj.fly());
        output("-----------------");
 
    }
    private static void pollObj(drone obj){
        output(obj.doYourJob());
        output(obj.fly());
        output("-----------------");
 
    }

    private static void pollObj(HoneyBee obj){
        output(obj.doYourJob());
        output(obj.fly());
        output("-----------------");
 
    }

   
   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

