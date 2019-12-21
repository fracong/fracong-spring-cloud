(function() {
	var blogSidebar = {
		displaySentenceHtml : function() {
			var html = '';
			html += '<strong>每日一句</strong>'+
				'<h2>2015年11月1日 星期日</h2>'+
				'<p>你是我人生中唯一的主角，我却只能是你故事中的一晃而过得路人甲。</p>';
			$(".sidebar .sentence").html(html);
		},
		displaySearchHtml : function() {
			var html = '<h2 class="title">'+
					'<strong>搜索</strong>'+
				'</h2>'+
				'<form class="navbar-form" action="search.php" method="post">'+
					'<div class="input-group">'+
						'<input type="text" class="form-control" size="35"'+
							'placeholder="请输入关键字"> <span class="input-group-btn">'+
							'<button class="btn btn-default btn-search" type="submit">搜索</button>'+
						'</span>'+
					'</div>'+
				'</form>';
			$(".sidebar .search").html(html);
		},
		displayRecommendHtml : function() {
			var html = '<h2 class="title">'+
					'<strong>热门推荐</strong>'+
				'</h2>'+
				'<ul>'+
					'<li>'+
						'<a target="_blank" href="">'+
							'<span class="thumb">'+
								'<img src="images/icon/icon.png" alt="">'+
							'</span> '+
								'<span class="text">Fracong博客的SHORTCUT和ICON图标...</span> '+
								'<span class="text-muted">阅读(2165)</span>'+
							'</a>'+
						'</li>'+
				'</ul>';
			$(".sidebar .recommend").html(html);
		},
		displayCommentHtml : function() {
			var html = '<h2 class="title">'+
					'<strong>最新评论</strong>'+
				'</h2>'+
				'<ul>'+
					'<li data-toggle="tooltip" data-placement="top" title="站长的评论">'+
						'<a target="_blank" href="">'+
							'<span class="face">'+
								'<img src="images/icon/icon.png" alt="">'+
							'</span>'+
							'<span class="text">'+
								'<strong>Fracong站长</strong> (2015-10-18) 说：'+
								'<br />'+ 
								'欢迎来到Fracong博客，在这里可以看到网站前端和后端的技术等 ...'+
							'</span>'+
						'</a>'+
					'</li>'+
				'</ul>';
			$(".sidebar .comment").html(html);
		}
	}
	$(function() {
		blogSidebar.displaySentenceHtml();
		blogSidebar.displaySearchHtml();
		blogSidebar.displayRecommendHtml();
		blogSidebar.displayCommentHtml();
	})
})();