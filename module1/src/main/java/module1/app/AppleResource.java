package module1.app;

import io.quarkus.arc.Unremovable;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import module1.shared.Apple;

import jakarta.enterprise.context.RequestScoped;


@RequestScoped
@Unremovable
public class AppleResource implements Apple {

    @ConfigProperty( name = "a.prop")
    String aProp;

    @Override
    public String get() {
        return "a";
    }
}
