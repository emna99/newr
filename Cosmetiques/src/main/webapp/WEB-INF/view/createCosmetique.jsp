<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Créer un Cosmetique</title>
</head>
<body>
<form action="saveCosmetique" method="post">
<pre>
nom : <input type="text" name="nomCosmetique">
prix : <input type="text" name="prixCosmetique">
date création : <input type="date" name="date">
<input type="submit" value="ajouter">
</pre>
</form>
${msg}
<br/>
<br/>
<a href="ListeCosmetiques">Liste Cosmetiques</a>
</body>
</html>
