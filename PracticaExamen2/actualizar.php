<?php

	$cedulaSeleccionado = $_GET['ced'];
	include 'conexionBD.php';
    $abirCon = OpenCon();

	if(isset($_POST['btnActualizar']))
	{	
		$TID = $_POST['TID'];
		$TDESCRIPCION = $_POST['TDESCRIPCION'];
		$TPRECIO = $_POST['TPRECIO'];
		$TIMPUESTO = $_POST['TIMPUESTO'];
		
		//Actualizar
		$sql3 = "call Actualizar('$TID','$TDESCRIPCION',$TPRECIO,$TIMPUESTO)";
		$abirCon->next_result();
		
		if($abirCon-> query($sql3))
		{
			header('Location: ejercicio.php');
		}
		else
		{
			echo $abirCon -> error;	
		}
	}
	
	if(isset($_POST['btnEliminar']))
	{
		//Eliminar
		$TID = $cedulaSeleccionado;
		$sql4 = "call Eliminar('$TID')";
		$abirCon->next_result();
		
		if($abirCon-> query($sql4))
		{
			header('Location: ejercicio.php');
		}
		else
		{
			echo $abirCon -> error;	
		}
	}

	$queryPromedios = "call Consultar('')";				
	$listaPromedios= $abirCon-> query($queryPromedios);
	$row = mysqli_fetch_array($listaPromedios);
			
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
<form action="" method="post" >


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
        
		<div class="card-body">
		
			<br/>
		
			<div class="row">
			
				<div class="col-4">
					<label>ID</label>
                    <input type="text" class="form-control" 
                    id="TID" name="TID" readonly="true" 
					value="<?php echo $cedulaSeleccionado; ?>" />
				</div>	
				
				<div class="col-4">
					<label>Descripción</label>
                    <input type="text" class="form-control" 
                    id="TDESCRIPCION" name="TDESCRIPCION"
					value="<?php echo $row["DESCRIPCION"]; ?>" />
				</div>	
				
				<div class="col-4">
					<label>Precio</label>
                    <input type="text" class="form-control" 
                    id="TPRECIO" name="TPRECIO" value="<?php echo $row["PRECIO"]; ?>"  />
				</div>
						
		    </div>

            <br/>
			
			<div class="row">
			
					
				
				<div class="col-3">
					<label>Impuesto</label>
                    <input type="text" class="form-control" 
                    id="TIMPUESTO" name="TIMPUESTO" value="<?php echo $row["IMPUESTO"]; ?>" />
				</div>	
				
							
		    </div>

			 <br/>

            <div class="row">
                <div class="col-6">
                    <input type="submit" class="btn btn-success btn-block" 
                    id="btnActualizar" name="btnActualizar" value="Actualizar" />
                </div>
				
				<div class="col-6">
                    <input type="submit" class="btn btn-success btn-block" 
                    id="btnEliminar" name="btnEliminar" value="Eliminar" />
                </div>
            </div>
		</div>
		
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
	

  </script>
</form>
</body>
</html>