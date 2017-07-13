<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<h1>添加用户</h1>
<s:form action="user_save" method="post" namespace="/" theme="simple">
用户名<s:textfield name="userModle.name"></s:textfield><br/>
年龄<s:textfield name="userModle.age"></s:textfield><br/>
<s:submit type="submit" value="提交"></s:submit>
</s:form>
</body>
</html>

