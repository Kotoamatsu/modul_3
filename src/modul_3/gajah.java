/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_3;

/**
 *
 * @author Ser Veresta
 */
public class gajah extends hewan{
    public static void testclassmethod(){
        System.out.println("The Class Method in Hewan...");
    }
     public void testinstancemethod(){
        System.out.println("The Instance Method in Gajah... ");
    }
     public static void main(String[] args){
         gajah mygajah = new gajah();
         hewan myhewan = mygajah;
         hewan.testclassmethod();
         myhewan.testinstancemethod();
     }
}
