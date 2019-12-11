
public class String_Buchuebung {

	public static void main(String[] args) {
		 String s = "Mayer";
		 String ss = "Meier";
		
		 System.out.println("String 1: " + s);
	     System.out.println("String 2: " + ss);
	     
	     int S = s.compareTo(ss);

	     if (S < 0) { System.out.println("\"" + s + "\"" + " ist lexikographisch über " + "\"" + ss + "\"");
	     } else if (S == 0) {
	         System.out.println("\"" + s + "\"" + " ist lexikographisch gleich " + "\"" + ss + "\"");
	     } else if (S > 0) {
	         System.out.println("\"" + s + "\"" + " ist lexikographisch unter " + "\"" + ss + "\"");
	     }
	}
}
