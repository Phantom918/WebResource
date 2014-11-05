<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>PICCRE登陆</title>
<link rel="icon" href="<%=path %>/img/PICC_icon.png" type="image/x-icon" />
<link rel="shortcut icon" href="<%=path %>/img/PICC_icon.png" type="image/x-icon" />
<link href="<%=path %>/css/bootstrap.min.css" rel="stylesheet" media="all" />
<link href="<%=path %>/css/bootstrap-theme.min.css" rel="stylesheet" media="all" />
<link href="<%=path %>/css/docs.css" rel="stylesheet" media="screen" />
<link href="<%=path %>/css/github.css" rel="stylesheet" media="screen" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<%=path %>/js/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="<%=path %>/js/loginComputer.js" type="text/javascript"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="<%=path %>/js/bootstrap.min.js"></script>
<script src="<%=path %>/js/respond.min.js"></script>
<!-- jQuery validate -->
<script src="<%=path %>/js/additional-methods.min.js" type="text/javascript"></script>
<script src="<%=path %>/js/jquery.validate.bootstrap.js" type="text/javascript"></script>
<script src="<%=path %>/js/jquery.validate.min.js" type="text/javascript"></script>
<script src="<%=path %>/js/messages_zh.js" type="text/javascript"></script>

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
<![endif]-->

<script type="text/ecmascript">
	$(document).ready(function(e) {
		
    });

</script>

