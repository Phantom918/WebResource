<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!-- 过渡类型：当需要利用 HTML在表现上的特性时，并且当需要为那些不支持层叠样式表的浏览器编写 XHTML 时。 -->
<!DOCTYPE html 
PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="anthor" content="SONY-XL" />
<title>登录</title>
<link rel="icon" href="img/PICC_icon.png" type="image/x-icon" />
<link rel="shortcut icon" href="img/PICC_icon.png" type="image/x-icon" />
<link href="<%=path %>/css/common/bootstrap.min.css" rel="stylesheet" media="screen" />
<link href="<%=path %>/css/common/bootstrap-theme.min.css" rel="stylesheet" media="screen" />
<link href="<%=path %>/css/common/docs.css" rel="stylesheet" media="screen" />
<link href="<%=path %>/css/common/github.css" rel="stylesheet" media="screen" />
<link href="<%=path %>/css/common/accordionMenu.css" rel="stylesheet" media="screen" />
<link href="<%=path %>/css/common/picc-common.css" rel="stylesheet" media="screen" />
<script src="<%=path %>/js/common/jquery-1.7.2.min.js"></script>
<link href="<%=path %>/css/common/daterangepicker-bs3.css" rel="stylesheet" media="screen" />
<script type="text/javascript" src="<%=path %>/js/common/moment.js"></script>
<script type="text/javascript" src="<%=path %>/js/common/daterangepicker.js"></script>

<script src="<%=path %>/js/common/bootstrap.min.js"></script>
<script src="<%=path %>/js/common/respond.min.js"></script>
<script src="<%=path %>/js/common/picc-common.js"></script>
<!-- jQuery validate -->
<script src="<%=path%>/js/common/additional-methods.min.js" ></script>
<script src="<%=path%>/js/common/jquery.validate.bootstrap.js"  ></script>
<script src="<%=path%>/js/common/jquery.validate.min.js"  ></script>
<script src="<%=path%>/js/common/messages_zh.js"  ></script>


<script type="text/javascript">

	$(document).ready(function() {
		if(self.frameElement && self.frameElement.tagName=="IFRAME"){
			window.parent.location.href="login!login";
		}
		
		//
		$(document).on("click","#loginFailure button",function(){
				window.location.href="login!login.action"; 
		});
		
		
		
		//登录失败提示
		var pageStatue = $("#popStatue").val();
		if(pageStatue == 8){
			$("#loginFailure").modal("toggle");
		}else if(pageStatue == 3){
			$("#fixPassSuccess").modal("toggle");
		}else if(pageStatue == 101){
			$("#fixPassFailure").modal("toggle");
		}
		
		//document.getElementById("input1").focus();
		 //jQuery验证
        $("#findPassword").validate({
			rules:{
				"userInfo.username":{
					required:true,
					rangelength:[4,15]
				},
				"userInfo.email":{
					required:true,
					email:true
				}
			},
			messages: {
				"userInfo.username":{
					required: "必填项！",
				    rangelength: "用户名的长度必须在4-15个字符之间！",
				},
				"userInfo.email":{
					required:"必填项！",
				    email:"邮件格式有误！",
				}
			    
			},
		});
		
		// Ajax验证用户名和密码是否正确
		$("#validateButton").click(function (){
			$.ajax({
			   type: "POST",
			   url: "login!checkIdAndPassword.action",
			   data: "userBasic.loginId=" + $("#validateLoginId").val() + "&userBasic.loginPwd=" + $("#validateLoginPwd").val(),
			   success: function(msg){
			     if(msg != "") {
			     	$("#validateModal").modal("hide");
			     	$("#updatePasswordModal").modal("show");
			     	$("#userId").val(msg);
			     } else {
			     	$("#validateFail").modal("show");
			     }
			   }
			}); 
		});
		
	});
	
