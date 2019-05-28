<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>校园宿舍管理系统</title>
<link rel="stylesheet" type="text/css" href="resources/css/index.css"/>
</head>
<body>
	<div class="center">
			<h4 class="title">校园宿舍管理系统</h4>
			<form class="box" action="login" method="post" name="myForm">
				<div class="identity">
					<label>身份:</label>	
					<select name="people">
					<option value="请选择">请选择</option>
					<option value="系统管理员">系统管理员</option>
					<option value="楼宇管理员">楼宇管理员</option>
					<option value="学生">学生</option>
					</select>
				</div>
				<div class="username">
					<label >用户名:</label>
					<input type="text" name="username"  value="" />
				</div>
				<div class="password">
					<label >密码:</label>				
					<input type="password" name="password"  value="" />
				</div>	
				<div class="land">
					<input type="submit" value="登录" onclick="return mycheck()"></input>
				</div>
			</form>			
		</div>
<script type="text/javascript">
function mycheck(){

    if(document.myForm.people.value=="请选择"){

        alert("请选择登录身份");
		return false
	}
	else if (document.myForm.username.value==""){

        alert("请输入用户名");
        return false}
    else if (document.myForm.password.value==""){

        alert("请输入密码");
        return false}

else
    {return ture;}
}
</script>


</body>
</html>