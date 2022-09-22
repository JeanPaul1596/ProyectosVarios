using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace ProyectoFinal.Models
{
    public class Ventas
    {
        [Key]
        public int Id { get; set; }

        public string Categoria { get; set; }

        public string Producto { get; set; }

        public int Cantidad { get; set; }

        public int Precio { get; set; }

        public string Vendedor { get; set; }

        public DateTime Fecha { get; set; }

    }
}
