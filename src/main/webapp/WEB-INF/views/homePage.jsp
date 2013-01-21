<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


	<h1>Home Page</h1>
	
	<form:form class="form" method="post" modelAttribute="displayLocation">
	   <form:input path="zip" class="input-block-level" placeholder="Zip Code" />
	   <button class="btn btn-large btn-primary" type="submit">Get Weather</button>
	</form:form>
	<p>
	    <br/>
		Temperature : <s:eval expression="displayLocation.temp" />
		<br/>
		<br/>
	    City : <s:eval expression="displayLocation.city" />
	    <br/>
	    <br/>
	    State : <s:eval expression="displayLocation.state" />
		
    </p>
