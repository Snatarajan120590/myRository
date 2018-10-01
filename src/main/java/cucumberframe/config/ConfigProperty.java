package cucumberframe.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperty 
{
  public ConfigProperty() throws IOException
  {
	  Properties OR=new Properties();
	  File file = new File("path");
	  FileInputStream fis=new FileInputStream(file);
	  OR.load(fis);
  }
}
