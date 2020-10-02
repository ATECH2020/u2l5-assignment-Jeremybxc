import java.util.Scanner;

public class HowFarAway {
  public static void main(String[] args) {
    double latitude;
    double longitude;
    double elat;
    double elon;
    double dis;

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the latitude of the starting location: ");
    latitude = scan.nextDouble();
    System.out.print("Enter the longitude of the starting location: ");
    longitude = scan.nextDouble();
    System.out.print("Enter the latitude of the ending location: ");
    elat = scan.nextDouble();
    System.out.print("Enter the longitude of the ending location: ");
    elon = scan.nextDouble();

    GeoLocation start = new GeoLocation(latitude, longitude);
    GeoLocation end = new GeoLocation(elat, elon);
    dis = start.distanceFrom(end);
    System.out.print("The distance is " + dis + " miles.");
  }
}