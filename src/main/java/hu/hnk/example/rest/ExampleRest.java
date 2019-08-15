package hu.hnk.example.rest;

import hu.hnk.example.model.Request;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;

@RequestScoped
public class ExampleRest implements IExampleRest {

    public Response postFile(Request request) {
        return Response.ok().build();
    }

}
