package module1.shared;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface Apple {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    String get();
}
