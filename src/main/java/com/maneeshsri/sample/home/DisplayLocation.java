
package com.maneeshsri.sample.home;

import javax.validation.constraints.Pattern;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author maneeshkumar
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true) 
public class DisplayLocation {
	
	
	
	@NotEmpty
	@JsonProperty("zip")
	@Pattern(regexp = "\\d{5}", message="Invalid Zip Code")
	private String zip;
	
	
	@JsonProperty("city")
	private String city;
	
	@JsonProperty("state_name")
	private String state;
	
	private String temp;

	/**
	 * @return the zipCode
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the temp
	 */
	public String getTemp() {
		return temp;
	}

	/**
	 * @param temp the temp to set
	 */
	public void setTemp(String temp) {
		this.temp = temp;
	}

}
