<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user2::register</title>
</head>
<body>
    <h3>user2 등록</h3>
    <a href="/ch05">메인</a>
    <a href="/ch05/user2/list">목록</a>
    <table border="1">
    <form action="/ch05/user2/register" method="post">
            <tr>
                <td>아이디</td>
                <td><input type="text" name="uid"></td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>생년월일</td>
                <td><input type="text" name="birth"></td>
            </tr>
            <tr>
                <td>주소</td>
                <td><input type="text" name="addr"></td>
            </tr>
            <tr>
                <td colspan="2" align="right"><input type="submit" value="등록"></td>
            </tr>
    </form>
    </table>
</body>
</html>
