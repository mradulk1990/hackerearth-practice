
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int upto = 100;
		for (int i=2; i<upto ; i++) {
			int count = 0;
			for(int j=2; j<upto; j++) {
				if(j<=i) {
					if(i%j == 0) {
						count++;
						if(count >= 2) 
							break;
					}
				}else break;
			}
			if(count == 1) {
				System.out.print(i+" ");
			}
		}
	}

}
