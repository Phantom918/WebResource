<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="/hnne/pagination-tags" prefix="p"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<!DOCTYPE>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>PICCRE职位中心</title>
    <link rel="icon" href="<%=path %>/img/PICC_icon.png" type="image/x-icon" />
    <link rel="shortcut icon" href="<%=path %>/img/PICC_icon.png" type="image/x-icon" />
    <jsp:include page="../include/importCSS.jsp"/>
    
    <script type="text/ecmascript">
        $(document).ready(function(e) {
            
        });
    </script>
    
    <style type="text/css">
        
    </style>
    
    
    <script type="text/javascript">
    //alert("状态："+$("#pageStatus").val());
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
						url : "job!checkName.action",
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
         
         function isLoginPerson(){
         	$.ajax({
     			url : "<%=path%>/recruitment/job!isLoginTurnToPersonal",
     			type : "POST",
     			dataType : "JSON",
     			error : function(XMLHttpRequest, textStatus, errorThrown) {
     				alert("Ajax请求用户权限码的状态：" + textStatus);
     			},
     			success : function(data) {
     				if(data==true){
     					$("#test_content").html("请先登录，然后再进行操作！");
     					$("#test_model").modal("toggle");
     				}else{
     					window.location.href="<%=path%>/recruitment/job!showPresonalMessage";
     				}
     			}
     		});
         }
    </script>
    
    </head>
    
    <body style="background-image:url(<%=path %>/img/bg1.jpg)">
    
        <div class="container" style="margin-top:-50px; background-color: rgb(248, 248, 248); padding-top:10px; padding-bottom:50px;">
            <!-- 获取网页状态 -->
		<input type="hidden" id="pageStatus" value="<s:property value='pageStatus' />"/>
            <div class="row">
            	<div class="col-md-3 col-sm-3 col-xs-3">
                	<img class="img-rounded img-responsive" alt="PICC中国人民健康保险股份有限公司" style="width: 100%; height: auto;" src="<%=path %>/img/picc_logo_s.png"></img>
                </div>
                <div class="col-md-9 col-sm-9 col-xs-9 text-right" style="margin-top:25px">
                <%
                	HttpSession sessions=request.getSession();
                	Object userName=sessions.getAttribute("name");
                	String path1 = request.getContextPath();
                	String temp = "";
                	if(userName != null){
                		temp = "<div class='col-md-11 col-sm-10 col-xs-9'>用户："+userName+"</div>"+
                        		"<div class='col-md-1  col-sm-2 col-xs-3'><a href='"+path1+"/login!logout'>退出</a></div>";
                	}else{
                		temp = "<div class='col-md-11 col-sm-10 col-xs-9'>"+
		                    	"<a data-toggle='modal' data-target='#loginForm'>"+
		                            "登录"+
		                        "</a>"+
			                    "</div>"+
			                    "<div class='col-md-1  col-sm-2 col-xs-3'>"+
			                    	"<a  data-toggle='modal' data-target='#registerModal'>"+
			                            "注册"+
			                        "</a>"+
			                    "</div>";
                	}
                %>
               <%=temp %>
                
                <%-- 
                	<div class="col-md-11 col-sm-10 col-xs-9">用户：<%=userName %></div>
                    <div class="col-md-1  col-sm-2 col-xs-3"><a href="<%=path%>/login!logout">退出</a></div>
                     --%>
                </div>
            	
            </div><!-- end off "row" -->
            
            <div class="row margin-top-3">
            	<div class="col-md-12 col-sm-12 col-xs-12">
                	<nav class="navbar navbar-default" role="navigation">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-header">
                          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                          </button>
                          <font class="navbar-brand" style="cursor:default; " >导航</font>
                        </div>
                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                          <ul class="nav navbar-nav">
                            <li><a href="job!queryAllDem">职位信息</a></li>
                            <li><a  onclick="isLoginPerson();">个人中心</a></li>
                          </ul>
                        </div><!-- /.navbar-collapse -->
                     </nav>
                </div>
            </div><!-- end off "row  margin-top-3" -->
            
            <div class="row">
            	<div class="col-md-12 col-sm-12 col-xs-12">
                	<div class="panel panel-info">
                        <div class="panel-heading">
                            <h3 class="panel-title">职位中心</h3>
                        </div>
                        <div class="panel-body" style="font-size:16px; font-weight:400; text-indent:2em;">
                            <p>中国人民健康保险公司（简称“中国人保健康”）成立于2005年4月8日，系国务院同意、中国保监会批准设立的国内第一家专业健康保险公司，由“世界500强”企业中国人民保险集团公司（PICC）联合欧洲最大的健康保险公司——德国健康保险股份公司（DKV）发起设立，目前公司注册资本金64.4977亿元，是中国内地资本实力最为雄厚的专业健康保险公司。</p>
                            <p>这里汇聚了PICC中国人民健康保险股份有限公司湖南全省的招聘信息，这里你可以随时查阅并且找到你合适的职位，只要你填写好相关的申报信息后你就可以参加PICC的面向全国的公开人才招聘。</p>
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="row">
            	<div class="col-md-12 col-sm-12 col-xs-12 text-info">
                      <h4>最新招聘信息</h4>
                </div>
                <div class="col-md-12 col-sm-12 col-xs-12">
                	<table class="table table-hover table-responsive table-bordered text-center">
                        <thead class="table-thead">
                            <tr>
                                <td class="col-md-1">编号</td>
                                <td class="col-md-5">招聘批次</td>
                                <td class="col-md-2">开始日期</td>
                                <td class="col-md-2">截止日期</td>
                                <td class="col-md-2">招聘状态</td>
                            </tr>
                        </thead>
                        <tbody class="table-tbody">
                            <s:iterator value="recruitmentList" status="number" id="temp">
                            	<tr>
	                                <td><s:property value="#number.count + (pageNo-1)*10"/></td>
	                                <td value="<s:property value='#temp.pkAppDem' />" >
	                                	<s:if test="#temp.status == 5">
	                                		<a href="<%=path%>/recruitment/requer!index?recruitment.pkAppDem=<s:property value='#temp.pkAppDem' />"><s:property value='#temp.demName' /></a>
	                                	</s:if>
										<s:else>
											<s:property value='#temp.demName' />
										</s:else>
	                                </td>
	                                <td><s:property value='turnDateToString(#temp.demPublishTime)' /></td>
	                                <td><s:property value='turnDateToString(#temp.demEndTime)' /></td>
	                                <td>
										<s:if test="#temp.status == 5">招聘中</s:if>
										<s:else>已经结束</s:else>
									</td>
	                            </tr>
                            </s:iterator>
                        </tbody>
                    </table>
                </div>
                
                <div align="right" style="margin-top: -20px"><p:PaginationTag href="/recruitment/job!queryAllDem" /></div>
                
			</div>
            
            
            
            
        </div><!-- end off "container" -->
            
        <!-- Modal -->
        <div class="modal fade form-horizontal" id="test_model" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
          <div class="modal-dialog">
            <div class="modal-content ">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title">温馨提示</h4>
              </div>
              <div class="modal-body">
                    <div class="text-center">
                        <h4 class="text-info" id="test_content"></h4>
                    </div>
              </div>
              <div class="modal-footer">
                <button class="btn btn-primary" data-dismiss="modal" aria-hidden="true">确定</button>
              </div>
            </div><!-- /.modal-content -->
          </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
        
        <!-- 注册模态对话框 -->
    <!-- Modal -->
    <form class="modal fade form-horizontal" method="post" action="job!regist" id="registerModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
      <div class="modal-dialog">
        <div class="modal-content ">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
            <h3 class="modal-title text-info" id="myModalLabel">用户注册</h3>
          </div>
          <div class="modal-body col-md-offset-2">
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
    
    <!-- 登录模态对话框 -->
    <!-- Modal -->
    <form class="modal fade form-horizontal modal-define" method="post" action="job!isExist.action" id="loginForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
      <div class="modal-dialog">
        <div class="col-md-12 panel panel-primary panel-body">
        		<div class="row">
                            <h3 class="text-center login-title">登&nbsp;&nbsp;录</h3>
                            <div class="col-md-8 col-md-offset-2 com-md-push-2 input-group margin_top">
                                <span class="input-group-addon glyphicon glyphicon-user"></span>
                                <input type="text" class="form-control"  placeholder="请输入用户名" name="loginUser.name"/>
                            </div>
                            <div class="col-md-8 col-md-offset-2 com-md-push-2 input-group margin_top">
                                <span class="input-group-addon glyphicon glyphicon-lock"></span>
                                <input type="password" class="form-control"  placeholder="请输入密码" name="loginUser.password"/>
                            </div>
                            <div class="col-md-8 col-md-offset-2 com-md-push-2 margin-top-2 text-center">
                                <button type="submit" class="btn btn-success btn-sm">
                                    <span class="glyphicon glyphicon-log-in"></span>登录
                                </button>     
                                 <button type="button" class="btn btn-default btn-sm"  data-toggle="modal" data-dismiss="modal">
                                    <span class="glyphicon glyphicon-leaf"></span>取消
                                </button>
                            </div>
                    </div>
                </div><!--  -->
      </div><!-- /.modal-dialog -->
    </form><!-- /.modal -->
        
        
      
    
    </body>
    <jsp:include page="../include/importJS.jsp"/>
</html>
