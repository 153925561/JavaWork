<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>校园宿舍管理系统</title>
<link rel="stylesheet" type="text/css" href="resources/css/houtai.css"/>
<link rel="stylesheet" type="text/css" href="resources/css/admin.css"/>
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
							<a href="TeacherMain">后台首页</a>
						</li>						
						<li>
							<img src="img/三角形-right.png"/>
							<a href="ManageStudent">学生管理</a>
						</li>						
						<li>
							<img src="img/三角形-right.png"/>
							<a href="StuMissing">学生缺寝记录</a>
						</li>						
						<li>
							<img src="img/三角形-right.png"/>
							<a href="ToTeaPassword">修改密码</a>
						</li>
						<li>
							<img src="img/三角形-right.png"/>
							<a href="toLogin"onclick="if(confirm('确定退出系统吗?')==false)return false;">退出系统</a>
						</li>						
					</ul>
				</div>
				
			</div>
			<div class="right" style="position: relative;">
				<div class="r_title">
					<p>学生管理</p>
				</div>
				<div class="nav">
					<div class="nav_left">
						<span>功能导航:</span>
						<a href="" >返回上页</a>
					</div>
					<div class="nav_right">						
						<form action="" method="get" >
							<label>寝室号:</label>							
							<input type="text" name="room" id="" value="" />
							<input type="submit" value="点击查询" >
						</form>
						
					</div>					
					<div>
						<table frame="void" cellpadding="10" cellspacing="0" width="710px" style="text-align:center;margin-top:5px">
							<tr style="background-color: lightgrey;">
								<th>寝室号</th>
								<th>学号</th>
								<th>姓名</th>
								<th>性别</th>
								<th>班级</th>
								<th>操作</th>
							</tr>
                          <c:forEach var="item" items="${students}">
								<tr>
									<td>${item.sturoom}</td>
									<td>${item.stuid}</td>
									<td>${item.stuname}</td>
									<td>${item.stusex}</td>
									<td>${item.stuclass}</td>
									
									<td>
										<a href=">缺寝登记</a>
																			
									</td>
								</tr>
                      </c:forEach>
						</table>
						<br>
						
					</div>
				</div>


			</div>
		</div>

</body>
</html>