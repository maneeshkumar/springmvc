/**
 * 
 */
package com.maneeshsri.sample.home;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertNotNull;

import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

/**
 * @author maneesh.kumar
 *
 */
@Test(groups = { "home" })
public class HomeServiceTest {
	
	private RestTemplate mockRestClient = mock(RestTemplate.class);
	
	private HomeService service = new HomeService();
	
	@Test
	public void getWeatherDataTest(){
		when(mockRestClient.getForObject("", WundergroundResponse.class)).thenReturn(getRestResponse());
		//MockRestServiceServer mockServer =  MockRestServiceServer.createServer(mockRestClient);
		DisplayLocation displayLocation = service.getWeatherData("12345");
		assertNotNull(displayLocation);
	}
	
	private WundergroundResponse getRestResponse(){
		WundergroundResponse res = new WundergroundResponse();
		CurrentObservation co = new CurrentObservation();
		DisplayLocation dl = new DisplayLocation();
		dl.setCity("CITY");
		dl.setCity("STATE");
        dl.setZip("12345");
        co.setDisplayLocation(dl);
		co.setTemperature("TEMP");
		return res;
	}

}
