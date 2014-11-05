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
    <title>PICCRE职位申请</title>
    <link rel="icon" href="<%=path %>/img/PICC_icon.png" type="image/x-icon" />
    <link rel="shortcut icon" href="<%=path %>/img/PICC_icon.png" type="image/x-icon" />
    <jsp:include page="../include/importCSS.jsp"/>
    
    <script type="text/javascript">
        function downMsg(id){
        	$.download('<%=path %>/recruitment/requer!dowload','recruitment.pkAppDem='+id,'post');
        }
        
        function turnToJobWrite(pkAppDem , demName){
        	$.ajax({
    			url : "<%=path%>/recruitment/requer!isLogin",
    			type : "POST",
    			data : "recruitment.pkAppDem="+pkAppDem+"&recruitment.demName="+demName,
    			dataType : "JSON",
    			error : function(XMLHttpRequest, textStatus, errorThrown) {
    				alert("Ajax请求用户权限码的状态：" + textStatus);
    			},
    			success : function(data) {
    				if(data==true){
    					$("#test_model").modal("toggle");
    				}else{
    					window.location.href="<%=path%>/recruitment/job!haveWriteBaseMessage";
    					<%-- 
    					if(data.count > 0){
    						window.location.href="<%=path%>/recruitment/job!haveWriteBaseMessage";
    					}else{
    						window.location.href="<%=path%>/recruitment/job!recruitWrite";
    					}
    					 --%>
    				}
    			}
    		});
        }
       
        function turnToLogin(){
        	var pkApp = '${recruitment.pkAppDem}';
        	var demName = '${recruitment.demName}';
        	//alert(pkApp+"     demName = "+demName);
        	window.location.href="<%=path%>/recruitment/requer!index?recruitment.pkAppDem="+pkApp+"&recruitment.demName="+demName;
        }
        
        $(document).ready(function(e) {
    		if($("#pageStatus").val() == 8) {
    			$("#public_content").html("登录失败！");
    			$("#public_model").modal("show");
    		} else if($("#pageStatus").val() == 204) {
    			$("#public_content").html("用户名或密码不正确！");
    			$("#public_model").modal("show");
    		} else if($("#pageStatus").val() == 3) {
    			$("#public_content").html("密码修改成功！");
    			$("#public_model").modal("show");
    		} else if($("#pageStatus").val() == 201) {
    			$("#public_content").html("密码修改失败！");
    			$("#public_model").modal("show");
    		}else if($("#pageStatus").val() == 401) {
    			$("#public_content").html("注册成功！");
    			$("#public_model").modal("show");
    		}else if($("#pageStatus").val() == 402) {
    			$("#public_content").html("注册失败！");
    			$("#public_model").modal("show");
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
         					$("#public_content").html("请先登录，然后再进行操作！");
         					$("#public_model").modal("toggle");
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
		                    	"<a  data-toggle='modal' data-target='#loginForm'>"+
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
                            <li><a onclick="isLoginPerson();">个人中心</a></li>
                          </ul>
                        </div><!-- /.navbar-collapse -->
                     </nav>
                </div>
            </div><!-- end off "row  margin-top-3" -->
            
            <div class="row">
            	<div class="col-md-12 col-sm-12 col-xs-12">
                	<div class="panel panel-info">
                        <div class="panel-heading">
                            <h3 class="panel-title"><s:property value="recruitment.demName" /></h3>
                        </div>
                        <div class="panel-body" style="font-size:16px; font-weight:400; text-indent:2em;">
                            <p><s:property value="recruitment.appContent" /></p>
                            <%-- <p>党的十八大之后，党和政府加快推进市场化改革和政府职能转变，进一步发挥市场在资源配置中的基础性作用，支持健康保险发展的政策措
                            施密集出台，商业保险机构参与社会保障体系建设呈现加深、加快趋势。面对新形势、新任务和新要求，公司科学制定新时期的发展战略，以“加
                            快转型、创新发展”为指导思想，注重创新驱动，全面推动发展模式战略转型，实现业务提速、经营增效，力争将公司建设成为专业技术领先、盈
                            利能力突出、治理结构完善、风险管控有力的专业健康保险公司，成为政府信任、人民满意的中国商业健康保险第一品牌。</p>
                            
                            <p>截至目前，公司已设立25家省级分公司、109家地市级机构、99家县区级机构和97家互动部，依托集团公司遍布全国的分支机构和服务网点，
                            分销服务网络可覆盖中国近100%的地级和县级行政区。公司坚持传统和新型销售渠道并举，通过社保、团险、个险、银保、互动、网销六大销售
                            渠道为客户提供多层次、多样化的健康保险和健康管理服务。在关系国计民生的医疗保障体系建设中，公司发挥着越来越重要的作用，承保的各类
                            社保业务项目覆盖23个省（自治区、直辖市、计划单列市）的122个地市，服务人群超过1亿人次。</p> --%>
                            <div class="row text-right">
                            	<a onclick="downMsg(<s:property value="recruitment.pkAppDem" />);" style="padding-right:2em;" > >>详细需求请下载附件<< </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div><!-- end off "row" -->
            
            <div class="row">
            	<div class="col-md-6 col-sm-6 col-xs-6 text-right">
                	<button role="button" class="btn btn-default btn-lg"> 取 消 </button>
                </div>
                <div class="col-md-6 col-sm-6 col-xs-6">
                	<button role="button" class="btn btn-success btn-lg" onclick="turnToJobWrite(<s:property value="recruitment.pkAppDem" />,'<s:property value='recruitment.demName' />');"> 职位申请 </button> <%--  --%>
                </div>
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
                        <h4 class="text-info" id="test_content">你还未登录请先登录！</h4>
                    </div>
              </div>
              <div class="modal-footer">
                <button class="btn btn-default" data-dismiss="modal" aria-hidden="true">取消</button>
                <button class="btn btn-primary" data-dismiss="modal" onclick="turnToLogin();">确定</button>
              </div>
            </div><!-- /.modal-content -->
          </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
        
        <!-- Modal -->
        <div class="modal fade form-horizontal" id="pub_model" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
          <div class="modal-dialog">
            <div class="modal-content ">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title">温馨提示</h4>
              </div>
              <div class="modal-body">
                    <div class="text-center">
                        <h4 class="text-info" id="pub_content"></h4>
                    </div>
              </div>
              <div class="modal-footer">
                <button class="btn btn-success" data-dismiss="modal" aria-hidden="true">确定</button>
              </div>
              
            </div><!-- /.modal-content -->
          </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
        
        <!-- 普通提示 -->
	<div class="modal fade" id="modal_sure_delete" tabindex="10" role="dialog" aria-hidden="true">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		        <h4 class="modal-title">提示</h4>
		      </div>
		      <div class="modal-body text-center">
		        	<div id="">你还未登录请先登录！</div>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
		        <button type="button" class="btn btn-primary" onclick="turnToLogin();">确定</button>
		      </div>
		    </div><!-- /.modal-content -->
		  </div><!-- /.modal-dialog -->
		</div><!-- /.modal -->
		
		 <!-- 注册模态对话框 -->
    <!-- Modal -->
    <form class="modal fade form-horizontal" method="post" action="requer!regist?recruitment.pkAppDem=${recruitment.pkAppDem}" id="registerModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
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
    
    <!-- 注册模态对话框 -->
    <!-- Modal -->
    <form class="modal fade form-horizontal" method="post" action="requer!isExist.action?recruitment.pkAppDem=${recruitment.pkAppDem}" id="loginForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
      <div class="modal-dialog">
        <div class="col-md-12 panel panel-primary panel-body">
        		<div class="row">
                            <h3 class="text-center login-title">登&nbsp;&nbsp;录</h3>
                            <div class="col-md-8 col-md-offset-2 com-md-push-2 input-group margin_top">
                                <span class="input-group-addon glyphicon glyphicon-lock"></span>
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
    
    <!-- Modal -->
        <div class="modal fade form-horizontal" id="public_model" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
          <div class="modal-dialog">
            <div class="modal-content ">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h3 class="modal-title text-info" id="myModalLabel">温馨提示</h3>
              </div>
              <div class="modal-body">
                    <div class="text-center">
                        <h2 id="public_content"></h2>
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
    <jsp:include page="../include/importJS.jsp"/>
</html>
