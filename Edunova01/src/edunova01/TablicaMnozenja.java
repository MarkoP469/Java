package edunova01;

public class TablicaMnozenja {

	public static void main(String[] args) {
		
		for(int i=1; i<=15; i++) {
			for(int j=1; j<=15;j++) {
				int rezultat = i * j;
				System.out.println(i + "x" + j +"=" + rezultat);
				}
			System.out.println("");
			}
	}

}
