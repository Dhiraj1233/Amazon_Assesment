package propertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class GetUserId 
{
	    @Test
		public String get(String key) throws IOException
		{
	    	FileInputStream fis =new FileInputStream("./propertyFile/outputproperties");
	    	Properties p=new Properties();
	    	p.load(fis);
	    	String user = p.getProperty("userId");
	    	System.out.println(user);
	    	return user;
			
		}
	}


