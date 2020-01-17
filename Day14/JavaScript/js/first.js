
var c=document.getElementById("myCanvas");
var ctx=c.getContext("2d");
var grad=ctx.createRadialGradient(75,50,5,90,60,100);
grad.addColorStop(0,"yellow");
grad.addColorStop("0.5","white");
grad.addColorStop(1,"red");
ctx.fillStyle=grad;
ctx.fillRect(20,20,180,180);