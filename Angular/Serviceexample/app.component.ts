import { Component,OnInit } from '@angular/core';
import { DisplayService } from './display.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'serviceexample';
  value: string = ""; 
  productList: Array<any>=[];
   constructor(private appService: DisplayService) { } 
   ngOnInit(): void { 
      this.value = this.appService.getApp();
      this.productList=this.appService.getProducts(); 
   }   
}

