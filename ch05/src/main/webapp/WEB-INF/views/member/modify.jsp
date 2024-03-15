<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>member::modify</title>
</head>
<body>
    <h3>member 수정</h3>
    <a href="/ch05">메인</a>
    <a href="/ch05/member/list">목록</a>
    <table border="1">
    <form action="/ch05/member/modify" method="post">
            <tr>
                <td>아이디</td>
                <td><input type="text" name="uid" readonly value="${memberDTO.uid}"></td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type="text" name="name" value="${memberDTO.name}"></td>
            </tr>
            <tr>
                <td>전화번호</td>
                <td><input type="text" name="hp" value="${memberDTO.hp}"></td>
            </tr>
            <tr>
                <td>직급</td>
                <td><input type="text" name="pos" value="${memberDTO.pos}"></td>
            </tr>
            <tr>
                <td>방번호</td>
                <td><input type="text" name="dep" value="${memberDTO.dep}"></td>
            </tr>
            <tr>
                <td>날짜</td>
                <td><input type="text" name="rdate" value="${memberDTO.rdate}"></td>
            </tr>
            <tr>
                <td colspan="2" align="right"><input type="submit" value="수정"></td>
            </tr>
    </form>
    </table>
</body>
</html>
