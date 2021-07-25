package guru.qa.owner.config;

import java.net.URL;

import org.aeonbits.owner.Config;

public interface SeleniumConfig extends Config {

    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub/")
    @Key("webdriver.remote.url")
    URL getRemoteUrl();

    @DefaultValue("false")
    @Key("webdriver.remote")
    boolean isRemote();
}