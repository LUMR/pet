<%--
  Created by IntelliJ IDEA.
  User: lumr
  Date: 2017/3/26
  Time: 下午10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加宠物</title>
    <script src="js/js.js"></script>
    <link rel="stylesheet" href="style/css.css">
</head>
<body>
<div id="content">
    <form action="/addPet" method="post">
        <table>
            <tr>
                <th>昵称：</th>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <th>品种</th>
                <td><select name="breed" id="breed" onclick="select()">
                    <option value="null">--请选择--</option>
                </select></td>
            </tr>
            <tr>
                <th>性别</th>
                <td>
                    <label><input type="radio" name="sex" value="雄">雄</label>
                    <label><input type="radio" name="sex" value="雌性">雌</label>
                </td>
            </tr>
            <tr>
                <th>出生日期：</th>
                <td><input type="date" name="birthday"></td>
            </tr>
            <tr>
                <th>宠物描述</th>
                <td><textarea name="description"></textarea></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交">&nbsp;<input type="reset" value="重置"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
