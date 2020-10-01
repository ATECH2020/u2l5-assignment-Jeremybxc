import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        double slat;
        double slon;
        double elat;
        double elon;
        double dis;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the latitude of the starting location: ");
        slat = scan.nextDouble();
        System.out.print("Enter the longitude of the starting location: ");
        slon = scan.nextDouble();
        System.out.print("Enter the latitude of the ending location: ");
        elat = scan.nextDouble();
        System.out.print("Enter the longitude of the ending location: ");
        elon = scan.nextDouble();
        
        System.out.print("The distance is " + dis);
    }
}