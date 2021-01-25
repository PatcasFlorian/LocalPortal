

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
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
                          <a href="view-all-sale.htm" style="color:#ffcc00;" class="nav-link"><==Back</a>
                        </li>
                      </ul>
                      <ul class="navbar-nav">
                        <li class="nav-item d-none d-sm-inline-block">
                          <a href="my-acount.htm "style="color:#ffcc00;" class="nav-link">My Account</a>
                        </li>
                      </ul>
   
                   <ul class="navbar-nav">
                        <li class="nav-item d-none d-sm-inline-block">
                           <a href="login-portal.htm" style="color:#ffcc00;">LogOut</a>
                        </li>
                      </ul>
                    </nav>
       </div>
       </section>
     
      <!-- /.container-fluid -->
      
      <!-- Content body -->
       <h3 class="my-3">${anunt.titluAnunt}</h3>
      <div class="col-6">
                <img src="data:image/jpg;base64,${anunt.poza1}" class="product-image" alt="Product Image">
              </div>
     <div class="col-6 product-image-thumbs">
                <div class="product-image-thumb active"><img src="data:image/jpg;base64,${anunt.poza1}" alt="Product Image"  ></div>
                <div class="product-image-thumb"><img src="data:image/jpg;base64,${anunt.poza2}" alt="Product Image"></div>
                <div class="product-image-thumb"><img src="data:image/jpg;base64,${anunt.poza3}" alt="Product Image"></div>
                <div class="product-image-thumb"><img src="data:image/jpg;base64,${anunt.poza4}" alt="Product Image"></div>
                <div class="product-image-thumb"><img src="data:image/jpg;base64,${anunt.poza5}" alt="Product Image"></div>
              </div>
   
   <div class="col-12 col-sm-6">
              
              <p>${anunt.textAnunt}</p>

              <hr>
             

              <div class="bg-gray py-2 px-3 mt-4">
                <h2 class="mb-0">
                  Pret Anunt :
                </h2>
                <h4 class="mt-0">
                  <small>${anunt.pretAnunt} Ron</small>
                 
                </h4>
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
    
    
    
