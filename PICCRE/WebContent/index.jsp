<% response.sendRedirect("recruitment/job!queryAllDem"); %>

<html>
<body>
	Hello world!
</body>
</html>


<form action="" name="paginationform" method="post">
	<input id="paginationformpageNo" type="hidden" value="11" name="pageNo"/>
</form>
<script type="text/javascript">
	function pagination(pageNo){
		var idInput = document.getElementById("paginationformpageNo");
		idInput.setAttribute("value",pageNo);
		document.paginationform.submit();
	}
</script>