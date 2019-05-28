
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>校园宿舍管理系统</title>
<link rel="stylesheet" type="text/css" href="css/houtai.css"/>
<link rel="stylesheet" type="text/css" href="css/check.css"/>
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
							<a href="WelcomeAdmin.jsp">后台首页</a>							
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="ShowTeacher">楼宇管理员管理</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="ShowStudent">学生管理</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="showbuilding">楼宇管理</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="showroom">宿舍管理</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="forcheckin">学生入住登记</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="ChangeRoom1.jsp">学生寝室调换</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="MoveOut1.jsp">学生迁出登记</a>
						</li>
						
						<li>
							<img src="img/三角形-right.png"/>
							<a href="showmoveout">迁出记录</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="shownotinroom">缺寝记录</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="ModifyPassword.jsp">修改密码</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="logout" onclick="if(confirm('确定退出系统吗?')==false)return false;">退出系统</a>
						</li>						
					</ul>
				</div>
				
			</div>

			<div class="right">
				<div class="r_title">
					<p>学生迁出登记</p>
				</div>
				<form action="moveout2" method="get" name="form1">
					<p style="color: red;font-size: 13px;margin-left: 100px;">此功能只适用于毕业的学生迁出，迁出后将不可恢复！ 确定要迁出学生吗？</p>
					<table border="0" cellspacing="5" cellpadding="2">										
						<tr>
							<td>学生学号:</td>
							<td></td>
						</tr>
						<tr>
							<td>学习姓名:</td>
							<td></td>
						</tr>
						<tr>
						
							<td>学生性别:</td>
							<td></td>
						</tr>
						<tr>
							<td>目前楼宇:</td>
							<td></td>
						</tr>
						<tr>
							<td>目前寝室:</td>
							<td></td>
						</tr>						
						<tr>
							<td>迁出备注:</td>
							<td><textarea name="content" rows="5" cols="50"></textarea></td>
						</tr>			
						
						<tr>
							<td></td>
							<td>
								<input type="submit" name="choose" value="确定迁出">
								<input type="submit" name="choose" value="返回上页">
								
							</td>
						</tr>
					</table>
				</form>			
			</div>
					
				
				
			</div>
		
</body>
</html>