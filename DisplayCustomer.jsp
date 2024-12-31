<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="sql" %>
<sql:setDataSource var="dataSource"
      driver="com.mysql.cj.jdbc.Driver"
      uri="jdbc:mysql://localhost:3306/java16"
      user="root" password="root"/>
<body>
    <sql:query var="customer" dataSource="${dataSource}">
        select * from Customer
    </sql:query>
    <table border>
        <tr>
            <th>Customer Name</th>
            <th>Username</th>
            <th>Password</th>
            <th>Age</th>
            <th>Email</th>
        </tr>    
        <c:forEach var="customer" item="${customer.rows}">
            <tr>
                <td><c:out value="${customer.custName}"/></td>
                <td><c:out value="${customer.userName}"/></td>
                <td><c:out value="${customer.password}"/></td>
                <td><c:out value="${customer.age}"/></td>
                <td><c:out value="${customer.email}"/></td>
            </tr>
        </c:forEach>    
    </table>
</body>