package kim;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by yikai on 2014/12/27.
 */

@Path("/test")
public class HelloWorld {

    @GET
    public Response sayHello(){

        return Response.ok().entity("hello").build();

    }
}
