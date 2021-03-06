package org.wildfly.quickstarts.microprofile;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class RootResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getRootResponse() {
        return "MicroProfile REST Client quickstart deployed successfully. You can find the available operations in the included README file.";
    }
}
