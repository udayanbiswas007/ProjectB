<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<script type="text/javascript">
function call(str)
{
	document.f1.action=str;
	document.f1.submit();
	}

</script>


</head>
<body>

<table style="width:100%">
   <tr>
   </tr>
   <tr>
   </tr>
   <tr>
  </tr>
  <tr>
  	<td></td>
    <td>Id</td>
    <td>Name</td>		
    <td>Age</td>
  </tr>
</table>
<form:form name="f1" commandName="sun" >
<tr>
	<td>
		<input type="text" name="name">
	</td>
</tr>
<tr>
	<td>
<input type="text" name="age">
<tr>
	<td>
	<input type="submit" onclick="call('save');" value="save">

<tr>
	<td>
	<input type="submit"   onclick="call('show');" value ="show">
<c:forEach var="sun" items="${suns}">
<tr>
	<td>
	
	<c:out value="${sun.name}"></c:out>
	<c:out value="${sun.age}"></c:out>
	</td>
</tr>	
</c:forEach>
</form:form>
</body>
</html>