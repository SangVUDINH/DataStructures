import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] tab = new int[3];
		tab[0]=1;
		tab[1]=3;
		tab[2]= 8;
		
		int[] tab2 = new int[3];
		tab2[0]=2;
		tab2[1]=6;
		tab2[2]=10;
		
		int[] tab3= new int[6];
		int index =0;
		int j =0;
		int indexI =0;
		for (int i =0;i <tab.length;i++) {
			
			if(tab[i] < tab2[j] && j < tab2.length) {
				tab3 [index] = tab[i];
				index++;
			}
			else if (tab[i] > tab2[j] && i< tab.length) {
				while(tab[i] > tab2[j] && i < tab.length) {
					
					tab3 [index] = tab2[j];
					
					if ((index+1) < tab3.length) {
						index++;
					}
										
					if ((j+1) < tab2.length) {
						j++;
					}
					
				}
				
				tab3 [index] = tab[i];
				if ((index+1) < tab3.length) {
					index++;
				}
			}
			
			indexI = i;
			
			
		}
		for (int a = j; a < tab2.length; a++) {
			tab3 [index] = tab2[a];
			if ((index+1) < tab3.length) {
				index++;
			}
		}
		
		for (int a = indexI; a < tab2.length; a++) {
			tab3 [index] = tab[a];
			if ((index+1) < tab3.length) {
				index++;
			}
		}
		
		System.out.println(Arrays.toString(tab3));
		
	}

}
