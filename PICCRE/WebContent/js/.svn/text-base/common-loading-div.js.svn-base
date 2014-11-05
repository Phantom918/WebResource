$(document).ready(function(){
	$(".common-loading-model").hide();
	$(".show-loading-btn").click(function(){
		$(".common-loading-model").css("height",$(document).height());
		$(".common-loading-model").css("width",$(document).width());
		$(".common-loading-model").show();
		$(".common-loading-img").attr("style","margin-top:"+($(document).height()/2-$(".loading_img").height())+"px");
	});
	$(".close-loading-btn").click(function(){
		$(".common-loading-model").css("height",0);
		$(".common-loading-model").css("width",0);
		$(".common-loading-model").hide();
	});
});
function showLoading(){
	$(".common-loading-model").css("height",$(document).height());
	$(".common-loading-model").css("width",$(document).width());
	$(".common-loading-model").show();
	$(".common-loading-img").attr("style","margin-top:"+($(document).height()/2-$(".loading_img").height())+"px");
}
function hidenLoading(){
	$(".common-loading-model").css("height",0);
	$(".common-loading-model").css("width",0);
	$(".common-loading-model").hide();
}