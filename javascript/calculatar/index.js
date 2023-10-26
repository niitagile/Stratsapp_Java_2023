//to fetch display div in js
let display=document.getElementById("display");
//buttons is an array of multiple div which are using class ="button"
let buttons=Array.from(document.getElementsByClassName("button")); 
//map() is used to tranform an array and return a new arrya with all changes
//map takes each value of array as an argument and perform some task on it by using arraw function

buttons.map(
(button)=>{
//addEventListener takes 2 arguements-1 event name 2. arraow function to run on event
button.addEventListener("click",(e)=>{

switch(e.target.innerText){
case "C" : display.innerText="";
           break;
case "=" : if(display.innerText=="")
                alert("Please enter some value")
            else{
                 try{   
                display.innerText=eval(display.innerText);
                 }
                 catch{
                    display.innerText="Error";
                 }
            }    
            break;

case "Backspace" : 
            display.innerText=display.innerText.substring(0,display.innerText.length-1);
            break;

default : display.innerText+=e.target.innerText;
}


});



});




