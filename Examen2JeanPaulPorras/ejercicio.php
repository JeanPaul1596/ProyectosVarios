<?php

    include 'conexionBD.php';
    $abirCon = OpenCon();

    $query1 = "call Consultar('')";		
		$lista = $abirCon-> query($query1);
   
    
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
<form action="" method="post">


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
        


		<table class="table table-bordered">
			
			<thead>
				<th>ID Venta</th>
				<th>Nombre Vendedor</th>
				<th>Descripción casa</th>
				<th>Precio</th>
        <th>Fecha de venta</th>
				</thead>
		<tbody>
			<?php 

			if (empty($lista)) 
			{
				echo '<tr>';
				echo '<td colspan="7">Sin Resultado</td>';
				echo '</tr>';
			}
			else
			{ 

					while ( $fila = mysqli_fetch_array($lista))
				{
				echo '<tr>';
				echo '<td>'. $fila["IdVenta"] .'</td>';
				echo '<td>'. $fila["NombreVendedor"] .'</td>';
				echo '<td>'. $fila["DescripcionCasa"] .'</td>';
				echo '<td>'. $fila["PrecioCasa"] . '%'. '</td>'; 
				echo '<td>'. $fila["FechaVenta"] .'</td>';
				echo '</tr>';
				}

			}
			  ?>
		</tbody>
		</table>
        
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