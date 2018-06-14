package com.sanjeeb;

class TestException{
	   public static void main(String[] args){
	      try {
	         new Input().method();
	      }
		  catch(UserDefinedException wie) {
	         System.out.println(wie.getMessage());
	      }
	   } 
	}