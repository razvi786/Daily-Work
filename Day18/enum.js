var Gender;
(function (Gender) {
    Gender[Gender["Male"] = 0] = "Male";
    Gender[Gender["Female"] = 1] = "Female";
})(Gender || (Gender = {}));
var Direction;
(function (Direction) {
    Direction[Direction["NORTH"] = 0] = "NORTH";
    Direction[Direction["SOUTH"] = 1] = "SOUTH";
    Direction[Direction["EAST"] = 2] = "EAST";
    Direction[Direction["WEST"] = 3] = "WEST";
})(Direction || (Direction = {}));
var Direction2;
(function (Direction2) {
    Direction2[Direction2["NORTH"] = 0] = "NORTH";
    Direction2[Direction2["SOUTH"] = 4] = "SOUTH";
    Direction2[Direction2["EAST"] = 5] = "EAST";
    Direction2[Direction2["WEST"] = 6] = "WEST";
})(Direction2 || (Direction2 = {}));
console.log(Gender[0]);
console.log(Direction[2]);
console.log(Direction2);
