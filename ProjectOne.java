
package projectone;

import java.util.Scanner;

public class ProjectOne {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1) Author info\n2) Integer Operation\n3) Floating point Operation\n0) Exit");
        int option = input.nextInt();
        
        while(true) 
        {
            if(option == 1){
                System.out.println("Pamella Barbosa Viana\n2792205");
                break;
                
            } else if(option == 2){ 
                System.out.println("Enter equation\nNote equation must be entered n1 op n2");
                System.out.println("for example 6 plus 4 would be '6 + 4' ");
                Scanner equation = new Scanner(System.in);
                int num1 = equation.nextInt();
                char op = equation.next().charAt(0);
                int num2 = equation.nextInt();                          
                              
                                
                if (op == '+') {
                    System.out.printf("%d + %d = %d\n",num1,num2, num1+num2);
                } else if (op == '-') {
                    System.out.printf("%d - %d = %d\n",num1,num2, num1-num2);
                }else if (op == '*' || op == 'x') {
                    System.out.printf("%d * %d = %d\n",num1,num2, num1*num2);
                }else if (op == '/') {
                    if (num2 != 0) {
                        System.out.printf("%d / %d = %d\n",num1,num2, num1/num2);
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                }else if (op == '%') {
                    int result = num1%num2;
                    System.out.println(num1 + " % " + num2 + " = " + result);
                } else {
                    System.out.println("Invalid Operation");
                }
                
                break;
                
            } else if(option == 3){
                System.out.println("Enter equation\nNote equation must be entered n1 op n2");
                System.out.println("for example 6 plus 4 would be '6 + 4' ");
                Scanner equation = new Scanner(System.in);
                double num1 = equation.nextDouble();
                char op = equation.next().charAt(0);
                double num2 = equation.nextDouble();                          
                              
                                
                if (op == '+') {
                    System.out.printf("%f + %f = %f\n",num1,num2, num1+num2);
                } else if (op == '-') {
                    System.out.printf("%f - %f = %f\n",num1,num2, num1-num2);
                }else if (op == '*' || op == 'x') {
                    System.out.printf("%f * %f = %f\n",num1,num2, num1*num2);
                }else if (op == '/') {
                    if (num2 != 0) {
                        System.out.printf("%f / %f = %f\n",num1,num2, num1/num2);
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                }else {
                    System.out.println("Invalid Operation");
                }
                
                break;
            
                
            } else if(option == 0){ 
                break;
                
            } else {
                System.out.println("Invalid Selection");
                break;
            }
                
        }
        
        
    }
    
}