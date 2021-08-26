/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaeeapp.controller;

import com.javaeeapp.entities.Autor;
import com.javaeeapp.model.AutorFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author MATEO AVILA
 */
@Named(value = "controllerAutor")
@SessionScoped
public class ControllerAutor implements Serializable {

    @EJB
    private AutorFacade autorFacade;

    private Autor autor;

    public ControllerAutor() {
        this.autor = new Autor();
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    //metodo para listar todo los autores 
    public List<Autor> ListAllAutor() {
        return autorFacade.findAll();
    }

    //metodo para agregar unautores 
    public String AddAutor() {
        autorFacade.create(autor);
        this.autor = new Autor();
        return "index";
    }

    //preparamos los datos del autor a editar
    public String SelectEditAutor(Autor a) {
        this.autor = a;
        return "updateAutor";
    }

    //metodo para editar un autores 
    public String EditAutor() {
        this.autorFacade.edit(autor);
        this.autor = new Autor();
        return "index";
    }
    
//eliminar un alumno
    public void DeleteAutor(Autor a) {
        this.autorFacade.remove(a);
    }
}
