using Microsoft.AspNetCore.Identity.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Text;
using ProyectoFinal.Models;

namespace ProyectoFinal.Data
{
    public class ApplicationDbContext : IdentityDbContext
    {
        public ApplicationDbContext(DbContextOptions<ApplicationDbContext> options)
            : base(options)
        {
        }
        public DbSet<ProyectoFinal.Models.Ventas> Ventas { get; set; }
        public DbSet<ProyectoFinal.Models.Proveedores> Proveedores { get; set; }
        public DbSet<ProyectoFinal.Models.Inventario> Inventario { get; set; }
    }
}
