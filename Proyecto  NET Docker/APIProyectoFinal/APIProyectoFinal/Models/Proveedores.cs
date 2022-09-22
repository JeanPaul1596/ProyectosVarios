﻿using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace APIProyectoFinal.Models
{
    public class Proveedores
    {
        [Key]

        public int Id { get; set; }

        public string Proveedor { get; set; }

        public string Numero { get; set; }

        public string Correo { get; set; }
    }
}
