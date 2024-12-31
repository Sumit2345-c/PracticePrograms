<jsp:useBean id="book" class="mypack.Book" scope="session"/>
<table border>
    <tr>
        <th>Book Num</th>
        <td><jsp:getProperty name"book" property="bno"/></td>
    </tr>
        <th>Book Name</th>
        <td><jsp:getproperty name="book" property="bname"/></td>
    <tr>
        <th>Book Price</th>
        <td><jsp:getProperty name="book" property="price"/></td>
    </tr>
</table>