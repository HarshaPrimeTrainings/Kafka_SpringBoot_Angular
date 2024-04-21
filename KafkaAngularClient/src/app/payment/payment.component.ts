import { Component } from '@angular/core';
import { WebSocketService } from '../web-socket.service';

@Component({
  selector: 'app-payment',
  standalone: true,
  imports: [],
  templateUrl: './payment.component.html',
  styleUrl: './payment.component.css',
  providers:[WebSocketService]
})
export class PaymentComponent {

  public message:any;

constructor(private websockserv:WebSocketService){
  let stomplcient =  websockserv.initWebsock();

  stomplcient.connect({},(frame: any)=>{
    stomplcient.subscribe('/ordertopic/hello',(notification: any)=>{
      console.log(notification);
      this.message = notification.body;
    });
  });

}




}
