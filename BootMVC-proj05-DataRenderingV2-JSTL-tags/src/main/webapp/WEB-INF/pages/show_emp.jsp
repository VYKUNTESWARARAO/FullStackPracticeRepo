<%@ page language="java" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%-- 
<c:if test="${!empty empData}" >
	<b>EmpInfo:::: ${empData.id},${empData.empName},${empData.empAddress},${empData.sal}</b>
</c:if> --%>

<c:choose>
	<c:when test="${!empty empData}">

		<table border="1" bgcolor="cyan" align="center">
			<tr>
				<th>Emp Id</th>
				<th>Emp Name</th>
				<th>Emp Address</th>
				<th>Emp Sal</th>
			</tr>
			<c:forEach var="emp" items="${empData}">
					<tr>
					<td>${emp.id}</td>
					<td>${emp.empName}</td>
					<td>${emp.empAddress}</td>
					<td>${emp.sal}</td>
					</tr>

			</c:forEach>


		</table>

	</c:when>

</c:choose>