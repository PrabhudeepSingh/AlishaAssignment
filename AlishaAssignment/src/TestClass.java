import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MyArrayList myArrayList = new MyArrayList();
		MyLinkedList myLinkedList = new MyLinkedList();
		String temp;
		int numInputs;
		
		System.out.print("Enter Number of inputs: ");
		numInputs = sc.nextInt();
		
		for(int i=0; i<numInputs; i++) {
			System.out.print("Enter element at index "+i+": ");
			temp = sc.next();
			
			myArrayList.add(temp);
			myLinkedList.add(temp);
		}
		
		System.out.println("\n---------------------------\n");
		
		System.out.println("Operations on MyArrayList:");
		System.out.println("Display:");
		myArrayList.display();
		System.out.println("\nDisplay Backward:");
		myArrayList.displayBackward();
		System.out.println("\nDisplay Odd elements");
		myArrayList.displayOddElements();
		
		System.out.println("\n---------------------------\n");
	
		System.out.println("Operations on MyLinkedList:");
		System.out.println("Display:");
		myLinkedList.display();
		System.out.println("\nDisplay Backward:");
		myLinkedList.displayBackward();
		System.out.println("\nDisplay Odd elements");
		myLinkedList.displayOddElements();
	}
}