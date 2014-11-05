<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/hnne/privilege-control-tags" prefix="pc" %>
<%
	String path = request.getContextPath();
%>
<script type="text/javascript">
	$(document).ready(function() {
		// 为标签生成的菜单添加图标
		$("#i1").attr("class", "icon-home");
		$("#i2").attr("class", "icon-user");
		$("#i3").attr("class", "icon-tablet");
		$("#i4").attr("class", "icon-star");
		//　写死权限模块的路径
		$("#i4").parent().attr("href", "<%=path%>/privilege/privilege!index");
	});
</script>

<div class="logoRegion">
	<div class="span1 offset3" style="margin-top:30px;">
		<img src="<%=path%>/img/logo.png" class="img-circle" />
	</div>
	<div class="span5" style="margin-top:36px;">
		<h1>NE COMMON SYSTEM</h1>
	</div>
</div>

<!-- 导航菜单条 -->
<div id="navbar-example" class="navbar navbar-static">
	<div class="navbar-inner">
		<div class="container" style="width: auto;">
			<pc:MainMenuTag></pc:MainMenuTag>
		</div>
	</div>
</div>			

