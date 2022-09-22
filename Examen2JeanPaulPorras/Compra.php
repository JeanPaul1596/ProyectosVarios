<?php

	include 'conexionBD.php';
	$abirCon = OpenCon();



	if(isset($_POST['btnComprar']))
	{
		$Vendedores = $_POST['Vendedores'];
		$Casas = $_POST['Casas'];
		
		$proc = "call Compra($Casas, $Vendedores)";
		$abirCon -> next_result();
		
		if($abirCon -> query($proc))
		{
			header('Location: Compra.php');
		}
		else		
		{
			echo "Error:" . $abirCon->error;			
		}
	}
	
	$producto = "CALL Mostrar('')"; 
	$abirCon = OpenCon();
	$lista = $abirCon -> query($producto);


	$productoss = "CALL Casas('')";
	$abirCon = OpenCon(); 
	$listaCasa = $abirCon -> query($productoss);

	

			
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
        <h2> Comprar casas  </h2>
        <br/>
        <br/>
        
            

      	<div class="form-group row">
			<label for="Vendedores" id="Vendedores" class="col-sm-2 col-form-label">Vendedores</label>
			<div class="col-sm-4">
			  <select class="form-control" id="Vendedores" name="Vendedores" size=1>				
				<?php
				while($fila = mysqli_fetch_array($lista))
				{
					echo "<option value=" . $fila["IdVendedor"] . ">" . $fila["NombreVendedor"] . "</option>";
				}					
				?>
			  </select>
			</div>
		</div>

	    <div class="form-group row">
			<label for="Casas" id="Casas" class="col-sm-2 col-form-label">Casas</label>
			<div class="col-sm-4">
			  <select class="form-control" id="Casas" name="Casas" size=1>				
				<?php
				while($fila = mysqli_fetch_array($listaCasa))
				{
					echo "<option value=" . $fila["IdCasa"] . ">" . $fila["DescripcionCasa"] ."-  Su Precio es ". $fila["PrecioCasa"] . "</option>";
				}					
				?>
			  </select>
			</div>
		</div>
     		
		<br/>
					<div class="row">
					<div class="col-4">
					<label>Precio</label>
                    <input type="text" class="form-control" 
                    id="txtNombre" name="txtNombre"
					  value="00.00"readonly="true" />
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