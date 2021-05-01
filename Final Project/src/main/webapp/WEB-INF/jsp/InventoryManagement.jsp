<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Midterm Website</title>
<link rel="stylesheet" href="welcomestyle.css">
</head>
<body>

<table style="width:100%">
    <tr>
        <th>ID</th>
        <th>Image</th>
        <th>Name</th>
        <th>Quantity</th>
        <th>Remove</th>
        <th>Edit</th>
    </tr>

    <c:forEach var = "iter" items = "${flowers}">
        <tr>
            <td>${iter.getId()}</td>
            <td><img src="${iter.getImg()}" alt="${iter.getImg()}" width="250" height="250"></td>
            <td>${iter.getName()}</td>
            <td>${iter.getQuantity()}</td>
            <td>
                <form action = "/Remove">
                                    <input type="hidden" name = "id" value="${iter.getId()}"/>
                                    <button type="submit" value="Remove">
                                        Remove
                                    </button>
                                </form>
            </td>
            <td>
                <form action = "/Edit">
                    <input type="hidden" name = "id" value="${iter.getId()}"/>
                    <button type="submit" value="Edit"/>
                    Edit
                </form>
            </td>
        </tr>
    </c:forEach>
</table>

<form action = "/New">
    <button type = "submit" value="New Flower"/>
    Create New Flower
</form>

</body>
</html>