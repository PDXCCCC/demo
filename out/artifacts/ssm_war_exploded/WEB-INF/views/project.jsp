<%--
  Created by IntelliJ IDEA.
  User: lch
  Date: 2021/3/31
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="true" %>
<html>
<head>
    <title>index</title>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>
<table style="border: 1px black solid">

</table>
<body>
<script>
    $(function () {
        $.ajax({
            url: "/pro/query",
            dataType: "JSON",
            type: "GET",
            success: function (data) {
                console.log(data)
                var html = ``;
                for (var i = 0;i<data.length;i++){
                    var id=data[i]["id"]
                    var projectName=data[i]["projectName"]
                    var startDate=data[i]["startDate"]
                    var endDate=data[i]["endDate"]
                    var status=data[i]["status"]
                    html+=`<tr>
                                <td>${id}</td>
                                <td>${projectName}</td>
                                <td>${startDate}</td>
                                <td>${endDate}</td>
                                <td>${status}</td>
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
