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
        <th>Image Link</th>
        <th>Name</th>
        <th>Quantity</th>
        <th>Save Changes</th>
    </tr>

        <tr>
            <td>${flower.getId()}</td>
            <form action = "/Edited">
                        <input type="hidden" name = "id" value="${Id}">
                        <td><input type="text" name = "img" value="${Img}"></td>
                        <td><input type="text" name = "name" value="${Name}"></td>
                        <td><input type="text" name = "quantity" value="${Quantity}"></td>
                        <td><input type="submit" value="Submit"></td>
            </form>
        </tr>
</table>

</body>
</html>