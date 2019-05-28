<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>校园宿舍管理系统</title>
<link rel="stylesheet" type="text/css" href="resources/css/houtai.css"/>
<link rel="stylesheet" type="text/css" href="resources/css/check.css"/>
</head>
<body>
	<div class="header">
			<div class="title">
				<p>校园宿舍管理系统</p>
			</div>
			
		</div>
		<div class="content">
			<div class="left">
				<div class="chooice">
					<img src="img/择律-选择费用-倒三角形-反对.png"/>
					<span>系统选项</span>
				</div>
				<div class="list">
					<ul>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="StuMain">后台首页</a>
						</li>												
						<li>
							<img src="img/三角形-right.png"/>
							<a href="MyMissing">我的缺寝记录</a>
						</li>						
						<li>
							<img src="img/三角形-right.png"/>
							<a href="ToStuPassword">修改密码</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="toLogin"onclick="if(confirm('确定退出系统吗?')==false)return false;">退出系统</a>
						</li>						
					</ul>
				</div>
				
			</div>
			<div class="right">
				<div class="r_title">
					<p>修改密码</p>
				</div>
				<form action="" method="get" >
					<table border="0" cellspacing="5" cellpadding="2">								
						<tr>
							<td><span>*</span>请输入原密码:</td>
							<td><input type="text" name="oldpassword" value="" /></td>
						</tr>
						<tr>
							<td><span>*</span>请输入新密码:</td>
							<td><input type="text" name="newpassword1" value="" /></td>
						</tr>
						<tr>
							<td><span>*</span>请重复新密码:</td>
							<td><input type="text" name="newpassword2" value="" /></td>
						</tr>
						<tr>
							<td></td>
							<td>
								<input type="submit" value="修改密码" >
							</td>
						</tr>
					</table>
				</form>			
			</div>
		</div>

				
				

</body>
</html>