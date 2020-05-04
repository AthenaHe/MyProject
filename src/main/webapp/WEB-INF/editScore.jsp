<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<div style="margin:0px auto; width:500px">

    <form action="updateScore" method="post">
		学号：<input name="scorePK.student.sno" value="${c.scorePK.student.sno}"> <br>
        课程号：<input name="scorePK.course.cno" value="${c.scorePK.course.cno}"> <br>
        成绩：<input name="score" value="${c.score}"><br>
        <button type="submit">提交</button>
    </form>
</div>