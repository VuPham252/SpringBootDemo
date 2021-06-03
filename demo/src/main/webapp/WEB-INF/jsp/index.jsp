<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    aslejfljsaefhseafsekhjf
<table>
    <thead>
        <td>Username</td>
        <td>pass</td>
        <td>email</td>
        <td></td>

    </thead>
    <c:forEach items="${test}" var="account">
        
        <tr>      
            <td>${account.getUsername()}</td>
            <td>${account.pass}</td>
            <td>${account.email}</td>
            <td><a href="/account/index/changeform">change info</a></td>
       
        </tr>
    </c:forEach>
</table>
    
    
    <p>${user}</p>
    <A HREF="/student/hello">View hello</A>
</body>
</html>