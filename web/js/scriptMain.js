var app = new Vue ({ 
  el: '#main-wrapper' ,
  created: function() {
      this.getDatos();
      this.toastBienvenida();
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
           });
       },
       toastBienvenida: function(){
         $.toast({
            heading: 'Bienvenido <b>'+$("#nomCom").text()+'</b>',
            text: 'Le deseamos un buen dia',
            position: { left : 'auto', right : 40, top : 50, bottom : 'auto' },
            loaderBg: '#f33c49',
            icon: 'info',
            hideAfter: 2500,
            stack: 10,
            loader: false
        });   
        }
   }
});

