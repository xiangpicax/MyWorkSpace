<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="js/easyui/themes/default/easyui.css">   
<link rel="stylesheet" type="text/css" href="js/easyui/themes/icon.css">   
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>   
<script type="text/javascript" src="js/easyui/jquery.easyui.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<form action="showFlytime" method="post">
起飞机场： <select name="takeid">
           <option value="0">请选择</option>
           <c:forEach items="${ports}" var="port"><option value="${port.id}">${port.portname }</option></c:forEach>
        </select>
  降落机场：  <select name="landid">
           <option value="0">请选择</option>
           <c:forEach items="${ports}" var="port"><option value="${port.id}">${port.portname }</option></c:forEach>
        </select>
   时间：     <input id="dd" type="text" name="flytime" class="easyui-datebox" ></input> 
    <input type="submit" value="查询" />
    <table border="1">
        <tr>
            <td>编号</td>
            <td>起飞机场</td>
            <td>降落机场</td>
            <td>起飞时间</td>
           
        </tr>
     <c:forEach items="${planeflytime}" var="ap">
        <tr>
            
                <td>${ap.id }</td>
                <td>${ap.takePort.portname }</td>
                <td>${ap.landPort.portname}</td>
                <td>${ap.flytime}</td>
           
        </tr>
     </c:forEach>
    </table>
</form>
</body>
</html>