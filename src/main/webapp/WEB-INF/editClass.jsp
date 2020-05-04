<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<div style="margin:0px auto; width:500px">

    <form action="updateClass" method="post">
     班级号：<input name="classid" value="${c.classid}"><br>
     班级名称：<input name="classname" value="${c.classname}"> <br>
        <button type="submit">提交</button>

    </form>
</div>