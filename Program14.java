import java.util.Scanner;
public class Program14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n= sc.nextInt();
		int count;
		for(int i=1;i<=5;i++){
			count=i;
			for(int j=1;j<=5;j++) {

			System.out.print(count+"  ");
			count=count+5;
			
		}
			System.out.println();
		// TODO Auto-generated method stub

	}
}
}
