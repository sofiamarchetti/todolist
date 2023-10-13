package com.sofiarocketseat.todolist.user;

import lombok.Data;

@Data //para adicionar getters e setters através do Lombok
public class UserModel {

    public String username;
    public String name;
    public String password;
}