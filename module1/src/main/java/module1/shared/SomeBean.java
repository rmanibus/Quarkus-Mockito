package module1.shared;

import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Unremovable
public class SomeBean {
    public String doSomething(){
        return "do";
    }
}
