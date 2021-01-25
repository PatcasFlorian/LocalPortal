<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Anunturi De Vanzare</title>
 <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>ForexTrade</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Font Awesome -->
  <link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- overlayScrollbars -->
  <link rel="stylesheet" href="dist/css/adminlte.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>
<body class="hold-transition sidebar-mini" >
<!-- Site wrapper -->
<div class="wrapper">
  
   
   
  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-2">
    <!-- Brand Logo -->
	<h3 style="color:red;"><img src="Comun/logo-image.png" alt="MicroLogo" style="width:250px;height:150px;" ></h3>

    <!-- Sidebar -->
    <div class="sidebar">
     

      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false"> 
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
          <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-tachometer-alt"></i>
              <p>
                Dashboard
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="#" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                 <p>Anunturi Cumparare</p><br>
                </a>
              </li>
			   <li class="nav-item">
                <a href="#" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Forum</p>
                </a>
              </li>
             
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>
<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        
         
          <nav  class="navbar navbar-expand navbar-primary navbar-light">
                      <!-- Left navbar links -->
                      <ul class="navbar-nav">
                        <li class="nav-item d-none d-sm-inline-block">
                          <a href="my-acount.htm" class="nav-link">My Account</a>
                        </li>
                      </ul>
   
                   <ul class="navbar-nav">
                        <li class="nav-item d-none d-sm-inline-block">
                           <a href="login-portal.htm" style="color:red;">LogOut</a>
                        </li>
                      </ul>
                    </nav>
       </div>
       </section>
     
      <!-- /.container-fluid -->
      
      <!-- Content body -->
       <div class="card card-solid">
 
 
        <div class="card-body pb-0">
          <div class="row d-flex align-items-stretch">
     
             
             <c:forEach var="anunt" items="${model.listAnunt}">
              <div class="col-12 col-sm-8 col-md-2 d-flex align-items-stretch">
              <div class="card bg-light">
              <div class="card-header text-muted border-bottom-7 ">
                  Anunt postat de :<br>
                  <c:out value="${anunt.userName}"></c:out>
                </div>
                <div class="card-header text-muted border-bottom-7 ">
                  Titlu Anunt:<br>
                  <c:out value="${anunt.titluAnunt}"></c:out>
                </div>
                <div class="card-body pt-0">
                  <div class="row">
                    <div class="col-7">
                      <h2 class="lead">Data Anuntului:<br>
                        <c:out value="${anunt.dataAnunt}"></c:out>
                      </h2>
                       <p class="text-muted text-sm"><b>Pret: </b><br>  <c:out value="${anunt.pretAnunt}"></c:out></p>
                      <ul class="ml-4 mb-0 fa-ul text-muted">
                        <li class="small"><span class="fa-li"><i class="fas fa-lg fa-building"></i></span> Address : <br><c:out value="${model.user.companyAdress}"></c:out></li>
                        <li class="small"><span class="fa-li"><i class="fas fa-lg fa-phone"></i></span> Phone : <br><c:out value="${model.user.phoneNumber}"></c:out></li>
                      </ul>
                    </div>
                    <div class="col-5 text-center">
                      <img src="../../dist/img/user1-128x128.jpg" alt="" class="img-circle img-fluid">
                    </div>
                  </div>
                </div>
                <div class="card-footer">
                  <div class="text-right">
                    
                    <a href="DownloadImage?id=${anunt.id}" class="btn btn-sm btn-primary">
                      <i class="fas fa-user"></i> Vizualizare</a>
                  </div>
                </div>
              </div>
               </div>
               </c:forEach>
           
          </div>
          
        </div>
        
    </div>
    
    
      <!-- /content body -->
      
     
       <footer class="main-footer" style="background-color:powderblue;">
    <div class="float-right d-none d-sm-block">
      <b>Version</b> 0.1
    </div>
    <strong>Copyright &copy; 2021-2025</a>.</strong> All rights
    reserved.
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- jQuery -->
<script src="plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="dist/js/demo.js"></script>

</body>
</html>