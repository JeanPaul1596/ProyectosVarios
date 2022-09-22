using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace ProyectoFinal.Models
{
    public class ClienteModels
    {
        public int IDCITA { get; set; }
        [Required]
        [StringLength(9)]
        [Display(Name = "Cédula del cliente:")]
        public string IDCLIENTE { get; set; }

        [Required]
        [StringLength(80)]
        [Display(Name = "Nombre del cliente:")]
        public string NOMBRECLIENTE { get; set; }

        [Required]
        [StringLength(80)]
        [Display(Name = "Apellido del cliente:")]
        public string APELLIDOCLIENTE { get; set; }

        [Required]
        [StringLength(50)]
        [Display(Name = "Dirección del cliente:")]
        public string DIRECCIONCLIENTE { get; set; }


        [Required]
        [DataType(DataType.PhoneNumber)]
        [Display(Name = "Número de teléfono:")]
        public int TELEFONOCLIENTE { get; set; }

        [Required]
        [StringLength(500)]
        [Display(Name = "Motivo de la cita:")]
        public string MOTIVOCITA { get; set; }

        [Required]
        [StringLength(80)]
        [Display(Name = "Nombre de la mascota:")]
        public string NOMBREMASCOTA { get; set; }

        [Required]
        [DataType(DataType.Date)]
        [Display(Name = "Fecha de la cita:")]
        public string FECHACITA { get; set; }

        
        public bool ESTADO { get; set; }
    }
}