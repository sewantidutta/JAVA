package pack2;
import java.util.*;
import pack1.test;
class sample extends test {
	
	public void display() {
		System.out.println("this is for nothing");
	}
		//private cannot be accessed in another package of non sub class
		//s.getage();
		//default cannot be accessed in another pakage of  non sub class
		//s.getgender();
		// protected cannot be accessed in another pacage of non sub class
		//s.getMarks();
		// public can be accessed over here
		//s.getName();
	
}
class sub extends sample{
	public static void main(String [] args) {
		sub s = new sub();
		//s.getage();
		//default cannot be accessed in another pakage of  non sub class
		//s.getgender();
		// protected cannot be accessed in another pacage of non sub class
		s.getMarks();
		// public can be accessed over here
		s.getName();
	}

}
