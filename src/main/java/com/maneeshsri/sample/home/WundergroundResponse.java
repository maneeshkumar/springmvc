/**
 * 
 */
package com.maneeshsri.sample.home;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author maneesh.kumar
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true) 
public class WundergroundResponse {
	
	//Wunderground
	
	@JsonProperty("current_observation")
	private CurrentObservation currentObservation;

	/**
	 * @return the currentObservation
	 */
	public CurrentObservation getCurrentObservation() {
		return currentObservation;
	}

	/**
	 * @param currentObservation the currentObservation to set
	 */
	public void setCurrentObservation(CurrentObservation currentObservation) {
		this.currentObservation = currentObservation;
	}
	
	
	
	
	

}
