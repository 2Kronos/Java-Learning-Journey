/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author 230522076
 */
public class AddtionClass {
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int number1; //First number to add
        int number2; //second number to add
        int sum;
        
        System.out.print("Enter first integer:"); //prompt message
        number1 = input.nextInt(); //read first number from user
        
        System.out.print("Enter second integer:"); //prompt message
        number2 = input.nextInt(); //read second number from user
        
        sum = number1 + number2;
        
        System.out.printf("Sum is %d\n", sum);
    
    }
       
    
}
