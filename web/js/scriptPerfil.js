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
    DatosUser();
});
var user;
function DatosUser(){
    var idu = $("#idu").val();
    $.get("us", {"idu": idu, "opc": 3}, function (data) {
        var x = JSON.parse(data);
        $("#imgP").attr("src",x.URLImg);
        $("#email").text(x.email);
        $("#cel").text(x.celular);
        $("#dir").text(x.direccion);
        $("#us").text(x.user);
        $("#nom").val(x.nombre);
        $("#ape").val(x.apellidos);
        $("#ema").val(x.email);
        $("#celu").val(x.celular);
        $("#dire").val(x.direccion);
        $("#dni").val(x.DNI);
        $("#user").val(x.user);
        $("#passw").val(x.pass);
        user=x.user;        
    });
}
$("#user").keyup(function(){
    var use = $("#user").val();
    if(use!==user){
        if(use.length<5){
            $("#inU").addClass("has-danger");
            $("#message").text("el usuario debe contener almenos 5 letras.");
            $("#message").css("display","block");
            $("#btn-go").attr("disabled",true);
        }else{
            $.get("us", {"user": $("#user").val(), "opc": 4}, function (data) {
            if(data!=="null"){
            $("#inU").addClass("has-danger");
            $("#message").text("ya existe un usuario con este nombre.");
            $("#message").css("display","block");
            $("#btn-go").attr("disabled",true);
        }else{
            $("#inU").removeClass("has-danger");
            $("#inU").addClass("has-success");
            $("#message").text("disponible.");
            $("#message").css("display","block");
            $("#btn-go").attr("disabled",false);
        }
        });
        }
    }else{
        $("#inU").removeClass("has-success");
        $("#inU").removeClass("has-danger");
        $("#message").css("display","none");
        $("#btn-go").attr("disabled",false);
    }
});

