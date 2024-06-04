// Importa los módulos necesarios de Angular Core y otras librerías.
import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { ActivatedRoute, RouterModule } from '@angular/router';

// Importa el servicio MoviesServicesService para interactuar con la API de películas.
import { MoviesServicesService } from '../../Services/movies-services.service';

// Define el componente de detalles de película.
@Component({
  selector: 'app-movies-details', // Selector del componente en el HTML.
  standalone: true, // Define si el componente es independiente o forma parte de otro componente.
  imports: [CommonModule, HttpClientModule, RouterModule], // Importa los módulos necesarios para el componente.
  templateUrl: './movies-details.component.html', // Ubicación del archivo HTML del componente.
  styleUrls: ['./movies-details.component.css'], // Ubicación de los archivos CSS de estilos del componente.
  providers: [MoviesServicesService] // Provee el servicio MoviesServicesService para el componente.
})
export class MoviesDetailsComponent implements OnInit {
  movie: any; // Variable para almacenar los detalles de la película.
  backgroundStyle: any; // Estilo de fondo para la imagen de la película.

  constructor(
    private route: ActivatedRoute, // Servicio para obtener los parámetros de la URL.
    private movieService: MoviesServicesService // Servicio para obtener los detalles de la película.
  ) {}

  ngOnInit(): void {
    // Obtiene el ID de la película de los parámetros de la URL.
    const id = this.route.snapshot.paramMap.get('id');
    if (id) {
      // Obtiene los detalles de la película del servicio.
      this.movieService.getMovieDetails(Number(id)).subscribe((data: any) => {
        this.movie = data; // Almacena los detalles de la película.
        // Define el estilo de fondo para la imagen de la película.
        this.backgroundStyle = {
          'background-image': `url(${this.movie.poster_path})`,
          'background-size': 'cover',
          'background-position': 'center center',
          'background-repeat': 'no-repeat'
        };
      });
    }
  }
}
