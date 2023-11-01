import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DisplayService {

  constructor() { }
  
  getApp(): string { 
    return "Hello world"; 
 } 

 getProducts():Array<any>{
 

  return [{name:"Rice", price:200},
          {name:"Sugar", price:40}
        ];

}
}
