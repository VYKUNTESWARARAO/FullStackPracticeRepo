<%@ page isELIgnored="false" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%-- <h1>model Attributes are ::: ${Name},${Age}</h1> --%>

<%-- <h1>Model Attributes are:::</h1>

<b>fav colors are ::<%= Arrays.toString(((String[])request.getAttribute("FavColors")))%> </b><br>
<b>Nick Names Are :: ${NickNames}</b><br>
<b>Players Are :: ${Games}</b><br>
<b>Fav Brands  Are :: ${Brands}</b><br> --%>

<h1>Model Attributes Are:::</h1>
<br>
<b>Favorite Colors Are==></b><br>
<c:forEach var="color" items="${FavColors}">${color},</c:forEach>
<br>
<b>Nick Names Are==></b><br>
<c:forEach var="name" items="${NickNames}">${name},</c:forEach>
<br>
<b>Players Are==></b><br>
<c:forEach var="Game" items="${Games}">${Game.key},${Game.value}==></c:forEach>
<br>
<b>Brands Are==></b><br>
<c:forEach var="Brand" items="${Brands}">${Brand}</c:forEach>
<br>


