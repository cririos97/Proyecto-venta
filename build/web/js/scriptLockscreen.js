$(document).ready(function () {
            ImgPerfil();
});
function ImgPerfil(){
    var idu = $("#idu").val();
    $.get("us", {"idu": idu, "opc": 2}, function (data) {
        var x = JSON.parse(data);
        $("#imgU").attr("src",x);
    });
}
$("#btn").click(function(){
    $.get("us", {"idu": $("#idu").val(),"pass":$("#pass").val(), "opc": 7}, function (data) {
        var x = JSON.parse(data);
        if(x===1){
            $(location).attr('href',''+sessionStorage.getItem("URL")+'');
        }
        else{
            swal({
              title: 'Password invalida!',
              type: 'warning',
              showConfirmButton: false,
              timer: 1700
            });
        }
    }); 
});




