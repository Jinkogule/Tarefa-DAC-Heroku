package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
     
    private String aut;
    private String lang;
    private String msg;
    private String msg2;
    private String msg3;
        
    public MessageBean() {
    }
    
    public String getAut() {
        return "Lucas Pimenta";
    }
    
    public void setLang(String value) {
        lang = value;
    }

    public void setTime(String value) {
        time = value;
    }
    
    public String getMsg() {
        switch (this.lang){
            case "pt":
                return "Alô";
            case "en":
                return "Hello";
            case "de":
                return "Hallo";
            case "fr":
                return "Bonjour";
        }
        return "";
    }
    public String getMsg2() {
        switch (this.lang){
            case "pt":
                return "Elaborado por";
            case "en":
                return "Created by";
            case "de":
                return "Erstellt von";
            case "fr":
                return "Créé par";
        }
        return "";
    }
    public String getMsg3() {
        //dia
        if (this.lang == "pt" && this.time == "dia"){
            return "Bom dia!"
        }
        else if (this.lang == "en" && this.time == "dia"){
            return "Good morning!"
        }
        else if (this.lang == "de" && this.time == "dia"){
            return "Guten Tag!"
        }
        else if (this.lang == "fr" && this.time == "dia"){
            return "Bonjour!"
        }

        //tarde
        else if (this.lang == "pt" && this.time == "tarde"){
            return "Boa tarde!"
        }
        else if (this.lang == "en" && this.time == "tarde"){
            return "Good afternoon!"
        }
        else if (this.lang == "de" && this.time == "tarde"){
            return "Guten Nachmittag!"
        }
        else if (this.lang == "fr" && this.time == "tarde"){
            return "Bon après-midi!"
        }

        //noite
        else if (this.lang == "pt" && this.time == "noite"){
            return "Boa noite!"
        }
        else if (this.lang == "en" && this.time == "noite"){
            return "Good evening!"
        }
        else if (this.lang == "de" && this.time == "noite"){
            return "Guten Abend!"
        }
        else if (this.lang == "fr" && this.time == "noite"){
            return "Bonsoir!"
        }

        else{
            return "";
        }
        
    }
}
