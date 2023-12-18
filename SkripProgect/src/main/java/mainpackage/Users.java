package mainpackage;

import java.io.Serializable;
import java.io.ObjectInputStream.GetField;

public class Users implements Serializable{
    
    private int IDUser;
    private String Name;
    private String Surname;
    private String Paronyc;
    private String Telephone;
    private int AgeUser;
    private String ModelAuto;
    private String AutoNumber;
    private String AdressUser;
    private boolean Benefits;
    private String BenefCateg;
    private String FileCarUser;

    public void NewUsers(int iduser, String name, String surname, String parony, 
                      String teleph, int age, String model, String numb, String adress , 
                      boolean benef, String categ, String file){
        this.IDUser = iduser;
        this.Name = name;
        this.Surname = surname;
        this.Paronyc = parony;
        this.Telephone = teleph;
        this.AgeUser = age;
        this.ModelAuto = model;
        this.AutoNumber = numb;
        this.AdressUser = adress;
        this.Benefits = benef;
        if (categ.isEmpty()) {
            this.BenefCateg = "Not categor";
        } else {
            this.BenefCateg = categ;
        }
        if (file.isEmpty()) {
            this.FileCarUser = "empty";
        } else {
            this.FileCarUser = file;
        }
        
    }
    
    
    public int getIDUser() {
        return IDUser;
    }
    
    public void setIDUser(int iduser) {
        this.IDUser = iduser;
    }
    
    
    
    public String getName() {
        return Name;
    } 
    
    public void setName(String name) {
        this.Name = name;
    }
    
    
    
    public String getSurname() {
        return Surname;
    }
    
    public void setSurname(String surname) {
        this.Surname = surname;
    }
    
    
    
    public String getParonyc() {
        return Paronyc;
    }
    
    public void setParonyc(String parony) {
        this.Paronyc = parony;
    }
    
    

    public String getTelephone() {
        return Telephone;
    }
    
    public void setTelephone(String teleph) {
        this.Telephone = teleph;
    }
    
    
    
    public int getAgeUser() {
        return AgeUser;
    }
    
    public void setAgeUser(int age) {
        this.AgeUser = age;
    }
    
    
    
    public String getModelAuto() {
        return ModelAuto;
    }
    
    public void setModelAuto(String model) {
        this.ModelAuto = model;
    }
    
    
    
     public String getAutoNumber() {
        return AutoNumber;
    }
    
    public void setAutoNumber(String numb) {
        this.AutoNumber = numb;
    }
    
    
   
    public String getAdressUser() {
        return AdressUser;
    }
    
    public void setAdressUser(String adress) {
        this.AdressUser = adress;
    }
    
    
    
    public boolean getBnefits() {
        return Benefits;
    }
    
    public void setBenefits(boolean benef) {
        this.Benefits = benef;
    }
    
    
    
    public String getBenefCateg() {
        return BenefCateg;
    }
    
    public void setBenefCateg(String categ) {
        this.BenefCateg = categ;
    }
    
    public String GetFieled() {
        return FileCarUser;
    }

    public void SetFieled(String file) {
        this.FileCarUser = file;
    }
    
    
    @Override
    public String toString() {
        return IDUser + "," + Name + "," + Surname + "," + Paronyc + "," + Telephone + "," + AgeUser + "," + ModelAuto + "," + AutoNumber + "," + AdressUser + "," + Benefits +
                "," + BenefCateg + "\n";
    }

}