<%--
  Created by IntelliJ IDEA.
  User: lch
  Date: 2021/4/1
  Time: 0:36
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
            url: "/cat/query",
            dataType: "JSON",
            type: "GET",
            success: function (data) {
                console.log(data)
                var html = ``;
                for (var i = 0;i<data.length;i++){
                    var id=data[i]["id"]
                    var name=data[i]["name"]
                    html+=`<tr>
                                <td>${id}</td>
                                <td>${name}</td>
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
