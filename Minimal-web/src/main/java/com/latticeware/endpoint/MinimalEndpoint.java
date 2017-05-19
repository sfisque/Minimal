/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latticeware.endpoint;


import java.util.Collections;
import java.util.Map;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;


/**
 * REST Web Service
 *
 * @author sfisque
 */

@Path( "minimal" )
public class MinimalEndpoint
{

    @Context
    private UriInfo context;


    /**
     * Creates a new instance of MinimalEndpoint
     */
    public MinimalEndpoint()
    {
    }


    /**
     * Retrieves representation of an instance of com.latticeware.endpoint.MinimalEndpoint
     * @return an instance of java.lang.String
     */
    @GET
    @Produces( MediaType.APPLICATION_JSON )
    public Map<String, String> getJson()
    {
        return Collections.singletonMap( "value", "hello world" );
    }


    /**
     * PUT method for updating or creating an instance of MinimalEndpoint
     * @param content representation for the resource
     */
    @PUT
    @Consumes( MediaType.APPLICATION_JSON )
    public void putJson( String content )
    {
    }
}
