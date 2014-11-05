$(document).ready(function(){
		
		});
		
	//新建模板按钮事件
	function createNewMoudle(){
		//切换步骤按钮颜色样式
		var temp = $("#input_moduleName").attr("value");
		if(temp == '' || temp==null){
			$("#input_moduleName").next("font").show();
		}else{
			$("#step_1").removeClass("successCircle").addClass("warningCircle");
			$("#okSign_1").attr("style",{});
			$("#step_2").removeClass("defaultCircle").addClass("successCircle");
			//设置进度条
			$("#progressBuar").css({"width":"50%"});
			//隐藏本页
			$("#page_1").css({'display':'none'});
			//显示下一页
			$("#page_2").attr("style",{});
			//显示返回按钮
			$("#backButton").attr("style",{});
			//设置返回按钮状态
			$("#backButton").attr("statue","2");
			$("#moduleEditArea").html(null);
			//将名字写到对应的区域
			$("#showModuleName").html("<h2>"+$("#input_moduleName").attr("value")+"</h2>");
			//隐藏当前弹窗
			$("#modal_createModale").modal("hide");
			$("#input_moduleName").next("font").hide();
			$("#button_add").removeAttr("disabled");
		}
		
		
	};
		
	//使用选择的模板按钮事件
	function selectModule(){
		//切换步骤按钮颜色样式
		$("#step_1").removeClass("successCircle").addClass("warningCircle");
		$("#okSign_1").show();
		$("#step_2").removeClass("defaultCircle").addClass("successCircle");
		//设置进度条
		$("#progressBuar").css({"width":"50%"});
		//隐藏本页
		$("#page_1").hide();
		//显示下一页
		$("#page_2").show();
		//显示返回按钮
		$("#backButton").show();
		//设置返回按钮状态
		$("#backButton").attr("statue","2");
		var tempContent="<div class='col-md-3' style='margin-bottom:30px;'>"+
							"<button type='button' class='btn btn-sm btn-info col-md-12' layerId='1' onclick='editModuleButton(this);' >RBM</button>"+
							"<div class='img-responsive imgCenter col-md-12' >"+
								"<img src='images/next_down.png' alt='next' />"+
							"</div>"+
							"<button type='button' class='btn btn-sm btn-info col-md-12' layerId='2' onclick='editModuleButton(this);' >RBM</button>"+
							"<div class='img-responsive imgCenter col-md-12' >"+
							 "   <img src='images/next_down.png' alt='next' />"+
							"</div>"+
							"<button type='button' class='btn btn-sm btn-info col-md-12' layerId='3' onclick='editModuleButton(this);' >RBM</button>"+
							"<div class='img-responsive imgCenter col-md-12' >"+
							 "   <img src='images/next_down.png' alt='next' />"+
							"</div>"+
							"<button type='button' class='btn btn-sm btn-info col-md-12' layerId='4' onclick='editModuleButton(this);' >RBM</button>"+
							"<div class='img-responsive imgCenter col-md-12'>"+
							"    <img src='images/next_down.png' alt='next' />"+
							"</div>"+
							"<button type='button' class='btn btn-sm btn-info col-md-12' layerId='5' onclick='editModuleButton(this);' >Modll</button>"+
							"<div class='img-responsive imgCenter col-md-12' >"+
							"    <img src='images/next_down.png' alt='next' />"+
							"</div>"+
							"<button type='button' class='btn btn-sm btn-info col-md-12' layerId='6' onclick='editModuleButton(this);' >RBM</button>"+
						"</div><!-- end of col-md-3 -->"+
						
						"<div class='col-md-1 rightDown' >"+
						 "   <img src='images/next_right.png' alt='next' />"+
						"</div>"+
						
						"<div class='col-md-3 col-md-offset-1 rightDown'>"+
						 "   <button type='button' class='btn btn-sm btn-info col-md-12' layerId='12' onclick='editModuleButton(this);' >RBM</button>"+
						  "  <div class='img-responsive imgCenter col-md-12' >"+
							   " <img src='images/next_up.png' alt='next' />"+
							"</div>"+
							"<button type='button' class='btn btn-sm btn-info col-md-12' layerId='11' onclick='editModuleButton(this);' >RBM</button>"+
							"<div class='img-responsive imgCenter col-md-12' >"+
							 "   <img src='images/next_up.png' alt='next' />"+
							"</div>"+
							"<button type='button' class='btn btn-sm btn-info col-md-12' layerId='10' onclick='editModuleButton(this);' >RBM</button>"+
							"<div class='img-responsive imgCenter col-md-12' >"+
							 "   <img src='images/next_up.png' alt='next' />"+
							"</div>"+
						   "<button type='button' class='btn btn-sm btn-info col-md-12' layerId='9' onclick='editModuleButton(this);' >RBM</button>"+
							"<div class='img-responsive imgCenter col-md-12' >"+
							 "   <img src='images/next_up.png' alt='next' />"+
							"</div>"+
						   "<button type='button' class='btn btn-sm btn-info col-md-12' layerId='8' onclick='editModuleButton(this);' >RBM</button>"+
							"<div class='img-responsive imgCenter col-md-12' >"+
							 "   <img src='images/next_up.png' alt='next' />"+
							"</div>"+
							"<button type='button' class='btn btn-sm btn-info col-md-12' layerId='7' onclick='editModuleButton(this);' >RBM</button>"+
					   " </div><!-- end of col-md-3 -->"+
						
						"<div class='col-md-1 col-md-offset-4' >"+
						 "   <img src='images/next_right.png' alt='next' />"+
						"</div>"+
						
						"<div class='col-md-3'>"+
						 "   <button type='button' class='btn btn-sm btn-info col-md-12' layerId='13' onclick='editModuleButton(this);' >RBM</button>"+
						  "  <div class='img-responsive imgCenter col-md-12' >"+
						  "     <img src='images/next_down.png' alt='next' />"+
						  " </div>"+
						  "  <button type='button' class='btn btn-sm btn-info col-md-12' layerId='14' onclick='editModuleButton(this);' >RBM</button>"+
						  "  <div class='img-responsive imgCenter col-md-12' >"+
						  "      <img src='images/next_down.png' alt='next' />"+
						  "  </div>"+
						   " <button type='button' class='btn btn-sm btn-info col-md-12' layerId='15' onclick='editModuleButton(this);' >RBM</button>"+
							
						"</div>";
		$("#moduleEditArea").html(tempContent);
		
	};
	
	//点击完成按钮参数设定
	function finishSeeting(){
		//切换步骤按钮颜色样式
		$("#step_2").removeClass("successCircle").addClass("warningCircle");
		$("#okSign_2").show();
		$("#step_3").removeClass("defaultCircle").addClass("successCircle");
		//设置进度条
		$("#progressBuar").css({"width":"75%"});
		//隐藏本页
		$("#page_2").hide();
		//显示下一页
		$("#page_3").show();
		//设置返回按钮状态
		$("#backButton").attr("statue","3");
		};
		
	function submitData(){
		//切换步骤按钮颜色样式
		$("#step_3").removeClass("successCircle").addClass("warningCircle");
		$("#okSign_3").show();
		$("#step_4").removeClass("defaultCircle").addClass("successCircle");
		//设置进度条
		$("#progressBuar").css({"width":"100%"});
		//隐藏本页
		$("#page_3").hide();
		//显示下一页
		$("#page_4").show();
		//设置返回按钮状态
		$("#backButton").attr("statue","4");
		//关闭当前模态对话框
		$("#submitData").modal("hide");
		};
		
	function backButton(){
		//去的当前的状态值
		var temp=$("#backButton").attr("statue");
		if(temp == '2'){
			//切换步骤按钮颜色样式
			$("#step_1").removeClass("warningCircle").addClass("successCircle");
			$("#okSign_1").hide();
			$("#step_2").removeClass("successCircle").addClass("defaultCircle");
			//设置进度条
			$("#progressBuar").css({"width":"25%"});
			//隐藏本页
			$("#page_2").hide();
			//显示上一页
			$("#page_1").show();
			//隐藏返回按钮
			$("#backButton").hide();
			//设置返回按钮状态
			$("#backButton").attr("statue","1");
		}else if(temp == '3'){
			//切换步骤按钮颜色样式
			$("#step_2").removeClass("warningCircle").addClass("successCircle");
			$("#okSign_2").hide();
			$("#step_3").removeClass("successCircle").addClass("defaultCircle");
			//设置进度条
			$("#progressBuar").css({"width":"50%"});
			//隐藏本页
			$("#page_3").hide();
			//显示上一页
			$("#page_2").show();
			//设置返回按钮状态
			$("#backButton").attr("statue","2");
		}else{
			//切换步骤按钮颜色样式
			$("#step_3").removeClass("warningCircle").addClass("successCircle");
			$("#okSign_3").hide();
			$("#step_4").removeClass("successCircle").addClass("defaultCircle");
			//设置进度条
			$("#progressBuar").css({"width":"75%"});
			//隐藏本页
			$("#page_4").hide();
			//显示上一页
			$("#page_3").show();
			//设置返回按钮状态
			$("#backButton").attr("statue","3");
		}
		
		};
		
	//RBM模块添加
	function addRBM(){
		//替换当前模块名
		$("#moduleNameDisplay").find("font").html("RBM");
		var tempContent="<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Optimize_method</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>CD</option>"+
									"<option>SML</option>"+
								"</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Hid_num</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1234567</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Max_epoch</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1234567</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Batch_size</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1234567</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Learning_rate</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1234567</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
					
						"";
		//替换内容
		$("#parameterArea").html(tempContent);
	};
	
	//SC模块添加
	function addSC(){
		//替换当前模块名
		$("#moduleNameDisplay").find("font").html("SC");
		var tempContent="<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Optimize_method</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>CG</option>"+
									"<option>LBFGS</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Hid_num</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1234567</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Max_epoch</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1234567</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Batch_size</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1234567</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Learning_rate</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1234567</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Pooling_type</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>SUM</option>"+
									"<option>MAX</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Pooling_dim</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1234567</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Lambda</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1234567</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Gamma</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1234567</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"";
		//替换内容
		$("#parameterArea").html(tempContent);
	};	
	
	//AutoEncoder模块添加
	function addAutoEncoder(){
		//替换当前模块名
		$("#moduleNameDisplay").find("font").html("AutoEncoder");
		var tempContent="<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Hid_num</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1</option>"+
									"<option>2</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Max_epoch</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1234567</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"";
		//替换内容
		$("#parameterArea").html(tempContent);
	};	
	
	//CRBM模块添加
	function addCRBM(){
		//替换当前模块名
		$("#moduleNameDisplay").find("font").html("CRBM");
		var tempContent="<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Hid_num</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1</option>"+
									"<option>2</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Max_epoch</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1234567</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Batch_size</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1</option>"+
									"<option>2</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Learning_rate</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1234567</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Num_maps</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1</option>"+
									"<option>2</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>W_dim</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1234567</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Pooling_type</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1</option>"+
									"<option>2</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Pooling_dim</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1234567</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"";
		//替换内容
		$("#parameterArea").html(tempContent);
	};
	
	
	//SoftMax模块添加
	function addSoftMax(){
		//替换当前模块名
		$("#moduleNameDisplay").find("font").html("SoftMax");
		var tempContent="<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Max_epoch</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1</option>"+
									"<option>2</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Lambda</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1234567</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"";
		//替换内容
		$("#parameterArea").html(tempContent);
	};
	
	//SVM模块添加
	function addSVM(){
		//替换当前模块名
		$("#moduleNameDisplay").find("font").html("SVM");
		var tempContent="<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Max_epoch</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1</option>"+
									"<option>2</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"<div class='col-md-offset-1'>"+
							"<div class='row' style='margin-top:20px;'>"+
								"<div class='col-md-2 col-md-offset-1'>Lambda</div>"+
								"<select class='col-md-4 col-md-offset-3'> "+
									"<option>1234567</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
									"<option>1</option>"+
								 "</select>"+
							 "</div>"+
							 "<div class='row' style='margin-top:10px;'>"+
								"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
							 "</div>"+
						"</div>"+
						"";
		//替换内容
		$("#parameterArea").html(tempContent);
	};	
	
	
	//将当前的模块添加到右边预览框中
	function addModuleToRight(){
		//拿到要添加的模块名
		var moduleName=$("#moduleNameDisplay").find("font").html();
		//拿到当前已添加过的最后一个模块
		var $layerNumber=$("button[layerId]:last");
		//alert("layer=="+$layerNumber.length+"id==="+$layerNumber.attr("layerId"));
		//最后一个模块的层数id，layerId
		var moduleID=0;
		var temp_layerID=0;
		if($layerNumber.length > 0){
			moduleID = $layerNumber.attr("layerId");
			//因为第二层是逆着排上去的，所以每次拿的最大的模块id永远为7（因为模块id是根据代码的摆放顺利哪的），所以需要在第二层是处理模块id
			if(moduleID >= 7 && moduleID < 12){
				var brathorNum = parseInt($layerNumber.siblings("button").length)+7;
				moduleID = brathorNum;
				//alert("moduleID===="+moduleID);
			}
			
		}
		//层级id为当前的最大的层级id+1
		temp_layerID =parseInt(moduleID)+1;
		//alert("moduleID===="+moduleID+"temp_layerID===="+temp_layerID)
		//数据为空的时候,添加第一层
		if(moduleID == 0){
			//alert("not content!");
			//拼接内容
			var temp="<div id='moduleRight_1' class='col-md-3' style='margin-bottom:30px;'>"+
							"<button type='button' class='btn btn-sm btn-info col-md-12' layerId="+temp_layerID+" onclick='editModuleButton(this);'  >"+moduleName+"</button>"+
					  "</div>";
			//追加内容
			$("#moduleEditArea").append(temp);
		}else if(moduleID > 0 && moduleID < 6){
			//拼接内容
			var temp = "<div class='img-responsive imgCenter col-md-12' >"+
							"<img src='images/next_down.png' alt='next' />"+
						"</div>"+
						"<button type='button' class='btn btn-sm btn-info col-md-12' layerId="+temp_layerID+" onclick='editModuleButton(this);' >"+moduleName+"</button>";
			//追加内容
			$("#moduleRight_1").append(temp);
		}else if(moduleID == 6){
			//拼接内容
			var temp = "<div class='col-md-1 rightDown' >"+
						 "   <img src='images/next_right.png' alt='next' />"+
						"</div>"+
						
						"<div id='moduleRight_2' class='col-md-3 col-md-offset-1 rightDown'>"+
						     "<button type='button' class='btn btn-sm btn-info col-md-12' layerId="+temp_layerID+"  onclick='editModuleButton(this);'  >"+moduleName+"</button>"+
						"</div>";
			//追加内容
			$("#moduleEditArea").append(temp);
		}else if(moduleID > 6 && moduleID < 12){
			//拼接内容
			var temp = "<button type='button' class='btn btn-sm btn-info col-md-12' layerId="+temp_layerID+" onclick='editModuleButton(this);'   >"+moduleName+"</button>"+
						"<div class='img-responsive imgCenter col-md-12' >"+
							 "<img src='images/next_up.png' alt='next' />"+
						"</div>";
			//追加内容
			$("#moduleRight_2").prepend(temp);
		}else if(moduleID == 12){
			//拼接内容
			var temp = "<div class='col-md-1 col-md-offset-4' >"+
						 "   <img src='images/next_right.png' alt='next' />"+
						"</div>"+
						"<div id='moduleRight_3' class='col-md-3'>"+
						 "   <button type='button' class='btn btn-sm btn-info col-md-12' layerId="+temp_layerID+" onclick='editModuleButton(this);'   >"+moduleName+"</button>"+
						"</div>";
			//追加内容
			$("#moduleEditArea").append(temp);
		}else if(moduleID > 12 && moduleID < 18){
			//拼接内容
			var temp = "<div class='img-responsive imgCenter col-md-12' >"+
							"<img src='images/next_down.png' alt='next' />"+
						"</div>"+
						"<button type='button' class='btn btn-sm btn-info col-md-12' layerId="+temp_layerID+" onclick='editModuleButton(this);' >"+moduleName+"</button>";
			//追加内容
			$("#moduleRight_3").append(temp);
		}else{
			
		};
		//如果加上了这两个模块的其中之一就表示完成了，则不再允许添加了
		if(moduleName == 'SoftMax' || moduleName == 'SVM'){
			$("#button_add").attr("disabled","disabled");
		}
		
		
	};
	
	
	//文件1单选按钮的操作1
	function uploadFile1_new(){
		$("#data1_input").show();
		$("#data1_select").hide();
	};
	
	//文件1单选按钮的操作2
	function uploadFile1_history(){
		$("#data1_input").hide();
		$("#data1_select").show();
	};
	
	//文件2单选按钮的操作1
	function uploadFile2_new(){
		$("#data2_input").show();
		$("#data2_select").hide();
	};
	
	//文件2单选按钮的操作2
	function uploadFile2_history(){
		$("#data2_input").hide();
		$("#data2_select").show();
	};
	
	//文件3单选按钮的操作1
	function uploadFile3_new(){
		$("#data3_input").show();
		$("#data3_select").hide();
	};
	
	//文件3单选按钮的操作2
	function uploadFile3_history(){
		$("#data3_input").hide();
		$("#data3_select").show();
	};
	
	//文件4单选按钮的操作1
	function uploadFile4_new(){
		$("#data4_input").show();
		$("#data4_select").hide();
	};
	
	//文件4单选按钮的操作2
	function uploadFile4_history(){
		$("#data4_input").hide();
		$("#data4_select").show();
	};
	
	//将当前选中的按钮的信息投射到左边的属性编辑区
	function editModuleButton(obj){
		//将DOM对象转换为jQuery对象
		var $module = $(obj);
		//拿到当前选中的模块名
		var moduleName=$module.html();
		//alert("moduleID======"+$module.attr("layerId"));
		//去掉原来选中的按钮的效果
		var temp = $("#moduleEditArea").find("button.btn-warning").removeClass(" btn-warning").addClass("btn-info");
		//给点击的模块按钮加上效果
		$module.removeClass("btn-info").addClass(" btn-warning");
		//将选中的按扭的参数信息添加到左边区域
		if(moduleName == 'RBM'){
			//替换当前模块名
			$("#moduleNameDisplay").find("font").html("RBM");
			var tempContent="<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Optimize_method</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>CD</option>"+
										"<option>SML</option>"+
									"</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Hid_num</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1234567</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Max_epoch</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1234567</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Batch_size</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1234567</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Learning_rate</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1234567</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
						
							"";
			//替换内容
			$("#parameterArea").html(tempContent);
		}else if(moduleName == 'SC'){
			//替换当前模块名
			$("#moduleNameDisplay").find("font").html("SC");
			var tempContent="<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Optimize_method</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>CG</option>"+
										"<option>LBFGS</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Hid_num</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1234567</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Max_epoch</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1234567</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Batch_size</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1234567</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Learning_rate</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1234567</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Pooling_type</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>SUM</option>"+
										"<option>MAX</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Pooling_dim</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1234567</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Lambda</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1234567</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Gamma</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1234567</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"";
			//替换内容
			$("#parameterArea").html(tempContent);
		}else if(moduleName == 'AutoEncoder'){
			//替换当前模块名
			$("#moduleNameDisplay").find("font").html("AutoEncoder");
			var tempContent="<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Hid_num</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1</option>"+
										"<option>2</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Max_epoch</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1234567</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"";
			//替换内容
			$("#parameterArea").html(tempContent);
		}else if(moduleName == 'CRBM'){
			//替换当前模块名
			$("#moduleNameDisplay").find("font").html("CRBM");
			var tempContent="<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Hid_num</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1</option>"+
										"<option>2</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Max_epoch</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1234567</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Batch_size</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1</option>"+
										"<option>2</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Learning_rate</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1234567</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Num_maps</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1</option>"+
										"<option>2</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>W_dim</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1234567</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Pooling_type</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1</option>"+
										"<option>2</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Pooling_dim</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1234567</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"";
			//替换内容
			$("#parameterArea").html(tempContent);
		}else if(moduleName == 'SoftMax'){
			//替换当前模块名
			$("#moduleNameDisplay").find("font").html("SoftMax");
			var tempContent="<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Max_epoch</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1</option>"+
										"<option>2</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Lambda</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1234567</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"";
			//替换内容
			$("#parameterArea").html(tempContent);
		}else{
			//替换当前模块名
			$("#moduleNameDisplay").find("font").html("SVM");
			var tempContent="<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Max_epoch</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1</option>"+
										"<option>2</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"<div class='col-md-offset-1'>"+
								"<div class='row' style='margin-top:20px;'>"+
									"<div class='col-md-2 col-md-offset-1'>Lambda</div>"+
									"<select class='col-md-4 col-md-offset-3'> "+
										"<option>1234567</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
										"<option>1</option>"+
									 "</select>"+
								 "</div>"+
								 "<div class='row' style='margin-top:10px;'>"+
									"<input type='text' value='350;500;672;' class='col-md-9 col-md-offset-1 text-info input-sm' />"+
								 "</div>"+
							"</div>"+
							"";
			//替换内容
			$("#parameterArea").html(tempContent);
		}
	};
	
	//删除选中的模块
	function deleteModule(){
		//取得当前选中的模块
		var $temp = $("#moduleEditArea").find("button.btn-warning").eq(0);
		if( $temp.length > 0 ){
			//取得需要删除模块的层id
			var layerId = $temp.attr("layerId");
			//取得需要删除模块的层名字
			var moduleName = $temp.html();
			//alert("nowNumber==="+$temp.attr("layerId"));
			//取得当前已有的模块的个数,也是当前最大的层id
			var $layerNumber= $("#moduleEditArea").find("button[layerId]").length;
			//alert("bigNumber==="+$layerNumber);
			//移除当前选中的模块
			for(var i = parseInt(layerId) ; i< parseInt($layerNumber) ; i++){
				//拿到需要被替换的模块
				var $tempOld=$("#moduleEditArea").find("button[layerId="+i+"]:last");
				//当循环到第2模块区域时由于模块层级关系依次递减的，需要反着那需要替换的数据
				if(i>=8 && i<=12){
					$tempOld=$("#moduleEditArea").find("button[layerId="+i+"]:first");
				}			
				//拿到用于替换的模块
				var temp_1=$("#moduleEditArea").find("button[layerId="+(i+1)+"]").clone();
				//alert("tempOld===="+$tempOld.html()+"*****************temp_1===="+temp_1.html()+"***************i==========="+i);
				//替换
				$tempOld.replaceWith(temp_1);
			}
			//调整替换后每个模块的层级id，都分别减1，走后一个重复的不会减小
			for(var i = parseInt(layerId) ; i< parseInt($layerNumber) ; i++){
				$("#moduleEditArea").find("button[layerId="+(i+1)+"]:first").attr("layerId",i);
			}
			//替换完毕后再删除最后一个多余的模块的上面的指示箭头标示
			if($layerNumber > 7 && $layerNumber <=12 ){
				//将走后一个多余的模块移除掉，因为整体采用的是前一个模块替换后一个模块
				$("#moduleEditArea").find("button[layerId="+($layerNumber)+"]").next().remove();
				$("#moduleEditArea").find("button[layerId="+($layerNumber)+"]").remove();
			}else if($layerNumber == 1 || $layerNumber == 7 || $layerNumber == 13 ){
				//替换完毕后再删除最后一个多余的模块的上面的指示箭头标示
				$("#moduleEditArea").find("button[layerId="+($layerNumber)+"]").parent().prev().remove();
				$("#moduleEditArea").find("button[layerId="+($layerNumber)+"]").parent().remove();
			}else{
				//替换完毕后再删除最后一个多余的模块的上面的指示箭头标示
				$("#moduleEditArea").find("button[layerId="+($layerNumber)+"]").prev().remove();
				//再删除最后一个多余的模块
				$("#moduleEditArea").find("button[layerId="+($layerNumber)+"]").remove();
			}
			//如果栓除了这两个模块的其中之一就表示允许添加了
			if(moduleName == 'SoftMax' || moduleName == 'SVM'){
				$("#button_add").removeAttr("disabled");
			}
		}else{
			//没有选中模块则显示提示信息
			$("#deleteError").modal("show");
		}
	};