package com.ibm.tickets.controller;

@Controller
@RequestMapping(“/home”)
class Home{
    
    @GetMapping
    public String getHome(){
        return “home”
    }
}