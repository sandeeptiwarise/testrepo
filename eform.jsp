<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
  <title>Spring MVC MulitLingual App</title>
</head>
<body>

Language : <a href="?language=en_US">English</a>|<a href="?language=hi_IN">Hindi</a>
  <h2><spring:message code="lbl.userPage" text="Default Value" /></h2>

  <table border="1">
    <tr>
      <th><spring:message code="lbl.userId" text="Default Value" /></th>
      <th><spring:message code="lbl.userfirstName" text="Default Value" /></th>
      <th><spring:message code="lbl.userlastName" text="Default Value" /></th>
    </tr>
  </table>
   <br/>

   Current Locale : ${ pageContext.response.locale}


</body>
</html>






