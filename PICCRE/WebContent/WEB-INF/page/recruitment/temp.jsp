<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="/hnne/pagination-tags" prefix="p"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
HttpSession sessions=request.getSession();
Object userName=sessions.getAttribute("name");
%>
<!DOCTYPE>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>PICCRE简历详情</title>
    <link rel="icon" href="<%=path %>/img/PICC_icon.png" type="image/x-icon" />
    <link rel="shortcut icon" href="<%=path %>/img/PICC_icon.png" type="image/x-icon" />
    <jsp:include page="../include/importCSS.jsp"/>
    <jsp:include page="../include/importJS.jsp"/>
    
    <script type="text/ecmascript">
        $(document).ready(function(e) {
        	$("#birth_date").attr("value",temp);
    		$('#birth_date').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                console.log(start.toISOString(), end.toISOString(), label);
              });
        });
        
        //修改函数
        function fixSomeMessage(obj){
        	$(obj).parent().parent().find("input").removeAttr("disabled");
        	$(obj).parent().parent().find("select").removeAttr("disabled");
        	$(obj).parent().find("button[btnType=saveBtn]").removeAttr("disabled");
        	$(obj).attr("disabled","disabled");
        }
        
      //职位选择表单提交
		function personalMessageForm(obj){
			var content = "";
			$("#personalMessage input").each(function(){
				content = content + $(this).attr("name") +"="+$(this).val()+"&";
			});
			$("#personalMessage select").each(function(){
				content = content + $(this).attr("name") +"="+$(this).val()+"&";
			});
			content = content.substring(0,content.length-1);
			//alert("字符串===="+content);
			$.ajax({
				url : "job!saveJobMessage",
				type : "POST",
				data:content,
				dataType : "JSON",
				timeout : 1000,
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					$("#test_content").html("操作失败！");
					$("#messageModal").modal("toggle");
				},
				success : function(data) {
					if(data.messageFlag == 1){
						$("#test_content").html("操作成功！");
					}else{
						$("#test_content").html("操作失败！");
					}
					$(obj).parent().parent().find("input").attr("disabled","disabled");
					$(obj).parent().parent().find("select").attr("disabled","disabled");
		        	$(obj).parent().find("button[btnType=fixBtn]").removeAttr("disabled");
		        	$(obj).attr("disabled","disabled");
					$("#messageModal").modal("toggle");
				}//end of success
			});
			//end of ajax
		}
        
		//学历信息表单提交
		function educationMessageForm(educationId){
			var content = "";
			$("#"+educationId+" input").each(function(){
				content = content + $(this).attr("name") +"="+$(this).val()+"&";
			});
			$("#"+educationId+" select").each(function(){
				content = content + $(this).attr("name") +"="+$(this).val()+"&";
			});//education="1" id="education1"
			var id = $("#"+educationId+"").attr("education");
			if(id != "" && id != null){
				content = content +"education.pkEducation="+id+"&";
			}
			content = content.substring(0,content.length-1);
			//alert("字符串===="+content);
			$.ajax({
				url : "job!saveEducationMessage",
				type : "POST",
				data:content,
				dataType : "JSON",
				timeout : 1000,
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					$("#test_content").html("操作失败！");
					$("#messageModal").modal("toggle");
				},
				success : function(data) {
					if(data.messageFlag != 2){
						$("#"+educationId+"").attr("education",data.messageFlag);
						$("#test_content").html("操作成功！");
					}else{
						$("#test_content").html("操作失败！");
					}
					$("#"+educationId+"").find("input").attr("disabled","disabled");
					$("#"+educationId+"").find("select").attr("disabled","disabled");
		        	$("#"+educationId+"").find("button[btnType=fixBtn]").removeAttr("disabled");
		        	$("#"+educationId+"").find("button[btnType=saveBtn]").attr("disabled","disabled");
					$("#messageModal").modal("toggle");
				}//end of success
			});
			//end of ajax
		}
		
		//履历信息表单提交
		function experienceMessageForm(experienceId){
			var content = "";
			$("#"+experienceId+" input").each(function(){
				content = content + $(this).attr("name") +"="+$(this).val()+"&";
			});
			$("#"+experienceId+" select").each(function(){
				content = content + $(this).attr("name") +"="+$(this).val()+"&";
			});//education="1" id="education1"
			var id = $("#"+experienceId+"").attr("experience");
			if(id != "" && id != null){
				content = content +"experience.pkExp="+id+"&";
			}
			content = content.substring(0,content.length-1);
			//alert("字符串===="+content);
			$.ajax({
				url : "job!saveExperienceMessage",
				type : "POST",
				data:content,
				dataType : "JSON",
				timeout : 1000,
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					$("#test_content").html("操作失败！");
					$("#messageModal").modal("toggle");
				},
				success : function(data) {
					if(data.messageFlag != 2){
						$("#"+experienceId+"").attr("experience",data.messageFlag);
						$("#test_content").html("操作成功！");
					}else{
						$("#test_content").html("操作失败！");
					}
					$("#"+experienceId+"").find("input").attr("disabled","disabled");
					$("#"+experienceId+"").find("select").attr("disabled","disabled");
		        	$("#"+experienceId+"").find("button[btnType=fixBtn]").removeAttr("disabled");
		        	$("#"+experienceId+"").find("button[btnType=saveBtn]").attr("disabled","disabled");
					$("#messageModal").modal("toggle");
				}//end of success
			});
			//end of ajax
		}
        
		//家庭成员信息表单提交
		function familyMessageForm(familyId){
			var content = "";
			$("#"+familyId+" input").each(function(){
				content = content + $(this).attr("name") +"="+$(this).val()+"&";
			});
			$("#"+familyId+" select").each(function(){
				content = content + $(this).attr("name") +"="+$(this).val()+"&";
			});
			var id = $("#"+familyId+"").attr("family");
			if(id != "" && id != null){
				content = content +"family.pkFamily="+id+"&";
			}
			content = content.substring(0,content.length-1);
			//alert("字符串===="+content);
			$.ajax({
				url : "job!saveFamilyMessage",
				type : "POST",
				data:content,
				dataType : "JSON",
				timeout : 1000,
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					$("#test_content").html("操作失败！");
					$("#messageModal").modal("toggle");
				},
				success : function(data) {
					//alert("标志位data.messageFlag=="+data.messageFlag);
					if(data.messageFlag != 2){
						$("#"+familyId+"").attr("family",data.messageFlag);
						$("#test_content").html("操作成功！");
					}else{
						$("#test_content").html("操作失败！");
					}
					$("#"+familyId+"").find("input").attr("disabled","disabled");
					$("#"+familyId+"").find("select").attr("disabled","disabled");
		        	$("#"+familyId+"").find("button[btnType=fixBtn]").removeAttr("disabled");
		        	$("#"+familyId+"").find("button[btnType=saveBtn]").attr("disabled","disabled");
					$("#messageModal").modal("toggle");
				}//end of success
			});
			//end of ajax
		}
		
		//奖励信息表单提交
		function rewardMessageForm(rewardId){
			var content = "";
			$("#"+rewardId+" input").each(function(){
				content = content + $(this).attr("name") +"="+$(this).val()+"&";
			});
			$("#"+rewardId+" select").each(function(){
				content = content + $(this).attr("name") +"="+$(this).val()+"&";
			});
			//奖励就将其状态为设置为1
			content = content +"reward.status=1&";
			var id = $("#"+rewardId+"").attr("reward");
			if(id != "" && id != null){
				content = content +"reward.pkRewPun="+id+"&";
			}
			content = content.substring(0,content.length-1);
			//alert("字符串===="+content);
			$.ajax({
				url : "job!saveRewardMessage",
				type : "POST",
				data:content,
				dataType : "JSON",
				timeout : 1000,
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					$("#test_content").html("操作失败！");
					$("#messageModal").modal("toggle");
				},
				success : function(data) {
					if(data.messageFlag != 2){
						$("#"+rewardId+"").attr("reward",data.messageFlag);
						$("#test_content").html("操作成功！");
					}else{
						$("#test_content").html("操作失败！");
					}
					$("#"+rewardId+"").find("input").attr("disabled","disabled");
					$("#"+rewardId+"").find("select").attr("disabled","disabled");
		        	$("#"+rewardId+"").find("button[btnType=fixBtn]").removeAttr("disabled");
		        	$("#"+rewardId+"").find("button[btnType=saveBtn]").attr("disabled","disabled");
					$("#messageModal").modal("toggle");
				}//end of success
			});
			//end of ajax
		}
		
		//处分信息表单提交
		function punishMessageForm(punishId){
			var content = "";
			$("#"+punishId+" input").each(function(){
				content = content + $(this).attr("name") +"="+$(this).val()+"&";
			});
			$("#"+punishId+" select").each(function(){
				content = content + $(this).attr("name") +"="+$(this).val()+"&";
			});
			//处分就将其状态为设置为2
			content = content +"reward.status=2&";
			var id = $("#"+punishId+"").attr("reward");
			if(id != "" && id != null){
				content = content +"reward.pkRewPun="+id+"&";
			}
			content = content.substring(0,content.length-1);
			//alert("字符串===="+content);
			$.ajax({
				url : "job!saveRewardMessage",
				type : "POST",
				data:content,
				dataType : "JSON",
				timeout : 1000,
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					$("#test_content").html("操作失败！");
					$("#messageModal").modal("toggle");
				},
				success : function(data) {
					if(data.messageFlag != 2){
						$("#"+punishId+"").attr("reward",data.messageFlag);
						$("#test_content").html("操作成功！");
					}else{
						$("#test_content").html("操作失败！");
					}
					$("#"+punishId+"").find("input").attr("disabled","disabled");
					$("#"+punishId+"").find("select").attr("disabled","disabled");
		        	$("#"+punishId+"").find("button[btnType=fixBtn]").removeAttr("disabled");
		        	$("#"+punishId+"").find("button[btnType=saveBtn]").attr("disabled","disabled");
					$("#messageModal").modal("toggle");
				}//end of success
			});
			//end of ajax
		}
    
		//账户基本信息修该
		function changeLoginMessage(){
			var content = "";
			var userName = $("#loginMessage_name").val();
			var email = $("#loginMessage_email").val();
			content = "loginMessage.name="+userName+"&loginMessage.email="+email;
			//alert("字符串===="+content);
			$.ajax({
				url : "job!changeLoginMessage",
				type : "POST",
				data:content,
				dataType : "JSON",
				timeout : 1000,
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					$("#test_content").html("操作失败！");
					$("#messageModal").modal("toggle");
				},
				success : function(data) {
					if(data.messageFlag != 2){
						$("#test_content").html("操作成功！");
					}else{
						$("#test_content").html("操作失败！");
					}
					$("#loginMessageForm").find("input").attr("disabled","disabled");
		        	$("#loginMessageForm").find("button[btnType=fixBtn]").removeAttr("disabled");
		        	$("#loginMessageForm").find("button[btnType=saveBtn]").attr("disabled","disabled");
					$("#messageModal").modal("toggle");
				}//end of success
			});
			//end of ajax
		}
		
    </script>
    
    
    </head>
    
    <body style="background-image:url(<%=path %>/img/bg1.jpg)">
    
        <div class="container" style="margin-top:-50px; background-color: rgb(248, 248, 248); padding-top:10px; padding-bottom:50px;" >
            <div class="row">
            	<div class="col-md-3 col-sm-3 col-xs-3">
                	<img class="img-rounded img-responsive" alt="PICC中国人民健康保险股份有限公司" style="width: 100%; height: auto;" src="<%=path %>/img/picc_logo_s.png"></img>
                </div>
                <div class="col-md-9 col-sm-9 col-xs-9 text-right" style="margin-top:25px;">
                	<div class="col-md-11 col-sm-10 col-xs-9">用户：<%=userName %></div>
                    <div class="col-md-1  col-sm-2 col-xs-3"><a href="<%=path%>/login!logout">退出</a></div>
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
                            <li><a href="job!showPresonalMessage">个人中心</a></li>
                          </ul>
                        </div><!-- /.navbar-collapse -->
                     </nav>
                </div>
            </div><!-- end off "row  margin-top-3" -->
            
            <div class="row">
            	<div class="col-md-12 col-sm-12 col-xs-12">
                	<div class="panel panel-info">
                        <div class="panel-heading text-center">
                            <h3 class="panel-title"><s:property value='userMessage.socialNo' /></h3>
                        </div>
                        <div class="panel-body" style="font-size:12px; text-indent:2em;">
                        	<!--********************************职位选择 >>***********************************-->
                            <div class="row padding-title">
                            	<div class="row">
                                	<h4 class="col-md-7 col-sm-7 col-xs-7">职位选择 >> </h4>
                                </div><!-- end off "row" -->
                            	
                                <div class="row">
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5">招聘批次：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><s:property value='userMessage.demName' /></div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5">市公司：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><s:property value='userMessage.applyUnit' /></div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5">部门：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><s:property value='userMessage.applyDept' /></div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5">岗位：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><s:property value='userMessage.applyPost' /></div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                </div><!-- end off "row" -->
                            </div><!-- end off "row" -->
                            <!--********************************个人信息***********************************-->
                            <div class="row padding-title">
                            	<div class="row">
                                	<h4 class="col-md-7 col-sm-7 col-xs-7">个人信息 >> </h4>
                                </div><!-- end off "row" -->
                            	
                                <div class="row" id="personalMessage">
                                	<div class="row text-right" style="padding-right: 4.5em;">
	                                	<button class="btn btn-xs btn-primary" btnType="fixBtn"  onclick="fixSomeMessage(this);">
                                        	<span class="glyphicon glyphicon-pencil"></span> 修改
                                        </button>
                                		<button  class="btn btn-xs btn-primary" disabled="disabled" btnType="saveBtn" onclick="personalMessageForm(this);">
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button>
                                	</div>
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">姓名：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.name" disabled="disabled" value="<s:property value='userMessage.name' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">曾用名：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.oldName" disabled="disabled" value="<s:property value='userMessage.oldName' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">身份证号：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.id" disabled="disabled" value="<s:property value='userMessage.id' />"  type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">性别：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<s:property value="userMessage." />
                                        	<select name="user.gender"  disabled="disabled" class="form-control input-sm col-md-10 col-sm-10 col-xs-12">
                                        		<s:if test='userMessage.gender == "女" '>
                                        			<option value="男">男</option>
                                                	<option value="女" selected="selected">女</option>
                                        		</s:if>
                                        		<s:else>
                                        			<option value="男">男</option>
                                                	<option value="女">女</option>
                                        		</s:else>
                                            	
                                            </select>
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">出生日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- user.birth -->
                                        	<input id="birth_date" name="birthTime" disabled="disabled" value="<s:property value='turnDateToString_1(userMessage.birth)' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">名族：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.ation" disabled="disabled" value="<s:property value='userMessage.ation' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">血型：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.blood" disabled="disabled" value="<s:property value='userMessage.blood' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">政治面貌：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.ps" disabled="disabled" value="<s:property value='userMessage.ps' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">家庭出生：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.household" disabled="disabled" value="<s:property value='userMessage.household' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">籍贯：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.nation" disabled="disabled" value="<s:property value='userMessage.nation' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">出生地：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.birthplace" disabled="disabled" value="<s:property value='userMessage.birthplace' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">健康状况：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.health" disabled="disabled" value="<s:property value='userMessage.health' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">婚姻状况：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.marriage" disabled="disabled" value="<s:property value='userMessage.marriage' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">档案所在地：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.archiveAddr" disabled="disabled" value="<s:property value='userMessage.archiveAddr' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">参加工作时间：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- user.workTime -->
                                        	<input id="user_workTime"  name="startWorkTime" disabled="disabled" value="<s:property value='turnDateToString_1(userMessage.workTime)' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">户口性质：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.householdNatrue" disabled="disabled" value="<s:property value='userMessage.householdNatrue' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">户口所在地：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.householdAddr" disabled="disabled" value="<s:property value='userMessage.householdAddr' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">家庭住址：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.houseAddr" disabled="disabled" value="<s:property value='userMessage.houseAddr' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">手机：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.priPhone" disabled="disabled" value="<s:property value='userMessage.priPhone' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">办公电话：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.officePhone" disabled="disabled" value="<s:property value='userMessage.officePhone' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">常联系人电话：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.linkmanPhone" disabled="disabled" value="<s:property value='userMessage.linkmanPhone' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">家庭电话：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.housePhone" disabled="disabled" value="<s:property value='userMessage.housePhone' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">邮政编码：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.postcode" disabled="disabled" value="<s:property value='userMessage.postcode' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">电子邮箱：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.email" disabled="disabled" value="<s:property value='userMessage.email' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">入党时单位：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.joinPartyComp" disabled="disabled" value="<s:property value='userMessage.joinPartyComp' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">入党(团)日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- user.joinParty -->
                                        	<input id="user_joinParty" disabled="disabled" value="<s:property value='turnDateToString_1(userMessage.joinParty)' />" name="inPartyTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">转正时间：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- user.joinPartyTime -->
                                        	<input id="user_joinPartyTime" disabled="disabled" value="<s:property value='turnDateToString_1(userMessage.joinPartyTime)' />" name="startPartyTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                </div><!-- end off "row" -->
                            </div><!-- end off "row" -->
                            <!--********************************学历信息***********************************-->
                            <div class="row padding-title">
                            	<div class="row" style="margin-top:30px;">
                                	<h4 class="col-md-7 col-sm-7 col-xs-7">学历信息 >> </h4>
                                </div><!-- end off "row" -->
                                <s:iterator value="educationMessage" id="temp" status="number">
                                	<div class="row" education="<s:property value='#temp.pkEducation' />" id="education<s:property value='#number.count' />">
	                                	<h4 class="text-info" style="text-indent:4em;">学历<s:property value='#number.count' />:</h4>
	                                	<div class="row text-right" style="padding-right: 4.5em;">
		                                	<button class="btn btn-xs btn-primary" btnType="fixBtn"  onclick="fixSomeMessage(this);">
	                                        	<span class="glyphicon glyphicon-pencil"></span> 修改
	                                        </button>
	                                		<button  class="btn btn-xs btn-primary" disabled="disabled" btnType="saveBtn" onclick="educationMessageForm('education<s:property value='#number.count' />');">
	                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
	                                        </button>
	                                	</div>
	                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学校：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="education.school" disabled="disabled" value="<s:property value='#temp.school' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                    
	                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">专业：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="education.pec" disabled="disabled" value="<s:property value='#temp.pec' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                    
	                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学历专业类别：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="education.pecType" disabled="disabled" value="<s:property value='#temp.pecType' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                     
	                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学历：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="education.edu" disabled="disabled" value="<s:property value='#temp.edu' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                    
	                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学位：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="education.degree" disabled="disabled" value="<s:property value='#temp.degree' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                     
	                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学制：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="education.eduLength" disabled="disabled" value="<s:property value='#temp.eduLength' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                    
	                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">最高学历：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                            <select name="education.heighEdu" disabled="disabled" class="form-control input-sm">
	                                            	<s:if test='#temp.heighEdu == "否" '>
	                                            		<option value="是">是</option>
	                                                	<option value="否" selected="selected">否</option>
	                                            	</s:if>
	                                            	<s:else>
	                                            		<option value="是">是</option>
	                                                	<option value="否">否</option>
	                                            	</s:else>
	                                            </select>
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                     
	                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">全日制学历：</label>
	                                       <div class="col-md-7 col-sm-7 col-xs-7">
	                                            <select name="education.dayEdu" disabled="disabled" class="form-control input-sm">
	                                                <s:if test='#temp.dayEdu == "否" '>
	                                            		<option value="是">是</option>
	                                                	<option value="否" selected="selected">否</option>
	                                            	</s:if>
	                                            	<s:else>
	                                            		<option value="是">是</option>
	                                                	<option value="否">否</option>
	                                            	</s:else>
	                                            </select>
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                     
	                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学校类型：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="education.schoolType" disabled="disabled" value="<s:property value='#temp.schoolType' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                    
	                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学习方式：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="education.eduType" disabled="disabled" value="<s:property value='#temp.eduType' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                    
	                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">入学日期：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- education.entranceTime -->
	                                        	<input id="education_entranceTime_1" disabled="disabled" value="<s:property value='turnDateToString_1(#temp.entranceTime)' />" name="toSchoolTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                    
	                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">毕业日期：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- education.gradTime -->
	                                        	<input id="education_gradTime_1" disabled="disabled" value="<s:property value='turnDateToString_1(#temp.gradTime)' />" name="grduateTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                     
	                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学历证书编号：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="education.eduCode" disabled="disabled" value="<s:property value='#temp.eduCode' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                     
	                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学位证书编号：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="education.degreeCode" disabled="disabled" value="<s:property value='#temp.degreeCode' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                </div><!-- end off "row" -->
                                </s:iterator>
                                    
                            </div><!-- end off "row" -->
                            <!--********************************履历信息***********************************-->
                            <div class="row padding-title">
                            	<div class="row" style="margin-top:30px;">
                                	<h4 class="col-md-7 col-sm-7 col-xs-7">履历信息 >> </h4>
                                </div><!-- end off "row" -->
                            	
                            	<s:iterator value="experienceMessage" id="temp" status="number">
                            		<div class="row" experience="<s:property value='#temp.pkExp' />" id="experience<s:property value='#number.count' />">
	                                	<h4 class="text-info" style="text-indent:4em;">履历<s:property value='#number.count' />:</h4>
	                                	<div class="row text-right" style="padding-right: 4.5em;">
	                                		<button class="btn btn-xs btn-primary" btnType="fixBtn"  onclick="fixSomeMessage(this);">
	                                        	<span class="glyphicon glyphicon-pencil"></span> 修改
	                                        </button>
	                                		<button  class="btn btn-xs btn-primary" disabled="disabled" btnType="saveBtn" onclick="experienceMessageForm('experience<s:property value='#number.count' />')">
	                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
	                                        </button>
	                                	</div>
	                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">起始日期：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- experience.begainTime -->
	                                        	<input id="experience_begainTime_1" name="experienceStartTime" disabled="disabled" value="<s:property value='turnDateToString_1(#temp.begainTime)' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                    
	                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">终止日期：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- experience.endTime -->
	                                        	<input id="experience_endTime_1" name="experienceEndTime" disabled="disabled" value="<s:property value='turnDateToString_1(#temp.endTime)' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                    
	                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">工作单位：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="experience.workPlace" disabled="disabled" value="<s:property value='#temp.workPlace' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                     
	                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">担任职务：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="experience.duty" disabled="disabled" value="<s:property value='#temp.duty' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                    
	                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">所在部门：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="experience.dept" disabled="disabled" value="<s:property value='#temp.dept' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                    
	                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">岗位：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="experience.post" disabled="disabled" value="<s:property value='#temp.post' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                   
	                                </div><!-- end off "row" -->
                            	</s:iterator>
                            	
                            </div><!-- end off "row" -->
                            <!--********************************家庭信息***********************************-->
                            <div class="row padding-title">
                            	<div class="row" style="margin-top:30px;">
                                	<h4 class="col-md-7 col-sm-7 col-xs-7">家庭成员信息 >> </h4>
                                </div><!-- end off "row" -->
                            	
                            	<s:iterator value="familyMessage" id="temp" status="number">
                            		<div class="row" family="<s:property value='#temp.pkFamily' />" id="family<s:property value='#number.count' />">
	                                	<h4 class="text-info" style="text-indent:4em;">成员<s:property value='#number.count' />:</h4>
	                                	<div class="row text-right" style="padding-right: 4.5em;">
	                                		<button class="btn btn-xs btn-primary" btnType="fixBtn"  onclick="fixSomeMessage(this);">
	                                        	<span class="glyphicon glyphicon-pencil"></span> 修改
	                                        </button>
	                                		<button  class="btn btn-xs btn-primary" disabled="disabled" btnType="saveBtn" onclick="familyMessageForm('family<s:property value='#number.count' />');" >
	                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
	                                        </button>
	                                	</div>
	                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">成员姓名：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="family.name" disabled="disabled" value="<s:property value='#temp.name' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                    
	                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">亲属关系：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="family.relation" disabled="disabled" value="<s:property value='#temp.relation' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                    
	                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">工作单位：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="family.workPlace" disabled="disabled" value="<s:property value='#temp.workPlace' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                     
	                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">职务：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="family.duty" disabled="disabled" value="<s:property value='#temp.duty' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                    
	                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">性别：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                            <select name="family.gender" disabled="disabled" class="form-control input-sm" name="" >
	                                                <s:if test='#temp.gender == "女"'>
	                                            		<option value="男">男</option>
	                                                	<option value="女" selected="selected">女</option>
	                                            	</s:if>
	                                            	<s:else>
	                                            		<option value="男">男</option>
	                                                	<option value="女">女</option>
	                                            	</s:else>
	                                            </select>
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                    
	                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">出生日期：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- family.birth -->
	                                        	<input id="family_birth_1" name="familyBirthTime" disabled="disabled" value="<s:property value='turnDateToString_1(#temp.birth)' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                    
	                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">政治面貌：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="family.polotics" disabled="disabled" value="<s:property value='#temp.polotics' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                    
	                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
	                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">文化程度：</label>
	                                        <div class="col-md-7 col-sm-7 col-xs-7">
	                                        	<input name="family.education" disabled="disabled" value="<s:property value='#temp.education' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
	                                        </div>
	                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
	                                   
	                                </div><!-- end off "row" -->
                            	</s:iterator>
                                   
                            </div><!-- end off "row" -->
                            <!--********************************奖励信息***********************************-->
                            <div class="row padding-title">
                            	<div class="row" style="margin-top:30px;">
                                	<h4 class="col-md-7 col-sm-7 col-xs-7">奖励信息 >> </h4>
                                </div><!-- end off "row" -->
                                
                                <s:iterator value="rewardMessage" id="temp" status="number">
                                	<s:if test="#temp.status == 1">
                                		<div class="row" reward="<s:property value='#temp.pkRewPun' />" id="reward<s:property value='#number.count' />">
		                                	<h4 class="text-info" style="text-indent:4em;">奖励<s:property value='#number.count' />:</h4>
		                                	<div class="row text-right" style="padding-right: 4.5em;">
		                                		<button class="btn btn-xs btn-primary" btnType="fixBtn"  onclick="fixSomeMessage(this);">
		                                        	<span class="glyphicon glyphicon-pencil"></span> 修改
		                                        </button>
		                                		<button  class="btn btn-xs btn-primary" disabled="disabled" btnType="saveBtn" onclick="rewardMessageForm('reward<s:property value='#number.count' />');">
		                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
		                                        </button>
		                                	</div>
		                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
		                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">奖励名称：</label>
		                                        <div class="col-md-7 col-sm-7 col-xs-7">
		                                        	<input name="reward.rpGist" disabled="disabled" value="<s:property value='#temp.rpGist' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
		                                        </div>
		                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
		                                    
		                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
		                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">奖励时间：</label>
		                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- reward.rpDate -->
		                                        	<input id="reward_rpDate_1" name="rewardTime" disabled="disabled" value="<s:property value='turnDateToString_1(#temp.rpDate)' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
		                                        </div>
		                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
		                                    
		                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
		                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">奖励事由：</label>
		                                        <div class="col-md-7 col-sm-7 col-xs-7">
		                                        	<input name="reward.rpVasue" disabled="disabled" value="<s:property value='#temp.rpVasue' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
		                                        </div>
		                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
		                                     
		                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
		                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">奖励内容：</label>
		                                        <div class="col-md-7 col-sm-7 col-xs-7">
		                                        	<input name="reward.rpMeasure" disabled="disabled" value="<s:property value='#temp.rpMeasure' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
		                                        </div>
		                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
		                                   
		                                </div><!-- end off "row" -->
                                	</s:if>
                                </s:iterator>
                                
                            </div><!-- end off "row" -->
                            <!--********************************处分信息***********************************-->
                            <div class="row padding-title">
                            	<div class="row">
                                	<h4 class="col-md-7 col-sm-7 col-xs-7">处分信息 >> </h4>
                                </div><!-- end off "row" -->
                                
                                <s:iterator value="rewardMessage" id="temp" status="number">
                                	<s:if test="#temp.status == 2">
                                		<div class="row" reward="<s:property value='#temp.pkRewPun' />" id="reward<s:property value='#number.count' />">
		                                	<h4 class="text-info" style="text-indent:4em;">处分<s:property value='#number.count' />:</h4>
		                                	<div class="row text-right" style="padding-right: 4.5em;">
		                                		<button class="btn btn-xs btn-primary" btnType="fixBtn"  onclick="fixSomeMessage(this);">
		                                        	<span class="glyphicon glyphicon-pencil"></span> 修改
		                                        </button>
		                                		<button  class="btn btn-xs btn-primary" disabled="disabled" btnType="saveBtn" onclick="punishMessageForm('reward<s:property value='#number.count' />');">
		                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
		                                        </button>
		                                	</div>
		                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
		                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">惩罚名称：</label>
		                                        <div class="col-md-7 col-sm-7 col-xs-7">
		                                        	<input name="reward.rpGist" disabled="disabled" value="<s:property value='#temp.rpGist' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
		                                        </div>
		                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
		                                    
		                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
		                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">惩罚时间：</label>
		                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- reward.rpDate -->
		                                        	<input id="reward_rpDate_4" disabled="disabled" value="<s:property value='turnDateToString_1(#temp.rpDate)' />" name="rewardTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
		                                        </div>
		                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
		                                    
		                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
		                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">惩罚事由：</label>
		                                        <div class="col-md-7 col-sm-7 col-xs-7">
		                                        	<input name="reward.rpVasue" disabled="disabled" value="<s:property value='#temp.rpVasue' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
		                                        </div>
		                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
		                                     
		                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
		                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">惩罚内容：</label>
		                                        <div class="col-md-7 col-sm-7 col-xs-7">
		                                        	<input name="reward.rpMeasure" disabled="disabled" value="<s:property value='#temp.rpMeasure' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
		                                        </div>
		                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
		                                   
		                                </div><!-- end off "row" -->
                                	</s:if>
                                </s:iterator>
                            	
                        </div><!-- end off "row padding-title" -->
                        
                        
                        
                    </div>
                </div>
                </div>
            </div><!-- end off "row" -->
           
           
            
            
            
            
        </div><!-- end off "container" -->
            
            
        <!-- 操作成功与否信息提示框 -->
        <div class="modal fade form-horizontal" id="messageModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
          <div class="modal-dialog">
            <div class="modal-content ">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h3 class="modal-title text-info">温馨提示</h3>
              </div>
              <div class="modal-body">
                    <div class="text-center text-info">
                        <h4 id="test_content"></h4>
                    </div>
              </div>
              <div class="modal-footer">
                <button class="btn btn-default btn-sm" data-dismiss="modal" aria-hidden="true">确定</button>
              </div>
              
            </div><!-- /.modal-content -->
          </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
        
        
      
    
    </body>
</html>
