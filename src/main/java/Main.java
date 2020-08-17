import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class Main {
    public static void main(String[] args) {
        final Config defaultApplication = ConfigFactory.defaultApplication();
        System.out.println(defaultApplication);
        Config uatConfig = defaultApplication
                .getConfig("UAT")
                .withFallback(defaultApplication)
                .resolve();
        System.out.println(uatConfig.getString("ip"));
    }
}
