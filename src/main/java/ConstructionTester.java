import java.util.Scanner;


public class ConstructionTester
{
    public static void main(String[] args)
    {
    
        double tRat;
        int wind;
        int bord;
        double bordc;
        double winc;
        double tot;
        double gtot;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the sales tax rate: ");
        tRat = scan.nextDouble();
        System.out.println("How many boards do you need? ");
        bord = scan.nextInt();
        System.out.println("How many windows do you need? ");
        wind = scan.nextInt();
        
        Construction con = new Construction(8, 11, tRat);
        
        bordc = con.lumberCost(bord);
        winc = con.windowCost(wind);
        tot = winc + bordc;
        System.out.println("Total: " + tot);
        gtot = con.grandTotal(tot);
        System.out.print("Grand Total: " + gtot);
        
        

    }
}
