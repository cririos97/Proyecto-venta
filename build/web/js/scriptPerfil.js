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
        Actividades();
    });
}
function Actividades(){
    $.get("us", {"idu": $("#idu").val(), "opc": 6}, function (data) {
        var x =JSON.parse(data);
        $("#act").children("div").remove();
        for (var i = 0; i < x.length; i++) {
            $("#act").append("<div class='sl-right'><div><span><b>"+x[i].date+" - </b></span><label class='link'>"+x[i].evento+" </label> <span class='sl-date'> "+x[i].time+"</span></div></div>");
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
            $("#message").text("disponible");
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
$("#btn-go").click(function(){
        $.post("us",{"idu": $("#idu").val(),"user":$("#user").val(),"pass":$("#passw").val(),"dire": $("#dire").val() ,
        "ema": $("#ema").val(),"cel": $("#celu").val(),"opc": 5}, function (data) {
        if(data==="1"){
            $.toast({
          //  heading: 'Perfil actualizado',
            text: 'Perfil actualizado',
            position: 'top-right',
            icon: 'success',
            hideAfter: 3000,
            stack: 6,
            loader: false,
            showHideTransition: 'slide'
        });
        DatosUser();
        }
        else{if(data==="2"){
            $(location).attr('href','lgt');
        }
    }
    });
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

