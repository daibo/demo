function myFunction(){
    alert('点击了登录');
    $.ajax({
        async : false, // 同步的AJAX请求保证赋值成功
        type : "get",
        dataType : "json",
        url : "loginIn",
        success : function(msg) {
            if(msg){
                alert('登录成功');
            }
        },	error : function(msg) {}

    })
}