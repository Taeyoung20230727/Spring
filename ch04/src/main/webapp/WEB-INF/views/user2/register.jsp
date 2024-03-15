<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>user2::register</title>
</head>
<body>
    <h3>user2 등록</h3>
    <a href="/ch04">Main</a>
    <a href="/ch04/user2/list">목록</a>
    <table border="1">
        <form action="/ch04/user2/modify" method="post">
            <tr>
                <td>아이디</td>
                <td><input type="text" name="uid" value="${user2DTO.uid}"></td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type="text" name="name" value="${user2DTO.name}"></td>
            </tr>
            <tr>
                <td>생년월일</td>
                <td><input type="text" name="birth" value="${user2DTO.birth}"></td>
            </tr>
            <tr>
                <td>주소</td>
                <td><input type="text" name="addr" value="${user2DTO.addr}"></td>
            </tr>
            <tr>
                <td colspan="2" align="right"><input type="submit" value="등록"></td>
            </tr>
        </form>
    </table>
</body>
</html>
