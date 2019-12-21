(function() {
	var blogContentUp = {
		displayHtml : function() {
			var html = '';
			html += '<header class="news_header">'+
				'<h2 class="content_name"></h2>'+
				'<ul>'+
					'<li><span class="content_user"></span> 发布于 <span'+
						'class="content_create_time"></span></li>'+
					'<li>栏目：<a href="" title="" target="_blank">未知</a></li>'+
					'<li>来源：<a class="content_source_name" href="" title=""'+
						'target="_blank"></a></li>'+
					'<li>共 <strong class="content_view_num"></strong> 查看'+
					'</li>'+
				'</ul>'+
			'</header>'+
			'<article class="news_content"></article>'+
			'<div class="reprint">'+
				'转载请说明出处：<a href="" title="" target="_blank">Fracong博客</a> » <a'+
					'href="" title="" target="_blank">欢迎来到Fracong博客</a>'+
			'</div>'+
			'<div class="zambia">'+
				'<a href="javascript:;" name="zambia" rel=""><span'+
					'class="glyphicon glyphicon-thumbs-up"></span> 赞（0）</a>'+
			'</div>'+
			'<div class="tags news_tags">'+
				'标签： <span data-toggle="tooltip" data-placement="bottom"'+
					'title="查看关于 本站 的文章"><a href="">本站</a></span> <span'+
					'data-toggle="tooltip" data-placement="bottom"'+
					'title="查看关于 Fracong 的文章"><a href="">Fracong</a></span>'+
			'</div>'+
			'<nav class="page-nav">'+
				'<span class="page-nav-prev">上一篇<br /> <a href="" rel="prev">欢迎来到Fracong博客</a></span>'+
				'<span class="page-nav-next">下一篇<br /> <a href="" rel="next">欢迎来到Fracong博客</a></span>'+
			'</nav>';
			$(".content-up").html(html);
		}
	}
	$(function() {
		blogContentUp.displayHtml();
	})
})();