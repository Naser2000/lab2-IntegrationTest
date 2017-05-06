package se.iths;

import static org.junit.Assert.*;

import org.junit.Test;

public class Timetest {

	@Test
	public void AmTest() {
		TimeConverter sut = new TimeConverter();
		
		String result = sut.getMeridiem(11);{
			assertEquals("AM", result);
			
		}
	}
	@Test
	public void PMTest() {
		TimeConverter sut = new TimeConverter();
		
		String result = sut.getMeridiem(21);{
			assertEquals("PM", result);
			
		}
	
		
	}
	
	

}
