"use strict";
exports.__esModule = true;
var Employee = /** @class */ (function () {
    function Employee(id, name, phone, age, address, salary, dob) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.dob = dob;
    }
    return Employee;
}());
exports.Employee = Employee;
var emp = new Employee(1, 'Syed', 12345, 22, 'Hyderabad', 50000, new Date());
console.log(emp);
