import java.util.Scanner;
public class Main {
    public static void main(String args[]){

        int a;
        int b;
        int c;
        int median;

        System.out.print("Bitte 3 Werte (a,b,c) eingeben, um den Nedian zu berechnen.");

        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();


        median = a;

        if((a <= b && b <= c) || (c <= b && b <= a)) {
            median = b;
        }
        else if ((a <= c && c <= b) || (b <= c && c <= a)){
            median = c;
        }
        System.out.printf("Median ist %d" ,median);



    }

}