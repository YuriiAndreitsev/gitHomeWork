<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@include file="../../includes/header.jsp" %>
<!DOCTYPE html>
<html>
<head>

    <title>Sing In</title>
</head>
<body>
<div>
    <a href="./registration.html" about="Sign Up">Sign Up</a><br>
</div>
<c:choose>

    <c:when test="${sessionScope.user.email==null}">

        <form id="loginForm" action="./login" method="post" align='center'>

            <div class="field" align='center'>
                <label>Enter your email:</label>
                <div class="input"><input type="text" name="email" value="" id="email"/></div>
            </div>

            <div class="field" align='center'>

                <label>Enter your password:</label> <a href="#" id="forgot"><font size='1'>Forgot your password?</font></a>
                <div class="input"><input type="password" name="password" value="" id="password"/></div>
            </div>

            <div class="submit" align='center'>
                <button type="submit">Enter</button>
                <label id="remember"><input name="" type="checkbox" value=""/> Remember me</label>
            </div>
        </form>
    </c:when>

    <c:otherwise>
        ${access}
    </c:otherwise>


</c:choose>

<c:choose>
    <c:when test="${errorMessage!=null}">
        ${errorMessage}
    </c:when>
</c:choose>
</body>
</html>
<%@include file="../../includes/footer.jsp" %>