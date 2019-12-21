(function() {
	var blogComment = {
		displayFormHtml : function() {
			var html = '';
			html += '<form action="comment.php" method="post" class="form-inline" id="comment-form">'+
						'<div class="comment-title">'+
							'<div class="form-group">'+
								'<label for="commentName">昵称：</label> <input type="text"'+
									'name="commentName" class="form-control" id="commentName"'+
									'placeholder="Fracong">'+
							'</div>'+
							'<div class="form-group">'+
								'<label for="commentEmail">邮箱：</label> <input type="email"'+
									'name="commentEmail" class="form-control" id="commentEmail"'+
									'placeholder="admin@FRACONG.CN">'+
							'</div>'+
						'</div>'+
						'<div class="comment-form">'+
							'<textarea placeholder="你的评论可以一针见血" name="commentContent"></textarea>'+
							'<div class="comment-form-footer">'+
								'<div class="comment-form-text">'+
									'请先 <a href="javascript:;">登录</a> 或 <a href="javascript:;">注册</a>，也可匿名评论'+
								'</div>'+
								'<div class="comment-form-btn">'+
									'<button type="submit" class="btn btn-default btn-comment">提交评论</button>'+
								'</div>'+
							'</div>'+
						'</div>'+
					'</form>';
			$(".content .comment-form").html(html);
		},
		displayContentHtml : function() {
			var html = '<ul>'+
								'<li>'+
									'<span class="face"><img src="images/icon/icon.png" alt=""></span>'+
									'<span class="text">'+
										'<strong>Fracong站长</strong> (2015-10-18) 说：'+
										'<br />'+
										'欢迎来到Fracong博客，在这里可以看到网站前端和后端的技术等在这里可以看到网站前端和后端的技术等在这里可以看到网站前端和后端的技术等...'+
									'</span>'+
								'</li>'+
							'</ul>';
			$(".content .comment-content").html(html);
		}
	}
	$(function() {
		blogComment.displayFormHtml();
		blogComment.displayContentHtml();
	})
})();