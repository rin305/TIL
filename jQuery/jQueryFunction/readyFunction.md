# ready Function

## ready함수를 호출하는 법 

```html
<script>
$(document).ready(function(){
	alert("ready()를 이용해서 함수를 호출합니다.");
})
$().ready(function(){
	alert("함수를 호출2");
})
$(function(){
	alert("함수를 호출3");
})
</script>
```
