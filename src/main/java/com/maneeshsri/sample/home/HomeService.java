/**
 * 
 */
package com.maneeshsri.sample.home;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
/**
 * @author maneeshkumar
 * 
 */

@Service
public class HomeService {

	private RestTemplate restClient ;

	@Value("${app.apiKey}")
	private String apiKey;
	

	@Value("${app.restUrl}")
	private String restUrl;
	
	public HomeService(){
		this.restClient = new RestTemplate();
	}
	
	

	/**
	 * Using the restTemplate we are getting the response
	 * 
	 * @param zipCode
	 * @return
	 */
	public DisplayLocation getWeatherData(String zipCode) {
		String sUrl = (restUrl==null || apiKey == null) ? "http://api.wunderground.com/api/ed044d75b91fb500" :this.restUrl+this.apiKey;
		
		String url = sUrl+"/conditions/q/" + zipCode + ".json";
	
		WundergroundResponse response = this.restClient.getForObject(url, WundergroundResponse.class);
		CurrentObservation currentObservation = response.getCurrentObservation();
		DisplayLocation displayLocation = currentObservation.getDisplayLocation();
		displayLocation.setTemp(currentObservation.getTemperature());
		return displayLocation;
	}

}
