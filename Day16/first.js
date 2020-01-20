console.log("Hello World");

var name="ehsan"
var name="syed"
console.log("Name: "+name);

//Problems with var keyword
//1. Same variable can be declared more than one time
//2. the scope of var keyword is function scope not block scope
//3. JavaScript uses hoisting
function test(){
  for (var index = 0; index < 5; index++) {
    console.log("Index: "+index);
    var name='ali'
  }
  console.log('Value of Index: '+index)
  console.log('Name: '+name)
}

function test(){
  var name='Krissy'
  {
    var name='Sallu'
  }
  console.log('Name: '+name)
}

let name2='virat'
//ERROR
//let name='dhoni'
console.log("Name: "+name2)

for (let index = 0; index < 5; index++) {
  console.log("Index: "+index)
}
//ERROR
//console.log("Index: "+index)

const name3='dabba'
//ERROR
//name3='dhakkan'

const sum=function(a,b){
  return a+b;
}
console.log('Sum : '+sum(2,3))

let num=5;
console.log(typeof num)








