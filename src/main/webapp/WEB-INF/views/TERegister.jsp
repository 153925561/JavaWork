
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>校园宿舍管理系统</title>
<link rel="stylesheet" type="text/css" href="resources/css/houtai.css"/>
<link rel="stylesheet" type="text/css" href="resources/css/check.css"/>
<script language="javascript" type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
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
			<%
					
			%>
			<div class="right">
				<div class="r_title">
					<p>学生缺寝登记</p>
				</div>

				<form action="" method="get" >
					<p style="color: red;font-size: 13px;margin-left: 100px;">请仔细确认信息是否正确，缺寝登记提交后将不可修改！</p>
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
							<td>班级:</td>
							<td></td>
						</tr>
						<tr>
							<td>寝室:</td>
							<td></td>
						</tr>
						<tr>
							<td><span>*</span>缺寝日期:</td>
							<td>
								<input  name="times" style="width: 120px;" onFocus="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd'})">
							</td>
						</tr>
												
						<tr>
							<td>缺寝备注:</td>
							<td><textarea name="note" rows="5" cols="50"></textarea></td>
						</tr>			
						
						<tr>
							<td></td>
							<td>
								<input type="submit" name="choose" value="确认提交" >
								<input type="submit" name="choose" value="返回上页">
								
							</td>
						</tr>
					</table>
				</form>			
			</div>			
			</div>

		
</body>
</html>