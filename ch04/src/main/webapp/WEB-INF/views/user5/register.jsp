<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>user5::register</title>
</head>
<body>
    <h3>user5 목록</h3>

    <a href="/ch04">메인</a>
    <a href="/ch04/user5/list">목록</a>
        <table border="1">
        <form action="/ch04/user5/register" method="post">
            <tr>
                <td>번호</td>
                <td><input type="text" name="seq"></td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>성별</td>
                <td><input type="text" name="gender"></td>
            </tr>
            <tr>
                <td>나이</td>
                <td><input type="number" name="age"></td>
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
