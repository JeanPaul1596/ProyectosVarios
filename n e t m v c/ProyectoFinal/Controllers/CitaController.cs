using AutoMapper;
using BussinessLogic;
using Model;
using ProyectoFinal.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace ProyectoFinal.Controllers
{
    public class CitaController : Controller
    {
        // GET: Citas
        public ActionResult Index()
        {
            return View();
        }

        [HttpGet]
        public ActionResult Registrar()
        {
            return View();
        }

        [HttpPost]
        public ActionResult Registrar(ClienteModels cliente)
        {
            try
            {
                if (ModelState.IsValid)
                {
                    var config = new MapperConfiguration(cfg => { cfg.CreateMap<ClienteModels, CLIENTE>(); });
                    IMapper iMapper = config.CreateMapper();
                    CLIENTE clienteNuevo = iMapper.Map<ClienteModels, CLIENTE>(cliente);
                    clienteNuevo.ESTADO = true;
                    MantenimientosBL mantenimientosBL = new MantenimientosBL();
                    mantenimientosBL.RegistrarCita(clienteNuevo);
                    cliente = new ClienteModels();
                }
            }
            catch (Exception)
            {

                throw;
            }
            return View(cliente);
        }

        public ActionResult Listado()
        {
            List<ClienteModels> modelo = new List<ClienteModels>();
            try
            {
                ConsultasBL consultasBL = new ConsultasBL();
                var config = new MapperConfiguration(cfg => { cfg.CreateMap<CLIENTE, ClienteModels>(); });
                IMapper iMapper = config.CreateMapper();
                modelo = iMapper.Map<List<CLIENTE>,  List<ClienteModels>>(consultasBL.ConsulatrCitas());
            }
            catch (Exception)
            {

                throw;
            }
            return View(modelo);
        }
    }
}