using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using APIAutomoviles.Models;

namespace APIAutomoviles.Data
{
    public class APIAutomovilesContext : DbContext
    {
        public APIAutomovilesContext (DbContextOptions<APIAutomovilesContext> options)
            : base(options)
        {
        }

        public DbSet<APIAutomoviles.Models.Automovil> Automovil { get; set; }
    }
}
