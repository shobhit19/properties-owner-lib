import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {


        String browser=PropertyUtil.readProperties("browser");
        System.out.println("Browser name :"+browser);

        String timeout = PropertyUtil.readProperties("timeout");
        System.out.println(Integer.parseInt(timeout));

        String tools=PropertyUtil.readProperties("tools");
        List<String> toolsList=Arrays.asList(tools.split(","));
        System.out.println("tools :");
        toolsList.forEach(a->System.out.println(a));

        boolean isTaken = Boolean.valueOf(PropertyUtil.readProperties("takesscreenshot"));
        System.out.println("Screenshot taken :"+isTaken);




    }
}
