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
    public class ControlController : Controller
    {
        [HttpGet]
        public ActionResult Registrar(int idCita)
        {
            ControlModels controlModels = new ControlModels();
            try
            {
                controlModels.IDCITA = idCita;
            }
            catch (Exception)
            {

                throw;
            }
            return View(controlModels);
        }

        [HttpPost]
        public ActionResult Registrar(ControlModels control)
        {
            try
            {
                if (ModelState.IsValid)
                {
                    var config = new MapperConfiguration(cfg => { cfg.CreateMap<ControlModels, CONTROL>(); });
                    IMapper iMapper = config.CreateMapper();
                    CONTROL controlNuevo = iMapper.Map<ControlModels, CONTROL>(control);
                    MantenimientosBL mantenimientosBL = new MantenimientosBL();
                    mantenimientosBL.RegistrarControl(controlNuevo);
                    control = new ControlModels();
                }


            }
            catch (Exception)
            {

                throw;
            }


            return View(control);
        }




        public ActionResult ListaRegistroControl(int idCita)
        {
            List<ControlModels> modelo = new List<ControlModels>();
            try
            {
                ConsultasBL consultasBL = new ConsultasBL();
                var config = new MapperConfiguration(cfg => { cfg.CreateMap<CONTROL, ControlModels>(); });
                IMapper iMapper = config.CreateMapper();
                modelo = iMapper.Map<List<CONTROL>, List<ControlModels>>(consultasBL.ConsulaControles(idCita));
                ViewBag.idCita = idCita;
            }
            catch (Exception)
            {

                throw;
            }
            return View(modelo);
        }

        [HttpGet]
        public ActionResult EditarRegistroControl(int idControl)
        {
            ControlModels modelo = new ControlModels();
            try
            {
                ConsultasBL consultasBL = new ConsultasBL();
                var config = new MapperConfiguration(cfg => { cfg.CreateMap<CONTROL, ControlModels>(); });
                IMapper iMapper = config.CreateMapper();
                modelo = iMapper.Map<CONTROL, ControlModels>(consultasBL.ConsultarControl(idControl));
            }
            catch (Exception)
            {

                throw;
            }
            return View(modelo);
        }

        [HttpPost]
        public ActionResult EditarRegistroControl(ControlModels modelo)
        {
            try
            {

                if (ModelState.IsValid)
                {
                    MantenimientosBL mantenimientosBL = new MantenimientosBL();
                    var config = new MapperConfiguration(cfg => { cfg.CreateMap<ControlModels, CONTROL>(); });
                    IMapper iMapper = config.CreateMapper();
                    CONTROL modeloEditar = iMapper.Map<ControlModels, CONTROL>(modelo);
                    mantenimientosBL.EditarControl(modeloEditar);
                    modelo.estado = true;
                    ModelState.Clear();
                    ViewBag.Correcto = true;
                    return RedirectToAction("ListaRegistroControl",new { modelo.IDCITA });

                }
            }
            catch (Exception)
            {

                throw;
            }
            return View(new ControlModels());
        }

        [HttpGet]
        public ActionResult EliminarRegistroControl(int idControl)
        {
            ControlModels modelo = new ControlModels();
            try
            {
                ConsultasBL consultasBL = new ConsultasBL();
                var config = new MapperConfiguration(cfg => { cfg.CreateMap<CONTROL, ControlModels>(); });
                IMapper iMapper = config.CreateMapper();
                modelo = iMapper.Map<CONTROL, ControlModels>(consultasBL.ConsultarControl(idControl));
            }
            catch (Exception)
            {

                throw;
            }
            return View(modelo);
        }

        [HttpPost]
        public ActionResult EliminarRegistroControl(ControlModels modelo)
        {
            try
            {

                
                    MantenimientosBL mantenimientosBL = new MantenimientosBL();
                    var config = new MapperConfiguration(cfg => { cfg.CreateMap<ControlModels, CONTROL>(); });
                    IMapper iMapper = config.CreateMapper();
                    CONTROL modeloEliminar = iMapper.Map<ControlModels, CONTROL>(modelo);
                    mantenimientosBL.EliminarControl(modeloEliminar);
                    
                    return RedirectToAction("ListaRegistroControl", new { modelo.IDCITA });
                
            }
            catch (Exception)
            {

                throw;
            }
            return View(modelo);
        }

    }
}