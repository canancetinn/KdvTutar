import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double tutar, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını girin: ");
        tutar = input.nextDouble();

        if (tutar > 0 && tutar < 1000){
            double oran = 0.18;
            kdvTutar = tutar * oran;
            kdvliTutar = tutar + kdvTutar;
            System.out.print("\nKDV' siz tutar = " + tutar);
            System.out.print("\nKDV Tutarı = " + kdvTutar);

            System.out.print("\nKDV'li tutar= " + kdvliTutar);
        }else if(tutar >= 1000){
            kdvTutar = tutar * 0.8;
            kdvliTutar = tutar + kdvTutar;
            System.out.print("\nKDV' siz tutar = " + tutar);
            System.out.print("\nKDV Tutarı = " + kdvTutar);
            System.out.print("\nKDV'li tutar= " + kdvliTutar);

        }






    }
}
