package hu.hnk.example.rest;

import hu.hnk.example.model.Request;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author nandor.holozsnyak
 */
@Path("/example")
public interface IExampleRest {

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    Response postFile(Request request);
}
