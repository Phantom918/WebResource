	$(document).ready(function(e) { 
		 $('.time-bucket').daterangepicker({ singleDatePicker: false,format: 'YYYY/MM/DD'}, function(start, end, label) {
			console.log(start.toISOString(), end.toISOString(), label);
		 });
		 $('.time-single').daterangepicker({ singleDatePicker: true }, function(start, end, label) {
             console.log(start.toISOString(), end.toISOString(), label);
         });
		 $('.time-bucket').focus(function(){
			 this.blur();
		 });
		 $('.time-bucket').focus(function(){
			 this.blur();
		 });
		 
		 //查询条件处理
		 $("form").submit(function(){
				$("form input").each(function(){
					$(this).attr("value",$.trim($(this).val()));
				});
				$("form").submit();
		 });
			
    });
	
	// Ajax 文件下载
	jQuery.download = function(url, data, method){
		if(data == undefined || data == null || data == ''){
			data = "no = null";
		}
	    // 获得url和data
	    if( url && data ){ 
	        // data 是 string 或者 array/object
	        data = typeof data == 'string' ? data : jQuery.param(data);
	        // 把参数组装成 form的  input
	        var inputs = '';
	        jQuery.each(data.split('&'), function(){ 
	            var pair = this.split('=');
	            inputs+='<input type="hidden" name="'+ pair[0] +'" value="'+ pair[1] +'" />'; 
	        });
	        // request发送请求
	        jQuery('<form action="'+ url +'" method="'+ (method||'post') +'">'+inputs+'</form>')
	        .appendTo('body').submit().remove();
	    };
	};
	
	//表单重置
	$("form button[type='reset']").click(function (){
		$(".form-class input").attr("value",null);
		$(".form-class select option").attr("selected",null);
	});
	
	// ----------------------------------------------------------------------
	// <summary>
	// 限制只能输入数字和字母
	// </summary>
	// ----------------------------------------------------------------------
	$.fn.onlyNumAlpha = function () {
	    $(this).keypress(function (event) {
	    //	alert("1");
	        var eventObj = event || e;
	        var keyCode = eventObj.keyCode || eventObj.which;
	        if ((keyCode >= 48 && keyCode <= 57) || (keyCode >= 65 && keyCode <= 90) || (keyCode >= 97 && keyCode <= 122))
	            return true;
	        else
	            return false;
	    }).focus(function () {
	        this.style.imeMode = 'disabled';
	    }).bind("paste", function () {
	        var clipboard = window.clipboardData.getData("Text");
	        if (/^(\d|[a-zA-Z])+$/.test(clipboard))
	            return true;
	        else
	            return false;
	    });
	};
	
	//打開新頁面
	function openNewWindow(url,name,height,width){
	    var top = (window.screen.height-height)/2;
		var left = (window.screen.width-width)/2;
		window.open(url, name, "height="+height+", width="+width+", top="+top+",left="+left+", toolbar=no,menubar=no, scrollbars=auto, resizable=no,location=no, status=no");
	}