<style type="text/css">
	
	body{font-family:"ff-tisa-web-pro-1","ff-tisa-web-pro-2","Lucida Grande","Helvetica Neue",Helvetica,Arial,"Hiragino Sans GB","Hiragino Sans GB W3","WenQuanYi Micro Hei",sans-serif;}
	/*所有文字的字体*/
	*{ font-family:"ff-tisa-web-pro-1","ff-tisa-web-pro-2","Lucida Grande","Helvetica Neue",Helvetica,Arial,"Hiragino Sans GB","Hiragino Sans GB W3","Microsoft YaHei UI","Microsoft YaHei","WenQuanYi Micro Hei",sans-serif}
	h1, .h1, h2, .h2, h3, .h3, h4, .h4, .lead {font-family:"ff-tisa-web-pro-1","ff-tisa-web-pro-2","Lucida Grande","Helvetica Neue",Helvetica,Arial,"Hiragino Sans GB","Hiragino Sans GB W3","Microsoft YaHei UI","Microsoft YaHei","WenQuanYi Micro Hei",sans-serif;}
	/*连接样式*/
	a{ cursor:pointer; }
	.margin_top{ margin-top:0.5em }
	.margin_bottom{ padding-top:1em }
	.title_top{font-size:18px; font-weight:500; margin-top:0.5em; text-shadow: 0px 1px 0px rgba(0, 0, 0, 0.15) }
   .login-title{ background-color:#09F; line-height:2em; margin-top:-.62em; border-radius:0.1em; }
   .margin-top-1{ margin-top:0.5em }
   .margin-top-2{ margin-top:1em }
   .margin-top-3{ margin-top:2em }
   .margin-top-4{ margin-top:4em }
   
   
   /* Footer
-------------------------------------------------- */

.footer {
    text-align: center;
    padding: 30px 0;
    margin-top: -30px;/*70px*/
    border-top: 1px solid #e5e5e5;/*  e5e5e5   006666 */
    background-color: #f5f5f5  ; /*  f5f5f5  0099CC  */
}
.footer p {
    margin-bottom: 0;
    color: #777; /*  #777  */
}
.footer-links {
    margin: 10px 0;
}
.footer-links li {
    display: inline;
    padding: 0 2px;
}
.footer-links li:first-child {
    padding-left: 0;
}
   
	
</style>


<script type="text/javascript">
	 $(document).ready(function(e) {
		if($("#pageStatus").val() == 8) {
			$("#test_content").html("登录失败！");
			$("#test_model").modal("show");
		} else if($("#pageStatus").val() == 204) {
			$("#test_content").html("用户名或密码不正确！");
			$("#test_model").modal("show");
		} else if($("#pageStatus").val() == 3) {
			$("#test_content").html("密码修改成功！");
			$("#test_model").modal("show");
		} else if($("#pageStatus").val() == 201) {
			$("#test_content").html("密码修改失败！");
			$("#test_model").modal("show");
		}else if($("#pageStatus").val() == 401) {
			$("#test_content").html("注册成功！");
			$("#test_model").modal("show");
		}else if($("#pageStatus").val() == 402) {
			$("#test_content").html("注册失败！");
			$("#test_model").modal("show");
		}
		 //jQuery验证
        $("#registerModal").validate({
			rules:{
				"loginUser.name":{
					required:true,
					rangelength:[4,15],
					remote : { //　ajax验证用户名是否已存在
						url : "login!checkName.action",
						type : "post",
						dateType : "html",
						async:false,
						data: {
							"loginUser.name" : function() {
								return $("#registerModal_userName").val();
							}
						},
						dataFilter : function(data, type) {
							if (data == "true") {
								return data;
							}else {
								return false;
							}
						}
					} 
				},
				"loginUser.password":{
					required:true,
					rangelength:[6,15]
				},
				"loginUser.passAgain":{
					required:true,
					equalTo:"#password"
				},
				"loginUser.email":{
					required:true,
					email:true
				}
			},
			messages: {
				"loginUser.name" : {
				    required: "此项不能为空",
				    rangelength: "字符长度需在4-15之间",
				   	remote : "该用户已存在"
				},
				"loginUser.password" : {
				    required: "此项不能为空",
				    rangelength: "字符长度需在6-15之间"
				},
				"loginUser.passAgain" : {
				    required: "此项不能为空",
				    equalTo:  "两次输入密码不符"
				},
				"loginUser.email" : {
				    required: "此项不能为空",
				    email: "邮箱格式有误",
				    remote : "该邮箱已注册"
			    }
			}
		});  
      //jQuery验证
       /*  $("#findPassword").validate({
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
					required: jQuery.i18n.prop("login.requierd"),
				   // rangelength: $.validator.format(jQuery.i18n.prop("login.range"))
				},
				"userInfo.email":{
					required: jQuery.i18n.prop("login.requierd"),
				    email: jQuery.i18n.prop("login.validemail")
				}
			    
			}
		}); */
	
     }); 

</script>

</head>

<body>
 	<div class="container" >
 	<!-- 获取网页状态 -->
		<input type="hidden" id="pageStatus" value="<s:property value='pageStatus' />"/>
    	<!-- 图标区域 -->
		<div class="row margin-top-2">
        	<div class="col-md-12 col-xs-12" style="width: 200px; height: 27px;">
            	<img src="<%=path %>/img/picc_logo_s.png" alt="logo" class="img-responsive img-rounded" />
            </div>
        </div>	
        <!-- 中间轮播图和登陆区域 -->
        <div class="row margin-top-3">
        	<div class="col-md-7 col-xs-12">
                <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                  <!-- Indicators -->
                  <ol class="carousel-indicators">
                    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="3"></li>
                  </ol>
                
                  <!-- Wrapper for slides -->
                  <div class="carousel-inner">
                  	<!-- 单个图片 -->
                    <div class="item active">
                      <img src="<%=path %>/img/h1.jpg" alt="山水一" class="img-responsive img-rounded" />
                      <!-- 文字说明区域 -->
                      <div class="carousel-caption">
                        这里是《被窝是青春的坟墓》剧组1号
                      </div>
                    </div>
                    
                    <div class="item">
                      <img src="<%=path %>/img/h2.jpg" alt="山水二" class="img-responsive img-rounded" />
                      <!-- 文字说明区域 -->
                      <div class="carousel-caption">
                        这里是《被窝是青春的坟墓》剧组2号
                      </div>
                    </div>
                    
                    <div class="item">
                      <img src="<%=path %>/img/h3.jpg" alt="山水三" class="img-responsive img-rounded" />
                      <!-- 文字说明区域 -->
                      <div class="carousel-caption">
                        这里是《被窝是青春的坟墓》剧组3号
                      </div>
                    </div>
                    
                    <div class="item">
                      <img src="<%=path %>/img/h4.jpg" alt="山水四" class="img-responsive img-rounded" />
                      <!-- 文字说明区域 -->
                      <div class="carousel-caption">
                        这里是《被窝是青春的坟墓》剧组4号
                      </div>
                    </div>
                    
                  </div>
                
                  <!-- 轮播左右翻页的控制 Controls -->
                  <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left"></span>
                  </a>
                  <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right"></span>
                  </a>
                </div>
            </div><!-- end of col-md-6 col-xs-12 -->
            <div class="col-md-4 col-md-offset-1 col-xs-12 ">
       
                <div class="col-md-12 panel panel-primary panel-body">                    <div class="row">
                        <form id="loginForm" role="form" action="login!isExist.action" method="post">
                            <h3 class="text-center login-title">登&nbsp;&nbsp;录</h3>
                            <div class="col-md-8 col-md-offset-2 com-md-push-2 input-group margin_top">
                                <span class="input-group-addon glyphicon glyphicon-lock"></span>
                                <input type="text" class="form-control"  placeholder="请输入用户名" name="loginUser.name"/>
                            </div>
                            <div class="col-md-8 col-md-offset-2 com-md-push-2 input-group margin_top">
                                <span class="input-group-addon glyphicon glyphicon-lock"></span>
                                <input type="password" class="form-control"  placeholder="请输入密码" name="loginUser.password"/>
                            </div>
                            <div class="col-md-8 col-md-offset-2 com-md-push-2 margin-top-2">
                                <button type="submit" class="btn btn-success btn-sm">
                                    <span class="glyphicon glyphicon-log-in"></span> 登 录
                                </button>
                                <button type="button" class="btn btn-default btn-sm"  data-toggle="modal" data-target="#registerModal">
                                    <span class="glyphicon glyphicon-leaf"></span> 注 册
                                </button>
                            </div>
                        </form>
                    </div>
                </div><!--  -->
                
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h3 class="panel-title">温馨提示</h3>
                    </div>
                    <div class="panel-body">
                        <p>请在试用本软件时，如果使用IE需要使用IE8及其上版本，其他浏览器无此限制，祝您使用愉快！</p>
                    </div>
                </div>
       
            </div>
            
          </div>
    
    </div><!--  end of container -->
    
   <footer class="footer" style="margin-top: 30px;">
    	<div class="container" style="color:#FFF;">
        	<p>Copyright&nbsp;&copy;2013&nbsp;–&nbsp;2014&nbsp;PICC. All&nbsp;Rights&nbsp;Reserved</p>
			<p> 中国人民财产保险股份有限公司 湖南省分公司 版权所有</p>
        </div>
    </footer>
    
    
    
    <!-- 注册模态对话框 -->
    <!-- Modal -->
    <form class="modal fade form-horizontal" method="post" action="<%=path %>/login!regist" id="registerModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
      <div class="modal-dialog">
        <div class="modal-content ">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
            <h3 class="modal-title text-info" id="myModalLabel">用户注册</h3>
          </div>
          <div class="modal-body col-md-offset-2">
          	<!--<form id="registerForm" class="form-horizontal" role="form">-->
              <div class="form-group">
                <label for="inputPassword3" class="col-sm-3 control-label">用户名：</label>
                <div class="col-sm-6 col-md-offset-1">
                  <input id="registerModal_userName" type="text" class="form-control" placeholder="请输入用户名" name="loginUser.name"/>
                </div>
              </div>
              <div class="form-group">
                <label for="inputPassword3" class="col-sm-3 control-label">密码：</label>
                <div class="col-sm-6 col-md-offset-1">
                  <input type="password" class="form-control" id="password" placeholder="请输入密码" name="loginUser.password"/>
                </div>
              </div>
              <div class="form-group">
                <label for="inputPassword3" class="col-sm-3 control-label">密码确认：</label>
                <div class="col-sm-6 col-md-offset-1">
                  <input type="password" class="form-control" id="asas" placeholder="请再次输入密码" name="loginUser.passAgain"/>
                </div>
              </div>
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-3 control-label">邮箱：</label>
                <div class="col-sm-6 col-md-offset-1">
                  <input type="email" class="form-control" id="inputEmail" placeholder="请输入邮箱" name="loginUser.email"/>
                </div>
              </div>
            <!--</form>-->
          	
          </div>
          <div class="modal-footer">
          	<div class="col-md-5 col-md-offset-7">
            	<div class="col-md-6">
                	 <button type="button" class="btn btn-default col-md-12" data-dismiss="modal"> 取消</button>
                </div>
                <div class="col-md-6">
                	<button id="registbutton" type="submit" class="btn btn-success  col-md-12"> 确定</button>
                </div>
            </div>
           
            
          </div>
        </div><!-- /.modal-content -->
      </div><!-- /.modal-dialog -->
    </form><!-- /.modal -->
    
    
    

<!-- 验证失败 -->
		<!-- 数据上传成功后提交模态对话框 -->
        <!-- Modal -->
        <div class="modal fade form-horizontal" id="validateFail" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
          <div class="modal-dialog">
            <div class="modal-content ">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h3 class="modal-title text-info" id="myModalLabel">提示</h3>
              </div>
              <div class="modal-body">
              		<div class="text-center">
                    	<h2>用户名或者密码有误</h2>
                    </div>
              </div>
              <div class="modal-footer">
                <button class="btn btn-success" data-dismiss="modal" aria-hidden="true"> 确定</button>
              </div>
              
            </div><!-- /.modal-content -->
          </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
        
        <!--  -->
        <!-- Modal -->
        <div class="modal fade form-horizontal" id="test_model" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
          <div class="modal-dialog">
            <div class="modal-content ">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h3 class="modal-title text-info" id="myModalLabel">提示</h3>
              </div>
              <div class="modal-body">
              		<div class="text-center">
                    	<h2 id="test_content"></h2>
                    </div>
              </div>
              <div class="modal-footer">
                <button class="btn btn-success" data-dismiss="modal"
					aria-hidden="true">
					确定
				</button>
              </div>
              
            </div><!-- /.modal-content -->
          </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
    
    
  

</body>
</html>
