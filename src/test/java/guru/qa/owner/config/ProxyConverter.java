package guru.qa.owner.config;

import java.lang.reflect.Method;

import org.aeonbits.owner.Converter;

public class ProxyConverter implements Converter<Proxy> {

    @Override
    public Proxy convert(final Method method, final String input) {
        String[] args = input.split(":");
        Proxy proxy = new Proxy();
        proxy.host = args[0];
        proxy.port = Integer.parseInt(args[1]);
        return proxy;
    }
}