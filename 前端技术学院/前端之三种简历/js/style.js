function out(){
	var span = document.getElementById("date");
	var date = new Date().getHours();
	if(date >= 19){
		span.innerHTML = "晚上好";
	}else if(date >= 12){
		span.innerHTML = "中午好";
	}else{
		span.innerHTML = "早上好";
	}
}
function get(){
		console.log("爱好其他");
}
