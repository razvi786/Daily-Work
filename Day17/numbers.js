var n=12
console.log(n)

var num=new Number(n)
console.log(num);

var str="hello"
console.log(Number.isNaN(NaN));
console.log(isNaN("hello"));
console.log(Number.isFinite(n));
console.log(Number.isInteger(n));
var float_num=Number.parseFloat(n);
float_num+=0.5
n+=0.5
console.log(float_num);
console.log(n);

var n1=4.5
console.log(n1);
console.log(Number.parseInt(n1));




num=123.456

console.log(num.toExponential(4));
console.log(num.toFixed());
console.log(num.toLocaleString());
console.log(num.toPrecision(5));

console.log(0x011);
console.log(011);
console.log(0b010);

num=10
console.log(num.toString(16));

var obj_n=new Number(15)
console.log(obj_n);
console.log(obj_n.valueOf());