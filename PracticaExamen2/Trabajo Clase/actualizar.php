<?php

	$cedulaSeleccionado = $_GET['ced'];
	include 'conexionBD.php';
    $abirCon = OpenCon();

	if(isset($_POST['btnActualizar']))
	{	
		$txtId = $_POST['txtId'];
		$txtNombre = $_POST['txtNombre'];
		$cboPerfil = $_POST['cboPerfil'];
		$txtNota1 = $_POST['txtNota1'];
		$txtNota2 = $_POST['txtNota2'];
		$txtProyecto = $_POST['txtProyecto'];
		$txtPromedio = $_POST['txtPromedio'];
		//Actualizar
		$sql3 = "call ActualizarDatos('$txtId','$txtNombre',$cboPerfil,$txtNota1,$txtNota2,$txtProyecto,$txtPromedio)";
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
		$txtId = $cedulaSeleccionado;
		$sql4 = "call EliminarDatos('$txtId')";
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

	$queryPromedios = "call ConsultarPromedios('" . $cedulaSeleccionado . "')";		
	$listaPromedios = $abirCon-> query($queryPromedios);
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
					<label>Cédula</label>
                    <input type="text" class="form-control" 
                    id="txtId" name="txtId" readonly="true" 
					value="<?php echo $cedulaSeleccionado; ?>" />
				</div>	
				
				<div class="col-4">
					<label>Nombre</label>
                    <input type="text" class="form-control" 
                    id="txtNombre" name="txtNombre"
					value="<?php echo $row["Nombre"]; ?>" />
				</div>	
				
				<div class="col-4">
					<label>Perfil</label>
                    <select class="form-control" id="cboPerfil" name="cboPerfil" size=1>
					<option value="0">Seleccione</option>
					
					<?php					
					if ($row["Perfil_Id"] == "1")
					{
						echo "<option value='1' selected>Administrador</option>";	
						echo "<option value='2'>Consulta</option>";					
					}
					else
					{
						echo "<option value='1'>Administrador</option>";	
						echo "<option value='2' selected>Consulta</option>";	
					}
					?>
					
					</select>
					
					<?php
					#echo "<option value='0'>Seleccione</option>";
					#while($fila = mysqli_fetch_array($listaRoles))
					#{
					#	if($row["Perfil_Id"] == $fila)
					#	echo "<option value=" . $fila["idRol"] . " selected>" . $fila["descripcionRol"] . "</option>";
					#   else
					#	echo "<option value=" . $fila["idRol"] . ">" . $fila["descripcionRol"] . "</option>";
					#}					
					?>
					
				</div>
				
		    </div>

            <br/>
			
			<div class="row">
			
				<div class="col-3">
					<label>Nota 1</label>
                    <input type="text" class="form-control" 
                    id="txtNota1" name="txtNota1" value="<?php echo $row["Nota1"]; ?>"  />
				</div>	
				
				<div class="col-3">
					<label>Nota 2</label>
                    <input type="text" class="form-control" 
                    id="txtNota2" name="txtNota2" value="<?php echo $row["Nota2"]; ?>" />
				</div>	
				
				<div class="col-3">
					<label>Proyecto</label>
                    <input type="text" class="form-control" 
                    id="txtProyecto" name="txtProyecto" value="<?php echo $row["Proyecto"]; ?>"/>
				</div>
				
				<div class="col-3">
					<label>Promedio</label>
                    <input type="text" class="form-control" 
                    id="txtPromedio" name="txtPromedio" readonly="true" value="<?php echo $row["Promedio"]; ?>" />
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