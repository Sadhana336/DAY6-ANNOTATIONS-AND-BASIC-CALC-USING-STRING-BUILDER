package com.example.frontendbackend;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

//@Controller //it consider whatever we create as api
@RestController //it consider whatever we create as api

//METHOD 1:ONLY ONE FUNC USING IF AND ELSE
public class TASK1Springbootannotations {


    @GetMapping("/hi/{name}") //endpoints to print String
    public String sayHello( @PathVariable String name){

        return "Hi "+  name;

    }
    @GetMapping("calc/{type}/{n1}/{n2}") //endpoints to add two numbers,we use pathvariable
    public String calc(@PathVariable String type, @PathVariable int n1,@PathVariable int n2){
        if(type.equals("add2")){
            int  result=n1+n2;
            return "Addition " + result;
        }
        else if(type.equals("sub")){
            int  result=n2-n1;
            return "Subtraction " + result;
        }
        else if(type.equals("mul")){
            int  result=n1*n2;
            return "Multiplication "+result;
        }

        int  result=n2/n1;
        return "Division " + result;


    }
    //METHOD 2:SEPARATE FUNC
    @GetMapping("add2/{n1}/{n2}") //endpoints to add two numbers,we use pathvariable
    public String calc1( @PathVariable int n1,@PathVariable int n2){
        int  result=n1+n2;
        return "Addition " + n1+n2;
    }
    @GetMapping("sub/{n2}/{n1}") //endpoints to add two numbers,we use pathvariable
    public String calc2( @PathVariable int n1,@PathVariable int n2){
        int  result=n2-n1;
        return "Subtraction " + result;
    }
    @GetMapping("mul/{n1}/{n2}") //endpoints to add two numbers,we use pathvariable
    public String calc3( @PathVariable int n1,@PathVariable int n2){
        int  result=n1*n2;
        return "Multiplication "+result;
    }
    @GetMapping("div/{n2}/{n1}") //endpoints to add two numbers,we use pathvariable
    public String calc4( @PathVariable int n1,@PathVariable int n2){
        int  result=n2/n1;
        return "Division " + result;
    }
    //To check whether the given name is my name
    @GetMapping("check/{name1}") //endpoints to add two numbers,we use pathvariable
    public String name( @PathVariable String name1){
        String name = name1.toLowerCase();
        if(name.equals("sadhana")){
            return "It's my name:Sadhana";
        }
        else{
            return "It's not my name";
        }
    }
    //to check even or odd
    @GetMapping("evenorodd/{n1}/{n2}") //endpoints to add two numbers,we use pathvariable
    public String evenorodd( @PathVariable int n1,@PathVariable int n2){
        int res=n1+n2;
        if(res%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }
    @GetMapping("/name")
    public String sayName(){
        return "Sadhana";
    }
    @GetMapping("/address")
    public String sayAddress(){
        return "5/215,VPK Garden,Coimbatore";
    }
    @GetMapping("/favcolor")
    public String sayColor(){
        return "lavender";
    }
}
