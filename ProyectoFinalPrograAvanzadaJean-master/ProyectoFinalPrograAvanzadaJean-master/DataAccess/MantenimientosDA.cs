using Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataAccess
{
    public class MantenimientosDA
    {
        public  bool RegistrarCita(CLIENTE cliente)
        {
            bool resultado = false;
            try
            {
                using(var model=new Model.conexion())
                {
                    model.CLIENTE.Add(cliente);
                    model.SaveChanges();
                    resultado = true;
                }
            }
            catch (Exception)
            {

                throw;
            }
            return resultado;
        }

        public bool RegistrarControl(CONTROL control)
        {
            bool resultado = false;
            try
            {
                using (var model = new Model.conexion())
                {
                    model.CONTROL.Add(control);
                    model.SaveChanges();
                    resultado = true;
                }
            }
            catch (Exception)
            {

                throw;
            }
            return resultado;
        }

        public bool EliminarControl(CONTROL control)
        {
            bool resultado = false;
            try
            {
                using (var model = new Model.conexion())
                {
                    var Control = model.CONTROL.Single(o => o.IDCONTROL == control.IDCONTROL);
                    model.CONTROL.Remove(Control);
                    model.SaveChanges();
                    resultado = true;
                }
            }
            catch (Exception ex)
            {

                throw;
            }
            return resultado;
        }

        public bool EditarControl(CONTROL control)
        {
            bool resultado = false;
            try
            {
                using (var model = new Model.conexion())
                {
                    model.CONTROL.Add(control);
                    
                    model.SaveChanges();
                    resultado = true;
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
