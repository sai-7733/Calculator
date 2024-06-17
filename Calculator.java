import java.util.*;
import java.lang.*;
class Calculator
{
    static Scanner sc = new Scanner(System.in);
    static double num1;
    static double answer = 0;
    static void firstnumber()
    {
        System.out.println("Enter the number :");
        num1 = sc.nextDouble();
        answer = answer+num1;
    }
    static void mode()
    {
        System.out.println("Choose the number to select :");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (% = remainder)");
        System.out.println("5. Divide (/ = quotient)");
        System.out.println("6. Sin");
        System.out.println("7. Cos");
        System.out.println("8. Tan");
        System.out.println("9. Cosec");
        System.out.println("10. Sec");
        System.out.println("11. Cot");
        System.out.println("12. Power");
        System.out.println("13. Squareroot");
        System.out.println("14. Factorial(!)");
        System.out.println("15. (1/number)");
        System.out.println("16. Final Answer");
        System.out.println("17. clear");
    }
    static void modeselection()
    {
        while(true)
        {
            System.out.println("Choose number to select the required mode :");
            int select = sc.nextInt();
            if(select == 1)
            {
                System.out.print("Addition :");
                addition();
                break;
            }
            else if(select == 2)
            {
                System.out.print("Subtraction :");
                subtraction();
                break;
            }
            else if(select == 3)
            {
                System.out.print("Multiplication :");
                multiplication();
                break;
            }
            else if(select == 4)
            {
                System.out.print("Division (%) :");
                division();
                break;
            }
            else if(select == 5)
            {
                System.out.print("Divide (/) :");
                divide();
                break;
            }
            else if(select == 6)
            {
                System.out.print("Sin("+num1+" radians) :");
                sin();
                break;
            }
            else if(select == 7)
            {
                System.out.print("Cos("+num1+" radians) :");
                cos();
                break;
            }
            else if(select == 8)
            {
                System.out.print("Tan("+num1+" radians) :");
                tan();
                break;
            }
            else if(select == 9)
            {
                System.out.print("Cosec("+num1+" radians) :");
                cosec();
                break;
            }
            else if(select == 10)
            {
                System.out.print("Sec("+num1+" radians) :");
                sec();
                break;
            }
            else if(select == 11)
            {
                System.out.print("Cot("+num1+" radians) :");
                cot();
                break;
            }
            else if(select == 12)
            {
                System.out.print("Power :");
                power();
                break;
            }
            else if(select == 13)
            {
                System.out.print("Squareroot :");
                squareroot();
                break;
            }
            else if(select == 14)
            {
                System.out.print("Factorial :");
                factorial();
                break;
            }
            else if(select == 15)
            {
                System.out.print("(1/number) :");
                onebynumber();
                break;
            }
            else if(select == 16)
            {
                System.out.print("Finam Answer :");
                finalanswer();
                break;
            }
            else if(select == 17)
            {
                System.out.print("All Clear :");
                clear();
                break;
            }
            else
            {
                System.out.println("Choose number only from 1 to 16.");
            }
        }
    }
    static void addition()
    {
        double num2 = sc.nextDouble();
        answer = answer+num2;
        modeselection();
    }
    static void subtraction()
    {
        double num2 = sc.nextDouble();
        answer = answer-num2;
        modeselection();
    }
    static void multiplication()
    {
        double num2 = sc.nextDouble();
        answer = answer*num2;
        modeselection();
    }
    static void division()
    {
        double num2 = sc.nextDouble();
        answer = answer%num2;
        modeselection();
    }
    static void divide()
    {
        double num2 = sc.nextDouble();
        answer = answer/num2;
        modeselection();
    }
    static void sin()
    {
        answer = Math.sin(answer);
        finalanswer();
    }
    static void cos()
    {
        answer = Math.cos(answer);
        finalanswer();
    }
    static void tan()
    {
        answer = Math.tan(answer);
        finalanswer();
    }
    static void cosec()
    {
        answer = 1 / Math.sin(answer);
        finalanswer();
    }
    static void sec()
    {
        answer = 1 / Math.cos(answer);
        finalanswer();
    }
    static void cot()
    {
        answer = 1 / Math.tan(answer);
        finalanswer();
    }
    static void power()
    {
        double num2 = sc.nextDouble();
        answer = Math.pow(answer,num2);
        finalanswer();
    }
    static void squareroot()
    {
        answer = Math.sqrt(answer);
        finalanswer();
    }
    static void factorial()
    {
        int ans = (int)answer;
        int factorial = ans;
        for(int i=ans-1;i>0;i--)
        {
            factorial=factorial*i;
        }
        answer = factorial;
        finalanswer();
    }
    static void onebynumber()
    {
        answer = 1 / answer;
        finalanswer();
    }
    static void finalanswer()
    {
        System.out.println(answer);
    }
    static void clear()
    {
        answer = answer - answer;
        finalanswer();
    }
    public static void main(String[] args)
    {
        firstnumber();
        mode();
        modeselection();
    }
}