import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        double tRat;
        int wind;
        int bord;
        double tot;
        double gtot;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the sales tax rate: ");
        tRat = scan.nextDouble();
        tRat = tRat + 1;
        System.out.println("How many boards do you need? ");
        bord = scan.nextInt();
        System.out.println("How many windows do you need? ");
        wind = scan.nextInt();
        tot = (wind * 11) + (bord * 8);
        System.out.println("Total: " + tot);
        gtot = tot * tRat;
        System.out.print("Grand Total: " + gtot);

    }
}
