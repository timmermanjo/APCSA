/* Derek
 * 11/12/2018
 * Adv. Programming 3Y
 * WaistOfTime
 */

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.math.RoundingMode;
public class WaistOfTime
{
    public static void main(String[] args)
    {
        int number;

        int n2;

        int n3;
        
        int n4;
        
        int n5;
        
        int n6;
        
        int n7;
        
        int n8;
        
        int n9;
        
        int n10;
        
        int billion;
        
        int hunMillion;
        
        int tenMillion;
        
        int million;
        
        int hunThousand;
        
        int tenThousand;
        
        int thousand;

        int hundred;

        int ten;

        int one;
        
        int bilo;
        
        int hunMilo;
        
        int tenMilo;
        
        int milo;
        
        int hunThouso;

        int tenThouso;
        
        int thouso;
        
        int hundo;

        int teno;

        int oneo;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        number = input.nextInt();
        
        bilo = number % 1000000000;
        billion = (number - bilo) / 1000000000;
        
        n2 = bilo;
        
        hunMilo = n2 % 100000000;
        hunMillion = (n2 - hunMilo) / 100000000;
        
        n3 = hunMilo;
        
        tenMilo = n3 % 10000000;
        tenMillion = (n3 - tenMilo) / 10000000;
        
        n4 = tenMilo;
        
        milo = n4 % 1000000;
        million = (n4 - milo) / 1000000;
        
        n5 = milo;
        
        hunThouso = n5 % 100000;
        hunThousand = (n5 - hunThouso) / 100000;
        
        n6 = hunThouso;

        tenThouso = n6 % 10000;
        tenThousand = (n6 - tenThouso) / 10000;
        
        n7 = tenThouso;
        
        thouso = n7 % 1000;
        thousand = (n7 - thouso) / 1000;
        
        n8 = thouso;
        
        hundo = n8 % 100;
        hundred = (n8 - hundo) / 100;

        n9 = hundo;

        teno = n9 % 10;
        ten = (n9 - teno) / 10;

        n10 = teno;

        oneo = n10 % 1;
        one = (n10 - oneo);

        if(billion != 0)
        {
            System.out.println(billion);
        }
        else
        {
            
        }
        if(hunMillion == 0 && (billion != 0))
        {
            System.out.println(hunMillion);
        }
        else if(hunMillion == 0 && (billion == 0))
        {
            
        }
        else
        {
            System.out.println(hunMillion);
        }
        if(tenMillion == 0 && (billion != 0 || hunMillion != 0))
        {
            System.out.println(tenMillion);
        }
        else if(tenMillion == 0 && (billion == 0 && hunMillion == 0))
        {
            
        }
        else
        {
            System.out.println(tenMillion);
        }
        if(million == 0 && (billion != 0 || hunMillion != 0 || tenMillion != 0))
        {
            System.out.println(million);
        }
        else if(million == 0 && (billion == 0 && hunMillion == 0 && tenMillion == 0))
        {
            
        }
        else
        {
            System.out.println(million);
        }
        if(hunThousand == 0 && (billion != 0 || hunMillion != 0 || tenMillion != 0 || million != 0))
        {
            System.out.println(hunThousand);
        }
        else if(hunThousand == 0 && (billion == 0 && hunMillion == 0 && tenMillion == 0 && million == 0))
        {
            
        }
        else
        {
            System.out.println(hunThousand);
        }
        if(tenThousand == 0 && (billion != 0 || hunMillion != 0 || tenMillion != 0 || million != 0 || hunThousand != 0))
        {
            System.out.println(tenThousand);
        }
        else if(tenThousand == 0 && (billion == 0 && hunMillion == 0 && tenMillion == 0 && million == 0 && hunThousand == 0))
        {
            
        }
        else
        {
            System.out.println(tenThousand);
        }
        if(thousand == 0 && (billion != 0 || hunMillion != 0 || tenMillion != 0 || million != 0 || hunThousand != 0 || tenThousand == 0))
        {
            System.out.println(thousand);
        }
        else if(thousand == 0 && (billion == 0 && hunMillion == 0 && tenMillion == 0 && million == 0 && hunThousand == 0 && tenThousand == 0))
        {
            
        }
        else
        {
            System.out.println(thousand);
        }
        if(hundred == 0 && (billion != 0 || hunMillion != 0 || tenMillion != 0 || million != 0 || hunThousand != 0 || tenThousand != 0 || thousand != 0))
        {
            System.out.println(hundred);
        }
        else if(hundred == 0 && (billion == 0 && hunMillion == 0 && tenMillion == 0 && million == 0 && hunThousand == 0 && tenThousand == 0 && thousand == 0))
        {
            
        }
        else
        {
            System.out.println(hundred);
        }
        if(ten == 0 && (billion != 0 || hunMillion != 0 || tenMillion != 0 || million != 0 || hunThousand != 0 || tenThousand != 0 || thousand != 0 || hundred != 0))
        {
            System.out.println(ten);
        }
        else if(ten == 0 && (billion == 0 && hunMillion == 0 && tenMillion == 0 && million == 0 && hunThousand == 0 && tenThousand == 0 && thousand == 0 && hundred == 0))
        {
            
        }
        else
        {
            System.out.println(ten);
        }
        if(one == 0 && (billion != 0 || hunMillion != 0 || tenMillion != 0 || million != 0 || hunThousand != 0 || tenThousand != 0 || thousand != 0 || hundred != 0 || ten != 0))
        {
            System.out.println(one);
        }
        else if(one == 0 && (billion == 0 && hunMillion == 0 && tenMillion == 0 && million == 0 && hunThousand == 0 && tenThousand == 0 && thousand == 0 && hundred == 0 && ten == 0))
        {
            
        }
        else
        {
            System.out.println(one);
        }
    }
}
