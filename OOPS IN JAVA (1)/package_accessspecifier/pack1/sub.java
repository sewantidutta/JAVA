package pack1;
import java.util.*;
import pack1.test;
public class sub extends test{
	public static void main(String []args){
		test t1 = new sub();
		//name is public
		t1.getName();
		//matks is protected 
		t1.getMarks();
		//gender is degault
		t1.getgender();
		//getage is private method 
		//t1.getage();
	}


}
