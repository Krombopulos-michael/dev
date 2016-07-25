/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;


public class Factorial {

   
    public static void main(String[] args) {
       long n,i=0;
        int a;
        n = new Scanner(System.in).nextInt();
        if (n!=1&&n>=0){
      while(i<=n){
          i++;
          System.out.println("Working"+n);
          
      }
        
        }
        
        if (n==1) {
            System.out.println("Фактоиал числа "+n+"равен"+n);
        }
        else {
            System.out.println("Эта программа не вычисляет фактоиал числа"+n);
        }
    }
    
}
