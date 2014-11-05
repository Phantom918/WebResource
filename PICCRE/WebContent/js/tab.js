		$(document).ready(function(e) { 
			$(".menu_padding").attr("style","height:"+($(window).height()-30)+"px");
		});	

		var tabArray = new Array();
		//打开tab
		function openTab(id,tabLink){
			$("#tabContent").attr("src",tabLink);
			$("#tabTitles li").attr("class","unactive");
			$("#tabTitles #"+id).attr("class","active");
			$(".nav-tabs li.unactive").attr("style","backgroundColor:#FFFFFF");
			$(".nav-tabs li.active").attr("style","backgroundColor:#3FB6D8");
//			$(".nav-tabs li.unactive").attr("onmouseover","style.backgroundColor='#84D0E6'");
//			$(".nav-tabs li.unactive").attr("onmouseout","style.backgroundColor='#FFFFFF'");
			$(".nav-tabs li.active").attr("onmouseover","");
			$(".nav-tabs li.active").attr("onmouseout","");
		}
		//添加tab
		function addTab(id,tabName,tabLink){
			for(i in tabArray){
				if(tabArray[i]==id){ openTab(id,tabLink); return;}//如果存在该tab不再添加
			}
			var tab = "<li id="+id+" to-link="+tabLink+" class=\"unactive\">"
                +"<span class=\"tab-close\" onclick=\"closeTab('"+id+"')\">&times;</span>"
                +"<span class=\"tab-link\" onclick=\"openTab('"+id+"','"+tabLink+"')\">"
                +tabName
                +"</span></li>";
			$("#tabTitles").append(tab);
			openTab(id,tabLink);
			tabArray.push(id);
		}
		//关闭tab
		function closeTab(id){
			for(i in tabArray){
				if(tabArray[i]==id){
					tabArray.splice(i, 1);
				}
			}
			if($("#tabTitles #"+id).attr("class")=="active"){//如果关闭的标签为活动标签,默认打开剩下的最后一个标签
				$("#tabTitles #"+id).remove();
				var openLink = $("#tabTitles li:last-child").attr("to-link");
				$("#tabTitles li:last-child").attr("class","active");
				$("#tabContent").attr("src",openLink);
			}else{//如果关闭的是未激活的,直接关闭
				$("#tabTitles #"+id).remove();
			}
			if(tabArray.length == 0){//如果关闭的是最后一个,默认打开默认页面
				$("#tabContent").attr("src","welcome.jsp");
			}
		}
		