<?php

    include 'conexionBD.php';
    $abirCon = OpenCon();
	
	//Llamar al procedimiento que me devuelve la lista de roles
	//guardar el resultado en $listaRoles

	if(isset($_POST['btnAgregar']))
	{	
		$txtId = $_POST['txtId'];
		$txtNombre = $_POST['txtNombre'];
		$cboPerfil = $_POST['cboPerfil'];
		$txtNota1 = $_POST['txtNota1'];
		$txtNota2 = $_POST['txtNota2'];
		$txtProyecto = $_POST['txtProyecto'];
		$txtPromedio = $_POST['txtPromedio'];
		
		$sql2 = "call InsertarDatos('$txtId','$txtNombre',$cboPerfil,$txtNota1,$txtNota2,$txtProyecto,$txtPromedio)";
		$abirCon->next_result();
		
		if($abirCon-> query($sql2))
		{
			header('Location: ejercicio.php');
		}
		else
		{
			echo $abirCon -> error;	
		}
    }
	
    CloseCon($abirCon);

?>

<!DOCTYPE html>
<html>

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
        
		<div class="card-body">
		
			<br/>
		
			<div class="row">
			
				<div class="col-4">
					<label>Cédula</label>
                    <input type="text" class="form-control" 
                    id="txtId" name="txtId" />
				</div>	
				
				<div class="col-4">
					<label>Nombre</label>
                    <input type="text" class="form-control" 
                    id="txtNombre" name="txtNombre" />
				</div>	
				
				<div class="col-4">
					<label>Perfil</label>
                    <select class="form-control" id="cboPerfil" name="cboPerfil" size=1>
					<option value="0">Seleccione</option>
					<option value="1">Administrador</option>
					<option value="2">Consulta</option>
					</select>
					
					<?php
					#echo "<option value='0'>Seleccione</option>";
					#while($row = mysqli_fetch_array($listaRoles))
					#{
					#	echo "<option value=" . $row["idRol"] . ">" . $row["descripcionRol"] . "</option>";
					#}					
					?>
					
				</div>
				
		    </div>

            <br/>
			
			<div class="row">
			
				<div class="col-3">
					<label>Nota 1</label>
                    <input type="number" class="form-control" 
                    id="txtNota1" name="txtNota1" onblur="CalcularPromedio();" />
				</div>	
				
				<div class="col-3">
					<label>Nota 2</label>
                    <input type="number" class="form-control" 
                    id="txtNota2" name="txtNota2" onblur="CalcularPromedio();" />
				</div>	
				
				<div class="col-3">
					<label>Proyecto</label>
                    <input type="number" class="form-control" 
                    id="txtProyecto" name="txtProyecto" onblur="CalcularPromedio();" />
				</div>
				
				<div class="col-3">
					<label>Promedio</label>
                    <input type="number" class="form-control" 
                    id="txtPromedio" name="txtPromedio" readonly="true" />
				</div>
				
		    </div>

			 <br/>

            <div class="row">
                <div class="col-12">
                    <input type="submit" class="btn btn-success btn-block" 
                    id="btnAgregar" name="btnAgregar" value="Agregar"  />
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
   
	$('#btnAgregar').prop('disabled', true);
   
    $("#menu-toggle").click(function(e) {
      e.preventDefault();
      $("#wrapper").toggleClass("toggled");
    });

	
    
	
	function CalcularPromedio()
	{
		var nota1 = document.getElementById("txtNota1").value;
		var nota2 = document.getElementById("txtNota2").value;
		var notaProyecto = document.getElementById("txtProyecto").value;
		
		if(nota1 != "" && nota2 != "" && notaProyecto != "")
		{		
			var resultado = (parseFloat(nota1) + parseFloat(nota2) + parseFloat(notaProyecto)) / 3;
			document.getElementById("txtPromedio").value = resultado.toFixed(2);
			
			$('#btnAgregar').prop('disabled', false);
		}
		else
		{
			document.getElementById("txtPromedio").value = "";
			$('#btnAgregar').prop('disabled', true);
		}



	}
	
	function ValidarCampos()
	{
		if( $("#txtId").val() == "" )
		{
			alert("Debe ingresar la cédula");
			return false;
		}
		
		if( $("#txtNombre").val() == "" )
		{
			alert("Debe ingresar el nombre");
			return false;
		}
		
		if( $("#cboPerfil").val() == "0")
		{
			alert("Debe ingresar el perfil");
			return false;
		}
		
		return true;		
	}

  </script>
</form>
</body>
</html>