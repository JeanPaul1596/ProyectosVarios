//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Model
{
    using System;
    using System.Collections.Generic;
    
    public partial class CLIENTE
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public CLIENTE()
        {
            this.CONTROL = new HashSet<CONTROL>();
        }
    
        public int IDCITA { get; set; }
        public int IDCLIENTE { get; set; }
        public string NOMBRECLIENTE { get; set; }
        public string APELLIDOCLIENTE { get; set; }
        public string DIRECCIONCLIENTE { get; set; }
        public int TELEFONOCLIENTE { get; set; }
        public string MOTIVOCITA { get; set; }
        public string NOMBREMASCOTA { get; set; }
        public string FECHACITA { get; set; }
        public bool ESTADO { get; set; }
    
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<CONTROL> CONTROL { get; set; }
    }
}
