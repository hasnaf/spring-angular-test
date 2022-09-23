import { Article } from "./article.model";

export class Order {
    id?:number;
    date ?: Date;
    articles!:any;
}