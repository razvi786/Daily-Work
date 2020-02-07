function store(){
  let id=document.getElementById("myid").value;
  let name=document.getElementById("name").value;
  let info={};
  info.id=id
  info.name=name
  localStorage.setItem("info",JSON.stringify(info));
}

function get(){
  var xhttp = new XMLHttpRequest();
  let url="http://localhost:3000/user/121";
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
      var obj=JSON.parse(this.responseText);
     document.getElementById("myid").innerHTML = obj.id;
    }
  };
  xhttp.open("GET", url, true);
  xhttp.send();
}