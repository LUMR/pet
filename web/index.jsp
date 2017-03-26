<%--
  Created by IntelliJ IDEA.
  User: fsweb
  Date: 17-3-24
  Time: 下午4:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>宠物信息</title>
    <link rel="stylesheet" href="style/css.css">
    <script src="js/js.js"></script>
</head>
<body>
<div id="content">
    <div id="select">
        <p>品种&nbsp;
            <select id="breed" name="breed" onclick="select()" onchange="change()">
                <option value="null" selected>--请选择--</option>
            </select>&nbsp;&nbsp;
            <a href="/addPet.jsp">新增宠物</a>
        </p>
    </div>

    <div>
        <table>
            <tr>
                <th>宠物昵称</th>
                <th>出生日期</th>
                <th>性别</th>
            </tr>
        </table>
        <table id="detail"></table>
    </div>

</div>
</body>
</html>
