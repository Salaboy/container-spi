/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kie.container.docker.provider;

import org.kie.container.spi.model.ContainerInstance;



/**
 *
 * @author salaboy
 */
public class DockerContainerInstance implements ContainerInstance{

    
    @Override
    public void start() {
        System.out.println(">>> ALready Started");
    }

    @Override
    public void stop() {
        
    }
    
}
