package com.donde.curso.rest.hello.jndi.template;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author hugo.montero
 */
@Path("HelloJndi")
public interface RestHelloJndiRemote {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response sayHelloJNDI();
}
