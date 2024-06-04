// Importa el módulo HttpClient de Angular para realizar solicitudes HTTP.
import { HttpClient } from '@angular/common/http';

// Importa el decorador Injectable de Angular para marcar la clase como un servicio inyectable.
import { Injectable } from '@angular/core';

// Importa el operador map de la librería RxJS para transformar los datos de las respuestas HTTP.
import { map } from 'rxjs';

@Injectable({
  providedIn: 'root' // Marca la clase MoviesServicesService como un servicio raíz, disponible en toda la aplicación.
})
export class MoviesServicesService {
  // Clave de la API de TMDb
  private apiKey = 'b669207887c2ede44c7c1ee6d9fa6884';

  // URL base de la API de TMDb
  private apiUrl = 'https://api.themoviedb.org/3';

  // Base URL para las imágenes de póster en TMDb
  private imageBaseUrl = 'https://image.tmdb.org/t/p';

  constructor(private http: HttpClient) { }

  // Método para obtener las películas populares
  getPopularMovies() {
    // Construye la URL para la solicitud de películas populares
    const url = `${this.apiUrl}/movie/popular?api_key=${this.apiKey}`;

    // Realiza la solicitud HTTP GET y transforma la respuesta utilizando map de RxJS
    return this.http.get<any>(url).pipe(
      map((response: { results: any[]; }) => {
        // Agrega la URL completa de la imagen de póster a cada película en la respuesta
        response.results.map(movie => {
          movie.poster_path = `${this.imageBaseUrl}/w500/${movie.poster_path}`;
        });
        return response;
      })
    );
  }

  // Método para obtener los detalles de una película específica
  getMovieDetails(movieId: number) {
    // Construye la URL para la solicitud de detalles de la película específica
    const url = `${this.apiUrl}/movie/${movieId}?api_key=${this.apiKey}`;

    // Realiza la solicitud HTTP GET y transforma la respuesta utilizando map de RxJS
    return this.http.get<any>(url).pipe(
      map(movie => {
        // Agrega la URL completa de la imagen de póster a la película en la respuesta
        movie.poster_path = `${this.imageBaseUrl}/w500/${movie.poster_path}`;
        return movie;
      })
    );
  }
}
