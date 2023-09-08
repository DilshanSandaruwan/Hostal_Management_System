/*
 * Kasun Miuranga
 * Copyright (c) 2023
 */

package lk.ijse.dto;


public class UserDTO {
    private String id;
    private String name;
    private String password;

    public UserDTO(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public UserDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
