package anudip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DuplicateName {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("How many names you go enter? ");
			int n = sc.nextInt();
			
			ArrayList<String>  al = new ArrayList<>();
			
			System.out.println("Enter " + n + " names: ");		
			for(int i =0 ; i< n; i++ ) {
				al.add(sc.nextInt(), null);
			}
			
			String name = null;
			System.out.println("Priniting " + n + " names");
			for(int i = 0; i < n; i++) {
				System.out.println(al.get(i));
			}
			
		
			Collections.sort( al);
			
			System.out.println("Printing " + n + " values after sorting");
			for(int i = 0; i < n; i++) {
				System.out.println(al.get(i));
			} 
			
			ArrayList<String>  duplicates = new ArrayList<>();
			int i = 0;
			while (i < n -1) {
				//  al.get(i) == al.get(i+1) -> comparing the 2 elements
				// (!duplicates.contains(al.get(i)) -> the element not already present in the duplicate list
				 if (( al.get(i) == al.get(i+1)) && (!duplicates.contains(al.get(i)))) {
					 duplicates.add(al.get(i));
				 }
			 i++;
			} 
			
			System.out.println("Priniting duplicate Names");
			for(int k = 0; k < duplicates.size(); k++) {
				System.out.println(duplicates.get(k));
			}
		}
	}