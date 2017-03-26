/**
 * Created by lumr on 2017/3/26.
 */

var xmlHttp = new XMLHttpRequest();

//获取列表框信息
function select() {
    xmlHttp.open("GET", "/selectBreed", true);
    xmlHttp.onreadystatechange = getBreed;
    xmlHttp.send();
}

//
function getBreed() {
    if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
        var select = document.getElementById("breed");
        select.innerHTML = xmlHttp.responseText;
    }
}

function change() {
    xmlHttp.open("POST", "/getPet",true);
    xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    xmlHttp.onreadystatechange = getPet;
    var breed = document.getElementById("breed").value;
    var str = "breed="+breed;
    xmlHttp.send(str);
}

function getPet() {
    if (xmlHttp.readyState == 4 && xmlHttp.status == 200){
        var getPet = document.getElementById("detail");
        getPet.innerHTML = xmlHttp.responseText;
    }
}