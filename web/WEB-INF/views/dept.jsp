<%--
  Created by IntelliJ IDEA.
  User: lch
  Date: 2021/3/31
  Time: 20:37
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
</table>
<script>
    $(function () {
        $.ajax({
            url: "/de/query",
            dataType: "JSON",
            type: "GET",
            success: function (data) {
                console.log(data)
                var html = ``;
                for (var i = 0;i<data.length;i++){
                    var dept_id=data[i]["dept_id"]
                    var dept_name=data[i]["dept_name"]
                    html+=`<tr>
                                <td>${dept_id}</td>
                                <td>${dept_name}</td>
                            </tr>`;
                }
                $("table").html(html);
            },
            error: function (data) {

            }
        });
    });
</script>
</body>
</html>
