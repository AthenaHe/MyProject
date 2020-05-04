<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>课程号</td>
        <td>课程名</td>
        <td>编辑</td>
        <td>删除</td>
    </tr>
<c:forEach items="${lists}" var="c" varStatus="st">
        <tr>
            <td>${c.cno}</td>
            <td>${c.coursename}</td>        
            <td><a href="editCourse?cno=${c.cno}">编辑</a></td>
            <td><a href="deleteCourse?cno=${c.cno}">删除</a></td>
            
    
        </tr>
    </c:forEach>
    新增:
    <form action="addCourse" method="post">
        课程号：<input name="cno" > <br>
        课程名：<input name="coursename"> <br>
        <button type="submit">提交</button>
    </form>
</table>