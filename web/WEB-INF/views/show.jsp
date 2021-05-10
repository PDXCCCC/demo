<%--
  Created by IntelliJ IDEA.
  User: lch
  Date: 2021/3/31
  Time: 17:23
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
            url: "/emp/query",
            dataType: "JSON",
            type: "GET",
            success: function (data) {
                console.log(data)
                var html = ``;
                for (var i = 0;i<data.length;i++){
                    var gender=data[i]["gender"]
                    var emp_name=data[i]["emp_name"]
                    var d_id=data[i]["d_id"]
                    var email=data[i]["email"]
                    var emp_id=data[i]["emp_id"]
                    html+=`<tr>
                                <td>${gender}</td>
                                <td>${emp_name}</td>
                                <td>${d_id}</td>
                                <td>${email}</td>
                                <td>${emp_id}</td>>
                            </tr>`;
                    // html+="<tr>\n" +
                    //     "        <td>"+data[i]["gender"]+"</td>\n" +
                    //     "        <td>"+data[i]["emp_name"]+"</td>\n" +
                    //     "        <td>"+data[i]["d_id"]+"</td>\n" +
                    //     "        <td>"+data[i]["email"]+"</td>\n" +
                    //     "        <td>"+data[i]["emp_id"]+"</td>\n" +
                    //     "    </tr>";
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
