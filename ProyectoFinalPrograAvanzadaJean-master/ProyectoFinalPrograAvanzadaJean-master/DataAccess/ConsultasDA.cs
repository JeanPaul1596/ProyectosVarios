using Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataAccess
{
    public class ConsultasDA
    {
        public List<CLIENTE> ConsulatrCitas()
        {
            List<CLIENTE> resultado = new List<CLIENTE>();
            try
            {
                using (var model = new Model.conexion())
                {
                    resultado = model.CLIENTE.ToList();
                }
            }
            catch (Exception)
            {

                throw;
            }
            return resultado;
        }


        public List<CONTROL> ConsultarControles(int idCita)
        {
            List<CONTROL> resultado = new List<CONTROL>();
            try
            {
                using (var model = new Model.conexion())
                {
                    resultado = model.CONTROL.Where(x => x.IDCITA == idCita).ToList();
                }
            }
            catch (Exception)
            {

                throw;
            }
            return resultado;
        }

        public CONTROL ConsultarControl(int idControl)
        {
            CONTROL resultado = new CONTROL();
            try
            {
                using (var model = new Model.conexion())
                {
                    resultado = model.CONTROL.Where(x => x.IDCONTROL == idControl).FirstOrDefault();
                }
            }
            catch (Exception)
            {

                throw;
            }
            return resultado;
        }
    }
}
