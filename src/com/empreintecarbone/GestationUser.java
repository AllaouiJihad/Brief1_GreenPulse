package com.empreintecarbone;

import java.util.ArrayList;
import java.util.HashMap;

public class GestationUser {

    private HashMap<String,User> users = new HashMap<>();

    public  void createUser(String name, int age, String id){

        User newUser = new User(name,age,id);
        users.put(newUser.getId(), newUser);

        System.out.println("user cree avec success , id = "+ newUser.getId() );
    }

    public void updateUser(String name, int age, String id){
        User user = users.get(id);
        if (user == null) {
            System.out.println("aucun utilisateur trouvé !!");
        }
        else {
            user.setName(name);
            user.setAge(age);
            System.out.println("modifier avec success , "+ users.values());
        }
    }

    public void deleteUser(String id){
        User user = users.get(id);

        if (user == null){
            System.out.println("aucun utilisateur trouvé !!");
        }
        else {
            users.remove(id);
            System.out.println("user supprimer avec success ");
        }
    }
    public void getUsers(){

        if (users.isEmpty()){
            System.out.println("aucun utilisateur trouvé !!");
        }else {
            System.out.println("-----USers------ \n");
            for (User user : users.values() ){

                System.out.println(user);

            }
        }
    }

    public void getUser(String id){

        if (users.get(id) != null){
            System.out.println(users.get(id));
        }
        else {
            System.out.println("aucun utilisateur trouvé !!");
        }
    }

    public boolean UserExist(String id){
        if (users.get(id) == null){
            return false;
        }
        else {
            return true;
        }
    }
    public void addConsomationToUser(String id, CarbonConsommation consommation){

        User user = users.get(id);
        if(user != null){
            user.addConsomation(consommation);
            System.out.println("consommation ajouter avec sucess ,avec volume = "+ consommation.getValue());
        }else {
            System.out.println("aucun utilisateur trouve !");
        }
    }
}
