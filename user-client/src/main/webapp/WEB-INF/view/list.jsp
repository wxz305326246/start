<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/11/15
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="http://apps.bdimg.com/libs/jquery/1.8.3/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css"  href="/static/css/css.css"  />
</head>
<body>
    <table>
        <tr>
            <td>商品编号</td>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>商品上线时间</td>
        </tr>
        <c:forEach items="${slist}" var="s">
            <tr>
                <td>${s.gid}</td>
                <td>${s.gname}</td>
                <td>${s.price}</td>
                <td><fmt:formatDate value="${s.datea}"></fmt:formatDate></td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
