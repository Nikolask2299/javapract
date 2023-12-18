/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpackage;

import java.util.ArrayList;


/**
 *
 * @author user
 */
public class Build_Data {
    ArrayList <Users> DataList;

    private int primIndex = -1;

    public int UpPrimIndex() {
        if (DataList.size() == 0){
            return -1;
        }

        if (primIndex + 1 > DataList.size() - 1) {
            this.primIndex = 0;
            return primIndex;
        }
        this.primIndex = primIndex + 1;
        return primIndex;
    }

    public int DownPrimIndex() {
        if (DataList.size() == 0){
            return -1;
        }

        if (primIndex - 1 < 0) {
            this.primIndex = DataList.size() - 1;
            return primIndex;
        }
        this.primIndex = primIndex - 1;
        return primIndex;
    }

    public void SetPrimIndex(int primIndex) {
        this.primIndex = primIndex;
    }

    public int GetPrimIndex() {
        return primIndex;
    }


    public Build_Data(){
        this.DataList = new ArrayList <Users>() ;
    }

    public void PutData(Users user) {
        DataList.add(user);
    }
    
    public Users GetData(int index){
        Users user = DataList.get(index);
      return user;
    }
    
    public void RemoveData(int index){
        DataList.remove(index);
    }
    
    public int Search(String[] mass) {
        int ind = -1;
        for (Users us : DataList){
            if (ChekSearch(mass, us)){
                ind = DataList.indexOf(us);
                break;
            }
        }
        return ind;
    }

    public void ClearData() {
        DataList.clear();
    }


    public String SearString(int index) {
                String users = "";
                if (index == -1) {
                    users = "Пользователь не найден, проверьте правильность вводимых данных!";
                    return users;  
                } else {
                    Users us = GetData(index);
                    users += "ID Users: " + us.getIDUser();
                    users += "\nИмя пользователя:" + us.getName();
                    users += "\nФамилия пользователя:" + us.getSurname();
                    users += "\nОтчество пользователя:" + us.getParonyc();
                    users += "\nТелефон пользователя:" + us.getTelephone();
                    users += "\nВозраст пользователя:" + us.getAgeUser();
                    users += "\nМодель авто пользователя:" + us.getModelAuto();
                    users += "\nГосномер авто пользователя:" + us.getAutoNumber();
                    users += "\nАдрес пользователя:" + us.getAdressUser();
                    users += "\nНаличие льгот у пользователя:" + us.getBnefits();
                    users += "\nКатегория льготы пользователя:" + us.getBenefCateg();
                    return users;      
                }
    }
    
    public boolean ChekSearch(String[] mass,Users user) {
            boolean Check = false;
            if (!mass[0].isEmpty()) {
                if (Integer.parseInt(mass[0]) == user.getIDUser()){
                    Check = true;
                } else {
                    return false;
                }
            }
            if (!mass[1].isEmpty()) {
                if (mass[1].equals(user.getName())){
                    Check = true;
                } else {
                    return false;
                }
            }
            if (!mass[2].isEmpty()) {
                if (mass[2].equals(user.getSurname())){
                    Check = true;
                } else {
                    return false;
                }
                
            }
            if (!mass[3].isEmpty()) {
                if (mass[3].equals(user.getParonyc())){
                    Check = true;
                } else {
                    return false;
                }
            }
            if (!mass[4].isEmpty()) {
                if (mass[4].equals(user.getTelephone()) ){
                    Check = true;
                } else {
                    return false;
                }
            }
            if (!mass[5].isEmpty()) {
                if (Integer.parseInt(mass[5]) == user.getAgeUser()){
                    Check = true;
                } else {
                    return false;
                }
            }
            if (!mass[6].isEmpty()) {
                if (mass[6].equals(user.getModelAuto())){
                    Check = true;
                } else {
                    return false;
                }
            }
            if (!mass[7].isEmpty()) {
                if (mass[7].equals(user.getAutoNumber())){
                    Check = true;
                } else {
                    return false;
                }
            }
            if (!mass[8].isEmpty()) {
                if (mass[8].equals(user.getAdressUser())){
                    Check = true;
                } else {
                    return false;
                }
            }
            if (!mass[9].isEmpty()) {
                if (Boolean.parseBoolean(mass[9]) == user.getBnefits()){
                    Check = true;
                    if (mass[10].equals(user.getBenefCateg())) {
                        Check = true;
                    } else {
                        return false;
                    }

                } else {
                    return false;
                }
            }
            return Check;

    }

   public void RedactorUser(int Key, String Value) {
        if (Key == 1) {
            DataList.get(primIndex).setName(Value);
        }
        if (Key == 2) {
            DataList.get(primIndex).setSurname(Value);
        }
        if (Key == 3) {
            DataList.get(primIndex).setParonyc(Value);
        }
        if (Key == 4) {
            DataList.get(primIndex).setTelephone(Value);
        }
        if (Key == 5) {
            DataList.get(primIndex).setAgeUser(Integer.parseInt(Value));
        }
        if (Key == 6) {
            DataList.get(primIndex).setModelAuto(Value);
        }
        if (Key == 7) {
            DataList.get(primIndex).setAutoNumber(Value);
        }
        if (Key == 8) {
            DataList.get(primIndex).setAdressUser(Value);
        }
        if (Key == 9) {
            DataList.get(primIndex).setBenefits(Boolean.parseBoolean(Value));
        }
        if (Key == 10) {
            DataList.get(primIndex).setBenefCateg(Value);
        }
    }
}
