import { Injectable } from '@angular/core';
import { FoodItems } from './models/food-items'

@Injectable({
  providedIn: 'root'
})
export class DeliveryService {

  items:FoodItems[] = [
    {id:0,name:'Pizza',price:200,restaurant:'Pista House',quantity:2},
    {id:1,name:'Chapati',price:20,restaurant:'Arich Cafeteria',quantity:4},
    {id:2,name:'Biryani',price:100,restaurant:'Grand Biryani House',quantity:1},
    {id:3,name:'Shawarma',price:70,restaurant:'Saudi House',quantity:2},
    {id:4,name:'Mandi',price:300,restaurant:'Hyderabadi Mandi',quantity:1},
  ]

  constructor() { }
}
