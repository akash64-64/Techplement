/**
 * 
 */

var display=document.getElementById("display");
var Res=document.getElementById("storeRes");
var numone=document.getElementById("storeFirstNum");
var numtwo=document.getElementById("storeSecondNum");
var action=document.getElementById("operation");

var firstNum;
var secondNum;
var result=0;
var step=0;
var firstNumArray=[];
var secondNumArray=[];
var operation

function getNumber(num){
if(step===0 || step===1){
	firstNumArray.push(num);
	step=1;
	firstNum= Number(firstNumArray.join(''));
	display.value=firstNum;
}else if(step===2){
	secondNumArray.push(num);
	secondNum=Number(secondNumArray.join(''));
	display.value=secondNum;
}
}

function getOperator(op){
step=2;
operation =op;	
}

function allClear(){
	display.value=" ";
	step=0;
	result=0;
	firstNum=null;
	secondNum=null;
	firstNumArray=[];
	secondNumArray=[];
}
function del(){
	if(step===1){
	display.value=display.value.slice(0,-1);
	firstNumArray.pop();
	}
}

function getEqual(){
	if(operation==='+'){
		result= firstNum+secondNum;
		display.value=result;
		numone.value=firstNum;
		numtwo.value=secondNum;
		action.value=operation;
		Res.value=result;
	}else if(operation==='-'){
		result=firstNum-secondNum;
		display.value=result;
		numone.value=firstNum;
		numtwo.value=secondNum;
		action.value=operation;
		Res.value=result;
	}else if(operation==='*'){
		result=firstNum*secondNum;
		display.value=result;
		numone.value=firstNum;
		numtwo.value=secondNum;
		action.value=operation;
		Res.value=result;
	}else if(operation==='/'){
		result=firstNum/secondNum;
		display.value=result;
		numone.value=firstNum;
		numtwo.value=secondNum;
		action.value=operation;
		Res.value=result;
	}
	
	
}