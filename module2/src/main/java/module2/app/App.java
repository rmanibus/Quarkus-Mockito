package module2.app;

import module1.shared.SomeBean;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class App {

    @Inject
    ABean bean;
    @GET
    public String get() {
        bean.get();
        return "b";
    }

}
