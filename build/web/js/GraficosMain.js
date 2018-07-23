$( document ).ready(function() {
    $.get("mn",{"opc":2},function (data){
      var x = JSON.parse(data);  
    var ctx1 = document.getElementById("chart2").getContext("2d");
    var data1 = {
        labels: [x[0].x, x[1].x, x[2].x, x[3].x, x[4].x, x[5].x, x[6].x],
        datasets: [
            {
                label: "My First dataset",
                fillColor: "#009efb",
                strokeColor: "#009efb",
                pointColor: "#009efb",
                pointStrokeColor: "#fff",
                pointHighlightFill: "#fff",
                pointHighlightStroke: "#009efb",
                data: [x[0].y, x[1].y, x[2].y, x[3].y, x[4].y, x[5].y, x[6].y]
            }
            
        ]
        
    };
    Chart.types.Line.extend({
      name: "LineAlt",
      initialize: function () {
        Chart.types.Line.prototype.initialize.apply(this, arguments);

        var ctx = this.chart.ctx;
        var originalStroke = ctx.stroke;
        ctx1.stroke = function () {
          ctx1.save();
          ctx1.shadowColor = 'rgba(0, 0, 0, 0.4)';
          ctx1.shadowBlur = 10;
          ctx1.shadowOffsetX = 8;
          ctx1.shadowOffsetY = 8;
          originalStroke.apply(this, arguments);
          ctx1.restore();

        };
      }
    });
    var chart1 = new Chart(ctx1).LineAlt(data1, {
        scaleShowGridLines : true,
        scaleGridLineColor : "rgba(0,0,0,.005)",
        scaleGridLineWidth : 0,
        scaleShowHorizontalLines: true,
        scaleShowVerticalLines: true,
        bezierCurve : true,
        bezierCurveTension : 0.4,
        pointDot : true,
        pointDotRadius : 4,
        pointDotStrokeWidth : 2,
        pointHitDetectionRadius : 2,
        datasetStroke : true,
		tooltipCornerRadius: 2,
        datasetStrokeWidth : 0,
        datasetFill : false,
        legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].strokeColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>",
        responsive: true
    });
    
    var ctx2 = document.getElementById("chart").getContext("2d");
    var data2 = {
        labels: [x[7].x, x[8].x, x[9].x, x[10].x, x[11].x, x[12].x],
        datasets: [
            {
                label: "My Second dataset",
                fillColor: "#55ce63",
                strokeColor: "#55ce63",
                highlightFill: "#55ce63",
                highlightStroke: "#55ce63",
                data: [x[7].y, x[8].y, x[9].y, x[10].y, x[11].y, x[12].y]
            }
        ]
    };
    
    var chart2 = new Chart(ctx2).Bar(data2, {
        scaleBeginAtZero : true,
        scaleShowGridLines : true,
        scaleGridLineColor : "rgba(0,0,0,.005)",
        scaleGridLineWidth : 0,
        scaleShowHorizontalLines: true,
        scaleShowVerticalLines: true,
        barShowStroke : true,
        barStrokeWidth : 0,
		tooltipCornerRadius: 2,
        barDatasetSpacing : 3,
        legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].fillColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>",
        responsive: true
    });
    });
});