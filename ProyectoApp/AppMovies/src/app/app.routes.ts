import { Routes } from '@angular/router';
import { ListMoviesComponent } from './pages/list-movies/list-movies.component';
import { MoviesDetailsComponent } from './pages/movies-details/movies-details.component';

export const routes: Routes = [
  { path: '', component: ListMoviesComponent },
  { path: 'movie/:id', component: MoviesDetailsComponent }
];