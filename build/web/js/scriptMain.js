/*$(document).ready(function(){
        NroProd();
        NroVent();
        NroUser();
});
function NroProd(){
    $.get("pr",{"opc":1},function (data) {
       var x = JSON.parse(data);
        $("#NroProd").text(x.NroProd);
    });
}
function NroVent(){
    $.get("vn",{"opc":1},function (data) {
       var x = JSON.parse(data);
        $("#NroVentas").text(x.RepNroVenta);
    });
}
function NroUser(){
    $.get("prs",{"opc":1},function (data) {
       var x = JSON.parse(data);
        $("#NroUsers").text(x.NroUser);
    });
} */

var app = new Vue ({ 
  el: '#main-wrapper' ,
  created: function() {
      this.getDatos();
  }, 
  data: { 
    prod: '', usu: '', ven: ''
   },
   methods: {
       getDatos: function(){
           axios.get('mn',{params:{'opc':1}}).then(response => {
               this.prod = response.data.prod;
               this.usu = response.data.usu;
               this.ven = response.data.ven;
               //console.log(response)
           });
       }
   }
});

