package hu.hnk.example.model;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

/**
 * @author nandor.holozsnyak
 */
@Schema(description = "Request object.")
public class Request {

    @Schema(description = "Byte array of the file", required = true)
    private byte[] fileData;

}
