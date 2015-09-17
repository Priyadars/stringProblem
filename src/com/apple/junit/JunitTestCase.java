package com.apple.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.apple.java.Stringproblem;
 
public class JunitTestCase { 
 @Test
 public void Removechar()
  {
	 assertEquals("pple",Stringproblem.removeChar("apple",'a'));
	 assertEquals("aple", Stringproblem.removeCharAt("apple",2));
	
  } 
	
}


