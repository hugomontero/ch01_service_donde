/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donde.curso.rest.hello;

import com.donde.curso.api.hello.HelloRemote;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author hugo.montero
 */
@Stateless
@LocalBean
public class Hello implements HelloRemote{

    @Override
    public String sayHello() {
        return "ahora ya me he actualizado";
    }
    
}
