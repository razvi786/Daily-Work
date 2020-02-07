function store(){
  
  let gift_card={

    "id":"101",

    "amount":
    {
      "rs":"500",
      "ps":"50"
    },

    "recipient_name":
    {
      "first":"ehsan",
      "last":"razvi"
    },

    "address":
    {
      "street":"yakutpura",
      "city":"hyd",
      "state":"telangana",
      "country":"india",
      "pin":"500023"
    },

    "buyer_name":
    {
    "first":"shahrukh",
    "last":"khan"
    },

    "phone":
    {
      "code":"+91",
      "number":"6304973550"
    },

    "email":"ehsan.razvi786@gmail.com"

  }

  if(localStorage.getItem("gift_card")==null){
  
    var all_gift_cards=[];

  }else{

    var all_gift_cards=JSON.parse(localStorage.gift_card);

  }
    
    all_gift_cards.push(gift_card)

    localStorage.setItem("gift_card",JSON.stringify(all_gift_cards))

}

function get(){

  var gift_cards=JSON.parse(localStorage.gift_card)
  console.log(gift_cards);
  var tbody=document.getElementById("gift_cards")
  var df=document.createDocumentFragment();
  for(let i=0;i<gift_cards.length;i++){
    var tr=document.createElement('tr')

    var id=document.createElement('td')
    id.textContent=i+1
    tr.appendChild(id)

    var buyers_name=document.createElement('td')
    buyers_name.textContent=gift_cards[i].buyer_name.first+" "+gift_cards[i].buyer_name.last;
    tr.appendChild(buyers_name)

    var address=document.createElement('td')
    let shipping_address=gift_cards[i].address.street+", "+
      gift_cards[i].address.city+", "+
      gift_cards[i].address.state+", "+
      gift_cards[i].address.country+"-"+
      gift_cards[i].address.pin+".";
    address.textContent=shipping_address
    tr.appendChild(address)

    var amount=document.createElement('td')
    let total_amount=gift_cards[i].amount.rs+"."+
    gift_cards[i].amount.ps;
    amount.textContent=total_amount
    tr.appendChild(amount)

    var phone=document.createElement('td')
    let full_number=gift_cards[i].phone.code+" "+
    gift_cards[i].phone.number;
    phone.textContent=full_number
    tr.appendChild(phone)

    df.appendChild(tr)

  }

  tbody.appendChild(df)
  
}

function validate(){
  var name=document.getElementById("fname");
  var value=new String(name.value);
  var div=document.getElementById('fname_iv')
    if(value.match("[0-9]")){
      div.style.display='block';
    }else{
      div.style.display='none';
    }
}

(function() {
  'use strict';
  window.addEventListener('load', function() {
  // Fetch all the forms we want to apply custom Bootstrap validation styles to
  var forms = document.getElementsByClassName('needs-validation');
  // Loop over them and prevent submission
  var validation = Array.prototype.filter.call(forms, function(form) {
  form.addEventListener('submit', function(event) {
  if (form.checkValidity() === false) {
  event.preventDefault();
  event.stopPropagation();
  }
  form.classList.add('was-validated');
  }, false);
  });
  }, false);
  })();