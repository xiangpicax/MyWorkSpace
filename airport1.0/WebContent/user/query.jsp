<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="show" method="get">
起飞机场： <select name="takeid">
           <option value="0">请选择</option>
           <c:forEach items="${ports}" var="port"><option value="${port.id}">${port.portname }</option></c:forEach>
        </select>
  降落机场：  <select name="landid">
           <option value="0">请选择</option>
           <c:forEach items="${ports}" var="port"><option value="${port.id}">${port.portname }</option></c:forEach>
        </select>
    <input type="submit" value="查询" />
    <table border="1">
        <tr>
            <td>飞机编号</td>
            <td>起飞机场</td>
            <td>降落机场</td>
            <td>航行时间</td>
            <td>座位</td>
            <td>起飞时间</td>
            <td>票价</td>
        </tr>
     <c:forEach items="${planes}" var="ap">
        <tr>
            
                <td>${ap.airno }</td>
                <td>${ap.takePort.portname }</td>
                <td>${ap.landPort.portname }</td>
                <td>
                    <c:if test="${ap.time>60}">
                        ${(ap.time-ap.time%60)/60}小时${ap.time%60}分钟
                    </c:if>
                    <c:if test="${ap.time<60}">
                        ${ap.time }分钟
                    </c:if>
                </td>
                <td>${ap.seat}</td>
                <td>${ap.flytime}</td>
                <td>${ap.price }</td>
           
        </tr>
     </c:forEach>
    </table>
</form>
</body>
</html>