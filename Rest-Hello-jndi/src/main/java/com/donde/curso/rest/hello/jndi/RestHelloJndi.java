/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donde.curso.rest.hello.jndi;

import com.donde.adv.api.impl.JNDIServiceResolver;
import com.donde.curso.api.hello.HelloRemote;
import com.donde.curso.rest.hello.jndi.template.RestHelloJndiRemote;
import javax.ejb.Stateless;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author hugo.montero
 */
@Stateless(name = "RestHelloJndi")
public class RestHelloJndi implements RestHelloJndiRemote{

    @Override
    public Response sayHelloJNDI() {
        JNDIServiceResolver jndiServiceResolver = new JNDIServiceResolver();
        HelloRemote hello = jndiServiceResolver.getService(HelloRemote.SERVICE_NAME, HelloRemote.class);
        return Response.status(Response.Status.OK)
                .encoding(MediaType.APPLICATION_JSON)
                .entity(hello.sayHello())
                .build();
        
    }
    
}
