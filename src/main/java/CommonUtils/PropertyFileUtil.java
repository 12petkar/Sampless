package CommonUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtil {



	 public String getDataPropertyFile(String keyname ) throws IOException {
		 

			FileInputStream fls = new FileInputStream("src\\main\\resources\\LoginCredential.properties");
				
			Properties p = new Properties();
			
			p.load(fls);

			
			String value = p.getProperty(keyname);
			
	      return value;
	      
	 }






}
