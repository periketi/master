<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function doSubmit(){
	
	document.form[0].action="POST";
	document.form[0].submit();
}

</script>
</head>
<body>
	<table>
		<tr>
			<td>ASNKEY:</td>
			<td><input type="text" name="asnkey" value=${asnList.asnkey} /></td>
		</tr>
		<tr>
			<td>STORER:</td>
			<td><input type="text" name="storerkey" value=${asnList.storerkey} /></td>
		</tr>
		<tr>
			<td>SKU:</td>
			<td><input type="text" name="sku" value=${asnList.sku} /></td>
		</tr>
		<tr>
			<td>PACKKEY:</td>
			<td><input type="text" name="packkey" value=${asnList.packkey} /></td>
		</tr>
		<tr>
			<td>Quantity:</td>
			<td><input type="text" name="quantity" value=${asnList.quantity} /></td>
		</tr>
		<tr>
	 	
			<td> <input type="submit" onclick="javascript:doSubmit();" /></td>
		</tr>
	</table>
</body>
</html>