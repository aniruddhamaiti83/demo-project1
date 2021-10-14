<%@ page language="java" contentType="text/html5; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html5>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>Welcome</h1>
  
  <form action="addFLight">
    <input type="text" name="flightId"><br>
    <input type="text" name="source"><br>
    <input type="text" name="destination"><br>
    <input type="text" name="arrival"><br>
    <input type="text" name="departure"><br>
    <input type="submit"><br>
  
  </form>
  
  <hr>
  
  <form action="getFLight">
    <input type="text" name="flightId"><br>
     <input type="submit"><br>
  </form>

</body>
</html>