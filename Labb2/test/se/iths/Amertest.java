package se.iths;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class Amertest {
	
	Americanizer sut;
	
	@Before
	public void createSut(){
		sut = new Americanizer();
	}
	
	@Test
	public void SpeachTest() {
		
		String result = sut.convertSpeach("We own you");
		{
			assertEquals(("yo dude!We own you, you know?"), result);
			
		}
	}
	
	@Test
	public void PoundTest() {
	
		MeasureConverter mockMC = mock(MeasureConverter.class);
		sut.setWeightConverter(mockMC);
		
		int result = 10;
		int test_int = 27;
		
		when(mockMC.convertWeight(test_int, true)).thenReturn(10);
		assertEquals(result, sut.convertToPound(test_int));
	}	
	@Test
	public void FeetTest() {
	
		MeasureConverter mockMC = mock(MeasureConverter.class);
		sut.setWeightConverter(mockMC);
		
		int result = 10;
		int test_int = 300;
		
		when(mockMC.convertToFeet(test_int)).thenReturn(10);
		assertEquals(result, sut.convertToFeet(test_int));
	}	
	@Test
	public void TimeAMTest() {
	
		TimeConverter mockMC = mock(TimeConverter.class);
		sut.setTimeConverter(mockMC);
		
		String result = "8 AM";
		String test_return = "AM";
		int test_int = 8;
		
		when(mockMC.getMeridiem(test_int)).thenReturn(test_return);
		assertEquals(result, sut.convertTime(test_int));
	}	
	@Test
	public void TimePTMest() {
	
		TimeConverter mockMC = mock(TimeConverter.class);
		sut.setTimeConverter(mockMC);
		
		String result = "10 PM";
		String test_return = "PM";
		int test_int = 22;
		
		when(mockMC.getMeridiem(test_int)).thenReturn(test_return);
		assertEquals(result, sut.convertTime(test_int));
	}	

		
	}
		
		
	