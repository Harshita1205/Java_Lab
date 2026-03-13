//WAP THAT TAKES TWO INTEGERS FROM THE USERS, PERFORMS DIVISION, AND HANDLES THE ARITHMETICEXCEPTION 
// IF THE SECOND NUMBER (DENOMINATOR) IS ZERO

import java.util.Scanner;
class ArithmeticExceptionProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        try{
            double div = n1/n2;
            System.out.println("Division result = "+div);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed. ");
        }
        sc.close();
    }
}