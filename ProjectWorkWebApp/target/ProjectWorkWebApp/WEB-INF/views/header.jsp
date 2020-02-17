<!DOCTYPE html>
<html lang="en">

<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url var="cssUrl" value="/resources/assets/css/styles.css"/>
<c:url var="logoUrl" value="/resources/assets/images/logo.png"/>
<c:url var="homeUrl" value="/home"/>
<c:url var="adminUrl" value="/admin"/>
<c:url var="regUserUrl" value="/register-user"/>
<c:url var="regSuppUrl" value="/register-supplier"/>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="${cssUrl }">
<title>Home Page</title>
<style>
</style>

</head>
<body class="pt-5">
	<nav class="navbar navbar-expand-md navbar-light bg-light fixed-top">
		<a class="navbar-brand" href="${homeUrl }"> <img class="avatar"
			src="${logoUrl }" alt="Stock Logo">
		</a> <a href="${homeUrl }" class="h3 nav-link">E-Commerce</a>
		<button class="navbar-toggler" data-toggle="collapse"
			data-target="#collNav">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse justify-content-between"
			id="collNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a href="${homeUrl }"
					class="nav-link text-center">Home</a></li>
				<li class="nav-item"><a href="${adminUrl }"
					class="nav-link text-center">Admin</a></li>
				<li class="nav-item"><a href="${regUserUrl }"
					class="nav-link text-center">Register User</a></li>
				<li class="nav-item"><a href="${regSuppUrl }"
					class="nav-link text-center">Register Supplier</a></li>
				<li class="nav-item"><a href=""
					class="nav-link text-danger text-center">Logout</a></li>
			</ul>
		</div>
	</nav>
	
	<div id="body" class="container mt-5">