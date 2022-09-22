using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace ProyectoFinal.Models
{
    public class ControlModels : BaseModels
    {
        public int IDCONTROL { get; set; }

        [Required]
        [StringLength(500)]
        [Display(Name = "Detalle del control:")]
        public string CONTROLMASCOTA { get; set; }

        [Required]
        [StringLength(80)]
        [Display(Name = "Nombre del Veterinario:")]
        public string NOMBREVETERINARIO { get; set; }

        [Required]
        [DataType(DataType.Date)]
        [Display(Name = "Próxima cita:")]
        public string CITAPROXIMA { get; set; }


        public int IDCITA { get; set; }
    }
}