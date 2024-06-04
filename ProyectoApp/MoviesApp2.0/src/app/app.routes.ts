import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { SearchComponent } from './pages/search/search.component';
import { MoviesComponent } from './pages/movies/movies.component';

export const routes: Routes = [
    { path: 'home', component: HomeComponent },
    { path: 'search/:text', component: SearchComponent },
    { path: 'movie/:id', component: MoviesComponent },
    { path: '', pathMatch: 'full', redirectTo: '/home' },
    { path: '**', pathMatch: 'full', redirectTo: '/home' }
];
