import java.util.ArrayList;

public class MyArrayList extends ArrayList<String>{
	
	public void display() {
		for(int i=0; i<this.size(); i++ ) {
			System.out.println(this.get(i));
		}
	}
	
	public void displayBackward() {
		for(int i=this.size()-1; i>=0; i--) {
			System.out.println(this.get(i));
		}
	}
	
	public void displayOddElements() {
		for(int i=1; i<this.size(); i+=2) {
			System.out.println(this.get(i));
		}
	}
}
