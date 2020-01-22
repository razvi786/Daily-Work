function getArray(items) {
    return new Array().concat(items);
}
var num = getArray([1, 2, 3]);
var str = getArray(['Hi', 'Hello', 'Bye']);
console.log(num);
console.log(str);
//CTE
// let err=getArray<string>(['Hi','Hello','Bye',4]);
