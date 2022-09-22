using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace APIAutomoviles.Models
{
    public class Automovil
    {
        [Key]

        public int Id { get; set; }

        public string Descripcion { get; set; }

        public string Modelo { get; set; }

        public string Motor { get; set; }

        public int Puertas { get; set; }

        public int Pasajeros { get; set; }

        public string Comentarios { get; set; }
    }
}
