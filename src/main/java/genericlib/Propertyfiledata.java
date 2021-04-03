package genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author QSP
 *
 */

public class Propertyfiledata implements AutoConstant{
	/**
	 * To read the data from propertyfile
	 * @param keys
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	
	public String getData(String keys) throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream(propertyfilepath));
		return p.getProperty(keys);
	}
	

}
