import org.aeonbits.owner.Config;

import java.io.FileInputStream;
import java.util.Objects;
import java.util.Properties;

/*
    Problems:
    Explicit call to readProperties method - problem remain as is
    Fetching integer, list or boolean is not possible - problem remain as is
    We are writing a lot of code
 */

public final class TryWithResourcesPropertyUtil {

    private TryWithResourcesPropertyUtil(){

    }

    private static Properties properties = new Properties();

    static {
       try( FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config.properties");){
           properties.load(fis);
       }
       catch (Exception e){
           System.exit(0);
       }
    }

    public static String getValue(ConfigProperties key){
        if(Objects.isNull(key) || Objects.isNull(properties.getProperty(key.name().toLowerCase()))){
            throw new RuntimeException("Some issue with properties file");
        }
        return properties.getProperty(key.name().toLowerCase());
    }
}
