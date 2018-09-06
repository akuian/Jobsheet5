/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Hafiyyan Faza XIR5
 */
public class trycatchfinally {

public static void main(String args[]){

try{

int bil = 0;

System.out.println(bil/0);

}

catch(Exception xx){

System.out.println(xx.getMessage());


}
finally {
            System.out.println("Perbaiki kesalahan ini");
            }
            
}}


