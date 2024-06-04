import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MoviesServicesService {
  private apiKey = 'b669207887c2ede44c7c1ee6d9fa6884'; // Reemplace con su clave API
  private apiUrl = 'https://api.themoviedb.org/3';
  private imageBaseUrl = 'https://image.tmdb.org/t/p'; // Base URL para las imágenes de póster

  constructor(private http: HttpClient) { }

  getPopularMovies() {
    const url = `${this.apiUrl}/movie/popular?api_key=${this.apiKey}`;
    return this.http.get<any>(url).pipe(
      map((response: { results: any[]; }) => {
        // Agregar la URL completa de la imagen de póster a cada película
        response.results.map(movie => {
          movie.poster_path = `${this.imageBaseUrl}/w500/${movie.poster_path}`;
        });
        return response;
      })
    );
  }

  getMovieDetails(movieId: number) {
    const url = `${this.apiUrl}/movie/${movieId}?api_key=${this.apiKey}`;
    return this.http.get<any>(url).pipe(
      map(movie => {
        // Agregar la URL completa de la imagen de póster al objeto de la película
        movie.poster_path = `${this.imageBaseUrl}/w500/${movie.poster_path}`;
        return movie;
      })
    );
  }
}
