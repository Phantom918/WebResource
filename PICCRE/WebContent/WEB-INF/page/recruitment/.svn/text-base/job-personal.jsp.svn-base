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
    <title>PICCRE个人中心</title>
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
    		var messageFlag = $("#messgeArea").val();
    		//deleteMessageModal delete_content
    		if(messageFlag == 1){
    			$("#delete_content").html("删除成功！");
    			$("#deleteMessageModal").modal("toggle");
    		}else if(messageFlag == 2){
    			$("#delete_content").html("删除失败！");
    			$("#deleteMessageModal").modal("toggle");
    		}
    		
    		
        });
        
      //修改函数
        function fixSomeMessage(obj){
        	$(obj).parent().parent().find("input").removeAttr("disabled");
        	$(obj).parent().parent().find("select").removeAttr("disabled");
        	$(obj).parent().find("button[btnType=saveBtn]").removeAttr("disabled");
        	$(obj).attr("disabled","disabled");
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
		
		//查看用户简历详细信息
		function seeRecruitDetail(recruitId){
			window.location.href="job!seeResumeDetail?resumeId="+recruitId;
		}
		
		//跳转到创建简历页面
		function toCreateResumePage(){
			window.location.href="job!createResume";
		}
		
		//弹出确认删除对话框 deleteMessageModal delete_content recruitId
		function toDeleteModal(recruitId){
			//将需要删除的id标记在某处
			$("#deleteId").attr("recruitId",recruitId);
			//弹出删除对话框
			$("#weatherDeleteMessageModal").modal("toggle");
		}
		
		//删除建立信息
		function deleteRecruitMessage(){
			var recruitId = $("#deleteId").attr("recruitId");
			//alert("删除ID==="+recruitId);
			window.location.href="job!deleteSomeRecruit?resumeId="+recruitId;
		}
		
		
		
		
		
    </script>
    
    
    </head>
    
    <body style="background-image:url(<%=path %>/img/bg1.jpg)">
    
    	<div id="messgeArea" value='<s:property value="deleteFlag" />' style="display:none;"></div>
    
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
                            <h3 class="panel-title">个人信息</h3>
                        </div>
                        <div class="panel-body" style="font-size:12px;">
                        	<!--********************************账户信息 >>***********************************-->
                        	<div class="row padding-title">
                            	<div class="row">
                                	<h4 class="col-md-7 col-sm-7 col-xs-7">账户信息 >> </h4>
                                </div><!-- end off "row" -->
                            	
                                <div class="row" id="loginMessageForm">
                                	<div class="row text-right" style="padding-right: 4.5em;">
	                                	<button class="btn btn-xs btn-primary" btnType="fixBtn"  onclick="fixSomeMessage(this);">
                                        	<span class="glyphicon glyphicon-pencil"></span> 修改
                                        </button>
                                		<button  class="btn btn-xs btn-primary" disabled="disabled" btnType="saveBtn" onclick="changeLoginMessage();">
                                        	<span class="glyphicon glyphicon-floppy-save"></span> 保存
                                        </button>
                                	</div>
                                	<div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">用户名：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input id="loginMessage_name" name="loginMessage.name" disabled="disabled" value="<s:property value='loginMessage.name' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                    
                                    <div class="col-md-4 col-sm-4 col-xs-4" style="margin-top:10px;">
                                    	<label class="text-right col-md-5 col-sm-5 col-xs-5" style="margin-top:6px;">邮箱地址：</label>
                                        <div class="col-md-7 col-sm-7 col-xs-7">
                                        	<input id="loginMessage_email" name="loginMessage.email" disabled="disabled" value="<s:property value='loginMessage.email' />" type="text" class="form-control input-sm col-md-10 col-sm-10 col-xs-12" />
                                        </div>
                                    </div><!-- end off "col-md-4 col-sm-4 col-xs-4" -->
                                </div><!-- end off "row" -->
                                
                            </div><!-- end off "row" -->
                            
                            <!-- ***********************************简历信息****************************************** -->
                            <div class="row padding-title">
                            	<div class="row">
                                	<h4 class="col-md-7 col-sm-7 col-xs-7">简历信息 >> </h4>
                                </div><!-- end off "row" -->
                                <div class="row text-right" style="padding-right: 4.5em;">
                                	<button class="btn btn-sm btn-primary" btnType="fixBtn"  onclick="toCreateResumePage();">
                                       	<span class="glyphicon glyphicon-plus"></span> 新建简历
                                    </button>
                               	</div>
                            	
                                <div class="col-md-12 col-sm-12 col-xs-12" style="padding:0 40px 50px 40px;" >
                                	<table class="table table-hover table-responsive table-bordered text-center" style="margin-top:30px;">
				                        <thead class="table-thead">
				                            <tr>
				                                <td>编号</td>
				                                <td>招聘批次</td>
				                                <td>招聘单位</td>
				                                <td>招聘部门</td>
				                                <td>招聘职位</td>
				                                <td>简历名称</td>
				                                <td>录用结果</td>
				                                <td>操作</td>
				                            </tr>
				                        </thead>
				                        <tbody class="table-tbody">
				                            <s:iterator value="userList" status="number" id="temp">
				                            	<tr>
					                                <td><s:property value="#number.count"/></td>
					                                <td>
					                                	<s:if test='#temp.demName != null and #temp.demName != "null"'>
					                                		<s:property value="#temp.demName"/>
					                                	</s:if>
					                                	<s:else>无</s:else>
					                                </td>
					                                <td>
					                                	<s:if test='#temp.applyUnit != null && #temp.applyUnit != "null"'>
					                                		<s:property value="#temp.applyUnit"/>
					                                	</s:if>
					                                	<s:else>无</s:else>
					                                </td>
				                                	<td>
				                                		<s:if test='#temp.applyDept != null && #temp.applyDept != "null"'>
					                                		<s:property value="#temp.applyDept"/>
					                                	</s:if>
					                                	<s:else>无</s:else>
				                                	</td>
				                                	<td>
				                                		<s:if test='#temp.applyPost != null && #temp.applyPost != "null"'>
					                                		<s:property value="#temp.applyPost"/>
					                                	</s:if>
					                                	<s:else>无</s:else>
				                                	</td>
					                                <td><s:property value='#temp.resumeName' /></td>
					                                <td class="col-md-2">
														<s:if test="#temp.status == 88">已录用</s:if>
														<s:elseif test="#temp.status == -88">未录用</s:elseif>
														<s:else>未知</s:else>
													</td>
					                                <td>
														<button class="btn btn-xs btn-primary" onclick="seeRecruitDetail(<s:property value='#temp.pkEmp' />);" >详细</button>
														<button class="btn btn-xs btn-primary" onclick="toDeleteModal(<s:property value='#temp.pkEmp' />);">删除</button>
													</td>
					                            </tr>
				                            </s:iterator>
				                        </tbody>
				                    </table>
                                </div><!-- end off "row" -->
                                
                            </div><!-- end off "row" -->
                        
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
        
        <!-- 是否删除提示框 -->
        <div class="modal fade form-horizontal" id="weatherDeleteMessageModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
          <div class="modal-dialog">
            <div class="modal-content ">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title">温馨提示</h4>
              </div>
              <div class="modal-body">
                    <div class="text-center text-info">
                        <h4 id="deleteId" recruitId="" >确认删除</h4>
                    </div>
              </div>
              <div class="modal-footer">
                <button class="btn btn-default btn-sm" data-dismiss="modal" aria-hidden="true">取消</button>
                <button class="btn btn-primary btn-sm" onclick="deleteRecruitMessage();">确定</button>
              </div>
              
            </div><!-- /.modal-content -->
          </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
        
        <!--删除成功与否信息提示框 -->
        <div class="modal fade form-horizontal" id="deleteMessageModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
          <div class="modal-dialog">
            <div class="modal-content ">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title">温馨提示</h4>
              </div>
              <div class="modal-body">
                    <div class="text-center text-info">
                        <h4 id="delete_content" recruitId="" ></h4>
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
