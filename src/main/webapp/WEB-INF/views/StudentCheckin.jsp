
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
							<a href="adminMain">后台首页</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="adminTeacher">楼宇管理员管理</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="adminSudent">学生管理</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="adminBuilding">楼宇管理</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="admainRoom">宿舍管理</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="toStudentCheckin">学生入住登记</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="adminMain">学生寝室调换</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="toStudentOut">学生迁出登记</a>
						</li>

						<li>
							<img src="img/三角形-right.png"/>
							<a href="toOuter">迁出记录</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="adminMain">缺寝记录</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="toChangAdminPassword">修改密码</a>
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
					<p>学生入住登记</p>
				</div>
				

				<form action="" method="get"  >
					<table border="0" cellspacing="5" cellpadding="2">						
						<tr>
							<td><span>*</span>楼宇:</td>						
							<td>
								<select name="build" id="build" onchange="mychange()">
								<option>请选择...</option>

								<option value=""></option>

								</select>
							
							</td>
						</tr>
						<tr>
							<td><span>*</span>寝室:</td>
							<td><input type="text" name="room"></td>
						</tr>
						<tr>
							<td><span>*</span>学生学号:</td>
							<td><input type="text" name="username" id="" value="" /></td>
						</tr>				
						<tr>
							<td></td>
							<td>
								<input type="submit" name="choose" value="确认入住" >
								<input type="submit" name="choose" value="返回">					
							</td>
						</tr>
					</table>
				</form>			
			</div>
		</div>
		

		
		

		
</body>
</html>