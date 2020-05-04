<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<div style="margin:0px auto; width:500px">

    <form action="updateStudent" method="post">
	    学号：${c.sno} <br>
	    <input name="sno" type="hidden" value="${c.sno}">
        姓名：<input name="sname" value="${c.sname}"> <br>
        班级号：<input name="theClass.classid" value="${c.theClass.classid}"><br>

        <button type="submit">提交</button>

    </form>
</div>