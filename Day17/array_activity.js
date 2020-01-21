var arr=new Array(10)

//Taking Random 2 digit numbers into array
for(let i=0;i<10;i++){
  arr[i]=Math.floor(Math.random()*100)
}

//displaying array
console.log('Array: '+arr);

//Filtering to only multiples of 2 and 5

//Using Normal Function
// function isDivisible(element, index, array) { 
//   if(element%2==0||element%5==0){
//     return element
//   } 
// } 

//Using Arrow Function
var filtered=arr.filter((x)=>x%2==0&&x%5==0)

//displaying array
console.log('Filtered: '+filtered);

//Incrementing each element by 10%

//Using Normal Function
// function increased(element){
//   return element*1.1
// }

//Using Arrow Function
var mapped=arr.map((x)=>Math.floor(x*1.1))

//displaying array
console.log('Mapped: '+mapped);