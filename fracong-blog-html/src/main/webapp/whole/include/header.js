(function() {
	var blogHeader = {
		displayHtml : function() {
			var html = '';
			html += '<div class="hidden-xs header">'+
				'<div class="blog-top"></div>'+
				'<h1 class="logo">'+
					'<a href="./color.html" title="Fracong技术博客 - POWERED BY WY ALL RIGHTS RESERVED"></a>'+
				'</h1>'+
				'<ul class="nav hidden-xs-nav">'+
					'<li class="active"><a href="index.html"><span class="glyphicon glyphicon-home"></span>网站首页</a></li>'+
					'<li><a href="/blog/contentList.html"><span class="glyphicon glyphicon-erase"></span>个人博客</a></li>'+
					'<li><a href=""><span class="glyphicon glyphicon-inbox"></span>后端技术</a></li>'+
					'<li><a href=""><span class="glyphicon glyphicon-globe"></span>管理系统</a></li>'+
					'<li><a href="about.html"><span class="glyphicon glyphicon-user"></span>关于我们</a></li>'+
					'<li><a href="friendly.html"><span	class="glyphicon glyphicon-tags"></span>友情链接</a></li>'+
				'</ul>'+
				'<div class="feeds">'+
					'<a class="feed feed-xlweibo" href="" target="_blank"><i></i>新浪微博</a>'+
					'<a class="feed feed-txweibo" href="" target="_blank"><i></i>腾讯微博</a>'+
					'<a class="feed feed-rss" href="" target="_blank"><i></i>订阅本站</a> '+
					'<a class="feed feed-weixin" data-toggle="popover"'+
						'data-trigger="hover" title="微信扫一扫" data-html="true"'+
						'data-content="<img src="images/weixin.jpg" alt="">"'+
						'href="javascript:;" target="_blank"><i></i>关注微信</a>'+
				'</div>'+
				'<div class="wall">'+
					'<a href="readerWall.html" target="_blank">读者墙</a> |'+
					'<a href="tags.html" target="_blank">标签云</a>'+
				'</div>'+
			'</div>'+
			'<div class="visible-xs header-xs">'+
				'<div class="navbar-header header-xs-logo">'+
					'<button type="button" class="login-left-xs collapsed login-show-name">'+
						'<span class="login-btn" onclick="showLogin(1) " >登录</span>'+
						'<span class="user_name_class_xs hidden" style="font-size:12px;" onclick="showLogout()">用户:'+
							'<span>fracong</span></span>'+
						'</span>'+
					'</button>'+
					'<button type="button" class="navbar-toggle collapsed"'+
						'data-toggle="collapse" data-target="#header-xs-menu"'+
						'aria-expanded="false" aria-controls="navbar">'+
						'<span class="glyphicon glyphicon-menu-hamburger"></span>'+
					'</button>'+
				'</div>'+
				'<div id="header-xs-menu" class="navbar-collapse collapse">'+
					'<ul class="nav navbar-nav header-xs-nav">'+
						'<li class="active"><a href="index.html"><span'+
								'class="glyphicon glyphicon-home"></span>网站首页</a></li>'+
						'<li><a href=""><span class="glyphicon glyphicon-erase"></span>网站前端</a></li>'+
						'<li><a href=""><span class="glyphicon glyphicon-inbox"></span>后端技术</a></li>'+
						'<li><a href=""><span class="glyphicon glyphicon-globe"></span>管理系统</a></li>'+
						'<li><a href="about.html"><span'+
								'class="glyphicon glyphicon-user"></span>关于我们</a></li>'+
						'<li><a href="friendly.html"><span'+
								'class="glyphicon glyphicon-tags"></span>友情链接</a></li>'+
					'</ul>'+
					'<form class="navbar-form" action="search.php" method="post" style="padding: 0 25px;">'+
						'<div class="input-group">'+
							'<input type="text" class="form-control" placeholder="请输入关键字">'+
							'<span class="input-group-btn">'+
								'<button class="btn btn-default btn-search" type="submit">搜索</button>'+
							'</span>'+
						'</div>'+
					'</form>'+
				'</div>'+
			'</div>';
			$(".container-left-header").html(html);
		}
	}
	$(function() {
		blogHeader.displayHtml();
	})
})();