<%--
  Created by IntelliJ IDEA.
  User: J丶晨星
  Date: 2018/11/14
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>省份选择</title>
</head>
<body>
省<select id="sheng" onchange="findSheng()"></select>
市<select id="shi" onchange="findShi()"></select>
县<select id="xian"></select>

<script>

    function findSheng() {
        var xhr = new XMLHttpRequest();
        xhr.onload = function () {
            var list = JSON.parse(xhr.responseText);
            var sheng = document.getElementById("sheng");
            for (var i = 0; i < list.length; i++) {
                var option = document.createElement("option");
                option.value = list[i].region_id;
                option.innerText = list[i].region_name;
                sheng.appendChild(option);
            }
            findShi();
        };
        xhr.open("get","/findByParentId?parent_id=1",true);
        xhr.send();
    }
    function findShi() {
        var id = document.getElementById("sheng").value;
        var xhr = new XMLHttpRequest();
        xhr.onload = function () {
            var list = JSON.parse(xhr.responseText);
            var shi = document.getElementById("shi");
            shi.innerHTML = "";
            for (var i = 0; i < list.length; i++) {
                var option = document.createElement("option");
                option.value = list[i].region_id;
                option.innerText = list[i].region_name;
                shi.appendChild(option);
            }
            findXian();
        };
        xhr.open("get","/findByParentId?parent_id="+id,true);
        xhr.send();
    }
    function findXian() {
        var id = document.getElementById("shi").value;
        var xhr = new XMLHttpRequest();
        xhr.onload = function () {
            var list = JSON.parse(xhr.responseText);
            var xian = document.getElementById("xian");
            xian.innerHTML = "";
            for (var i = 0; i < list.length; i++) {
                var option = document.createElement("option");
                option.value = list[i].region_id;
                option.innerText = list[i].region_name;
                xian.appendChild(option);
            }
        };
        xhr.open("get","/findByParentId?parent_id="+id,true);
        xhr.send();
    }
    findSheng();
</script>
</body>
</html>
