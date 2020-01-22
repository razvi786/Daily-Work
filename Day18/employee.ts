export class Employee{
  id:number;
  name:string;
  phone:number;
  age:number;
  address:string;
  salary:number;
  dob:Date;
  constructor(id:number,name:string,phone:number,age:number,address:string,salary:number,dob:Date){
    this.id=id;
    this.name=name;
    this.phone=phone;
    this.age=age;
    this.address=address;
    this.salary=salary;
    this.dob=dob;
  }
}

var emp=new Employee(1,'Syed',12345,22,'Hyderabad',50000,new Date());
console.log(emp);
