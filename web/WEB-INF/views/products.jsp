<%--
  Created by IntelliJ IDEA.
  User: lch
  Date: 2021/4/1
  Time: 0:44
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
            url: "/produ/query",
            dataType: "JSON",
            type: "GET",
            success: function (data) {
                console.log(data)
                var html = ``;
                for (var i = 0;i<data.length;i++){
                    var id=data[i]["id"]
                    var productName=data[i]["productName"]
                    var productDate=data[i]["productDate"]
                    var productSum=data[i]["productSum"]
                    var productDesc=data[i]["productDesc"]
                    var productPrice=data[i]["productPrice"]
                    html+=`<tr>
                                <td>${id}</td>
                                <td>${productName}</td>
                                <td>${productDate}</td>
                                <td>${productSum}</td>
                                <td>${productDesc}</td>
                                <td>${productPrice}</td>
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
