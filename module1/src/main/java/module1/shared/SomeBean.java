package module1.shared;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SomeBean {
    public String doSomething(){
        return "do";
    }
}
