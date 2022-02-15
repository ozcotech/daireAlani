import java.util.Scanner;

public class daireAlani{

   public static void main(String[] args) {
  
   Scanner input = new Scanner(System.in);
   
   double r, pi, a;

  // r = Dairenin Yarı Çapı
  // a = Dairenin Merkez Açısı
  // pi = pi sayısı

   pi = 3.14;

   System.out.print("Dairenin Yarı Çapını Giriniz: ");

   r = input.nextDouble();

   System.out.print("Dairenin Merkez Açısını Giriniz: ");

   a = input.nextDouble();

  double alan, cevre, dilimAlan;

  // alan = Dairenin alanı
  // cevre = Dairenin Çevresi
  // dilimAlan = Dairenin Bir Diliminin alanı

  cevre = 2 * pi * r;

  alan = pi * r * r;

  dilimAlan = (pi * (r * r) * a) / 360;

  System.out.println(" Dairenin Çevresi = " + cevre);

  System.out.println(" Dairenin Alanı = " + alan);

  System.out.println(" Dairenin Dilim Alanı = " + dilimAlan);

  input.close();





  }
  

}