import java.util.Scanner;

//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/is-zoo-f6f309e7/

public class Zzoooo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//series sequence n+2n=3n
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if(input.startsWith("z") && input.endsWith("o")) {
			if(input.length() % 3 == 0) {
				int expectedZ = input.length()/3;
				int expectedO = input.length()-expectedZ;
				
				int zCount = 0;
				int oCount = 0;
				for(int i=0; i<=expectedZ; i++) {
					if(input.charAt(i)=='z'||input.charAt(i)=='Z')
						zCount++;					
				}
				for(int j=expectedZ; j<input.length(); j++) {
					System.out.println("inpi "+input.length()+"  j"+j);
					if(input.charAt(j)=='o'||input.charAt(j)=='O')
						oCount++;
				}
				if(expectedO==oCount && expectedZ==zCount)
					System.out.println("Yes");
				else
					System.out.println("No");
				
			}else System.out.println("No");
				
		}else
			System.out.println("No");
		
	}

}
