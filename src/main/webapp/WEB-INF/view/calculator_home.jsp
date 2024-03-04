<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<link href="/css/cssCalc.css" rel="stylesheet"/>
</head>
<body class="bg-info" >

<h1 class="display-3 text-center">CALCULATOR</h1>

<div class="container calcLayout"style="height:450px;width:310px;border:1px solid black">
<input id="display" value="${data}" type="text" class="display mt-2" readonly/>

<div class="buttons mt-3">
<div class="row">
<button value="AC" class="col-5 ac" onclick="allClear()">AC</button>
<button value="DEL" class="col del" onclick="del()">DEL</button>
<button value="/" class="col" onclick="getOperator('/')">/</button>
</div>

<div class="row">
<button value="7" class="col but" onclick="getNumber(7)">7</button>
<button value="8" class="col but" onclick="getNumber(8)">8</button>
<button value="9" class="col but" onclick="getNumber(9)">9</button>
<button value="*" class="col but" onclick="getOperator('*')">*</button>
</div>

<div class="row">
<button value="4" class="col but" onclick="getNumber(4)">4</button>
<button value="5" class="col but" onclick="getNumber(5)">5</button>
<button value="6" class="col but" onclick="getNumber(6)">6</button>
<button value="-" class="col but" onclick="getOperator('-')">-</button>
</div>

<div class="row">
<button value="1" class="col but" onclick="getNumber(1)">1</button>
<button value="2" class="col but" onclick="getNumber(2)">2</button>
<button value="3" class="col but" onclick="getNumber(3)">3</button>
<button value="+" class="col but" onclick="getOperator('+')">+</button>
</div>

<div class="row">
<button value="." class="col but" onclick="getNumber('.')">.</button>
<button value="0" class="col but" onclick="getNumber(0)">0</button>
<button value="="  type="submit" form="sendForm" class="col-5 equal" onclick="getEqual()">=</button>
</div>
</div>
</div>
<form id="sendForm" action="success">
<input type="hidden" id="storeFirstNum" name="firstnum"/>
<input type="hidden" id="storeSecondNum" name="secondnum"/>
<input type="hidden" id="operation" name="op"/>
<input type="hidden" id="storeRes" name="result"/>
</form>

<script src="/js/calcJS.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>