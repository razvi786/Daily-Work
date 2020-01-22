function add(s1:string,s2:string):string;

function add(a:number,b:number):number;

function add(s:string,n:number):string;

function add(x:number,y:number,z:number):number

function add(num1:any,num2:any):any{
  return num1+num2;
}

// console.log(add(10,20));
console.log(add(10,80));
console.log(add('Good ','Morning'));
console.log(add('Hello',30));
console.log(add(1,2,3));



// class Add{
//   sum(a:number,b:number):number{
//     return a+b;
//   }
//   sum(a:string,b:string):string{
//     return a+b;
//   }
// }