/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;


public class Factorial {

  

   static long fact(int x){
       if(x==1)return 1;
       
       return fact(x-1)*x;
    }
   
    public static void main(String[] args) {
       int i;
        
        int a = new Scanner(System.in).nextInt();
     if (a!=0 && a>=1){
       for ( i = 1 ;i<=a;i++){
           
      System.out.println( i+" = "+Factorial.fact(i));
    
       }
       i = i-1;
       System.out.println("Факториал числа  "+a+"   равен   "+Factorial.fact(i));
     }
     else{
         System.out.println("Программа не вычисляет факториал числа"+a);
     }
    }
    
}
