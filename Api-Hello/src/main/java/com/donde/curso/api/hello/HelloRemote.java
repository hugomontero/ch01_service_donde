/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donde.curso.api.hello;

import com.donde.adv.api.ADVService;
import com.donde.adv.api.ADVServiceName;

/**
 *
 * @author hugo.montero
 */
@ADVServiceName(remoteName = HelloRemote.REMOTE_NAME,
        serviceName = HelloRemote.SERVICE_NAME,
        webServiceName = HelloRemote.WEBSERVICE_NAME
        )
public interface HelloRemote extends ADVService{
    public static final String REMOTE_NAME = "HelloRemote";
    public static final String SERVICE_NAME = "Hello";
    public static final String WEBSERVICE_NAME = "HelloWS";
    
    public String sayHello();
    
}
