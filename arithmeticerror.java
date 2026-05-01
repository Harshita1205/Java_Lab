//lab practical 13-03-2026

import java.util.Scanner;
class Division{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter number 1:");
        a = sc.nextInt();
        System.out.println("Enter number 2:");
        b= sc.nextInt();
        try{
            int result = a/b;
            System.out.println("Result: "+result);
        }
        catch(ArithmeticException e){
             System.out.println("cannot divide by zero");
        }
        sc.close();
    }

}
