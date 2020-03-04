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
        }else{//start to find prime numbers 
            for (int j =2;j<i;j++){//start from 2 
                boolean found =false;//set the found as false 
                for(int n =0; n<prime.size(); n++){//loop to dicern whether it is a prime number or not 
                if ((j%prime.get(n))==0){//if the number is divisible, finish the loop 
                    found = false;
                    break;
                }else{//if it is not devisible, it continues and found is true
                found = true;}
                }
                if (found){//if found is not false, j is a prime number 
                    prime.add(j);//add j in the prime 
                  }
            }
            for(int n =0; n<prime.size(); n++){//output the prime number 
                System.out.println("Prime Number:" + prime.get(n) );}
        }
          
          
    
     
    }
    
}
