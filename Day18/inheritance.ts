class Father{
  occupation:string;
  constructor(occupation:string){
    this.occupation=occupation;
  }
  display_father(){
    console.log('Occupation of Father is : '+this.occupation);
  }
}

class Son extends Father{
  school:string;
  constructor(foccupation:string,school:string){
    super(foccupation);
    this.school=school;
  }
  display_son(){
    console.log('School of Son is : '+this.school);
  }
}

class Daughter extends Father{
  college:String;
  constructor(foccupation:string,college:string){
    super(foccupation);
    this.college=college;
  }
  display_daughter(){
    console.log('College of Daughter is : '+this.college);
  }
}

var son=new Son('CEO of Company','M.S. Junior');
son.display_father();
son.display_son();

var daughter=new Daughter('Trainer','Deccan College');
daughter.display_father();
daughter.display_daughter();

interface Company{
  display_company();
}
class NewCompany implements Company{
  cname:string;
  constructor(cname:string){
    this.cname=cname;
  }
  display_company(){
    console.log('Company name is: '+this.cname);
  }
}

var cts=new NewCompany('CTS');
cts.display_company();

class Actor{
  static profession:string;
  name:string;
  constructor(name:string){
    this.name=name
  }
  display(){
    console.log('Profession of '+this.name+' is: '+Actor.profession);
  }
}

var srk=new Actor('Shahrukh Khan')
Actor.profession='Hero'
srk.display()
var arijit=new Actor('Arijit Singh')
Actor.profession='Singer'
arijit.display()
srk.display()