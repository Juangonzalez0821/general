import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { ActivatedRoute, RouterModule } from '@angular/router';
import { MoviesServicesService } from 'src/app/Services/movies-services.service';


@Component({
  selector: 'app-movies-details',
  standalone: true,
  imports: [CommonModule, HttpClientModule, RouterModule],
  templateUrl: './movies-details.component.html',
  styleUrls: ['./movies-details.component.css'],
  providers: [MoviesServicesService]
})
export class MoviesDetailsComponent {
  movie: any;

  constructor(
    private route: ActivatedRoute,
    private movieService: MoviesServicesService
  ) {}

  ngOnInit(): void {
    const id = this.route.snapshot.paramMap.get('id');
    this.movieService.getMovieDetails(Number(id)).subscribe((data: any) => {
      this.movie = data;
    });
  }
}
