
import java.util.Scanner;
public class starProbles{
//	public static void main(String[] args) {
//		Scanner n=new Scanner(System.in);
//		int t;
//		int j,i;
//		System.out.print("Enter the number of stars : ");
//		t=n.nextInt();
//		for(i=1;i<=t;i++) {
//			for(j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		n.close();
//	}
    
	
	
// 	public static void main(String[] args) {
// 		Scanner n=new Scanner(System.in);
// 		int t;
// 		int j,i;
// 		System.out.print("Enter the number of stars : ");
// 		t=n.nextInt();
// 		for(i=t;i>0;i--) {
// 			for(j=i;j>0;j--) {
// 				System.out.print("*");
// 			}
// 			System.out.println();
// 		}
// 		n.close();
// 	}
// }
// public static void main(String args[]){
	// number right angle triangle.
	// Scanner s= new Scanner(System.in);
	// System.out.println("enter the number to print the stars");
	// int n=s.nextInt();
	// for(int i=1;i<=n;i++){
	// 	for(int j=1;j<=i;j++){
	// 		System.out.print(i);
	// 	}
	// 	System.out.println();
	// }


	// s.close();
	// Scanner s= new Scanner(System.in);
	// System.out.println("enter the number to print the stars");
	// int n=s.nextInt();
	// for(int i=n;i>=0;i--){
	// 	for(int j=i;j>0;j--){
	// 		System.out.print(i);
	// 	}
	// 	System.out.println();
	// }


	// s.close();






// 	Scanner s= new Scanner(System.in);
// 	System.out.println("enter the number to print the stars");
// 	int n=s.nextInt();
// 	for(int i=1;i<=n;i++){
// 		for(int j=1;j<=n-i;j++){
// 			System.out.print(" ");
// 		}
// 		for(int k=1; k<=(2*i)-1;k++){
// 			System.out.print("*");
// 		}
// 		System.out.println( );
// 	}
	
// 	for(int i=n;i>=1;i--){
// 		for(int j=1;j<=n-i;j++){
// 			System.out.print(" ");
// 		}
// 		for(int k=1; k<=(2*i)-1;k++){
// 			System.out.print("*");
// 		}
// 		System.out.println( );
// 	}

// 	s.close();



// }
// }
public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int t;
		int j,i;
		System.out.print("Enter the number of stars : ");
		t=n.nextInt();
		int k=0;
		for(i=1;i<=t;i++) {
			// k+=1;
			for(j=1;j<=i;j++) {
				
				// System.out.print(k+" ");
				System.out.print(i);
			}
			System.out.println();
		}
		n.close();
	}
}