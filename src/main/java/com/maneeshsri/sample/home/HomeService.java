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

	private RestTemplate restClient = new RestTemplate();

	@Value("${app.apiKey}")
	private String apiKey;
	

	@Value("${app.restUrl}")
	private String restUrl;
	
	

	/**
	 * Using the restTemplate we are getting the response
	 * 
	 * @param zipCode
	 * @return
	 */
	public CurrentObservation getWeatherData(String zipCode) {
		String url = restUrl+apiKey+"/conditions/q/" + zipCode + ".json";
	
		WundergroundResponse response = restClient.getForObject(url, WundergroundResponse.class);
		return response.getCurrentObservation();
	}

}
