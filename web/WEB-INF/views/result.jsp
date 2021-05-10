<%--
  Created by IntelliJ IDEA.
  User: lch
  Date: 2021/3/31
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="true" %>
<html>
<head>
    <title>index</title>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>
<body>
<table style="border: 1px black solid">
<%--    <tr>--%>
<%--        <td></td>--%>
<%--        <td></td>--%>
<%--        <td></td>--%>
<%--        <td></td>--%>
<%--    </tr>--%>
</table>
<script>
    $(function () {
        $.ajax({
            url: "/re/query",
            dataType: "JSON",
            type: "GET",
            success: function (data) {
                console.log(data)
                var html = ``;
                for (var i = 0;i<data.length;i++){
                    var ID = data[i]["ID"]
                    var SCORE = data[i]["SCORE"]
                    var SURVEY_Date = data[i]["SURVEY_Date"]
                    var TEACHER_ID = data[i]["TEACHER_ID"]
                    var CLBUM_ID = data[i]["CLBUM_ID"]
                    html+=`<tr>
                                <td>${ID}</td>
                                <td>${SCORE}</td>
                                <td>${SURVEY_Date}</td>
                                <td>${TEACHER_ID}</td>
                                <td>${CLBUM_ID}</td>
                            </tr>`;
                }
                ${"table"}.html(html);
            },
            error: function (data) {

            }
        });
    });
</script>
</body>
</html>
