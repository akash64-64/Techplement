<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body class="bg-primary">
<div class="container">
<h1 class="display3 text-white text-center">Log in</h1>
</div>
<div class="container border border-white" style="width:400px;height:300px;background-color:white">
<form action="login">
<label class="form-label">Username</label>
<input type="text" class="form-control" name="uname"/>
<label class="form-label">Password</label>
<input type="password" class="form-control" name="pwd"/>
<button type="submit" class="form-control btn btn-success mt-4">Log in</button>
</form>
</div>

</body>
</html>