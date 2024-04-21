import { Routes } from '@angular/router';
import { OrderComponent } from './order/order.component';
import { PaymentComponent } from './payment/payment.component';
import { ProductComponent } from './product/product.component';

export const routes: Routes = [
    {path:'orders',component:OrderComponent},
    {path:'payment',component:PaymentComponent},
    {path:'products',component:ProductComponent}
];
