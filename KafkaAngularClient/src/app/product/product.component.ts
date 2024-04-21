import { Component } from '@angular/core';
import { OrderService } from '../order.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-product',
  standalone: true,
  imports: [HttpClientModule],
  templateUrl: './product.component.html',
  styleUrl: './product.component.css',
  providers:[OrderService,HttpClient]
})
export class ProductComponent {

  constructor(private orderservice:OrderService){

  }

  saveOrder(prodcut:string,status:string,price:number){
    let orderid = 123;
    let order = {
      oid: orderid,
      product:prodcut,
      status:status,
      price:price
    }
    this.orderservice.placeOrder(order).subscribe(res=>{
      alert('Ordedr placed');
      console.log('Order Placed');
    });
  }
 


}
