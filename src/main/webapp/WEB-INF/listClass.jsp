<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>班级号</td>
        <td>班级名称</td>
        <td>编辑</td>
        <td>删除</td>
    </tr>
<c:forEach items="${lists}" var="c" varStatus="st">
        <tr>
            <td>${c.classid}</td>
            <td>${c.classname}</td>        
            <td><a href="editClass?classid=${c.classid}">编辑</a></td>
            <td><a href="deleteClass?classid=${c.classid}">删除</a></td>
            
    
        </tr>
    </c:forEach>
    新增:
    <form action="addClass" method="post">
        班级号：<input name="classid" > <br>
        班级名称： <input name="classname"> <br>
        <button type="submit">提交</button>
    </form>
</table>