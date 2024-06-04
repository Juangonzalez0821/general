import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { ActivatedRoute, RouterModule } from '@angular/router';
import { MoviesServicesService } from '../../Services/movies-services.service';

@Component({
  selector: 'app-movies-details',
  standalone: true,
  imports: [CommonModule, HttpClientModule,RouterModule],
  templateUrl: './movies-details.component.html',
  styleUrls: ['./movies-details.component.css'],
  providers: [MoviesServicesService]
})
export class MoviesDetailsComponent implements OnInit {
  movie: any;
  backgroundStyle: any;

  constructor(
    private route: ActivatedRoute,
    private movieService: MoviesServicesService
  ) {}

  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id');
    if (id) {
      this.movieService.getMovieDetails(Number(id)).subscribe((data: any) => {
        this.movie = data;
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
