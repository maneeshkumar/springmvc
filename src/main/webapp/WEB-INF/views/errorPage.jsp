<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


	<h1>Error Page</h1>
	<p>
	    <h2><s:eval expression="error" /></h2>
	    
	    <s:url value="/" var="home"></s:url>
	    
	    <a href="${home}">Continue</a>
		
    </p>
