/**
 * 
 */
package com.maneeshsri.sample.home;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

/**
 * @author maneesh.kumar
 *
 */
@Test(groups = { "home" })
public class HomeServiceTest {
	
	private RestTemplate restClient = mock(RestTemplate.class);
	
	@Test
	public void getWeatherDataTest(){
		
	}
	
	

}
