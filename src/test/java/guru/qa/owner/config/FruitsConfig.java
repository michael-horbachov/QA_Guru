package guru.qa.owner.config;

import java.util.List;

import org.aeonbits.owner.Config;

public interface FruitsConfig extends Config {

    @Separator(";")
    @Key("github.fruits")
    List<String> getFruits();

    @Separator(",")
    @Key("github.fruits")
    List<String> getFruitsWithComa();

    @Separator(",")
    @Key("github.fruits")
    @DefaultValue("Apple,Orange,Banana")
    List<String> getFruitsWithDefaultValue();
}