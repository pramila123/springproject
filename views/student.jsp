<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h1>
		<center>Student Form</center>
	</h1>
	<hr>
	<spring:form action="student" method="post" modelAttribute="smodel">
		<table>
			<tr>
				<td>FirstName</td>
				<td><spring:input path="fname" required="true" /></td>
			</tr>
			<tr>
				<td>LastName</td>
				<td><spring:input path="lname" required="true" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><spring:radiobutton path="gender" value="Male"/>Male
				<spring:radiobutton path="gender" value="Female"/>Female </td>
			</tr>
			<tr>
				<td>Date Of Birth</td>
				<td><spring:input path="dob" type="date" /></td>
			</tr>
			<tr>
				<td>Admission Year</td>
				<td><spring:input path="joiningDate" type="date" /></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><spring:input path="phone" required="true" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><spring:input path="email" /></td>
			</tr>
			<tr>
				<td>FatherName</td>
				<td><spring:input path="fathername" /></td>
			</tr>
<tr>
				<td>MotherName</td>
				<td><spring:input path="mothername" /></td>
			</tr>
<tr>
				<td>Parent's Contact</td>
				<td><spring:input path="parentcontact" /></td>
			</tr>
			<tr>
				<td>Faculty</td>
				<td><spring:input path="faculty.facname" /></td>
			</tr>
			<tr>
				<td>Country</td>
				<td><spring:input path="address.country" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><spring:input path="address.city" /></td>
			</tr>
			<tr>
				<td>State</td>
				<td><spring:select path="address.state">
				<spring:option value="Select">---Select---</spring:option>
				<spring:option value="State-1">State-1</spring:option>
				<spring:option value="State-2">State-2</spring:option>
				<spring:option value="State-3">State-3</spring:option>
				<spring:option value="State-4">State-4</spring:option>
				<spring:option value="State-5">State-5</spring:option>
				<spring:option value="State-6">State-6</spring:option>
				<spring:option value="State-7">State-7</spring:option>
				</spring:select> </td>
			</tr>
			<tr>
				<td>Zip</td>
				<td><spring:input path="address.zip" /></td>
			</tr>
			<tr>
				
				<td><input type="submit" value="submit" class="btn btn-primary"></td>
			</tr>

		</table>

	</spring:form>

</body>
</html>