function getArray<T>(items:T[]):T[]{
  return new Array<T>().concat(items);
}

let num=getArray<number>([1,2,3]);
let str=getArray<string>(['Hi','Hello','Bye']);

console.log(num);
console.log(str);

//CTE
// let err=getArray<string>(['Hi','Hello','Bye',4]);