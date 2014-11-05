<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
		+ request.getServerName() + ":" + request.getServerPort()
		+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <div class="navbar navbar-default navbar-fixed-to" style="margin-top:-50px;margin-bottom:.5em;height:100px;padding:20px 0 20px 0; ">
		<a class="col-md-3"  ><img src="<%=path %>/img/picc-logo.gif" style="margin-left: 20"/> </a>
		<div class="col-md-9" style="margin-top:10px;">
			<p class="col-md-8 text-center text-info" style="font-size:25px;letter-spacing:3px;">欢迎使用 PICC湖南省分公司人力资源管理系统</p>
			<div class="col-md-4 text-right " style="font-size:14px">
					<div class="row text-right" style="font-size:18px;">用户：<small><s:property value="userBasic.name"/></small>&nbsp;&nbsp;<a href="<%=path%>/login!logout">退出</a></div>
					<div class="row" id="showtime" style="margin-top:10px;"></div>
			</div>
		</div>
</div> --%>
<!-- 
	<header class="navbar navbar-fixed-top navbar-default heading-banner" role="banner">
    	<img class="col-md-3 col-sm-3 img-responsive img-center" src="images/picc_logo.png"  />
        
        <div class="col-md-1 col-sm-2 col-xs-6 picc_font_1 text-right">PICC</div>
        <div class="col-md-2 col-sm-2 col-xs-6 picc_font_2 text-left">中国人保财险</div>
        
    	<div class="col-md-9 col-sm-8  col-xs-12">
        	
        </div>
    
    </header>
     -->
    <div class="col-md-12 my_banner">
    	<div class="col-md-3 col-sm-3" style="padding-top:0.4em; padding-bottom:0.4em;">
        	<img class="col-md-3 col-sm-3 img-responsive img-center" src="<%=path %>/img/picc_logo_s.png"  />
        </div>
        <div class="col-md-9 col-sm-8  col-xs-12">
        	<div class="text-info wecome_message col-md-6 col-ms-6 text-right">PICC人力资源管理系统</div>
        	<div class="col-md-6 col-sm-6 user_message text-right">
                <div class="col-md-10">用户: <s:property value="userBasic.name"/></div>
                <div class="col-md-2"><a href="<%=path%>/login!logout">退出</a></div>
            </div>
        </div>
    </div>



<script type="text/javascript">

	
	function turnTimeForm(number){
		if( number < 10 ){
			number ="0" + number;
		}
		return number;
	}
	
	function nowTime(){
		var d = new Date();
		var vYear = d.getFullYear();
		var vMon = d.getMonth() + 1;
		var vDay = d.getDate();
		var h =turnTimeForm( d.getHours() ); 
		var m =turnTimeForm( d.getMinutes() ); 
		var se =turnTimeForm( d.getSeconds() );
		var AMPM="";
		if(h >=0 && h<5){
			AMPM = "凌晨";
		}else if(h >=5 && h<12){
			AMPM = "上午";
		}else if(h >=12 && h<18){
			AMPM = "下午";
		}else if(h >=18 && h<23){
			AMPM = "晚上";
		}
		//$('#showtime').html(vYear+'年 '+vMon+'月 '+vDay+'日 '+"  "+h+":"+m+":"+se);
		$('#showtime').html(vYear+'年 '+vMon+'月 '+vDay+'日 '+" ");	
	}
	setInterval('nowTime()',1000);
</script>