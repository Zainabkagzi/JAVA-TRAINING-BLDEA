//Write a program to check if the given two arrays are equal are not.
import java.util.Arrays;
public class arr{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,20,30,40,50,60,70,80,90,100};
		int arr2[]= {20,40,60,70,30,10,50,80,100,90};
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if(arr1.length==arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]!=arr2[i]) {
					System.out.println("Arrays not equal");
					System.exit(0);
				}
			}
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are equal");	
		}
	}
}