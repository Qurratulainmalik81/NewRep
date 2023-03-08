import java.util.*;
public class Lab5{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
       double Operand1= 0, Operand2 = 0, result = 0;
       char Operator;
       System.out.println("Enter Operand 1: ");
       Operand1 = in.nextInt();
       System.out.println("Enter Operand 2: ");
       Operand2 = in.nextInt();
       System.out.println("Choose an operator: +, -, *, or /");
       Operator = in.next().charAt(0);
       switch (Operator) {

        // performs addition between numbers
        case '+':
          result = Operand1 + Operand2 ;
          System.out.println(Operand1 + " + " + Operand2  + " = " + result);
          break;
  
        // performs subtraction between numbers
        case '-':
          result = Operand1 - Operand2 ;
          System.out.println(Operand1+ " - " + Operand2  + " = " + result);
          break;
  
        // performs multiplication between numbers
        case '*':
          result = Operand1 * Operand2 ;
          System.out.println(Operand1 + " * " + Operand2  + " = " + result);
          break;
  
        // performs division between numbers
        case '/':
          result = Operand1 / Operand2 ;
          System.out.println(Operand1 + " / " + Operand2 + " = " + result);
          break;
  
        default:
          System.out.println("Invalid operator!");
          break;
      }
       in.close();
   }
}
