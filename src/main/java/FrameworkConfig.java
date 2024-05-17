import org.aeonbits.owner.Config;

import java.util.List;


@Config.Sources(value="file:${user.dir}/src/test/resources/config.properties")
public interface FrameworkConfig extends Config {


    BrowserType browser();

    Long timeout();

    List<String> tools();

    boolean takesscreenshot();


}
