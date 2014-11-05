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
    <title>PICCRE创建简历</title>
    <link rel="icon" href="<%=path %>/img/PICC_icon.png" type="image/x-icon" />
    <link rel="shortcut icon" href="<%=path %>/img/PICC_icon.png" type="image/x-icon" />
    <jsp:include page="../include/importCSS.jsp"/>
    <jsp:include page="../include/importJS.jsp"/>
    
    <script type="text/javascript">
    
    	$(document).ready(function(e) { 
    		var myDate = new Date();
    		var year = myDate.getFullYear();    //获取完整的年份(4位,1970-????)
    		var month = myDate.getMonth()+1;       //获取当前月份(0-11,0代表1月)
    		var day = myDate.getDate(); 
    		var temp = year+"/"+month+"/"+day;
    		//alert("value==="+temp);
    		//user_workTime user_joinPartyTime  user_joinParty
    		$("#birth_date").attr("value",temp);
    		$('#birth_date').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                console.log(start.toISOString(), end.toISOString(), label);
              });
    		$("#user_workTime").attr("value",temp);
    		$('#user_workTime').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                console.log(start.toISOString(), end.toISOString(), label);
              });
    		$("#user_joinPartyTime").attr("value",temp);
    		$('#user_joinPartyTime').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                console.log(start.toISOString(), end.toISOString(), label);
              });
    		$("#user_joinParty").attr("value",temp);
    		$('#user_joinParty').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                console.log(start.toISOString(), end.toISOString(), label);
              });
    		$("#education_gradTime_1").attr("value",temp);
    		$('#education_gradTime_1').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                console.log(start.toISOString(), end.toISOString(), label);
              });
    		$("#education_entranceTime_1").attr("value",temp);
    		$('#education_entranceTime_1').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                console.log(start.toISOString(), end.toISOString(), label);
              });
    		$("#education_gradTime_2").attr("value",temp);
    		$('#education_gradTime_2').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                console.log(start.toISOString(), end.toISOString(), label);
              });
    		$("#education_entranceTime_2").attr("value",temp);
    		$('#education_entranceTime_2').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                console.log(start.toISOString(), end.toISOString(), label);
              });
    		$("#education_gradTime_3").attr("value",temp);
    		$('#education_gradTime_3').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                console.log(start.toISOString(), end.toISOString(), label);
              });
    		$("#education_entranceTime_3").attr("value",temp);
    		$('#education_entranceTime_3').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                console.log(start.toISOString(), end.toISOString(), label);
              });
            $("#experience_begainTime_1").attr("value",temp);
      		$('#experience_begainTime_1').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                  console.log(start.toISOString(), end.toISOString(), label);
                });
      		$("#experience_endTime_1").attr("value",temp);
      		$('#experience_endTime_1').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                  console.log(start.toISOString(), end.toISOString(), label);
                });
      		$("#experience_begainTime_2").attr("value",temp);
      		$('#experience_begainTime_2').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                  console.log(start.toISOString(), end.toISOString(), label);
                });
      		$("#experience_endTime_2").attr("value",temp);
      		$('#experience_endTime_2').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                  console.log(start.toISOString(), end.toISOString(), label);
                });
      		$("#experience_begainTime_3").attr("value",temp);
      		$('#experience_begainTime_3').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                  console.log(start.toISOString(), end.toISOString(), label);
                });
      		$("#experience_endTime_3").attr("value",temp);
      		$('#experience_endTime_3').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                  console.log(start.toISOString(), end.toISOString(), label);
             });
            $("#family_birth_1").attr("value",temp);
       		$('#family_birth_1').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                   console.log(start.toISOString(), end.toISOString(), label);
              });
       		$("#family_birth_2").attr("value",temp);
      		$('#family_birth_2').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                  console.log(start.toISOString(), end.toISOString(), label);
             });
      		$("#family_birth_3").attr("value",temp);
      		$('#family_birth_3').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                  console.log(start.toISOString(), end.toISOString(), label);
            });
      		$("#family_birth_4").attr("value",temp);
      		$('#family_birth_4').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                  console.log(start.toISOString(), end.toISOString(), label);
            });
            $("#reward_rpDate_1").attr("value",temp);
       		$('#reward_rpDate_1').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                   console.log(start.toISOString(), end.toISOString(), label);
            });
       		$("#reward_rpDate_2").attr("value",temp);
       		$('#reward_rpDate_2').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                   console.log(start.toISOString(), end.toISOString(), label);
            });
       		$("#reward_rpDate_3").attr("value",temp);
       		$('#reward_rpDate_3').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                   console.log(start.toISOString(), end.toISOString(), label);
            });
       		$("#reward_rpDate_4").attr("value",temp);
       		$('#reward_rpDate_4').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                   console.log(start.toISOString(), end.toISOString(), label);
            });
       		$("#reward_rpDate_5").attr("value",temp);
       		$('#reward_rpDate_5').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                   console.log(start.toISOString(), end.toISOString(), label);
            });
       		$("#reward_rpDate_6").attr("value",temp);
       		$('#reward_rpDate_6').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
                   console.log(start.toISOString(), end.toISOString(), label);
            });
       		
    		/***********************************************************************/
    		
        });
    	/*######################################################################################################*/
    	
		//个人信息表单提交
		function personalMessageForm(){
			var content = "";
			$("#personalMessage input").each(function(){
				content = content + $(this).attr("name") +"="+$(this).val()+"&";
			});
			$("#personalMessage select").each(function(){
				content = content + $(this).attr("name") +"="+$(this).val()+"&";
			});
			//将简历主键信息设置进去
			var userId = $("#personalMessage").attr("recruitId");
			if(userId != null && userId != ""){
				content = content + "user.pkEmp="+userId+"&";
			}
			content = content.substring(0,content.length-1);
			//alert("字符串===="+content);
			$.ajax({
				url : "job!saveJobMessage",
				type : "POST",
				data:content,
				dataType : "JSON",
				
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert("通讯出错！");
				},
				success : function(data) {
					if(data.messageFlag != -1){
						//将后台返回的简历id存到recruitId属性中
						$("#personalMessage").attr("recruitId",data.messageFlag);
						$("#test_content").html("操作成功！");
					}else{
						$("#test_content").html("操作失败！");
					}
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
			//取得学历信息表主键
			var id = $("#"+educationId+"").attr("education");
			if(id != "" && id != null){
				content = content +"education.pkEducation="+id+"&";
			}
			//取得当前所属简历信息表主键,如果没有个人信息主键则需要先填写并且保存个人信息
			var resumeId = $("#personalMessage").attr("recruitId");
			if(resumeId != "" && resumeId != null){
				content = content +"education.pkEmp="+resumeId+"&";
			}else{
				$("#needSavePersonal").modal("toggle");//模态框提示
				return false;
			}
			content = content.substring(0,content.length-1);
			//alert("字符串===="+content);
			$.ajax({
				url : "job!saveEducationMessage",
				type : "POST",
				data:content,
				dataType : "JSON",
				
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert("通讯出错！");
				},
				success : function(data) {
					if(data.messageFlag != -1){
						$("#"+educationId+"").attr("education",data.messageFlag);
						$("#test_content").html("操作成功！");
					}else{
						$("#test_content").html("操作失败！");
					}
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
			//取得当前所属简历信息表主键,如果没有个人信息主键则需要先填写并且保存个人信息
			var resumeId = $("#personalMessage").attr("recruitId");
			if(resumeId != "" && resumeId != null){
				content = content +"experience.pkEmp="+resumeId+"&";
			}else{
				$("#needSavePersonal").modal("toggle");//模态框提示
				return false;
			}
			content = content.substring(0,content.length-1);
			//alert("字符串===="+content);
			$.ajax({
				url : "job!saveExperienceMessage",
				type : "POST",
				data:content,
				dataType : "JSON",
				
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert("通讯出错！");
				},
				success : function(data) {
					if(data.messageFlag != -1){
						$("#"+experienceId+"").attr("experience",data.messageFlag);
						$("#test_content").html("操作成功！");
					}else{
						$("#test_content").html("操作失败！");
					}
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
			//取得当前所属简历信息表主键,如果没有个人信息主键则需要先填写并且保存个人信息
			var resumeId = $("#personalMessage").attr("recruitId");
			if(resumeId != "" && resumeId != null){
				content = content +"family.pkEmp="+resumeId+"&";
			}else{
				$("#needSavePersonal").modal("toggle");//模态框提示
				return false;
			}
			content = content.substring(0,content.length-1);
			//alert("字符串===="+content);
			$.ajax({
				url : "job!saveFamilyMessage",
				type : "POST",
				data:content,
				dataType : "JSON",
				
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert("通讯出错！");
				},
				success : function(data) {
					//alert("标志位data.messageFlag=="+data.messageFlag);
					if(data.messageFlag != -1){
						$("#"+familyId+"").attr("family",data.messageFlag);
						$("#test_content").html("操作成功！");
					}else{
						$("#test_content").html("操作失败！");
					}
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
			//取得当前所属简历信息表主键,如果没有个人信息主键则需要先填写并且保存个人信息
			var resumeId = $("#personalMessage").attr("recruitId");
			if(resumeId != "" && resumeId != null){
				content = content +"reward.pkEmp="+resumeId+"&";
			}else{
				$("#needSavePersonal").modal("toggle");//模态框提示
				return false;
			}
			content = content.substring(0,content.length-1);
			//alert("字符串===="+content);
			$.ajax({
				url : "job!saveRewardMessage",
				type : "POST",
				data:content,
				dataType : "JSON",
				
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert("通讯出错！");
				},
				success : function(data) {
					if(data.messageFlag != -1){
						$("#"+rewardId+"").attr("reward",data.messageFlag);
						$("#test_content").html("操作成功！");
					}else{
						$("#test_content").html("操作失败！");
					}
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
			//取得当前所属简历信息表主键,如果没有个人信息主键则需要先填写并且保存个人信息
			var resumeId = $("#personalMessage").attr("recruitId");
			if(resumeId != "" && resumeId != null){
				content = content +"reward.pkEmp="+resumeId+"&";
			}else{
				$("#needSavePersonal").modal("toggle");//模态框提示
				return false;
			}
			content = content.substring(0,content.length-1);
			//alert("字符串===="+content);
			$.ajax({
				url : "job!saveRewardMessage",
				type : "POST",
				data:content,
				dataType : "JSON",
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert("通讯出错！");
				},
				success : function(data) {
					if(data.messageFlag != -1){
						$("#"+punishId+"").attr("reward",data.messageFlag);
						$("#test_content").html("操作成功！");
					}else{
						$("#test_content").html("操作失败！");
					}
					$("#messageModal").modal("toggle");
				}//end of success
			});
			//end of ajax
		}
		
		//提交全部信息
		function turnToPersonalCenter(){
			window.location.href="job!showPresonalMessage";
		}
		
		
		
		
		
    </script>
    
    </head>
    
    <body style="background-image:url(<%=path %>/img/bg1.jpg)">
    
        <div class="container" style="margin-top:-50px; background-color: rgb(248, 248, 248); padding-top:10px; padding-bottom:50px;">
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
                            <h3 class="panel-title">创建简历</h3>
                        </div>
                        <div class="panel-body" style="font-size:12px;">
                            <!--********************************个人信息***********************************-->
                            <div class="row padding-title">
                            	<div class="row">
                                	<h4 class="col-md-7 col-sm-7 col-xs-7">个人信息 >> </h4>
                                    <div class="col-md-5 col-sm-5 col-xs-5 text-right" style="padding-right: 3em;">
                                    	<button role="button" class="btn btn-xs btn-primary" onclick="personalMessageForm();">
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button>
                                    </div>
                                </div><!-- end off "row" -->
                            	
                                <div class="row" id="personalMessage" recruitId="">
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">简历名：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.resumeName" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">姓名：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.name" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">年龄：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.age" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">曾用名：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.oldName" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">身份证号：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.id" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">性别：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<select name="user.gender" class="form-control input-sm col-md-10 col-sm-10 col-xs-12">
                                            	<option value="男">男</option>
                                                <option value="女">女</option>
                                            </select>
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">出生日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- user.birth -->
                                        	<input id="birth_date" name="birthTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">名族：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.ation" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">血型：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.blood" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">政治面貌：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.ps" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">家庭出生：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.household" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">籍贯：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.nation" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">出生地：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.birthplace" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">健康状况：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.health" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">婚姻状况：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.marriage" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">档案所在地：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.archiveAddr" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">参加工作时间：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- user.workTime -->
                                        	<input id="user_workTime" name="startWorkTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">户口性质：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.householdNatrue" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">户口所在地：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.householdAddr" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">家庭住址：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.houseAddr" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">手机：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.priPhone" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">办公电话：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.officePhone" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">常联系人电话：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.linkmanPhone" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">家庭电话：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.housePhone" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">邮政编码：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.postcode" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">电子邮箱：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.email" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">入党时单位：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="user.joinPartyComp" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">入党(团)日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- user.joinParty -->
                                        	<input id="user_joinParty" name="inPartyTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">转正时间：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- user.joinPartyTime -->
                                        	<input id="user_joinPartyTime" name="startPartyTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                </div><!-- end off "row" -->
                            </div><!-- end off "row" -->
                     
                            <!--********************************学历信息***********************************-->
                            <div class="row padding-title">
                            	<div class="row" style="margin-top:30px;">
                                	<h4 class="col-md-7 col-sm-7 col-xs-7">学历信息 >> </h4>
                                </div><!-- end off "row" -->
                            	
                                <div class="row" education="" id="education1">
                                	<h4 class="text-info" style="text-indent:4em;">学历1:</h4>
                                	<div class="row text-right" style="padding-right: 4.5em;">
                                		<button role="button" class="btn btn-xs btn-primary" onclick="educationMessageForm('education1');">
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button>
                                	</div>
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学校：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.school" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">专业：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.pec" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学历专业类别：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.pecType" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学历：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.edu" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学位：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.degree" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学制：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.eduLength" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">最高学历：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                            <select name="education.heighEdu" class="form-control input-sm">
                                                <option value="是">是</option>
                                                <option value="否">否</option>
                                            </select>
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">全日制学历：</label>
                                       <div class="col-md-7 col-sm-7 col-xs-7">
                                            <select name="education.dayEdu" class="form-control input-sm">
                                                <option value="是">是</option>
                                                <option value="否">否</option>
                                            </select>
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学校类型：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.schoolType" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学习方式：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.eduType" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">入学日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- education.entranceTime -->
                                        	<input id="education_entranceTime_1" name="toSchoolTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">毕业日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- education.gradTime -->
                                        	<input id="education_gradTime_1" name="grduateTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学历证书编号：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.eduCode" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学位证书编号：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.degreeCode" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                   
                                    
                                    
                                </div><!-- end off "row" -->
                                
                                <div class="row" education="" id="education2">
                                	<h4 class="text-info" style="text-indent:4em;">学历2:</h4>
                                	<div class="row text-right" style="padding-right: 4.5em;">
                                		<button role="button" class="btn btn-xs btn-primary" onclick="educationMessageForm('education2');">
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button>
                                	</div>
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学校：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.school" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">专业：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.pec" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学历专业类别：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.pecType" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学历：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.edu" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学位：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.degree" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学制：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.eduLength" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">最高学历：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                            <select name="education.heighEdu" class="form-control input-sm">
                                                <option value="是">是</option>
                                                <option value="否">否</option>
                                            </select>
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">全日制学历：</label>
                                       <div class="col-md-7 col-sm-7 col-xs-7">
                                            <select name="education.dayEdu" class="form-control input-sm">
                                                <option value="是">是</option>
                                                <option value="否">否</option>
                                            </select>
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学校类型：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.schoolType" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学习方式：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.eduType" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">入学日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- education.entranceTime -->
                                        	<input id="education_entranceTime_2" name="toSchoolTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">毕业日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- education.gradTime -->
                                        	<input id="education_gradTime_2" name="grduateTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学历证书编号：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.eduCode" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学位证书编号：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.degreeCode" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                   
                                    
                                    
                                </div><!-- end off "row" -->
                                
                                <div class="row" education="" id="education3">
                                	<h4 class="text-info" style="text-indent:4em;">学历3:</h4>
                                	<div class="row text-right" style="padding-right: 4.5em;">
                                		<button role="button" class="btn btn-xs btn-primary" onclick="educationMessageForm('education3');">
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button>
                                	</div>
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学校：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.school" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">专业：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.pec" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学历专业类别：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.pecType" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学历：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.edu" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学位：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.degree" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学制：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.eduLength" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">最高学历：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                            <select name="education.heighEdu" class="form-control input-sm">
                                                <option value="是">是</option>
                                                <option value="否">否</option>
                                            </select>
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">全日制学历：</label>
                                       <div class="col-md-7 col-sm-7 col-xs-7">
                                            <select name="education.dayEdu" class="form-control input-sm">
                                                <option value="是">是</option>
                                                <option value="否">否</option>
                                            </select>
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学校类型：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.schoolType" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学习方式：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.eduType" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">入学日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- education.entranceTime -->
                                        	<input id="education_entranceTime_3" name="toSchoolTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">毕业日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- education.gradTime -->
                                        	<input id="education_gradTime_3" name="grduateTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学历证书编号：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.eduCode" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">学位证书编号：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="education.degreeCode" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                   
                                    
                                    
                                </div><!-- end off "row" -->
                            </div><!-- end off "row" --> 
                            <!--********************************履历信息***********************************-->
                            <div class="row padding-title">
                            	<div class="row" style="margin-top:30px;">
                                	<h4 class="col-md-7 col-sm-7 col-xs-7">履历信息 >> </h4>
                                </div><!-- end off "row" -->
                            	
                                <div class="row" experience="" id="experience1">
                                	<h4 class="text-info" style="text-indent:4em;">履历1:</h4>
                                	<div class="row text-right" style="padding-right: 4.5em;">
                                		<button role="button" class="btn btn-xs btn-primary" onclick="experienceMessageForm('experience1')">
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button>
                                	</div>
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">起始日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- experience.begainTime -->
                                        	<input id="experience_begainTime_1" name="experienceStartTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">终止日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- experience.endTime -->
                                        	<input id="experience_endTime_1" name="experienceEndTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">工作单位：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="experience.workPlace" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">担任职务：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="experience.duty" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">所在部门：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="experience.dept" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">岗位：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="experience.post" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                   
                                </div><!-- end off "row" -->
                                
                                <div class="row" experience="" id="experience2">
                                	<h4 class="text-info" style="text-indent:4em;">履历2:</h4>
                                	<div class="row text-right" style="padding-right: 4.5em;">
                                		<button role="button" class="btn btn-xs btn-primary" onclick="experienceMessageForm('experience2')">
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button>
                                	</div>
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">起始日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- experience.begainTime -->
                                        	<input id="experience_begainTime_2" name="experienceStartTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">终止日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- experience.endTime -->
                                        	<input id="experience_endTime_2" name="experienceEndTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">工作单位：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="experience.workPlace" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">担任职务：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="experience.duty" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">所在部门：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="experience.dept" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">岗位：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="experience.post" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                   
                                </div><!-- end off "row" -->
                                
                                <div class="row" experience="" id="experience3">
                                	<h4 class="text-info" style="text-indent:4em;">履历3:</h4>
                                	<div class="row text-right" style="padding-right: 4.5em;">
                                		<button role="button" class="btn btn-xs btn-primary" onclick="experienceMessageForm('experience3')">
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button>
                                	</div>
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">起始日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- experience.begainTime -->
                                        	<input id="experience_begainTime_3" name="experienceStartTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">终止日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- experience.endTime -->
                                        	<input id="experience_endTime_3" name="experienceEndTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">工作单位：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="experience.workPlace" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">担任职务：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="experience.duty" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">所在部门：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="experience.dept" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">岗位：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="experience.post" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                   
                                </div><!-- end off "row" -->
                            </div><!-- end off "row" -->
                            <!--********************************家庭信息***********************************-->
                            <div class="row padding-title">
                            	<div class="row" style="margin-top:30px;">
                                	<h4 class="col-md-7 col-sm-7 col-xs-7">家庭成员信息 >> </h4>
                                </div><!-- end off "row" -->
                            	
                                <div class="row" family="" id="family1">
                                	<h4 class="text-info" style="text-indent:4em;">成员1:</h4>
                                	<div class="row text-right" style="padding-right: 4.5em;">
                                		<button role="button" class="btn btn-xs btn-primary" onclick="familyMessageForm('family1');" >
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button>
                                	</div>
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">成员姓名：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.name" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">亲属关系：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.relation" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">工作单位：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.workPlace" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">职务：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.duty" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">性别：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                            <select name="family.gender" class="form-control input-sm" name="" >
                                                <option value="男">男</option>
                                                <option value="女">女</option>
                                            </select>
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">出生日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- family.birth -->
                                        	<input id="family_birth_1" name="familyBirthTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">政治面貌：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.polotics" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">文化程度：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.education" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                   
                                </div><!-- end off "row" -->
                                
                                <div class="row" family="" id="family2">
                                	<h4 class="text-info" style="text-indent:4em;">成员2:</h4>
                                	<div class="row text-right" style="padding-right: 4.5em;">
                                		<button role="button" class="btn btn-xs btn-primary" onclick="familyMessageForm('family2');" >
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button>
                                	</div>
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">成员姓名：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.name" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">亲属关系：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.relation" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">工作单位：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.workPlace" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">职务：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.duty" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">性别：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                            <select name="family.gender" class="form-control input-sm" name="" >
                                                <option value="男">男</option>
                                                <option value="女">女</option>
                                            </select>
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">出生日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- family.birth -->
                                        	<input id="family_birth_2" name="familyBirthTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">政治面貌：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.polotics" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">文化程度：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.education" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                   
                                </div><!-- end off "row" -->
                                
                                <div class="row" family="" id="family3">
                                	<h4 class="text-info" style="text-indent:4em;">成员3:</h4>
                                	<div class="row text-right" style="padding-right: 4.5em;">
                                		<button role="button" class="btn btn-xs btn-primary" onclick="familyMessageForm('family3');" >
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button>
                                	</div>
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">成员姓名：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.name" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">亲属关系：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.relation" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">工作单位：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.workPlace" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">职务：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.duty" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">性别：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                            <select name="family.gender" class="form-control input-sm" name="" >
                                                <option value="男">男</option>
                                                <option value="女">女</option>
                                            </select>
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">出生日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- family.birth -->
                                        	<input id="family_birth_3" name="familyBirthTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">政治面貌：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.polotics" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">文化程度：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.education" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                   
                                </div><!-- end off "row" -->
                                
                                 <div class="row" family="" id="family4">
                                	<h4 class="text-info" style="text-indent:4em;">成员4:</h4>
                                	<div class="row text-right" style="padding-right: 4.5em;">
                                		<button role="button" class="btn btn-xs btn-primary" onclick="familyMessageForm('family4');" >
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button>
                                	</div>
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">成员姓名：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.name" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">亲属关系：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.relation" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">工作单位：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.workPlace" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">职务：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.duty" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">性别：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                            <select name="family.gender" class="form-control input-sm" name="" >
                                                <option value="男">男</option>
                                                <option value="女">女</option>
                                            </select>
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                     <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">出生日期：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- family.birth -->
                                        	<input id="family_birth_4" name="familyBirthTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">政治面貌：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.polotics" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">文化程度：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="family.education" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                   
                                </div><!-- end off "row" -->
                            </div><!-- end off "row" -->
                            <!--********************************奖励信息***********************************-->
                            <div class="row padding-title">
                            	<div class="row" style="margin-top:30px;">
                                	<h4 class="col-md-7 col-sm-7 col-xs-7">奖励信息 >> </h4>
                                </div><!-- end off "row" -->
                            	
                                <div class="row" reward="" id="reward1">
                                	<h4 class="text-info" style="text-indent:4em;">奖励1:</h4>
                                	<div class="row text-right" style="padding-right: 4.5em;">
                                		<button role="button" class="btn btn-xs btn-primary" onclick="rewardMessageForm('reward1');">
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button>
                                	</div>
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">奖励名称：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="reward.rpGist" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">奖励时间：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- reward.rpDate -->
                                        	<input id="reward_rpDate_1" name="rewardTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">奖励事由：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="reward.rpVasue" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">奖励内容：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="reward.rpMeasure" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                   
                                </div><!-- end off "row" -->
                                
                                <div class="row" reward="" id="reward2">
                                	<h4 class="text-info" style="text-indent:4em;">奖励2:</h4>
                                	<div class="row text-right" style="padding-right: 4.5em;">
                                		<button role="button" class="btn btn-xs btn-primary" onclick="rewardMessageForm('reward2');">
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button>
                                	</div>
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">奖励名称：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="reward.rpGist" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">奖励时间：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- reward.rpDate -->
                                        	<input id="reward_rpDate_2" name="rewardTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">奖励事由：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="reward.rpVasue" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">奖励内容：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="reward.rpMeasure" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                   
                                </div><!-- end off "row" -->
                                
                                <div class="row" reward="" id="reward3">
                                	<h4 class="text-info" style="text-indent:4em;">奖励3:</h4>
                                	<div class="row text-right" style="padding-right: 4.5em;">
                                		<button role="button" class="btn btn-xs btn-primary" onclick="rewardMessageForm('reward3');">
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button>
                                	</div>
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">奖励名称：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="reward.rpGist" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">奖励时间：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- reward.rpDate -->
                                        	<input id="reward_rpDate_3" name="rewardTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">奖励事由：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="reward.rpVasue" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">奖励内容：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="reward.rpMeasure" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                   
                                </div><!-- end off "row" -->
                            </div><!-- end off "row" -->
                            <!--********************************处分信息***********************************-->
                            <div class="row padding-title">
                            	<div class="row" style="margin-top:30px;">
                                	<h4 class="col-md-7 col-sm-7 col-xs-7">处分信息 >> </h4>
                                </div><!-- end off "row" -->
                            	
                                <div class="row" reward="" id="reward4">
                                	<h4 class="text-info" style="text-indent:4em;">处分1:</h4>
                                	<div class="row text-right" style="padding-right: 4.5em;">
                                		<button role="button" class="btn btn-xs btn-primary" onclick="punishMessageForm('reward4');">
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button>
                                	</div>
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">惩罚名称：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="reward.rpGist" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">惩罚时间：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- reward.rpDate -->
                                        	<input id="reward_rpDate_4" name="rewardTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">惩罚事由：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="reward.rpVasue" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">惩罚内容：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="reward.rpMeasure" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                   
                                </div><!-- end off "row" -->
                                
                                <div class="row" reward="" id="reward5">
                                	<h4 class="text-info" style="text-indent:4em;">处分2:</h4>
                                	<div class="row text-right" style="padding-right: 4.5em;">
                                		<button role="button" class="btn btn-xs btn-primary" onclick="punishMessageForm('reward5');">
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button>
                                	</div>
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">惩罚名称：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="reward.rpGist" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">惩罚时间：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- reward.rpDate -->
                                        	<input id="reward_rpDate_5" name="rewardTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">惩罚事由：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="reward.rpVasue" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">惩罚内容：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="reward.rpMeasure" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                   
                                </div><!-- end off "row" -->
                                
                                <div class="row" reward="" id="reward6">
                                	<h4 class="text-info" style="text-indent:4em;">处分3:</h4>
                                	<div class="row text-right" style="padding-right: 4.5em;">
                                		<button role="button" class="btn btn-xs btn-primary" onclick="punishMessageForm('reward6');">
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button>
                                	</div>
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">惩罚名称：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="reward.rpGist" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">惩罚时间：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7"><!-- reward.rpDate -->
                                        	<input id="reward_rpDate_6" name="rewardTime" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">惩罚事由：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="reward.rpVasue" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                     
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">惩罚内容：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input name="reward.rpMeasure" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                   
                                </div><!-- end off "row" -->
                            </div><!-- end off "row" -->
                            <!--********************************个人信息***********************************-->
                            <div class="row margin-top-4 text-center">
                            	<%-- <div class="col-md-6 col-sm-6 col-xs-6 text-right">
                                	<button role="button" class="btn btn-default">
                                    	<span class="glyphicon glyphicon-expand"></span> 预 览
                                    </button>
                                </div> --%>
                               <%--  <div class="col-md-6 col-sm-6 col-xs-6">
                                	<button role="button" class="btn btn-success">
                                    	<span class="glyphicon glyphicon-saved"></span> 提交申请
                                    </button>
                                </div> --%>
                              <%--   
                                <button class="btn btn-default" onclick="turnToPersonalCenter();">
                                	<span class="glyphicon glyphicon-saved"></span> 保存
                               	</button>
                               	 --%>
                            </div>
                            
                        </div><!-- end off "panel-body" -->
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
                <h4 class="modal-title">温馨提示</h4>
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
        
        
        
        <!-- 是否提交弹出框 -->
        <div class="modal fade form-horizontal" id="needSavePersonal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
          <div class="modal-dialog">
            <div class="modal-content ">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title">温馨提示</h4>
              </div>
              <div class="modal-body">
                    <div class="text-center text-info">
                        <h4>你需要先保存个人信息！</h4>
                    </div>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-primary btn-sm" data-dismiss="modal" aria-hidden="true">确定</button>
              </div>
              
            </div><!-- /.modal-content -->
          </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
        
        
        
        
    </body>
</html>
