// Importa los módulos necesarios de Angular Core y otras librerías.
import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';

// Importa el servicio MoviesServicesService para interactuar con la API de películas.
import { MoviesServicesService } from '../../Services/movies-services.service';

// Define el componente de lista de películas.
@Component({
  selector: 'app-list-movies', // Selector del componente en el HTML.
  standalone: true, // Define si el componente es independiente o forma parte de otro componente.
  imports: [CommonModule, HttpClientModule, RouterModule], // Importa los módulos necesarios para el componente.
  templateUrl: './list-movies.component.html', // Ubicación del archivo HTML del componente.
  styleUrls: ['./list-movies.component.css'], // Ubicación de los archivos CSS de estilos del componente.
  providers: [MoviesServicesService] // Provee el servicio MoviesServicesService para el componente.
})
export class ListMoviesComponent {
  popularMovies: any[] = []; // Array para almacenar las películas populares.

  constructor(private movieService: MoviesServicesService) {} // Constructor del componente con inyección de dependencia.

  ngOnInit(): void {
    // Método que se ejecuta al inicializar el componente.
    this.movieService.getPopularMovies().subscribe((data: any) => {
      // Suscribe al servicio para obtener las películas populares y actualiza el array popularMovies.
      this.popularMovies = data.results;
    });
  }
}
