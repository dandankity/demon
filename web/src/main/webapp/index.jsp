<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Caclulator</title>

</head>
<body>
    <%
        String errorStr ="";
		if( request.getAttribute("errorStr")!=null)
			errorStr=request.getAttribute("errorStr").toString();
     
		%>
<h1>Budget Query</h1>
<form action="caculate" method="post" name="information" id="information" onsubmit="return checkId()">
    name
    <input type="text" name="add1" id="name"></br>
    id&nbsp&nbsp&nbsp&nbsp&nbsp
    <input type="text" name="add2" id="id"></br></br>
    &nbsp&nbsp&nbsp&nbsp<input type="button" name="cancel" value="cancel" >&nbsp&nbsp&nbsp&nbsp&nbsp
    <input type="submit" name="submit" value="submit"> </br>
	<div><%=errorStr%></div>
</form>
</body>
</html>