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
         function turnToLogin(){
        	 
        	 window.location.href="<%=path%>/login!index";
         }
        
       	
		
    </script>
    
    
    </head>
    
    <body>
    
    	<div class="row text-center" style="margin-top:200px;">
    		<h1 onclick="turnToLogin();"><a>当前还未登陆，请登录后重新操作！</a></h1>
    	</div>
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
