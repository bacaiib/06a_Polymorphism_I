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
        

       // ---- 2. Iteration Overloading ---//
      
    }

        // ---- 3 Iteration Polymorphie ---//
    private static void pollObj(HoneyBee obj){
        output(obj.doYourJob());
        output(obj.fly());
        output("-----------------");
 
    }

   
   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

