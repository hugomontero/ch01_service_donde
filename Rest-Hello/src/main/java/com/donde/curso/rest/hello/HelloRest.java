/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donde.curso.rest.hello;

import com.donde.curso.rest.hello.template.HelloRestRemote;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 *
 * @author hugo.montero
 */
@Stateless(name= "HelloRest")
public class HelloRest implements HelloRestRemote {
    @EJB
    Hello hello;

    @Override
    public Response sayHello() {
        return Response.status(Response.Status.OK)
                .encoding(MediaType.APPLICATION_JSON)
                .entity(hello.sayHello())
                .build();
    }

    @Override
    public Response sayHello(String userName) {
        return Response.status(Response.Status.OK)
                .encoding(MediaType.APPLICATION_JSON)
                .entity("hola sr " + userName)
                .build();
    }
    
}
