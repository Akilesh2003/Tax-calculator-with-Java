
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        
        double t1 = 100.0 + (value-5000)*0.08;
        double t2 = 1700.0 + (value-25000)*0.1;
        double t3 = 4700.0 + (value-55000)*0.12;
        double t4 = 22100.0 + (value-200000)*0.15;
        double t5 = 142100.0 + (value-1000000)*0.17;
        
        if (value<5000) {
            System.out.println("No tax!");
        } else if (value==5000) {
            System.out.println("Tax: 100.0");
        } else if (value>5000 && value<25000){
            System.out.println("Tax: " + t1 );
        } else if (value==25000) {
            System.out.println("Tax: 1700.0");
        } else if (value>25000 && value<55000){
            System.out.println("Tax: " + t2 );
        } else if (value>55000 && value<200000){
            System.out.println("Tax: " + t3 );
        } else if (value==55000){
            System.out.println("Tax: 4700.0");
        } else if (value==200000){
            System.out.println("Tax: 22100.0");
        } else if (value==1000000){
            System.out.println("Tax: 142100.0");
        } else if (value>200000 && value<1000000){
            System.out.println("Tax: " + t4 );
        } else if (value>1000000){
            System.out.println("Tax: " + t5 );
        }
        

    }
}
