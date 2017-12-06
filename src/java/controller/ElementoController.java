/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ElementoModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
public class ElementoController {
    @RequestMapping(value="getAll")
    
    public String getAll(Model m)           
    {
        ElementoModel model = new ElementoModel();
        m.addAttribute("lst",model.getAll());
        
        return "data";
    }
}
