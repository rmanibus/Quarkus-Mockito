package module1.app;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import module1.shared.Apple;

import javax.enterprise.context.RequestScoped;


@RequestScoped
public class AppleResource implements Apple {

    @ConfigProperty( name = "a.prop")
    String aProp;

    @Override
    public String get() {
        return "a";
    }
}
