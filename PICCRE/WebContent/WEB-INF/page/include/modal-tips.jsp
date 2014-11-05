<%@ page contentType="text/html; charset=UTF-8"%>

<script type="text/javascript">
	$(document).ready(function() {
		if($("#pageStatus").val() == 1) {
			$("#insertSuccessModal").modal("show");
		} else if($("#pageStatus").val() == 2) {
			$("#deleteSuccessModal").modal("show");
		} else if($("#pageStatus").val() == 3) {
			$("#updateSuccessModal").modal("show");
		} else if($("#pageStatus").val() == 4) {
			$("#assignSuccessModal").modal("show");
		} else if($("#pageStatus").val() == 5) {
			$("#cancelAssignModal").modal("show");
		} else if($("#pageStatus").val() == 6) {
			$("#banSuccessModal").modal("show");
		} else if($("#pageStatus").val() == 7) {
			$("#restartSuccessModal").modal("show");
		} else if($("#pageStatus").val() == 8) {
			$("#loginFailModal").modal("show");
		} else if($("#pageStatus").val() == 101) {
			$("#operateFailModal").modal("show");
		}
	});
</script>
<!-- 添加成功 -->
<div class="modal fade" id="insertSuccessModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"  backdrop="static">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		        <h4 class="modal-title" id="myModalLabel">提示</h4>
		      </div>
		      <div class="modal-body text-center">
		        	<div>添加成功！</div>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-success" data-dismiss="modal">确定</button>
		      </div>
		    </div><!-- /.modal-content -->
		  </div><!-- /.modal-dialog -->
		</div><!-- /.modal -->

<!-- 删除成功 -->
<div class="modal fade" id="deleteSuccessModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" backdrop="static">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		        <h4 class="modal-title" id="myModalLabel">提示</h4>
		      </div>
		      <div class="modal-body text-center">
		        	<div>删除成功！</div>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-success" data-dismiss="modal">确定</button>
		      </div>
		    </div><!-- /.modal-content -->
		  </div><!-- /.modal-dialog -->
		</div><!-- /.modal -->


<!-- 禁用成功 -->
<div class="modal fade" id="banSuccessModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" aria-describedby="这是一个描述！" backdrop="static">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		        <h4 class="modal-title" id="myModalLabel">提示</h4>
		      </div>
		      <div class="modal-body text-center">
		        	<div>禁用成功！</div>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-success" data-dismiss="modal">确定</button>
		      </div>
		    </div><!-- /.modal-content -->
		  </div><!-- /.modal-dialog -->
		</div><!-- /.modal -->

<!-- 启用成功 -->
<div class="modal fade" id="restartSuccessModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" aria-describedby="这是一个描述！" backdrop="static">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		        <h4 class="modal-title" id="myModalLabel">提示</h4>
		      </div>
		      <div class="modal-body text-center">
		        	<div>启用成功！</div>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-success" data-dismiss="modal">确定</button>
		      </div>
		    </div><!-- /.modal-content -->
		  </div><!-- /.modal-dialog -->
		</div><!-- /.modal -->

<!-- 修改成功 -->
<div class="modal fade" id="updateSuccessModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" aria-describedby="这是一个描述！" backdrop="static">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		        <h4 class="modal-title" id="myModalLabel">提示</h4>
		      </div>
		      <div class="modal-body text-center">
		        	<div>修改成功！</div>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-success" data-dismiss="modal">确定</button>
		      </div>
		    </div><!-- /.modal-content -->
		  </div><!-- /.modal-dialog -->
		</div><!-- /.modal -->

<!-- 分配用户成功 -->
<div class="modal fade" id="assignSuccessModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" aria-describedby="这是一个描述！" backdrop="static">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		        <h4 class="modal-title" id="myModalLabel">提示</h4>
		      </div>
		      <div class="modal-body text-center">
		        	<div>分配用户成功！</div>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-success" data-dismiss="modal">确定</button>
		      </div>
		    </div><!-- /.modal-content -->
		  </div><!-- /.modal-dialog -->
		</div><!-- /.modal -->

<!-- 取消分配成功 -->
<div class="modal fade" id="cancelAssignModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" aria-describedby="这是一个描述！" backdrop="static">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		        <h4 class="modal-title" id="myModalLabel">提示</h4>
		      </div>
		      <div class="modal-body text-center">
		        	<div>取消分配成功！</div>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-success" data-dismiss="modal">确定</button>
		      </div>
		    </div><!-- /.modal-content -->
		  </div><!-- /.modal-dialog -->
		</div><!-- /.modal -->

<!-- 登录  -->
<div class="modal fade" id="loginFailModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" aria-describedby="这是一个描述！" backdrop="static">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		        <h4 class="modal-title" id="myModalLabel">提示</h4>
		      </div>
		      <div class="modal-body text-center">
		        	<div>登录失败！</div><br />
		        	可能的原因：
					<ol>
						<li>用户名或密码错误。</li>
						<li>该用户被禁用。</li>
					</ol>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-success" data-dismiss="modal">确定</button>
		      </div>
		    </div><!-- /.modal-content -->
		  </div><!-- /.modal-dialog -->
		</div><!-- /.modal -->


<!-- 操作失败 -->
<div class="modal fade" id="operateFailModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" aria-describedby="这是一个描述！" backdrop="static">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		        <h4 class="modal-title" id="myModalLabel">提示</h4>
		      </div>
		      <div class="modal-body text-center">
		        	<div>操作失败！</div>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-success" data-dismiss="modal">确定</button>
		      </div>
		    </div><!-- /.modal-content -->
		  </div><!-- /.modal-dialog -->
		</div><!-- /.modal -->

