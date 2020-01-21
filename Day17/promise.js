// var promise=new Promise(function(resolve,reject){
//   setTimeout(resolve,5000)
// })
// promise.then(function(){
//   console.log('This is done');
// })



// var asyncFunc=function(){
//   return new Promise(function(resolve,reject){
//     console.log('Promise Execution Started');
//     setTimeout(resolve,5000)
//   })
// }
// asyncFunc()
//   .then(asyncFunc)
//   .then(asyncFunc)




// const myProm=new Promise((resolve,reject)=>{
//   if(Math.random()*100<=90){
//     resolve('Hello, Promises!')
//   }
//   reject(new Error('I will fail in 10% cases'))
// })

// const onResolved=(x)=>console.log(x);
// const onRejected=(x)=>console.log(x);

// myProm.then(onResolved,onRejected)

// console.log('This is the main thread statement');





var fs = require('fs');
let sampletext = "This is the sample text that will go in the file.";
new Promise((resolve, reject) => {
    fs.mkdir('Hello', function (err) {
        if (err) {
            console.error("Error in creating directory!");
        } else {
            console.log('The Directory Hello is created!!');
        }
    })
 resolve();
})
    .then(() => {
        fs.writeFile('.//hello//write.txt', sampletext, function (err) {
            if (err) {
                console.error("Error in writing the file!");
            } else {
                console.log('The data is written in the file!');
            }
        })
    })
    .catch(() => {
        console.log('The Data is Not Written');
    })
    .then(() => {
        fs.readFile('.//hello//write.txt', 'utf8', function (err, data) {
            if (err) {
                console.log("Error in reading file!");
            } else {
                console.log(data);
                fs.unlink('.//hello//write.txt', function (err) {
                    if (err) {
                        console.error("Error deleting file!");
                    }
                    else {
                        fs.rmdir('hello', function () { });
                        console.log('The Directory is deleted Successfully');
                    }
                });
            }
        })
    })