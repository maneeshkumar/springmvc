package com.maneeshsri.sample.home;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author maneeshkumar
 *
 */

@Controller
public class HomeController {
	
	@Autowired
	private HomeService service;
	
	/**
	 * Landing page of your application
	 * 
	 * @param data
	 * @return
	 */
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(@ModelAttribute DisplayLocation data) {
		return "homePage";
	}
	
	/**
	 * Get the all the details based on zipCode
	 * 
	 * @param data
	 * @param errors
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String weather(@Valid @ModelAttribute DisplayLocation data, Errors errors, Model model){
		if(errors.hasErrors()){
			model.addAttribute("error", "Invalid Zip Code");
			return "errorPage";
		}
		else{
			CurrentObservation result = service.getWeatherData(data.getZip());
			DisplayLocation response = result.getDisplayLocation();
			response.setTemp(result.getTemperature());
			model.addAttribute(response);
		}
	    
	    return "homePage";
	}
	
	public HomeService getService(){
		return this.service;
	}
}
