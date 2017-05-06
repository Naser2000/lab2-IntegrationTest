package se.iths;

import static org.junit.Assert.*;

import org.junit.Test;

public class Measuretest {
		
	@Test

		public void WeightTest() {
		boolean a = true;
			MeasureConverter sut = new MeasureConverter();{
			
			if (a){
			int result = sut.convertWeight(5, a);
				assertEquals(((int)(5/2.7)), result);
				System.out.println(result);
			}	
			
			 else if (!a) 
			{
				 int result = sut.convertWeight(5, a);
			
				assertEquals(((int)(5 * 2.7)), result);
				System.out.println(result);
			}
	   }

	}
    @Test
	    public void ToFeet1Test() {
		
			MeasureConverter sut = new MeasureConverter();{
				int result = sut.convertToFeet(90);
				assertEquals((90/30), result );
			}
	   }

	}


