package Score_Chapter04.java;

public class score {
	public static void main(String[] args) {
		System.out.println("Aさん"+10);
		System.out.println("Bさん"+20);
		System.out.println("Cさん"+30);
		System.out.println("Dさん"+40);
		System.out.println("Eさん"+50);
		System.out.println("Fさん"+60);
		System.out.println("Gさん"+70);
		System.out.println("Hさん"+80);
		System.out.println("Iさん"+90);
		System.out.println("Jさん"+100);
		
		
		 double sum = 0;
		 double [] data = {10,20,30,40,50,60,70,80,90,100};
		 for(int i=0; i<data.length; i++) {
			 sum += data[i];
		 }
		 double ave = sum / data.length;
		 System.out.println(ave);
		 

	}
}
