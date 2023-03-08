import java.util.*;
public class Lab3 {
    public static void main(String args[]) 
    {
        double investment = 1000.0;
        System.out.println("year    Amount on deposit");
        for(int i =0;i<10;i++)
        {
            System.out.println(i+"       " +( Math.round(investment*100.0)/100.0));
            investment = investment + (0.05*investment);
        }
   }
}
