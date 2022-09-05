import { Category } from "./category";

export class Product{
    productId: string="";
    productName:string="";
    price:number=0;
    category:Category=new Category();
}