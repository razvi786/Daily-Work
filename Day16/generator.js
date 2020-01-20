"use strict"
function* color(){
  yield "orange"
  yield "yellow"
  yield "blue"
}
for (let iterator of color()) {
  console.log(iterator)
}

function* ask(){
  const name=yield "what is your name?";
  const sport=yield "which sport you like?";
  return `${name}'s favorite sport is ${sport}`;
}

const iterator=ask();
console.log(iterator.next())
console.log(iterator.next('Syed'))
console.log(iterator.next('Cricket'))