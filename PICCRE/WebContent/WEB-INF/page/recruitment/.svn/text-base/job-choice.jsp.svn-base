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
    <title>PICCRE职位申请</title>
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
       		
    		//市公司选择改变的时候相应的改变下面的部门列表信息
    		$(document).on("click","#cityCompany",function(){
				var cityCode = $(this).attr("value");
				var recruitId = $("#recruitName").attr("value");
				$.ajax({
					url : "job!getAllByRecruit?recruitmentDetail.compCode=" + cityCode+"&recruitmentDetail.pkAppDem="+recruitId,
					type : "POST",
					dataType : "JSON",
					contentType:'application/x-www-form-urlencoded; charset=UTF-8',
					deforeSend : function(u) {
						u.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
					},
					error : function(XMLHttpRequest, textStatus, errorThrown) {
						alert("通讯出错！");
					},
					success : function(data) {
						//var departmentOption ="<option value='-1'>请选择</option>";
						var departmentOption ="";
						$.each(data.content, function(i, temp) {
							departmentOption += "<option value='"+temp.deptName+"'>"+temp.deptName+"</option>";
						});
						$("#cityDepartment").html(departmentOption);
						//$("#cityPosition").html("<option value='-1'>请选择</option>");
						$("#cityPosition").html("");
					}//end of success
				});
				//end of ajax
    		});
    		/***********************************************************************/
    		//部门选择改变的时候相应的改变下面的岗位列表信息 http://localhost:8080/PICCRE/recruitment/job!queryAllDem
    		$(document).on("click","#cityDepartment",function(){
    			var departName = $(this).attr("value");
    			var cityCode = $("#cityCompany").attr("value");
				var recruitId = $("#recruitName").attr("value");
				var temp = "recruitmentDetail.compCode=" + cityCode+"&recruitmentDetail.pkAppDem="+recruitId+"&recruitmentDetail.deptName="+departName;
				$.ajax({
					url : "job!getAllByRecruit",
					type : "POST",
					dataType : "JSON",
					data:temp,
					error : function(XMLHttpRequest, textStatus, errorThrown) {
						alert("通讯出错！");
					},
					success : function(data) {
						//var PositionOption ="<option value='-1'>请选择</option>";
						var PositionOption ="";
						$.each(data.content, function(f, temp) {
							PositionOption += "<option value='"+temp.postName+"'>"+temp.postName+"</option>";
						});
						$("#cityPosition").html(PositionOption);
					}//end of success
				});
				//end of ajax
    		});
    		
        });
    	/*######################################################################################################*/
    	//职位选择表单提交
		function subJobChoiceForm(){
			//alert("进入采集数据。。。。。");
			var content = "";
			$("#jobChoice input").each(function(){
				content = content + $(this).attr("name") +"="+$(this).val()+"&";
			});
			var resumeId = $("#resumeId").find("option:selected").val();
			var cityCode = $("#cityCompany").find("option:selected").val();
			var cityName = $("#cityCompany").find("option:selected").html();
			var deptName = $("#cityDepartment").find("option:selected").html();
			var optionName = $("#cityPosition").find("option:selected").html();
			if(resumeId == null || resumeId == ""){
				$("#sureToCommitModal").modal("hide");//模态框提示
				$("#needCreateResume").modal("toggle");//模态框提示
				return false;
			}
			content = content + "user.applyUnitCode="+cityCode+"&user.applyUnit="+cityName+"&user.applyDept="+deptName+"&user.applyPost="+optionName+"&user.pkEmp="+resumeId+"&";
			content = content.substring(0,content.length-1);
			$.ajax({
				url : "job!saveRequirementMessage",
				type : "POST",
				data:content,
				dataType : "JSON",
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert("通讯出错！");
				},
				success : function(data) {
					if(data.messageFlag != -1){
						$("#jobChoice").attr("recruitId",data.messageFlag);
						$("#test_content").html("操作成功！");
						window.location.href="job!showPresonalMessage";
					}else{
						$("#test_content").html("操作失败！");
					}
					$("#messageModal").modal("toggle");
				}//end of success
			});
			//end of ajax
		}
    	
		
		//转到简历中心
		function turnToPersonalCenter(){
			window.location.href="job!showPresonalMessage";
		}
		
		//跳转到创建简历页面
		function toCreateResumePage(){
			window.location.href="job!createResume";
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
                    <div class="col-md-1  col-sm-2 col-xs-3"><a href="<%=path%>/PICCRE/login!logout">退出</a></div>
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
                          <a class="navbar-brand" href="#">导航</a>
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
                            <h3 class="panel-title">职位申请</h3>
                        </div>
                        <div class="panel-body" style="font-size:12px;">
                        	<!--********************************职位选择 >>***********************************-->
                            <div class="row padding-title">
                            	<div class="row">
                                	<h4 class="col-md-7 col-sm-7 col-xs-7">职位选择 >> </h4>
                                    <%-- <div class="col-md-5 col-sm-5 col-xs-5 text-right" style="padding-right: 3em;">
                                    	<button type="button" class="btn btn-xs btn-primary" onclick="subJobChoiceForm();">
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button> 
                                    </div> --%>
                                </div><!-- end off "row" -->
                            	
                                <div class="row" id="jobChoice" recruitId="">
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5"  style="margin-top:6px;">招聘批次：</label>
                                    	<input name="user.demName" type="text" value="<s:property value='recruitment.demName' />" style="display:none;" /><!-- 需求名 -->
                                    	<input name="user.demPk" type="text" value="<s:property value='recruitment.pkAppDem' />" style="display:none;" /><!-- 需求id -->
                                        <div class="col-md-7 col-sm-7 col-xs-7" style="margin-top:6px;" value="<s:property value='recruitment.pkAppDem' />" id="recruitName" ><s:property value='recruitment.demName' /></div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">市公司：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<select name="user.planUnit" class="form-control input-sm" id="cityCompany">
                                        		<s:iterator value="organizationList" id="temp">
                                        			<option value="<s:property value='#temp.orgCode' />"><s:property value="#temp.orgName" /></option>
                                        		</s:iterator>
                                            </select>
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">部门：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<select name="user.planDept" class="form-control input-sm" id="cityDepartment">
                                        		
                                            </select>
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">岗位：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7" >
                                        	<select name="user.planPost" class="form-control input-sm" id="cityPosition">
                                        		
                                            </select>
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">简历：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<select name="user.pkEmp" class="form-control input-sm" id="resumeId">
                                        		<s:iterator value="userList" id="temp">
                                        			<option value="<s:property value='#temp.pkEmp' />"><s:property value="#temp.resumeName" /></option>
                                        		</s:iterator>
                                            </select>
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<div class="col-md-7 col-sm-7 col-xs-7 col-md-offset-2">
                                    		<button class="btn btn-sm btn-primary" btnType="fixBtn"  onclick="toCreateResumePage();">
		                                       	<span class="glyphicon glyphicon-forward"></span> 创建简历
		                                    </button>
                                    	</div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                </div><!-- end off "row" -->
                            </div><!-- end off "row" -->
                            <!--********************************个人信息***********************************-->
                            <div class="row margin-top-4 text-center">
                                <button class="btn btn-success" data-toggle="modal" data-target="#sureToCommitModal"> 
                                    	<span class="glyphicon glyphicon-saved"></span> 提交申请
                                </button>
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
        
        <!-- 是否提交弹出框 -->
        <div class="modal fade form-horizontal" id="sureToCommitModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
          <div class="modal-dialog">
            <div class="modal-content ">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h3 class="modal-title text-info">温馨提示</h3>
              </div>
              <div class="modal-body">
                    <div class="text-center text-info">
                        <h4>确认提交？</h4>
                    </div>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default btn-sm" data-dismiss="modal" aria-hidden="true">取消</button>
                <button type="button" class="btn btn-success btn-sm" onclick="subJobChoiceForm();" >确定</button>
              </div>
              
            </div><!-- /.modal-content -->
          </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
        
         <!-- 是否提交弹出框 -->
        <div class="modal fade form-horizontal" id="needCreateResume" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
          <div class="modal-dialog">
            <div class="modal-content ">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title">温馨提示</h4>
              </div>
              <div class="modal-body">
                    <div class="text-center text-info">
                        <h4>当前您还没有创建一份属于您自己的简历，请在至少创建一份简历后，在开始申请职位！</h4>
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
