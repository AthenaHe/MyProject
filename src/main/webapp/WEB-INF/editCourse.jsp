<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<div style="margin:0px auto; width:500px">

    <form action="updateCourse" method="post">
     课程号：<input name="cno" value="${c.cno}"><br>
     课程名：<input name="coursename" value="${c.coursename}"> <br>
     <!--<input name="id" type="hidden" value="${c.cno}">  -->
        <button type="submit">提交</button>

    </form>
</div>