package pack1;
import java.util.*;
public class test {
	public String name = "Pankaj Goel";
	public double cgpa = 9.34;
	public int age = 20;
	public char gender = 'M';

	public void getName() {
		System.out.println("Name is = "+name);
	}
	private void getage() {
		System.out.println("Age is = "+age);
	}
	//default method 
	void getgender() {
		System.out.println("Gender is = "+gender);
	}
	
	protected void  getMarks() {
		System.out.println("Marks is ="+cgpa);
	}
}
