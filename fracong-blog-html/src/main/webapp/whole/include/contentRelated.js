(function() {
	var blogContentRelated = {
		displayHtml : function() {
			var html = '';
			html += '<div class="content-block related-content visible-lg visible-md">'+
								'<h2 class="title">'+
									'<strong>相关推荐</strong>'+
								'</h2>'+
								'<ul>'+
									'<li>'+
										'<a target="_blank" href="">'+
											'<img src="/images/blog/logo.png" alt="">'+
											'<h3>欢迎来到Fracong博客,在这里可以看到网站前端和后端的技术等</h3> '+
										'</a>'+
									'</li>'+
									'<li>'+
										'<a target="_blank" href="">'+
											'<img src="/images/blog/logo.png" alt="">'+
											'<h3>欢迎来到Fracong博客,在这里可以看到网站前端和后端的技术等</h3> '+
										'</a>'+
									'</li>'+
									'<li>'+
										'<a target="_blank" href="">'+
											'<img src="/images/blog/logo.png" alt="">'+
											'<h3>欢迎来到Fracong博客,在这里可以看到网站前端和后端的技术等</h3> '+
										'</a>'+
									'</li>'+
									'<li>'+
										'<a target="_blank" href="">'+
											'<img src="/images/blog/logo.png" alt="">'+
											'<h3>欢迎来到Fracong博客,在这里可以看到网站前端和后端的技术等</h3> '+
										'</a>'+
									'</li>'+
									'<li>'+
										'<a target="_blank" href="">'+
											'<img src="/images/blog/logo.png" alt="">'+
											'<h3>欢迎来到Fracong博客,在这里可以看到网站前端和后端的技术等</h3> '+
										'</a>'+
									'</li>'+
									'<li>'+
										'<a target="_blank" href="">'+
											'<img src="/images/blog/logo.png" alt="">'+
											'<h3>欢迎来到Fracong博客,在这里可以看到网站前端和后端的技术等</h3> '+
										'</a>'+
									'</li>'+'<li>'+
										'<a target="_blank" href="">'+
											'<img src="/images/blog/logo.png" alt="">'+
											'<h3>欢迎来到Fracong博客,在这里可以看到网站前端和后端的技术等</h3> '+
										'</a>'+
									'</li>'+
									'<li>'+
										'<a target="_blank" href="">'+
											'<img src="/images/blog/logo.png" alt="">'+
											'<h3>欢迎来到Fracong博客,在这里可以看到网站前端和后端的技术等</h3> '+
										'</a>'+
									'</li>'+
								'</ul>'+
							'</div>';
			$(".content-related").html(html);
		}
	}
	$(function() {
		blogContentRelated.displayHtml();
	})
})();