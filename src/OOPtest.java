
public class OOPtest {
	public static void main(String[]args) {
		OOP OOPONE = new OOP("Jam");
		OOP OOPTWO = new OOP("Ryu");
		System.out.printf(" %s description \n",OOPONE.getdes());
		OOPONE.setdes("Sun");
		System.out.printf(" %s description \n",OOPONE.getdes());
		System.out.printf(" %s description ",OOPTWO.getdes());
		
	}
}
