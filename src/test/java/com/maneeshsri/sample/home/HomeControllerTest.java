package com.maneeshsri.sample.home;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.testng.annotations.Test;



@Test(groups = { "home" })
public class HomeControllerTest{
	
	private HomeService mockHomeService = mock(HomeService.class);
	
	private final HomeController controller = new HomeController(mockHomeService);
	
	private BindingResult mockBindingResult = mock(BindingResult.class);
	
	
	private Model model = mock(Model.class);
	
   
	@Test
	public void indexTestForNullInput(){
		assertEquals(controller.index(null), "homePage");
	}
	
	@Test
	public void indexTestForAnyInput(){
		assertEquals(controller.index(new DisplayLocation()), "homePage");
	}
	
	
	@Test
	public void weatherTestForValidInput(){
		DisplayLocation input = new DisplayLocation();
		input.setZip("12345");
		when(mockBindingResult.hasErrors()).thenReturn(false);
		when(mockHomeService.getWeatherData(input.getZip())).thenReturn(new DisplayLocation());
		assertEquals(controller.weather(input, mockBindingResult, model), "homePage");
	}
	
	@Test
	public void weatherTestForInvalidInput(){
		when(mockBindingResult.hasErrors()).thenReturn(true);
		assertEquals(controller.weather(null, mockBindingResult, model), "errorPage");
	}
	
	
	
}