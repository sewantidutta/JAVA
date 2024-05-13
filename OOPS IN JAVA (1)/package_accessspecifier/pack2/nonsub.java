package pack2;
import java.util.*;
import pack1.test;
class nonsub {
	public static void main(String []args) {
		test t1 = new test();
		//private cannot be accessed in another package of non sub class
		//t1.getage();
		//default cannot be accessed in another pakage of  non sub class
		//t1.getgender();
		// protected cannot be accessed in another pacage of non sub class
		//t1.getMarks();
		// public can be accessed over here
		t1.getName();
	}
}
