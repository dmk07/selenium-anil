package Selenium_java;

import java.io.IOException;

import org.testng.annotations.Test;

public class Data_Write1 {

	@Test
	public void Writer() throws IOException
	{
		Data_Writer obj=new Data_Writer();
		obj.Write_Excel("Sheet1", "Male", 0, 5);

	}

}
