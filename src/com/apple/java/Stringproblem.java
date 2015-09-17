package com.apple.java;

/**
  * Java program to remove given character from a given String
  * 
  */


public class Stringproblem {

	public static String removeChar(String s, char c) {
		
		StringBuffer br=new StringBuffer();
        int current = 0;

        for (int i=0; i<s.length(); i++){
            char cur = s.charAt(i);
            if(cur != c) 
            	
            	br.append(cur);
        }
        br.trimToSize();
        return br.toString();
        
       
    
    }
	
	public static String removeCharAt(String s, int pos) {
		   StringBuffer buf = new StringBuffer( s.length() - 1 );
		   buf.append( s.substring(0,pos) ).append( s.substring(pos+1) );
		   return buf.toString();
		}



	 public static void main(String[] args) {
	       
	        System.out.println("Output for removeChar(): " + removeChar("apple Google Paypal", 'a'));
	        System.out.println("Output for removeCharAt(): " + removeCharAt("apple",2));
	       
	    }
	}


