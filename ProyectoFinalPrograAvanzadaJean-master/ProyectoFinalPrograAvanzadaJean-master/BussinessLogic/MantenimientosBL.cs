using DataAccess;
using Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BussinessLogic
{
    public class MantenimientosBL
    {
        public bool RegistrarCita(CLIENTE cliente)
        {
            bool respuesta = false;
            try
            {
                MantenimientosDA mantenimientosDA = new MantenimientosDA();
                respuesta = mantenimientosDA.RegistrarCita(cliente);


            }
            catch (Exception)
            {

                throw;
            }
            return respuesta;
        }

        public bool RegistrarControl(CONTROL control)
        {
            bool respuesta = false;
            try
            {
                MantenimientosDA mantenimientosDA = new MantenimientosDA();
                respuesta = mantenimientosDA.RegistrarControl(control);


            }
            catch (Exception)
            {

                throw;
            }
            return respuesta;
        }

        public bool EliminarControl(CONTROL control)
        {
            bool respuesta = false;
            try
            {
                MantenimientosDA mantenimientosDA = new MantenimientosDA();
                respuesta = mantenimientosDA.EliminarControl(control);


            }
            catch (Exception)
            {

                throw;
            }
            return respuesta;
        }

        public bool EditarControl(CONTROL control)
        {
            bool respuesta = false;
            try
            {
                MantenimientosDA mantenimientosDA = new MantenimientosDA();
                respuesta = mantenimientosDA.EditarControl(control);


            }
            catch (Exception)
            {

                throw;
            }
            return respuesta;
        }

    }
}
