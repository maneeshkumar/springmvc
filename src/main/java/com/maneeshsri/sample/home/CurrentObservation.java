/**
 * 
 */
package com.maneeshsri.sample.home;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author maneeshkumar
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true) 
public class CurrentObservation {
	
	@JsonProperty("display_location")
	private DisplayLocation displayLocation;

	
	@JsonProperty("temperature_string")
	private String temperature;
	
	/**
	 * @return the displayLocation
	 */
	public DisplayLocation getDisplayLocation() {
		
		return displayLocation;
	}

	/**
	 * @param displayLocation the displayLocation to set
	 */
	public void setDisplayLocation(DisplayLocation displayLocation) {
		this.displayLocation = displayLocation;
	}
	
	/**
	 * @return the temparature
	 */
	public String getTemperature() {
		return temperature;
	}

	/**
	 * @param temparature the temparature to set
	 */
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	
	
	

}
