$(document).ready(function() {
				
				$(".form").slideDown(500);
				
				$("#landing").addClass("border-btn");

				$("#registered").click(function() {
					$("#landing").removeClass("border-btn");
					$("#landing-content").hide(500);
					$(this).addClass("border-btn");
					$("#registered-content").show(500);
					
				})
				
				$("#registeredtxt").click(function() {
					$("#landing").removeClass("border-btn");
					$("#landing-content").hide(500);
					$(this).addClass("border-btn");
					$("#registered-content").show(500);
					
				})

				$("#landing").click(function() {
					$("#registered").removeClass("border-btn");
					$(this).addClass("border-btn");
					
					$("#landing-content").show(500);
					$("#registered-content").hide(500);
				})
				
				$("#resetbtn").click(function(){
					var url = window.location.href;
					var password = $("#fpassword").val();
					var params = url.substring(url.indexOf("=", 0)+1,url.length);
					$.ajax({
						type:"GET",
						url:"login/resetpassword?email="+params+"&password="+password,
						dataType:"json",
						success:function(data){
							if(data.success){
								alert(data.message);
							}
						}
					});
					
				})
				
				$("#forgotpassword").click(function(){
//					var email = $("#lemail").val();
//					$.ajax({
//						type:"GET",
//						url:"login/forgotpemail?email="+email,
//						dataType:"json",
//						success:function(data){
//							if(data.success){
//								alert(data.message);
//							}
//						}
//					});
					var url = window.location.href;
					var rootUrl = url.substring(0,url.lastIndexOf("/"));
					window.location.href = rootUrl+"/forgetpassword.html"
				})
				
				$("#sendEmail").click(function(){
					var email = $("#email").val();
					$.ajax({
						type:"GET",
						url:"login/forgotpemail?email="+email,
						dataType:"json",
						success:function(data){
							if(data.success){
								alert(data.message);
							}
						}
					});
				})
				
				//user login event
				$("#loginbtn").click(function(){
					var email = $("#lemail").val();
					var password = $("#lpassword").val();
					if(email.length==0 || password.length ==0){
						alert("用户名和密码不能为空");
						return;
					}
					$.ajax({
						type:"GET",
						url:"login/login?email="+email+"&password="+password,
						dataType:"json",
						success:function(data){
							if(data.success){
								window.location.href=data.message;
							}else{
								alert(data.message);
							}
						}
					});
				})
				
				//user register event
				$("#registerbtn").click(function(){
					var name = $("#rname").val();
					var remail = $("#remail").val();
					var description = $("#rdescription").val();
					$.ajax({
						type:"GET",
						url:"signup/sendemail?name="+name+"&email="+remail+"&description="+description,
						dataType:"json",
						success:function(data){
							if(data.success){
								alert(data.message);
							}
						}
					});
				})
			});