<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
</head>
<body>
<center>
    <table border="1">
        <thead>
        <tr>
            <th>用户id</th>
            <th>用户名</th>
            <th>性别</th>
            <th>生日</th>
            <th>地址</th>
        </tr>
        </thead>
        <tbody>
        <#list userList as user>
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.sex}</td>
                <td>${user.birthday}</td>
                <td>${user.address}</td>
            </tr>
        </#list>
        </tbody>
    </table>
</center>

</body>
</html>