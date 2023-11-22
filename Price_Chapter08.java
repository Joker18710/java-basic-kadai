package kadai_008;

public class Price_Chapter08 {
   public static void main(String[] args) {
	   
	  int age = 30;
	  
	  switch(age) {
	  case 10 -> System.out.println("10代で1000円です");
	  case 20 -> System.out.println("20代で2000円です");
	  case 30 -> System.out.println("30代で3000円です");
	  case 40 -> System.out.println("40代で3000円です");
	  case 50 -> System.out.println("50代で4000円です");
	  case 60 -> System.out.println("60代で4000円です");
	  case 70 -> System.out.println("70代で4000円です");
	  case 80 -> System.out.println("80代で5000円です");
	  default -> System.out.println("上記以外の年代で500円です");
	  
	  }
   }
}
