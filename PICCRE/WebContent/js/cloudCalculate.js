$(document).ready(function(){
		
		});
		
	//�½�ģ�尴ť�¼�
	function createNewMoudle(){
		//�л����谴ť��ɫ��ʽ
		var temp = $("#input_moduleName").attr("value");
		if(temp == '' || temp==null){
			$("#input_moduleName").next("font").show();
		}else{
			$("#step_1").removeClass("successCircle").addClass("warningCircle");
			$("#okSign_1").attr("style",{});
			$("#step_2").removeClass("defaultCircle").addClass("successCircle");
			//���ý�����
			$("#progressBuar").css({"width":"50%"});
			//���ر�ҳ
			$("#page_1").css({'display':'none'});
			//��ʾ��һҳ
			$("#page_2").attr("style",{});
			//��ʾ���ذ�ť
			$("#backButton").attr("style",{});
			//���÷��ذ�ť״̬
			$("#backButton").attr("statue","2");
			$("#moduleEditArea").html(null);
			//������д����Ӧ������
			$("#showModuleName").html("<h2>"+$("#input_moduleName").attr("value")+"</h2>");
			//���ص�ǰ����
			$("#modal_createModale").modal("hide");
			$("#input_moduleName").next("font").hide();
			$("#button_add").removeAttr("disabled");
		}
		
		
	};
		
	//ʹ��ѡ���ģ�尴ť�¼�
	function selectModule(){
		//�л����谴ť��ɫ��ʽ
		$("#step_1").removeClass("successCircle").addClass("warningCircle");
		$("#okSign_1").show();
		$("#step_2").removeClass("defaultCircle").addClass("successCircle");
		//���ý�����
		$("#progressBuar").css({"width":"50%"});
		//���ر�ҳ
		$("#page_1").hide();
		//��ʾ��һҳ
		$("#page_2").show();
		//��ʾ���ذ�ť
		$("#backButton").show();
		//���÷��ذ�ť״̬
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
	
	//�����ɰ�ť�����趨
	function finishSeeting(){
		//�л����谴ť��ɫ��ʽ
		$("#step_2").removeClass("successCircle").addClass("warningCircle");
		$("#okSign_2").show();
		$("#step_3").removeClass("defaultCircle").addClass("successCircle");
		//���ý�����
		$("#progressBuar").css({"width":"75%"});
		//���ر�ҳ
		$("#page_2").hide();
		//��ʾ��һҳ
		$("#page_3").show();
		//���÷��ذ�ť״̬
		$("#backButton").attr("statue","3");
		};
		
	function submitData(){
		//�л����谴ť��ɫ��ʽ
		$("#step_3").removeClass("successCircle").addClass("warningCircle");
		$("#okSign_3").show();
		$("#step_4").removeClass("defaultCircle").addClass("successCircle");
		//���ý�����
		$("#progressBuar").css({"width":"100%"});
		//���ر�ҳ
		$("#page_3").hide();
		//��ʾ��һҳ
		$("#page_4").show();
		//���÷��ذ�ť״̬
		$("#backButton").attr("statue","4");
		//�رյ�ǰģ̬�Ի���
		$("#submitData").modal("hide");
		};
		
	function backButton(){
		//ȥ�ĵ�ǰ��״ֵ̬
		var temp=$("#backButton").attr("statue");
		if(temp == '2'){
			//�л����谴ť��ɫ��ʽ
			$("#step_1").removeClass("warningCircle").addClass("successCircle");
			$("#okSign_1").hide();
			$("#step_2").removeClass("successCircle").addClass("defaultCircle");
			//���ý�����
			$("#progressBuar").css({"width":"25%"});
			//���ر�ҳ
			$("#page_2").hide();
			//��ʾ��һҳ
			$("#page_1").show();
			//���ط��ذ�ť
			$("#backButton").hide();
			//���÷��ذ�ť״̬
			$("#backButton").attr("statue","1");
		}else if(temp == '3'){
			//�л����谴ť��ɫ��ʽ
			$("#step_2").removeClass("warningCircle").addClass("successCircle");
			$("#okSign_2").hide();
			$("#step_3").removeClass("successCircle").addClass("defaultCircle");
			//���ý�����
			$("#progressBuar").css({"width":"50%"});
			//���ر�ҳ
			$("#page_3").hide();
			//��ʾ��һҳ
			$("#page_2").show();
			//���÷��ذ�ť״̬
			$("#backButton").attr("statue","2");
		}else{
			//�л����谴ť��ɫ��ʽ
			$("#step_3").removeClass("warningCircle").addClass("successCircle");
			$("#okSign_3").hide();
			$("#step_4").removeClass("successCircle").addClass("defaultCircle");
			//���ý�����
			$("#progressBuar").css({"width":"75%"});
			//���ر�ҳ
			$("#page_4").hide();
			//��ʾ��һҳ
			$("#page_3").show();
			//���÷��ذ�ť״̬
			$("#backButton").attr("statue","3");
		}
		
		};
		
	//RBMģ�����
	function addRBM(){
		//�滻��ǰģ����
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
		//�滻����
		$("#parameterArea").html(tempContent);
	};
	
	//SCģ�����
	function addSC(){
		//�滻��ǰģ����
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
		//�滻����
		$("#parameterArea").html(tempContent);
	};	
	
	//AutoEncoderģ�����
	function addAutoEncoder(){
		//�滻��ǰģ����
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
		//�滻����
		$("#parameterArea").html(tempContent);
	};	
	
	//CRBMģ�����
	function addCRBM(){
		//�滻��ǰģ����
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
		//�滻����
		$("#parameterArea").html(tempContent);
	};
	
	
	//SoftMaxģ�����
	function addSoftMax(){
		//�滻��ǰģ����
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
		//�滻����
		$("#parameterArea").html(tempContent);
	};
	
	//SVMģ�����
	function addSVM(){
		//�滻��ǰģ����
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
		//�滻����
		$("#parameterArea").html(tempContent);
	};	
	
	
	//����ǰ��ģ����ӵ��ұ�Ԥ������
	function addModuleToRight(){
		//�õ�Ҫ��ӵ�ģ����
		var moduleName=$("#moduleNameDisplay").find("font").html();
		//�õ���ǰ����ӹ������һ��ģ��
		var $layerNumber=$("button[layerId]:last");
		//alert("layer=="+$layerNumber.length+"id==="+$layerNumber.attr("layerId"));
		//���һ��ģ��Ĳ���id��layerId
		var moduleID=0;
		var temp_layerID=0;
		if($layerNumber.length > 0){
			moduleID = $layerNumber.attr("layerId");
			//��Ϊ�ڶ�������������ȥ�ģ�����ÿ���õ�����ģ��id��ԶΪ7����Ϊģ��id�Ǹ��ݴ���İڷ�˳���ĵģ���������Ҫ�ڵڶ����Ǵ���ģ��id
			if(moduleID >= 7 && moduleID < 12){
				var brathorNum = parseInt($layerNumber.siblings("button").length)+7;
				moduleID = brathorNum;
				//alert("moduleID===="+moduleID);
			}
			
		}
		//�㼶idΪ��ǰ�����Ĳ㼶id+1
		temp_layerID =parseInt(moduleID)+1;
		//alert("moduleID===="+moduleID+"temp_layerID===="+temp_layerID)
		//����Ϊ�յ�ʱ��,��ӵ�һ��
		if(moduleID == 0){
			//alert("not content!");
			//ƴ������
			var temp="<div id='moduleRight_1' class='col-md-3' style='margin-bottom:30px;'>"+
							"<button type='button' class='btn btn-sm btn-info col-md-12' layerId="+temp_layerID+" onclick='editModuleButton(this);'  >"+moduleName+"</button>"+
					  "</div>";
			//׷������
			$("#moduleEditArea").append(temp);
		}else if(moduleID > 0 && moduleID < 6){
			//ƴ������
			var temp = "<div class='img-responsive imgCenter col-md-12' >"+
							"<img src='images/next_down.png' alt='next' />"+
						"</div>"+
						"<button type='button' class='btn btn-sm btn-info col-md-12' layerId="+temp_layerID+" onclick='editModuleButton(this);' >"+moduleName+"</button>";
			//׷������
			$("#moduleRight_1").append(temp);
		}else if(moduleID == 6){
			//ƴ������
			var temp = "<div class='col-md-1 rightDown' >"+
						 "   <img src='images/next_right.png' alt='next' />"+
						"</div>"+
						
						"<div id='moduleRight_2' class='col-md-3 col-md-offset-1 rightDown'>"+
						     "<button type='button' class='btn btn-sm btn-info col-md-12' layerId="+temp_layerID+"  onclick='editModuleButton(this);'  >"+moduleName+"</button>"+
						"</div>";
			//׷������
			$("#moduleEditArea").append(temp);
		}else if(moduleID > 6 && moduleID < 12){
			//ƴ������
			var temp = "<button type='button' class='btn btn-sm btn-info col-md-12' layerId="+temp_layerID+" onclick='editModuleButton(this);'   >"+moduleName+"</button>"+
						"<div class='img-responsive imgCenter col-md-12' >"+
							 "<img src='images/next_up.png' alt='next' />"+
						"</div>";
			//׷������
			$("#moduleRight_2").prepend(temp);
		}else if(moduleID == 12){
			//ƴ������
			var temp = "<div class='col-md-1 col-md-offset-4' >"+
						 "   <img src='images/next_right.png' alt='next' />"+
						"</div>"+
						"<div id='moduleRight_3' class='col-md-3'>"+
						 "   <button type='button' class='btn btn-sm btn-info col-md-12' layerId="+temp_layerID+" onclick='editModuleButton(this);'   >"+moduleName+"</button>"+
						"</div>";
			//׷������
			$("#moduleEditArea").append(temp);
		}else if(moduleID > 12 && moduleID < 18){
			//ƴ������
			var temp = "<div class='img-responsive imgCenter col-md-12' >"+
							"<img src='images/next_down.png' alt='next' />"+
						"</div>"+
						"<button type='button' class='btn btn-sm btn-info col-md-12' layerId="+temp_layerID+" onclick='editModuleButton(this);' >"+moduleName+"</button>";
			//׷������
			$("#moduleRight_3").append(temp);
		}else{
			
		};
		//���������������ģ�������֮һ�ͱ�ʾ����ˣ��������������
		if(moduleName == 'SoftMax' || moduleName == 'SVM'){
			$("#button_add").attr("disabled","disabled");
		}
		
		
	};
	
	
	//�ļ�1��ѡ��ť�Ĳ���1
	function uploadFile1_new(){
		$("#data1_input").show();
		$("#data1_select").hide();
	};
	
	//�ļ�1��ѡ��ť�Ĳ���2
	function uploadFile1_history(){
		$("#data1_input").hide();
		$("#data1_select").show();
	};
	
	//�ļ�2��ѡ��ť�Ĳ���1
	function uploadFile2_new(){
		$("#data2_input").show();
		$("#data2_select").hide();
	};
	
	//�ļ�2��ѡ��ť�Ĳ���2
	function uploadFile2_history(){
		$("#data2_input").hide();
		$("#data2_select").show();
	};
	
	//�ļ�3��ѡ��ť�Ĳ���1
	function uploadFile3_new(){
		$("#data3_input").show();
		$("#data3_select").hide();
	};
	
	//�ļ�3��ѡ��ť�Ĳ���2
	function uploadFile3_history(){
		$("#data3_input").hide();
		$("#data3_select").show();
	};
	
	//�ļ�4��ѡ��ť�Ĳ���1
	function uploadFile4_new(){
		$("#data4_input").show();
		$("#data4_select").hide();
	};
	
	//�ļ�4��ѡ��ť�Ĳ���2
	function uploadFile4_history(){
		$("#data4_input").hide();
		$("#data4_select").show();
	};
	
	//����ǰѡ�еİ�ť����ϢͶ�䵽��ߵ����Ա༭��
	function editModuleButton(obj){
		//��DOM����ת��ΪjQuery����
		var $module = $(obj);
		//�õ���ǰѡ�е�ģ����
		var moduleName=$module.html();
		//alert("moduleID======"+$module.attr("layerId"));
		//ȥ��ԭ��ѡ�еİ�ť��Ч��
		var temp = $("#moduleEditArea").find("button.btn-warning").removeClass(" btn-warning").addClass("btn-info");
		//�������ģ�鰴ť����Ч��
		$module.removeClass("btn-info").addClass(" btn-warning");
		//��ѡ�еİ�Ť�Ĳ�����Ϣ��ӵ��������
		if(moduleName == 'RBM'){
			//�滻��ǰģ����
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
			//�滻����
			$("#parameterArea").html(tempContent);
		}else if(moduleName == 'SC'){
			//�滻��ǰģ����
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
			//�滻����
			$("#parameterArea").html(tempContent);
		}else if(moduleName == 'AutoEncoder'){
			//�滻��ǰģ����
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
			//�滻����
			$("#parameterArea").html(tempContent);
		}else if(moduleName == 'CRBM'){
			//�滻��ǰģ����
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
			//�滻����
			$("#parameterArea").html(tempContent);
		}else if(moduleName == 'SoftMax'){
			//�滻��ǰģ����
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
			//�滻����
			$("#parameterArea").html(tempContent);
		}else{
			//�滻��ǰģ����
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
			//�滻����
			$("#parameterArea").html(tempContent);
		}
	};
	
	//ɾ��ѡ�е�ģ��
	function deleteModule(){
		//ȡ�õ�ǰѡ�е�ģ��
		var $temp = $("#moduleEditArea").find("button.btn-warning").eq(0);
		if( $temp.length > 0 ){
			//ȡ����Ҫɾ��ģ��Ĳ�id
			var layerId = $temp.attr("layerId");
			//ȡ����Ҫɾ��ģ��Ĳ�����
			var moduleName = $temp.html();
			//alert("nowNumber==="+$temp.attr("layerId"));
			//ȡ�õ�ǰ���е�ģ��ĸ���,Ҳ�ǵ�ǰ���Ĳ�id
			var $layerNumber= $("#moduleEditArea").find("button[layerId]").length;
			//alert("bigNumber==="+$layerNumber);
			//�Ƴ���ǰѡ�е�ģ��
			for(var i = parseInt(layerId) ; i< parseInt($layerNumber) ; i++){
				//�õ���Ҫ���滻��ģ��
				var $tempOld=$("#moduleEditArea").find("button[layerId="+i+"]:last");
				//��ѭ������2ģ������ʱ����ģ��㼶��ϵ���εݼ��ģ���Ҫ��������Ҫ�滻������
				if(i>=8 && i<=12){
					$tempOld=$("#moduleEditArea").find("button[layerId="+i+"]:first");
				}			
				//�õ������滻��ģ��
				var temp_1=$("#moduleEditArea").find("button[layerId="+(i+1)+"]").clone();
				//alert("tempOld===="+$tempOld.html()+"*****************temp_1===="+temp_1.html()+"***************i==========="+i);
				//�滻
				$tempOld.replaceWith(temp_1);
			}
			//�����滻��ÿ��ģ��Ĳ㼶id�����ֱ��1���ߺ�һ���ظ��Ĳ����С
			for(var i = parseInt(layerId) ; i< parseInt($layerNumber) ; i++){
				$("#moduleEditArea").find("button[layerId="+(i+1)+"]:first").attr("layerId",i);
			}
			//�滻��Ϻ���ɾ�����һ�������ģ��������ָʾ��ͷ��ʾ
			if($layerNumber > 7 && $layerNumber <=12 ){
				//���ߺ�һ�������ģ���Ƴ�������Ϊ������õ���ǰһ��ģ���滻��һ��ģ��
				$("#moduleEditArea").find("button[layerId="+($layerNumber)+"]").next().remove();
				$("#moduleEditArea").find("button[layerId="+($layerNumber)+"]").remove();
			}else if($layerNumber == 1 || $layerNumber == 7 || $layerNumber == 13 ){
				//�滻��Ϻ���ɾ�����һ�������ģ��������ָʾ��ͷ��ʾ
				$("#moduleEditArea").find("button[layerId="+($layerNumber)+"]").parent().prev().remove();
				$("#moduleEditArea").find("button[layerId="+($layerNumber)+"]").parent().remove();
			}else{
				//�滻��Ϻ���ɾ�����һ�������ģ��������ָʾ��ͷ��ʾ
				$("#moduleEditArea").find("button[layerId="+($layerNumber)+"]").prev().remove();
				//��ɾ�����һ�������ģ��
				$("#moduleEditArea").find("button[layerId="+($layerNumber)+"]").remove();
			}
			//���˨����������ģ�������֮һ�ͱ�ʾ���������
			if(moduleName == 'SoftMax' || moduleName == 'SVM'){
				$("#button_add").removeAttr("disabled");
			}
		}else{
			//û��ѡ��ģ������ʾ��ʾ��Ϣ
			$("#deleteError").modal("show");
		}
	};