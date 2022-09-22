<!DOCTYPE html>
<html >

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Jean</title>
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="css/simple-sidebar.css" rel="stylesheet">
	<link href="css/EstilosSitio.css" rel="stylesheet">
	<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
  
  <style>
    
	/*Elemento #*/
	/*Clase .*/
	
	.ColorTitulo
	{
		color: blue;
	}
	
	#tituloPrincipal
	{
		color: dark-blue;
	}
	
	h2
	{
		color: green;
	}

	.Mayuscula
	{
		text-transform: uppercase;
	}

	.Minuscula
	{
		text-transform: lowercase;
	}

	.InicioMayuscula
	{
		text-transform: capitalize;
	}
  
  </style>

</head>

<body>

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
        
				<!-- Estilos CSS -->
				<h1 style="color:red;">Forma 1</h1>
				<h1 class="ColorTitulo">Forma 2</h1>
				<h2>Forma 2</h2>
				<h3 id="tituloPrincipal" >Forma 2</h3>
				<h4 id="tituloSecundario" class="ColorNaranja">Forma 3</h4>

				<!-- Funciones JS -->
				<p id="lblBienvenida">Buenas noches</p>
				
				<button type="button" class="btn btn-info form-control" onclick="document.getElementById('lblBienvenida').innerHTML = 'Curso Ambiente Web Cliente Servidor'">Procesar Forma 1</button>
				
				<br/><br/>
				
				<button type="button" class="btn btn-primary form-control" onclick="ChangeLabel();">Procesar Forma 2</button>
				
				<br/><br/>
				
				<button type="button" class="btn btn-danger form-control" onmousemove="ActivateLabel();" onclick="MostrarSaludo('Eduardo');">Procesar Forma 3</button>
				<br/><br/>
		
				<!-- Funciones JS -->
				<input type="text" id="txtTipoCambio" class="form-control">

				<br/><br/>
				<!-- Textos -->
				<p class="Mayuscula">hola mundo</p>
				<p class="Minuscula">HOLA MUNDO</p>
				<p class="InicioMayuscula">hola mundo</p>

				<br/><br/>

				<ol>
					<li><a href="https://www.coca-cola.com.co/es/home"></a>Cocacola</li>
					<li><a href="https://www.coca-cola.com.co/es/home"></a>Facebook</li>
					<li><a href="https://www.coca-cola.com.co/es/home"></a>Instagram</li>
				</ol>

				<br/><br/>

				<table class="table table-bordered table-hover" style="color:blue!important;">
					<tr>
						<th>Código</th>
						<th>Nombre</th>
						<th>Nota</th>
					</tr>
					<tr>
						<td>001</td>
						<td>Eduardo</td>
						<td>100</td>
					</tr>
				</table>

				<br/><br/>

				<div class="card-body">
					<div class="row">

						<div class="col-4">
							<label>Monto</label>
						  <input type="text" class="form-control" id="txtMonto" />
						</div>

						<div class="col-4">
						<label>Porcentaje</label>
						<input type="text" class="form-control" id="txtPorcentaje" />
						</div>

						<div class="col-4" style="text-align:center;">
						<br/>
							<i class="fa fa-facebook-square fa-3x" onclick="fnPorcentaje();" ></i>
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
	
	function ChangeLabel()
	{
		console.log("Si est� llegando");
		document.getElementById('lblBienvenida').innerHTML = 'Curso Ambiente Web Cliente Servidor';
	}


 	

	function fnPorcentaje()
	{
		try
		{
			var monto = document.getElementById('txtMonto').value;
			var porcentaje = document.getElementById('txtPorcentaje').value;
			var resultado = (monto * porcentaje) / 100;
			alert("El resultado es: "+ resultado); 
		}
		catch(error)
		{
			console.log(error);	
		}
	}
/*window.onload = fnInicio();
	function fnInicio()
	{
		/*
		document.write("Buenas noches");
		document.write(5 + 6);
		
		alert("Buenas noches");
		alert(5 + 6);
		
		document.getElementById("lblBienvenida").innerHTML = "Buenas noches";
		document.getElementById("lblBienvenida").innerHTML = 5 + 6;
		
		console.log("Buenas noches");
		console.log(5 + 6);
		*/
		
		/*
		//a + b / c
		var a = 10;
		var b = 20;
		var c = 30;
		
		console.log(a+b/c);
		console.log(a+b);
		console.log((a+b)/c);
		*/
		
		/*
		let texto1 = "Hola";
		let texto2 = "Mundo";
		
		let edad1 = 1000000;
		let edad2 = 20;
		let resultado = edad1 + edad2;
		
		console.log(texto1 + " " + texto2 + " " + resultado);
		
		var valorA;
		var valorB;
		const impuesto = 10;
		
		valorA = 15;
		valorB = 10.5;
		
		console.log((valorA * valorB) / impuesto);
		*/
		
		/*
		//Objeto
		var personas = ["persona0", "persona1"];
		console.log(personas[0] + " - " + personas[1]);
		
		var persona = 
		{
			cedula : "304590415",
			nombre : "Eduardo",
			provincia : "Cartago"
		};
		
		console.log(persona);
		console.log(persona.cedula);
		*/
		
		/*
		//Error no controlado 	-- 1
		//undefined				-- 2
		//Null					-- 3
		//Not a Number			-- 4
		var casa;
		if (3 === "3")
		{
			console.log("entr� al if");
		}
		else
		{
			console.log("No entr� al if");
		}
				
		

			
		
	}*/
	fnTipoCambio();
	
	function fnTipoCambio()
	{
		var request = new XMLHttpRequest();
		request.open('GET','https://api.hacienda.go.cr/indicadores/tc', true);
		request.send();
		
		request.onload = function()
		{		
			if(request.status >= 200 && request.status < 400)
			{
				var datos = JSON.parse(this.response);

				//alert(datos.dolar.venta.valor + " - " + datos.dolar.compra.valor);
				//document.getElementById("txtTipoCambio").value = datos.dolar.venta.valor + " - " + datos.dolar.compra.valor;
				$("#txtTipoCambio").val(datos.dolar.venta.valor + " - " + datos.dolar.compra.valor);
			}
			else
			{
				alert("No se pudo consultar el tipo de cambio del dia de hoy");
			}
		}
	}
	
  </script>
</body>
</html>


