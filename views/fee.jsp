<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="spring"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
	<spring:form action="fee"
		method="post" modelAttribute="fmodel">
		<table>
			<tr>
				<td>Fee Type</td>
				<td><spring:input path="feetype" /></td>
			</tr>
			<tr>
				<td>Tuition Fee</td>
				<td><spring:input path="tuitionfee" /></td>
			</tr>
			<tr>
				<td>Lab fee</td>
				<td><spring:input path="labfee" /></td>
			</tr>
			<tr>
				<td>Transportation fee</td>
				<td><spring:input path="transportationfee" /></td>
			</tr>
			<tr>
				<td>Development fee</td>
				<td><spring:input path="developmentfee" /></td>
			</tr>
			<tr>
				<td>Library fee</td>
				<td><spring:input path="libraryfee" /></td>
			</tr>
			<tr>
				<td>Other fee</td>
				<td><spring:input path="otherfee" /></td>
			</tr>
			<tr>
				<td>Discount</td>
				<td><spring:input path="discount" /></td>
			</tr>
			<tr>
				<td>Paid Amount</td>
				<td><spring:input path="paidamount" /></td>
			</tr>
			<tr>
				<td>Student_Id</td>
				<td><spring:input path="student.studentId" /></td>
				
				
			</tr>
			
			<tr>
				<td><input type="submit" value="Add" class="btn btn-primary"></td>
				
			</tr>
		</table>
	</spring:form>

</body>
</html>