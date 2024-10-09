import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        double minInYear = 365*24*60;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of minutes: ");
        double min = sc.nextDouble();
        long years = (long) (min / minInYear);
        int days = (int) (min / 60 / 24) % 365;
        System.out.println(min + " minutes is exactly " + years + " years and " + days + " days.");
    }
}
