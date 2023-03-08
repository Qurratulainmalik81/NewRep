import java.util.*;
public class Lab7{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int num, dec = 0, i = 0, rem, bin =0;
       //Binary to Decimal
        System.out.println("Enter a binary number:");
        num = in.nextInt();
        int temp = num;
        while (temp != 0) {
            rem = temp % 10;
            temp /= 10;
            dec += rem * Math.pow(2, i);
            ++i;
        }
       System.out.println("Decimal Equivalent of " + num + " is "+ dec);

       //Decimal to Binary
       System.out.println("Enter a Decimal number now:");
       num = in.nextInt();
       temp = num;
       i = 1;
       while (temp != 0) {
            rem = temp % 2;
            temp /= 2;
            bin += rem * i;
            i *= 10;
        }
    System.out.println("Binary Equivalent of " + num + " is "+ bin);
    in.close();
   }
}