</script>
</head>
<body style="background-image:url(<%=path %>/img/login-bg.jpg);" >
	<!-- 登陆成功与否状态位记录点 -->
	<input id="popStatue" type="text" value='<s:property value="pageStatus" />' style="display:none;" />
 	
    <div class="col-md-12">
    	<div class="text-center col-md-12" style="color:#FFF;">
        	<h1>PICC 人 力 资 源 管 理 系 统</h1>
        </div>
            <form class="form-horizontal col-md-4 col-md-offset-4 panel panel-info login-shadow " style="margin-top:50px;" id="loginForm"  action="login!isExist.action"  method="post"  name="loginAction">
                <h3 class="text-center login-title col-md-12">登&nbsp;&nbsp;录</h3>
                <div class="col-md-8 col-md-offset-2 input-group input-group-sm margin-top-2">
                    <span class="glyphicon glyphicon-user input-group-addon"></span>
                    <input type="text" class="form-control " id="loginForm_userName"  placeholder="请输入用户名" name="userBasic.loginId" />
                </div>
                <div class="col-md-8 col-md-offset-2 input-group input-group-sm margin_top">
                    <span class="input-group-addon glyphicon glyphicon-lock"></span>
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="请输入密码" name="userBasic.loginPwd" />
                </div>
                <div class="col-md-8 col-sm-8 col-md-offset-2 col-sm-offset-2 margin-top-2">
                    <button type="submit" class="btn btn-success btn-sm"> 
                    	<span class="glyphicon glyphicon-log-in"></span> 登 录  
                    </button>
                    <!--
                    <button type="button" class="btn btn-default btn-sm"  data-toggle="modal" data-target="#registerModal">
                        <span class="glyphicon glyphicon-leaf"></span> 注 册
                    </button>
                    -->
                    <button type="button" class="btn btn-sm btn-default" data-toggle="modal" data-target="#findPassword">
                        <span class="glyphicon glyphicon-question-sign"></span> 忘 记
                    </button>
                </div>
            </form>
        
        
    </div>
   
    
    <!-- 注册模态对话框 -->
	<!-- Modal -->
	<form class="modal fade form-horizontal" method="post" action="login!Regist" id="registerModal"  tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
		<s:token></s:token><!-- struts2防止表单重复提交 -->
		<div class="modal-dialog">
			<div class="modal-content ">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h3 class="modal-title text-info" id="myModalLabel"> 用户注册</h3>
				</div>
				<div class="modal-body col-md-offset-2">
					<!--<form id="registerForm" class="form-horizontal" role="form">-->
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-3 control-label">用户名：</label>
						<div class="col-sm-6 col-md-offset-1">
							<input id="registerModal_userName" type="text" class="form-control" placeholder="请输入用户名" name="userName" />
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-3 control-label">密码：</label>
						<div class="col-sm-6 col-md-offset-1">
							<input type="password" class="form-control" id="password" placeholder="请输入密码" name="password" />
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-3 control-label">密码：</label>
						<div class="col-sm-6 col-md-offset-1">
							<input type="password" class="form-control" id="passwordAgain" placeholder="请再次输入密码" name="passwordAgain" />
						</div>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-3 control-label">邮箱：</label>
						<div class="col-sm-6 col-md-offset-1">
							<input type="email" class="form-control" id="inputEmail" placeholder="请输入邮箱号" name="email">
						</div>
					</div>
					<!--</form>-->
				</div>
				<div class="modal-footer">
					<div class="col-md-5 col-md-offset-7">
						<div class="col-md-6">
							<button type="button" class="btn btn-default col-md-12" data-dismiss="modal">取消</button>
						</div>
						<div class="col-md-6">
							<button id="registbutton" type="submit" class="btn btn-success  col-md-12">确定</button>
						</div>
					</div>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</form>
	<!-- /.modal -->



	<!-- 找回密码模态对话框 -->
	<form class="modal fade form-horizontal" action="login!updatePassword" method="post" id="findPassword" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
		<div class="modal-dialog">
			<div class="modal-content ">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h3 class="modal-title text-info" id="myModalLabel">密码找回</h3>
				</div>
				<div class="modal-body col-md-offset-2">
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-3 control-label">用户名：</label>
						<div class="col-sm-6 col-md-offset-1">
							<input id="findPassword_userName" type="text" class="form-control" placeholder="请输入用户名" name="userBasic.loginId" />
						</div>
					</div>
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-3 control-label">邮箱号：</label>
						<div class="col-sm-6 col-md-offset-1">
							<input type="email" class="form-control" id="findPassword_email" placeholder="请输入注册邮箱" name="userBasic.emailAddr" />
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<div class="col-md-5 col-md-offset-7">
						<div class="col-md-6">
							<button type="button" class="btn btn-default col-md-12 btn-sm" data-dismiss="modal"> 取 消</button>
						</div>
						<div class="col-md-6">
							<button type="submit" class="btn btn-success  col-md-12 btn-sm"> 确定</button>
						</div>
					</div>
				</div>
			</div> <!-- /.modal-content -->
		</div> <!-- /.modal-dialog -->
	</form> <!-- /.modal -->
	
	<!-- Modal -->
	<div class="modal fade" id="loginFailure" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"  data-backdrop="static">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	        <h4 class="modal-title" id="myModalLabel">提示</h4>
	      </div>
	      <div class="modal-body">
	        <p class="text-info" style="font-size:18px;">登录失败，您的用户名或密码有误！</p>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-success btn-sm" data-dismiss="modal">确定</button>
	      </div>
	    </div><!-- /.modal-content -->
	  </div><!-- /.modal-dialog -->
	</div><!-- /.modal -->
	
	<!-- Modal -->
	<div class="modal fade" id="fixPassSuccess" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	        <h4 class="modal-title" id="myModalLabel">提示</h4>
	      </div>
	      <div class="modal-body">
	        <p class="text-info" style="font-size:18px;">密码修改成功！</p>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-success btn-sm" data-dismiss="modal">确定</button>
	      </div>
	    </div><!-- /.modal-content -->
	  </div><!-- /.modal-dialog -->
	</div><!-- /.modal -->
	
	<!-- Modal -->
	<div class="modal fade" id="fixPassFailure" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
	        <h4 class="modal-title" id="myModalLabel">提示</h4>
	      </div>
	      <div class="modal-body">
	        <p class="text-info" style="font-size:18px;">密码修改失败，请稍后再试！</p>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-success btn-sm" data-dismiss="modal">确定</button>
	      </div>
	    </div><!-- /.modal-content -->
	  </div><!-- /.modal-dialog -->
	</div><!-- /.modal -->
	
	
	</div>
	
</body>
</html>