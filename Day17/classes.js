class Name{
  constructor(first,last){
    this.first=first;
    this.last=last;
  }
  display(){
    return this.first+" "+this.last;
  }
}
let ehsan=new Name('Syed','Razvi')
ehsan.middle=' Ehsan';
console.log(ehsan.display()+ehsan.middle);

let box=class{
  constructor(h,w){
    this.h=h
    this.w=w
  }
}
box.h=10
box.w=20
console.log(box.h+" "+box.w);

class Company{
  static meth(){
    console.log('I am Superman');
  }
  static meth2(){
    console.log('I am not Superman');
    this.meth()
  }
}

Company.meth2()

console.log(ehsan instanceof Name);

class MyKid extends Name{
  constructor(fn,ln,kidname){
    super(fn,ln)
    this.kidname=kidname;
  }
  display(){
    console.log(this.first+" "+this.last+" Mubarak for "+this.kidname);
  }
}

var kid=new MyKid('Syed','Razvi','Hyder')
kid.display()





class Character{
  exposed(){
    console.log('I am Good');
  }
  
}

class Selfish extends Character{
  exposed(){
    console.log('I am Selfish');
  }
}

var character=new Selfish();
character.exposed()


