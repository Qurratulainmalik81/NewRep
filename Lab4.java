import java.util.*;
public class Lab4 {
    public static void main(String args[]) 
    {
       double average = 0, sum = 0, number = 0, count = 0;
       Scanner in = new Scanner(System.in);
        while(number !=-999)
        {
            sum = sum + number;
            count++;
            System.out.println("Enter numbers and -999 to exit");
            number = in.nextInt();
            
        }
        average = sum/count;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        in.close();
   }
}
