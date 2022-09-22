using DataAccess;
using Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BussinessLogic
{
    public class ConsultasBL
    {
        public List<CLIENTE> ConsulatrCitas()
        {
            List<CLIENTE> resultado = new List<CLIENTE>();
            try
            {
                ConsultasDA consultasDA = new ConsultasDA();
                resultado = consultasDA.ConsulatrCitas();

            }
            catch (Exception)
            {

                throw;
            }
            return resultado;
        }


        public List<CONTROL> ConsulaControles(int idCita)
        {
            List<CONTROL> resultadoO = new List<CONTROL>();
            try
            {
                ConsultasDA consultasDA = new ConsultasDA();
                resultadoO = consultasDA.ConsultarControles(idCita);

            }
            catch (Exception)
            {

                throw;
            }
            return resultadoO;
        }

        public CONTROL ConsultarControl(int idControl)
        {
            CONTROL resultadoO = new CONTROL();
            try
            {
                ConsultasDA consultasDA = new ConsultasDA();
                resultadoO = consultasDA.ConsultarControl(idControl);

            }
            catch (Exception)
            {

                throw;
            }
            return resultadoO;
        }

    }
}
