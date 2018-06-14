package com.sanjeeb;

public class UserDefinedException extends Exception {
	UserDefinedException(String s,Throwable t){
		super(s,t);
		
	}

}
class Input {
	Throwable t=null;
	   void method() throws UserDefinedException {
	      throw new UserDefinedException("Wrong input", t);
	   }
	}
