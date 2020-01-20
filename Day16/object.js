var ehsan={
  firstname: 'Syed ',
  lastname: 'Razvi',
  middlename: function(){
    return 'Ehsan Ali'
  },
  marks:[1,2,3,4,5],
  company:{
    companyname:'Cognizant',
    salary:function(){
      return 21600;
    },
    locations:['Chennai','Hyderabad','Bangalore','Coimbatore'],
    faculty:{
      facultyname:'Pankaj',
      timing: [9.00,6.00]
    }
  }
};
console.log(ehsan.firstname);
console.log(ehsan.middlename());
console.log(ehsan.lastname);
console.log(ehsan.marks[3]);
console.log(ehsan.company.companyname);
console.log(ehsan.company.salary());
console.log(ehsan.company.locations[1]);
console.log(ehsan.company.faculty.facultyname);
console.log(ehsan.company.faculty.timing[1]);

var car=new Object();
car["make"]="Ford"
car.model=2009
car.year=2020

var propertyname="color";
car[propertyname]="blue";
car.propertyname="yellow";

console.log(car.make);
console.log(car["model"]);
console.log(car.year)
console.log(car.color)
console.log(car.propertyname)

function Animal(){
  this.name="tiger"
  this.type="carnivores"
  this.fav_food=function(){
    return "Snakes"
  }
}

var tiger=new Animal();
tiger.dangerous=true;
console.log(tiger.name);
console.log(tiger.type);
console.log(tiger.dangerous);
console.log(tiger.fav_food());

console.log('Assign Object:');
var assign_demo=Object.assign(tiger,car);
for (const key in assign_demo) {
  console.log(key+':'+assign_demo[key]);
}


var roles={
  type:'Admin',
  displayType:function(){
    console.log(this.type);
  }
}

//role for admin creation
var admin_role=Object.create(roles);
admin_role.displayType();

//role for guest creation
var guest_role=Object.create(roles);
guest_role.type='Guest'
guest_role.displayType();

var obj={a:5,b:10}
delete obj.a
console.log("a" in obj);
console.log('b' in obj);

//destructuring
var ehsan={
  name: 'ehsan',
  age: 22,
  relationship: 'single'
}

var {name,age,relationship} = ehsan

console.log(name);
console.log(age);
console.log(relationship);

var n=new Number(12);
console.log(n);

var nums=[1,2,3,4,5]
for (let n in nums) {
  console.log(nums[n]);
}

var [a,b,c,d,e] = nums
console.log(a);
console.log(b);
console.log(e);