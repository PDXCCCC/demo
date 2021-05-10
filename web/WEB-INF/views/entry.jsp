<%--
  Created by IntelliJ IDEA.
  User: lch
  Date: 2021/4/1
  Time: 0:24
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
            url: "/en/query",
            dataType: "JSON",
            type: "GET",
            success: function (data) {
                console.log(data)
                var html = ``;
                for (var i = 0;i<data.length;i++){
                    var id=data[i]["id"]
                    var categoryId=data[i]["categoryId"]
                    var title=data[i]["title"]
                    var summary=data[i]["summary"]
                    var uploaduser=data[i]["uploaduser"]
                    var createdate=data[i]["createdate"]
                    html+=`<tr>
                                <td>${id}</td>
                                <td>${categoryId}</td>
                                <td>${title}</td>
                                <td>${summary}</td>
                                <td>${uploaduser}</td>
                                <td>${createdate}</td>
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
