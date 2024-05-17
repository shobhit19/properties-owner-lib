import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public final class  PropertyUtil {
    /*
     Problems with this apprach
     1. Explicit call to readProperties method - problem remain as is
     2. Improper exception shown to user - overcome with help of try - with resources
     3. We are connecting to external file every time to fetch a value - overcome with help of try - with resources
     4. When there is an exception we have to stop the program
     5. Fetching integer, list or boolean is not possible - problem remain as is
     */

     static FileInputStream fis;
     static Properties properties;

     private PropertyUtil(){}
    public static String  readProperties(String key){
        try {
            fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config.properties");
            properties = new Properties();
            properties.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return properties.getProperty(key);
    }

}
