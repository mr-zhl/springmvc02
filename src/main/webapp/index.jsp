<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="zh">
<body>
<%--post请求会有乱码--%>
<form action="${pageContext.request.contextPath}/dog/form2.do" method="post">
    <input type="text" placeholder="小狗的昵称" name="name">
    <input type="number" placeholder="小狗的年龄" name="age">
    <input type="submit">
</form>
</body>
</html>
