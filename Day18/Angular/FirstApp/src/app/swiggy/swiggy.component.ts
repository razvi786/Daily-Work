import { Component, OnInit } from '@angular/core';
import { DeliveryService } from '../delivery.service';
import {FoodItems} from '../models/food-items';

@Component({
  selector: 'app-swiggy',
  templateUrl: './swiggy.component.html',
  styleUrls: ['./swiggy.component.css']
})
export class SwiggyComponent implements OnInit {

  foodItem:FoodItems;
  itemDelivered:boolean;

  constructor(private delivery:DeliveryService) { }

  getFoodItem(){
    this.foodItem=this.delivery.items[1];
    this.itemDelivered=true;
  }

  ngOnInit() {
  }

}
