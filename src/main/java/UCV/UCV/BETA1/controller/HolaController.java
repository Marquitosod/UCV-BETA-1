package UCV.UCV.BETA1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HolaController {

	@GetMapping("/home")
    public String home () {            
    	    return "holajoaquin";	
    	   
    	   }}
    
    
   		
   
    		
    









