<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>

	<%@ include file="header.jsp"%>
	<table id="myTable" class="table table-stripted">
		<thead>
			<tr class="success">
				<td>StudentId</td>
				<td>FirstName</td>
				<td>LastName</td>
				<td>Faculty</td>
				<td>Country</td>
				<td>Action</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="std" items="${slist}">
				<tr class="danger">
					<td>${std.studentId }</td>
					<td>${std.fname }</td>
					<td>${std.lname }</td>
					<td>${std.faculty.facname }</td>
					<td>${std.address.country}</td>
					<td><input type="submit" class="btn btn-success" onclick="edit(${std.studentId})"
						value="edit"> <input type="submit" class="btn btn-danger"
						onclick="deleteStudent(${std.studentId})" value="delete">
						<input type="submit"  class="btn btn-primary" onclick="addFee(${std.studentId})"
						value="AddFee"></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<script type="text/javascript">
	
	function edit(studentId) {
		window.location="${pageContext.request.contextPath}/"+studentId+"/edit";
		
	}
	function deleteStudent(studentId) {
		var msg=confirm("Do you want to delete?");
		if(msg==true)
			{
		window.location="${pageContext.request.contextPath}/"+studentId+"/delete";
		
			}
	}
	function addFee(studentId) {
		window.location="${pageContext.request.contextPath}/"+studentId+"/addFee";
		
	}	
	$(document).ready( function () {
	    $('#myTable').DataTable();
	} );
	
</script>
	<!--  	
	<h1>Fee Module</h1><hr>
	
	<table border="1">
	<thead>
		<tr>
			<td>FeeId</td>
			<td>FeeType</td>
			<td>StudentId</td>
			
			<td>Action</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="ftd" items="${flist}">
			<tr>
				<td>${ftd.feeId }</td>
				<td>${ftd.feetype }</td>
				<td>${ftd.student.studentId }</td>
				
				<td> <input type="submit" onclick="editFee(${ftd.feeId})" value="edit"> <input
					type="submit"  onclick="deleteFee(${ftd.feeId})"value="delete"> 
					
			</tr>
		</c:forEach>
	</tbody>
</table>
<script type="text/javascript">

function editFee(feeId) {
	window.location="${pageContext.request.contextPath}/"+feeId+"/editFee";
	
}
function deleteFee(feeId) {
	var msg=confirm("Do you want to delete?");
	if(msg==true)
		{
	window.location="${pageContext.request.contextPath}/"+feeId+"/deleteFee";
	
		}
	
}

$(document).ready( function () {
    $('#myTable').DataTable();
} );	
	</script>-->
</body>
</html>
