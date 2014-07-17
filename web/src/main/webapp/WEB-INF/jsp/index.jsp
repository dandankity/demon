<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Calculator</title>

</head>
<body>
    <%
        String result ="";
		if( request.getAttribute("result")!=null)
			result=request.getAttribute("result").toString();
     
		%>
<h1>Calculator</h1>
<form action="budget" method="post" name="information" id="information">
    EmployeeID
    <input type="text" name="id" ></br>
    Name
    <input type="text" name="name" ></br></br>
    &nbsp&nbsp&nbsp&nbsp<input type="button" name="cancel" value="cancel" >&nbsp&nbsp&nbsp&nbsp&nbsp
    <input type="submit" name="submit" value="submit"> </br>
	<div><%=result%></div>
</form>
</body>
</html>