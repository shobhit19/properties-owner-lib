public class TryWithResourcesRunner {
    /*

     */
    public static void main(String[] args) {


        System.out.println("Browser : "+ TryWithResourcesPropertyUtil.getValue(ConfigProperties.browser));
        System.out.println("Timeout : "+ TryWithResourcesPropertyUtil.getValue(ConfigProperties.timeout));
        System.out.println("Tools : "+ TryWithResourcesPropertyUtil.getValue(ConfigProperties.tools));
        System.out.println("Takes screenshot : "+ TryWithResourcesPropertyUtil.getValue(ConfigProperties.takesscreenshot));

    }
}
