import org.aeonbits.owner.ConfigFactory;

public class RunnerWithOwner {

    public static void main(String[] args) {


        FrameworkConfig config =ConfigFactory.create(FrameworkConfig.class);

        System.out.println(config.browser());
        System.out.println(config.browser().name());
        System.out.println(config.timeout());
        System.out.println(config.takesscreenshot());
        config.tools().forEach(a->System.out.println(a));

    }
}
