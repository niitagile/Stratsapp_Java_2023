import { Component } from '@angular/core';
import { CrudHttpService } from './crud-http.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-service-app';
  todoList:any = [];

  constructor(private crudHttpService: CrudHttpService){}

  ngOnInit(): void {
    this.listTodos();
  }

  //to display all records
  listTodos(){
    this.crudHttpService.list().subscribe(
      (response)=>{this.todoList = response;},
    (error=>{console.error("Some problem in geeting data");})
    );
  }





  //create new record
  createTodo(){
    let todo = {
      id: new Date().getTime(),
      title:`Some Todo` 
    }
    this.crudHttpService.create(todo).subscribe((response)=>{
      this.listTodos();
    },(error=>{

    }));
  }

  //modify record
  editTodo(todo: any){
    let data = {
      id: new Date().getTime(),
      title:`modify` 
    }
    this.crudHttpService.update(todo.id,data).subscribe((response)=>{
      this.listTodos();
    },(error=>{

    }));
  }

  //delete a record
  deleteTodo(id: any){
    this.crudHttpService.delete(id).subscribe((response)=>{
      this.listTodos();
    },(error=>{
    }));
  }
}



