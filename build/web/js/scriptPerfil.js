/*var app = new Vue ({ 
  el: '#main-wrapper' , 
  data: { 
    prod: ''
   },
   methods: {
       uploadImg: function(){
           var img = $("#imgPerfil").val();
           alert(img);
           axios.post('us',{params:{'opc':1,'img':img}}).then(response => {
           });
       }
   }
}); */
$(document).ready(function () {
    ImgPerfil();
});
function ImgPerfil(){
    var idu = $("#idu").val();
    $.get("us", {"idu": idu, "opc": 2}, function (data) {
        var x = JSON.parse(data);
        $("#imgP").attr("src",x);
    });
}

