package com.maneeshsri.sample.home;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.testng.Assert.assertEquals;

import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



@Test(groups = { "home" })
public class HomeControllerTest{
	
	private HomeService mockHomeService;
	
	private final HomeController controller = new HomeController();
	
    @BeforeMethod(alwaysRun = true)
    public void init(){
    	mockHomeService = mock(HomeService.class);
    }
	
	@Test
	public void indexTestForNullInput(){
		assertEquals(controller.index(null), "homePage");
	}
	
	@Test
	public void indexTestForAnyInput(){
		assertEquals(controller.index(new DisplayLocation()), "homePage");
	}
	
	/**
	@Test
	public void weatherTestForInvalidInput(){
		DisplayLocation input = new DisplayLocation();
		input.setZip("12345");
		when(mockHomeService.getWeatherData(input.getZip())).thenReturn(new CurrentObservation());
		Errors error = new BindException(input, "input");
		Model model = new ExtendedModelMap();
		assertEquals(controller.weather(input, error, model), "homePage");
	}
	**/
}