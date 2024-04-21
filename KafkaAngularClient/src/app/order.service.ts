import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { orderdetails } from './orderdetails';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  constructor(private http:HttpClient) { 

  }

  placeOrder(order:orderdetails){
  return this.http.post('http://localhost:8080/save',order);
  }
}
