import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        int money = scanner.nextInt();
        System.out.println("Enter number of months: ");
        int month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        double interset_rate = scanner.nextDouble();
        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset += money * (interset_rate/100)/12 * month;
        }
        System.out.println("Total of interset: " + total_interset);
    }
}
