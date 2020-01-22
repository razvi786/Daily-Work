var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Father = /** @class */ (function () {
    function Father(occupation) {
        this.occupation = occupation;
    }
    Father.prototype.display_father = function () {
        console.log('Occupation of Father is : ' + this.occupation);
    };
    return Father;
}());
var Son = /** @class */ (function (_super) {
    __extends(Son, _super);
    function Son(foccupation, school) {
        var _this = _super.call(this, foccupation) || this;
        _this.school = school;
        return _this;
    }
    Son.prototype.display_son = function () {
        console.log('School of Son is : ' + this.school);
    };
    return Son;
}(Father));
var Daughter = /** @class */ (function (_super) {
    __extends(Daughter, _super);
    function Daughter(foccupation, college) {
        var _this = _super.call(this, foccupation) || this;
        _this.college = college;
        return _this;
    }
    Daughter.prototype.display_daughter = function () {
        console.log('College of Daughter is : ' + this.college);
    };
    return Daughter;
}(Father));
var son = new Son('CEO of Company', 'M.S. Junior');
son.display_father();
son.display_son();
var daughter = new Daughter('Trainer', 'Deccan College');
daughter.display_father();
daughter.display_daughter();
var NewCompany = /** @class */ (function () {
    function NewCompany(cname) {
        this.cname = cname;
    }
    NewCompany.prototype.display_company = function () {
        console.log('Company name is: ' + this.cname);
    };
    return NewCompany;
}());
var cts = new NewCompany('CTS');
cts.display_company();
var Actor = /** @class */ (function () {
    function Actor(name) {
        this.name = name;
    }
    Actor.prototype.display = function () {
        console.log('Profession of ' + this.name + ' is: ' + Actor.profession);
    };
    return Actor;
}());
var srk = new Actor('Shahrukh Khan');
Actor.profession = 'Hero';
srk.display();
var arijit = new Actor('Arijit Singh');
Actor.profession = 'Singer';
arijit.display();
srk.display();
