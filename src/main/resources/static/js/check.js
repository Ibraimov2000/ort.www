function check(){
    var yes = 0;
    var no = 0;
    var result = "";
    var choice;
    for(var v = 1; v <= 30; v++){
        var q = document.forms["m1"].elements["rb"+v];
        for (var i=1; i<=q.length;i++){
            if(q[i].checked) {choice=q[i].value}
        }
        if(choice="1") yes++;
        if(choice="0") no++;
    }
    alert(yes);
}