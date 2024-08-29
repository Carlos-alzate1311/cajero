package com.cajero.backendcajero.Entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Usuario {

    @Id
    @GeneratedValue( generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String idUsuario;
    @Column(nullable = false)
    private String nombreUsuario;
    private String apellidoUsuario;
    private String userName;
    private String password;
    
    @Override
    public String toString() {
        return "Usuario [idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", apellidoUsuario="
                + apellidoUsuario + ", userName=" + userName + ", password=" + password + "]";
    }

    
}
