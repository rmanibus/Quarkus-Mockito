package module2.app;

import module1.shared.SomeBean;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

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
