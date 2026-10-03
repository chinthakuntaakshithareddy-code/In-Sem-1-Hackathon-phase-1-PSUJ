import java.util.Scanner;
public class Methods {
    double TotalWaste(double a,double b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Waste Collected at 1st point:");
        double p1=sc.nextInt();
        System.out.print("Enter Waste Collected at 2nd point:");
        double p2=sc.nextInt();
        double waste=TotalWaste(p1,p2);
        System.out.println("Total Waste Collected:"+waste);
    }
}
