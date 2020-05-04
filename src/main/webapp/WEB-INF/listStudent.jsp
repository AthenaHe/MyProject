<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>班级</td>
        <td>编辑</td>
        <td>删除</td>
    </tr>
<c:forEach items="${lists}" var="c" varStatus="st">
        <tr>
            <td>${c.sno}</td>
            <td>${c.sname}</td>
          	<td>${c.theClass.classname}</td>           
            <td><a href="editStudent?sno=${c.sno}">编辑</a></td>
            <td><a href="deleteStudent?sno=${c.sno}">删除</a></td>
            
    
        </tr>
    </c:forEach>
    新增:
    <form action="addStudent" method="post">
        学号：<input name="sno" > <br>
        姓名：<input name="sname"> <br>
        班级号：<input name="theClass.classid"><br>
        <button type="submit">提交</button>
    </form>
</table>