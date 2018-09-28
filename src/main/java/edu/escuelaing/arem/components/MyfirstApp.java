/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.components;

import edu.escuelaing.arem.aplicationServer.Component;
import edu.escuelaing.arem.aplicationServer.Mapping;

@Component
public class MyfirstApp {
    
    @Mapping("/results")
    public Double resultado(){
        return Math.PI;
    }
    
}
