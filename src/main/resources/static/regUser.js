/**
 * Created by 杨晗 on 2017/8/16.
 */

$(function () {

    //验证用户名
    $("#name").blur(function () {
        $("#na").empty();
        var name=$(this).val();
        if(name==""){
                var span=$("<span id='na' style='color: crimson'>用户名不能为空</span>");
                $("#nameDiv").addClass("has-error");
                $(this).after(span);
         }else{
            $.post(
                "selectName",{"userName":name},function (d) {
                    if(d=="error"){
                        var span=$("<span id='na' style='color: aqua'>用户名已存在</span>");
                        $("#nameDiv").addClass("has-error").after(span);
                        $("#name").after(span);
                    }else{
                        var span=$("<span id='na' style='color: lawngreen'>√</span>");
                        $("#nameDiv").removeClass("has-error").addClass("has-success").after(span);
                        $("#name").after(span);
                        userName=true;
                    }
                }
            )


        }


    });

    //验证密码
    $("#password").blur(function () {

        $("#pa").empty();
        var password=$(this).val();
        if(password==""){
            var span=$("<span id='pa' style='color: crimson'>密码不能为空</span>");
            $("#passwordDiv").addClass("has-error").after(span);
            $(this).after(span);
        }else{
            var span=$("<span id='pa' style='color: lawngreen'>√</span>");
            $("#passwordDiv").removeClass("has-error").addClass("has-success");
            $("#password").after(span);
            userPassword=true;

        }

    });

    //验证邮箱
    $("#email").blur(function () {

        $("#em").empty();
        var email=$(this).val();
        if(email==""){
            var span=$("<span id='em' style='color: crimson'>邮箱不能为空</span>");
            $("#emailDiv").addClass("has-error").after(span);
            $(this).after(span);
        }else{
           var emailStr =
                /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
           if(!emailStr.test(email)){
               var span=$("<span id='em' style='color: crimson'>邮箱格式错误</span>");
               $("#emailDiv").addClass("has-error").after(span);
               $(this).after(span);
           }else{
            var span=$("<span id='em' style='color: lawngreen'>√</span>");
            $("#emailDiv").removeClass("has-error").addClass("has-success");
            $("#email").after(span);
            userEmail=true;
           }
        }

    });

    //验证头像
    $("#head").blur(function () {

        $("#he").empty();
        var head=$(this).val();
        if(head==""){
            var span=$("<span id='he' style='color: crimson'>头像不能为空</span>");
            $("#headDiv").addClass("has-error").after(span);
            $(this).after(span);
        }else{
            var heads=head.split(".");
            if(heads[1]=="jpg"){
                var span=$("<span id='he' style='color: lawngreen'>√</span>");
                $("#headDiv").removeClass("has-error").addClass("has-success");
                $(this).after(span);
                userHead=true;
            }else{
                var span=$("<span id='he' style='color: crimson'>头像格式错误</span>");
                $("#emailDiv").addClass("has-error");
                $(this).after(span);
            }

        }  });

        $("#but").click(function () {
                    if(userName&&userPassword&&userEmail&&userHead){
                            $.post(
                                "insertUser",$('#reg').serialize(),function (d) {
                                        if(d=="ok"){
                                            alert("成功");
                                        }
                                },
                                "json"
                            )

                    }

        });





});