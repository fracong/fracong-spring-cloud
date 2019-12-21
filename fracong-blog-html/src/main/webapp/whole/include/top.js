(function() {
	var blogTop = {
		displayTopHtml : function() {
			var html = '';
			html += '<div class="top-container">'
							+ '<div class="top-logo"><img src="./whole/images/top_logo.png"/></div>'
							+'<button class="btn btn-default btn-search login-btn" onclick="showLogin(0)">登陆</button>'
							+ '<button class="btn btn-default btn-search logout-btn hidden" onclick="showLogout(0)">退出</button>'
							+ '<div class="user_name_class hidden"  >'
								+ '<strong style="color: royalblue;">Welcome, <span></span></strong>'
							+ '</div>' 
							+ '</div>';
			$(".blog-top").html(html);
		},
		displayLoginHtml : function() {
			var html = '<div class="modal-dialog">'
					+ '<div class="modal-content">'
					+ '<div class="modal-header">'
					+ '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>'
					+ '</div>'
					+ '<div class="modal-body blog-user-login">'
					+ '<h4 class="modal-title" align="center">登录框</h4>'
					+ '<br/>'
					+ '<form class="form-horizontal" role="form">'
					+ '<div class="form-group">'
					+ '<label for="name" class="col-sm-offset-2 col-sm-2 control-label">账号</label>'
					+ '<div class="col-sm-5">'
					+ '<input type="text" class="form-control" id="loginName" placeholder="请输您的入账号">'
					+ '</div>'
					+ '</div>'
					+ '<div class="form-group">'
					+ '<label for="password" class="col-sm-offset-2 col-sm-2 control-label">密码</label>'
					+ '<div class="col-sm-5">'
					+ '<input type="password" class="form-control" id="userPassword" placeholder="请输入您的密码">'
					+ '</div>'
					+ '</div>'
					+ '<div class="form-group">'
					+ '<div class="col-sm-offset-4 col-sm-5">'
					+ '<button id="submitBtn" type="button" class="btn btn-default btn-block btn-primary" onclick="blogUserLogin()">登录</button>'
					+ '</div>' + '</div>' + '</form>' + '</div>'
					+ '<div class="modal-footer">' + '</div>' + '</div>'
					+ '</div>';
			$("#loginModal").html(html);
		},
		displayLogoutHtml : function() {
			var html = '<div class="modal-dialog">'
								+ '<div class="modal-content">'
									+ '<div class="modal-header">'
										+ '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>'
									+ '</div>'
									+ '<div class="modal-body blog-user-login">'
											+ '<div class="form-group">'
												+ '<label for="name" class="col-sm-offset-3 col-sm-9 control-label">确认是否退出登录？</label>'
											+ '</div>'
											+ '<br/>'
											+ '<div class="form-group" style="height: 15px;">'
												+ '<div class="col-sm-offset-4 col-sm-5">'
													+ '<button id="submitBtn" type="button" class="btn btn-default btn-block btn-primary" onclick="blogUserLogout()">退出</button>'
												+ '</div>'
											+ '</div>' 
									+ '</div>'
									+ '<div class="modal-footer">' 
									+ '</div>' 
								+ '</div>'
							+ '</div>';
			$("#logoutModal").html(html);
		},
		checkIfLogin : function(){
			$.ajax({
				url: BLOG_API_URL+"/user/checkLogin",
				type : "GET",
				contentType : "application/json;charset=UTF-8",
				//async:false,
				xhrFields : {
					withCredentials : true
				},
				dataType:"json",
				success : function(data) {
					console.log(typeof data);
					if("success" == data.message) {
						var user = data.bean;
						setUserIfLogin(0,user);
						setUserIfLogin(1,user);
					}
				}
			});
		}
	}
	$(function() {
		blogTop.displayTopHtml();
		blogTop.displayLoginHtml();
		blogTop.displayLogoutHtml();
		blogTop.checkIfLogin();
	})
})();

function showLogin() {
	$('#loginModal').modal('show'); // 显示模态框
}

function showLogout(){
	$('#logoutModal').modal('show');
}

function blogUserLogin(type) {
	var loginName = $(".blog-user-login #loginName").val();
	var userPassword = $(".blog-user-login #userPassword").val();
	var param = {loginName:loginName,userPassword:userPassword};
	$.ajax({
		url: BLOG_API_URL+"/user/login",
		type : "POST",
		contentType : "application/json;charset=UTF-8",
		//async:false,
		xhrFields : {
			withCredentials : true
		},
		dataType:"json",
		data:JSON.stringify(param),
		success : function(data) {
			console.log(data.message);
			if("OK" == data.message){
				$(".blog-user-login #loginName").val('');
				$(".blog-user-login #userPassword").val('');
				$('#loginModal').modal('hide');
				var user = data.bean;
				setUserIfLogin(type,user);
			}
		}
	});
}

function setUserIfLogin(type,user){
	if(type == 0){
		$(".login-btn").hide();
		$(".logout-btn").show();
		$(".logout-btn").removeClass("hidden");
		$(".user_name_class").show();
		$(".user_name_class").removeClass("hidden");
		$(".top-container .user_name_class span").html(user.userName);
	}else{
		$(".login-left-xs .login-btn").hide();
		$(".login-left-xs .user_name_class_xs").show();
		$(".login-left-xs .user_name_class_xs").removeClass("hidden");
		$(".login-left-xs .user_name_class_xs span").html(user.userName);
	}
}


function blogUserLogout(type) {
	$.ajax({
		url: BLOG_API_URL+"/user/logout",
		type : "GET",
		contentType : "application/json;charset=UTF-8",
		//async:false,
		xhrFields : {
			withCredentials : true
		},
		dataType:"json",
		success : function(data) {
			console.log(data.message);
			if("success" == data.message){
				$('#logoutModal').modal('hide');
				setUserIfLogout(type);
			}
		}
	});
}

function setUserIfLogout(type){
	if(type == 0){
		$(".login-btn").show();
		$(".user_name_class").hide();
		$(".user_name_class").addClass("hidden");
		$(".top-container .user_name_class span").html("");
	}else{
		$(".login-left-xs .login-btn").show();
		$(".login-left-xs .user_name_class_xs").hide();
		$(".login-left-xs .user_name_class_xs").addClass("hidden");
		$(".login-left-xs .user_name_class_xs span").html("");
	}
}