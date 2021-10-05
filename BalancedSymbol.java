/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class BalancedSymbol {
   public static void main(String[] args) {
    
       StackGeneric<String> stack = new StackGeneric<>(25);
       String rumus = "f(x)=(2x+y)-(3+(2x-x)+20)" ;
       Scanner balanced = new Scanner(rumus);
       
       balanced.useDelimiter(""); 
       for (int i = 0; i < 25; i++) {
           String symbol = balanced.next();
           if(symbol.equals("(")) {
               stack.push("(");
           } else if (symbol.equals(")")) {
               stack.pop();
           }
       }
       if(stack.isEmpty()) {
           System.out.println("valid");
       } else { 
           System.out.println("tidak valid");
       }
   }
}