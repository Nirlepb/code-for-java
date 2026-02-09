package nirlep;

import java.util.Scanner;

public class incresedTriangle {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter an number for triangle :-");
		int n=s.nextInt();
		int num=1;
		
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((i+j)%2);
				
				
				}
			System.out.println();
		}
		s.close();

	}

}
