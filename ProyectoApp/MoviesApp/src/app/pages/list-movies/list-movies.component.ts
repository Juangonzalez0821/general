import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { MoviesServicesService } from '../../Services/movies-services.service';



@Component({
  selector: 'app-list-movies',
  standalone: true,
  imports: [CommonModule, HttpClientModule, RouterModule],
  templateUrl: './list-movies.component.html',
  styleUrls: ['./list-movies.component.css'],
  providers: [MoviesServicesService]
})
export class ListMoviesComponent {
  popularMovies: any[] = [];

  constructor(private movieService: MoviesServicesService) {}

  ngOnInit(): void {
    this.movieService.getPopularMovies().subscribe((data: any) => {
      this.popularMovies = data.results;
    });
  }
}