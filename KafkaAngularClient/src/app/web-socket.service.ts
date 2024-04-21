import { Injectable } from '@angular/core';

import SockJs from "sockjs-client";
import Stomp from "stompjs";

//var SockJs = require("sockjs-client");
//var Stomp = require("stompjs");

@Injectable({
  providedIn: 'root'
})
export class WebSocketService {

  constructor() { }


  initWebsock(){
    let sockjs = new SockJs('http:localhost:8087/websocketenv');
    let stompclient  = Stomp.over(sockjs);
    return stompclient;
  }
}
