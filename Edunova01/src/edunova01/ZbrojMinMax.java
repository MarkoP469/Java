package edunova01;

import javax.swing.JOptionPane;

public class ZbrojMinMax {

	public static void main(String[] args) {
		
		
			
			int a[] = new int[24];
			int zbroj=0;
			int min = 0;
			int max = 0;
			for(int i=0 ;i<a.length;i++) {
				a[i] = Integer.parseInt(
						JOptionPane.showInputDialog(
								"Unesi " + (i+1) + ". broj")
						);
				
				 zbroj+=a[i];
				 min = a[0];
				 max = a[0];
				 if (min>a[i]) {
					 min = a[i];
					}
				 
				 if (max<=a[i]) {
					 max = a[i];
					 
					}
				
				}
			System.out.println("zbroj = " + zbroj);
			System.out.println("Najveci broj = " + max);	
			System.out.println("Najmanji broj = " + min);
	}

}
