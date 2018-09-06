/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/***
 * @author Hafiyyan Faza XIR5*
 * 
 */
class Thereisanintruder {
    static void whatisdis() throws ClassNotFoundException{
        System.out.println("there is an error!");
        throw new ClassNotFoundException("i've catched it");
    }
}

public class throwthrows {
    
    public static void main(String[] args){
        try{
            Thereisanintruder.whatisdis();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
