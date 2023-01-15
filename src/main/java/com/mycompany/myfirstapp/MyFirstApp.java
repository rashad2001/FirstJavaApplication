/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.myfirstapp;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author HP
 */
public class MyFirstApp {
    public static void main(String[] args) {
       
//        Scanner sc = new Scanner(System.in);
//        
//        String input = sc.nextLine();
//        String LowerInput = input.toLowerCase();
//        for(int i=0; i<input.length()-1;i++){
//        
//            if((LowerInput.charAt(i)!= LowerInput.charAt(input.length()-1-i))){
//                System.out.println("No mirror");
//             
//                System.out.println(LowerInput.charAt(i));
//                System.out.println(LowerInput.charAt(LowerInput.length()-1-i));
//                break;
//            }
//            else{
//                System.out.println("Mirror");
//                System.out.println(LowerInput.charAt(i));
//                break;
//            }
//        }
        int[] a ={18,1,3,6,7,-5} ;
     myArray(a);
    }
        public static int[] myArray( int list[]){
            int k=0;
           int[] result = new int[list.length-k];

           for (int i = 0, j = 0; i < list.length-1; i++, j++) {
          
               if((i==0) && (list[i]>list[i+1]) ){
                   result[j] = list[i];
                   System.out.println(list[i]);
               }
               else if((list[i]>list[i+1]) && (list[i]>list[i-1])){
                   System.out.println(list[i]);
                    k = k+1;
                   System.out.println(k);
               }
   }
            System.out.println(Arrays.toString(result));
       return result;
        }
      
    }
   




