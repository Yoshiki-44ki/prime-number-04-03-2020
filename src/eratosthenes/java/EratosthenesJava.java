/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eratosthenes.java;

/**
 *
 * @author yohar3320
 */

import java.util.Scanner;
import java.util.ArrayList;
public class EratosthenesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
        ArrayList<Integer> prime = new ArrayList<Integer>(); // Create array to store prime numbers
        prime.add(2);
        Scanner in = new Scanner(System.in); //declare a scanner 
        System.out.println("Type a whole number");//1 is not a prime numbeber
        int i = in.nextInt();
        if (i==1){
            System.out.println("no prime number ");
        }else{
            for (int j =2;j<i;j++){
                boolean found =false;
                for(int n =0; n<prime.size(); n++){
                if ((j%prime.get(n))==0){
                    found = false;
                    break;
                }else{
                found = true;}
                }
                if (found){
                    prime.add(j);
                  }
            }
            for(int n =0; n<prime.size(); n++){
                System.out.println("Prime Number:" + prime.get(n) );}
        }
          
          
    
     
    }
    
}
