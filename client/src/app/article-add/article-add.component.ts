import { Component, OnInit } from '@angular/core';
import { FormBuilder,FormGroup, Validators } from '@angular/forms';
import { Article } from 'src/models/article.model';
import { MatDialogRef } from '@angular/material/dialog';
import { ArticleService } from 'src/services/article.service';

@Component({
  selector: 'app-article-add',
  templateUrl: './article-add.component.html',
  styleUrls: ['./article-add.component.css']
})
export class ArticleAddComponent implements OnInit {
  

  constructor(private fb:FormBuilder,
     private articleService: ArticleService ) 
    //  public dialogRef: MatDialogRef<ArticleAddComponent>,
     { }
  offerForm = this.fb.group({
    title: ["", Validators.required],
    prix: ["", Validators.required],
    companyName :["", Validators.required],
  });

  ngOnInit(): void {
  }

  onFileSelected(event:any){
    console.log(event);

  }

  onSubmit(){
    const newArticle: Article = {
      name: this.offerForm.get('title')?.value,
      prix: this.offerForm.get("prix")?.value,
      picture: this.offerForm.get("companyName")?.value,
      id:0
    };
    console.log(newArticle);
    this.articleService.addArticle(newArticle).subscribe(res => {
      console.log(res);
    })

  }

    onClose(){
      this.offerForm.reset();
      // this.offerForm.close();
    }
  
    reset(){
      this.offerForm.reset();
    }

}
