import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-greet',
  templateUrl: './greet.component.html',
  styleUrls: ['./greet.component.css']
})
export class GreetComponent implements OnInit {
  ngOnInit(): void {
    
  }
// name:string="Kanika";
// greet():void{
//   alert("Hello"+this.name);
// }
// productList: Array<any>=[
//   {pname: "rice", price:200},
//   {pname:"sugar", price:50}
// ];
username:string="";
password:string="";
msg="";
status:string='error';

validate():void{
  if(this.username=="abc" && this.password=="123"){
  this.status='';
    this.msg="Welcome"+this.username;
  
  }
  else{
  this.msg="Invalid user";
  this.status='error';
  
  }
  
  this.username="";
  this.password="";
}


}
