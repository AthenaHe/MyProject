<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>班级</td>
        <td>课程名</td>
        <td>成绩</td>
        <td>编辑</td>
        <td>删除</td>
    </tr>
<c:forEach items="${lists}" var="c" varStatus="st">
        <tr>
            <td>${c.scorePK.student.sno}</td>
            <td>${c.scorePK.student.sname}</td>
          	<td>${c.scorePK.student.theClass.classname}</td> 
          	<td>${c.scorePK.course.coursename}</td>
          	<td>${c.score}</td>         
            <!-- <td><a href="editScore?scorePK=${c.scorePK}">编辑</a></td> -->
            <td><a href="editScore?sno=${c.scorePK.student.sno}&cno=${c.scorePK.course.cno}">编辑</a></td>
            <td><a href="deleteScore?scorePK.student.sno=${c.scorePK.student.sno}&scorePK.course.cno=${c.scorePK.course.cno}">删除</a></td>
            
    
        </tr>
    </c:forEach>
    新增:
    <form action="addScore" method="post">
        学号：<input name="scorePK.student.sno" > <br>
        课程号：<input name="scorePK.course.cno"> <br>
        成绩：<input name="score"><br>
        <button type="submit">提交</button>
    </form>
</table>