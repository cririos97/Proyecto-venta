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
var pass;
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
        pass=x.pass;
        Actividades();
    });
}
function Actividades(){
    $.get("us", {"idu": $("#idu").val(), "opc": 6}, function (data) {
        var x =JSON.parse(data);
        $("#act").children("div").remove();
        for (var i = 0; i < x.length; i++) {
            $("#act").append("<div class='sl-right'><div><span><b>"+x[i].date+" - </b></span><label class='link'>"+x[i].evento+"<span class='sl-date'> " +x[i].time+"</span> </label></div></div>");
        }
    });
}
$("#user").keyup(function(){
    var use = $("#user").val();
    if(use!==user){
        if(use.length<5){
            $("#inU").addClass("has-danger");
            $("#message").text("el usuario debe tener almenos 5 letras.");
            $("#message").css("display","block");
            $("#btn-go").attr("disabled",true);
            setTimeout("$('#message').css('display','none')", 3000);
        }else{
            $.get("us", {"user": $("#user").val(), "opc": 4}, function (data) {
            if(data!=="null"){
            $("#inU").addClass("has-danger");
            $("#message").text("ya existe un usuario con este nombre.");
            $("#message").css("display","block");
            $("#btn-go").attr("disabled",true);
            setTimeout("$('#message').css('display','none')", 3000);
        }else{
            $("#inU").removeClass("has-danger");
            $("#inU").addClass("has-success");
            $("#message").text("disponible");
            $("#message").css("display","block");
            $("#btn-go").attr("disabled",false);
            setTimeout("$('#message').css('display','none')", 3000);
        }
        });
        }
    }
});
$("#btn-go").click(function(){
        $.post("us",{"idu": $("#idu").val(),"user":$("#user").val(),"pass":$("#passw").val(),"dire": $("#dire").val() ,
        "ema": $("#ema").val(),"cel": $("#celu").val(),"opc": 5}, function (data) {
        if(data==="1"){
        swal({
          title: 'Perfil actualizado',
          type: 'success',
          showConfirmButton: false,
          timer: 2000
        });
        DatosUser();
        $("#btn-go").attr("disabled",true);
        }
        else{if(data==="2"){
            $(location).attr('href','lgt');
        }
    }
    });
});

$("#ema,#celu,#dire,#passw").keyup(function(){
    if($("#dire").val().length<10 || $("#ema").val().length<10 || $("#passw").val().length<6 || $("#celu").val().length<9){
    $("#btn-go").attr("disabled",true);
    }else{
         var pswd = $("#passw").val();
         if(pswd===pass){
             $("#btn-go").attr("disabled",false);
         }else{
            if (pswd.match(/[A-Z]/) && pswd.match(/\d/)) {
             $('#message2').css('display','block');
             setTimeout("$('#message2').css('display','none')", 3000);
             } else {
                $("#btn-go").attr("disabled",true);
             }
         }
    }   
});
function validaNum(e){
    tecla = (document.all) ? e.keyCode : e.which;

    //Tecla de retroceso para borrar, siempre la permite
    if (tecla===8){
        return true;
    }
        
    // Patron de entrada, en este caso solo acepta numeros
    patron =/[0-9]/;
    tecla_final = String.fromCharCode(tecla);
    return patron.test(tecla_final);
}
function validaLet(e){
    tecla = (document.all) ? e.keyCode : e.which;

    //Tecla de retroceso para borrar, siempre la permite
    if (tecla===8){
        return true;
    }
        
    // Patron de entrada, en este caso solo acepta numeros
    patron =/[a-z,A-Z,ñ]/;
    tecla_final = String.fromCharCode(tecla);
    return patron.test(tecla_final);
}
function validaUserPass(e){
    tecla = (document.all) ? e.keyCode : e.which;

    //Tecla de retroceso para borrar, siempre la permite
    if (tecla===8){
        return true;
    }
        
    // Patron de entrada, en este caso solo acepta numeros
    patron =/[a-z,A-Z,ñ,0-9]/;
    tecla_final = String.fromCharCode(tecla);
    return patron.test(tecla_final);
}

