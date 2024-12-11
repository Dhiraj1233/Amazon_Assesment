package propertyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class GetPropertyFile 
{
//	  @Test
//			public String get(String key) throws IOException
//			{
//		    	FileInputStream fis =new FileInputStream("./propertyFile/outputproperties");
//		    	Properties p=new Properties();
//		    	p.load(fis);
//		    	String url = p.getProperty(key);
//		    	System.out.println(url);
//		    	return url;
//				
//			}
	  @Test
			public void  send() throws IOException
			{
		    	FileOutputStream fis =new FileOutputStream("./propertyFile/outputproperties");
		    	Properties pp=new Properties();
		    	pp.setProperty("userId", "456789");
				pp.store(fis, "data is stored");
			}

}
