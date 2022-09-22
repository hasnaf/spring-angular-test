import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ArticleAddComponent } from './article-add/article-add.component';
import { ArticleListComponent } from './article-list/article-list.component';
import { OrderListComponent } from './order-list/order-list.component';

const routes: Routes = [
  {path : 'addArticle', component : ArticleAddComponent},
  {path : 'listArticle', component : ArticleListComponent},
  {path : 'listOrder', component : OrderListComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
