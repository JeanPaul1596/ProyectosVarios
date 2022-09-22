using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace ProyectoFinal.Models
{
    public class Inventario
    {
        [Key]

        public int Id { get; set; }

        public string Producto { get; set; }

        public int Cantidad { get; set; }
    }
}
