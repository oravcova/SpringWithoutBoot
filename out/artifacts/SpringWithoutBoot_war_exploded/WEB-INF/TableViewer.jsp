<%--
  Created by IntelliJ IDEA.
  User: janor
  Date: 26/08/2019
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="resources/css/style.css" type="text/css" />
    <title>TableViewer</title>
</head>
<body>
<table>
    <tr>
        <th>alpha</th>
        <th>morse</th>
    </tr>
    <c:forEach var="letter" begin="0" end="25">
        <tr>
            <td>${alphas[letter]}</td>
            <td>${morse[letter]}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
