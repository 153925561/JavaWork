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
							<a href="toLogin" onclick="if(confirm('确定退出系统吗?')==false)return false;">退出系统</a>
						</li>						
					</ul>
				</div>
				
			</div>
			<div class="right" style="position: relative;">
				<div class="r_title">
					<p>楼宇管理员管理</p>
				</div>
				<div class="nav">
					<div class="nav_left">
						<span>功能导航:</span>
						<a href="ToAddTeacher">添加楼宇管理员</a>
					</div>
					<div class="nav_right">						
						<form action="" method="post">
							<label>查询:</label>
							<select name="pick">
								<option value="姓名">姓名</option>
								<option value="电话">电话</option>
								<option value="用户名">用户名</option>
							</select>
							<input type="text" name="content" id="" value="" />
							<input type="submit" value="点击查询">
						</form>
						
					</div>					
					<div>
						<table frame="void" cellpadding="10" cellspacing="0" width="710px" style="text-align:center;margin-top:5px">
							<tr style="background-color:lightgrey;">
								<th>姓名</th>
								<th>性别</th>
								<th>电话</th>
								<th>用户名</th>
								<th>操作</th>
							</tr>

							<c:forEach var ="item" items="${teachers}">
								<tr>
									<td>${item.teachername}</td>
									<td>${item.teachersex}</td>
									<td>${item.teacherphone}</td>
									<td>${item.teacherusername}</td>
									
									<td>
										<a href="ToUpdateTeacher?id=${item.teacherid}">修改</a>
											
										<a href="ToDeleteTeacher?id=${item.teacherid}"onclick="if(confirm('确定删除吗?')==false)return false;">删除</a>
										
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