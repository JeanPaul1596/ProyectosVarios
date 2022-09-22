<?php

	include 'conexionBD.php';
	$abirCon = OpenCon();



	if(isset($_POST['btnComprar']))
	{
		$Cantidad = $_POST['txtCantidad'];
		$Producto = $_POST['cboProducto'];
		
		$proc = "call Compras($Cantidad, $Producto)";
		$abirCon -> next_result();
		
		if($abirCon -> query($proc))
		{
			header('Location: ejercicio.php');
		}
		else		
		{
			echo "Error:" . $abirCon->error;			
		}
	}
	
	$producto = "CALL Mostrar('')"; 
	$listaProductos = $abirCon -> query($producto);
			
	 CloseCon($abirCon);
		
?>

<!DOCTYPE html>
<html >

<head>

   <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Jean Paul</title>
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="css/simple-sidebar.css" rel="stylesheet">
  <link href="css/EstilosSitio.css" rel="stylesheet">
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">

</head>

<body>

<form action="" method="post" onsubmit="return ValidarCampos();">


  <div class="d-flex" id="wrapper">

    <div class="bg-light border-right" id="sidebar-wrapper">
      <div class="sidebar-heading">Menu</div>
      <div class="list-group list-group-flush">
        <?php include'menu.php' ?>

      </div>
    </div>

    <div id="page-content-wrapper">

      <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
        <button class="btn btn-primary" id="menu-toggle">X</button>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
            <li class="nav-item active">
              <a class="nav-link" href="#"><i class="fa fa-paper-plane-o"></i><span class="sr-only">(current)</span></a>
            </li>
          </ul>
        </div>
      </nav>
       <div class="container-fluid">
        <br/>
        <h2> Comprar Productos  </h2>
        <br/>
        <br/>
        
        <div class="form-group row">
			<label for="cantidad" id="cantidad" class="col-sm-2 col-form-label">Cantidad</label>
			<div class="col-sm-4">
             <input type="number" class="form-control" id="txtCantidad" name="txtCantidad">
			</div>
        </div>
      
	    <div class="form-group row">
			<label for="descripcion" id="descripcion" class="col-sm-2 col-form-label">Descripci&oacute;n</label>
			<div class="col-sm-4">
			  <select class="form-control" id="cboProducto" name="cboProducto" size=1>				
				<?php
				while($fila = mysqli_fetch_array($listaProductos))
				{
					echo "<option value=" . $fila["ID"] . ">" . $fila["DESCRIPCION"] . "</option>";
				}					
				?>
			  </select>
			</div>
		</div>
     		
		<br/>
        
		<input type="submit" class="btn btn-success btn-block" name="btnComprar" value="Comprar"/>
       
    </div>
	  
    </div>

  </div>

  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="js/FuncionesSitio.js"></script>

  <script>
      
    $("#menu-toggle").click(function(e) {
      e.preventDefault();
      $("#wrapper").toggleClass("toggled");
    });
	

	function ValidarCampos()
	{
		if( $("#txtCantidad").val() == "" )
		{
			alert("Debe ingresar un valor");
			return false;
		}
		
		
		
		return true;		
	}

  </script>
</form>
</body>
</html>