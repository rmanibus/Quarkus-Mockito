package module1.shared;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public interface Apple {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    String get();
}
