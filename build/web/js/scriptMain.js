$(document).ready(function(){
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
}

