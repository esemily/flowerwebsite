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
            <form action = "/Create">
            <td><input type="text" name = "id" value="${flower.getImg()}"></td>
            <td><input type="text" name = "img" value="${flower.getImg()}"></td>
            <td><input type="text" name = "name" value="${flower.getName()}"></td>
            <td><input type="text" name = "quantity" value="${flower.getQuantity()}"></td>
            <td><input type="submit" value="Submit"></td>
            </form>
        </tr>
</table>

</body>
</html>