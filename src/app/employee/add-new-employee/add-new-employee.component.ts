import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/domain/product';

@Component({
  selector: 'app-add-new-employee',
  templateUrl: './add-new-employee.component.html',
  styleUrls: ['./add-new-employee.component.css']
})
export class AddNewEmployeeComponent implements OnInit {
  product : Product=new  Product();
  constructor() { }

  ngOnInit(): void {
  }
addNewProduct()
{
  console.log("in addnewproduct()");
  console.log(this.product);
}

}
