/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intefaces;

import Modelo.Producto;
import java.util.List;

/**
 *
 * @author diegoeekhout
 */
public interface CRUD {
    public List listar();
    public Producto list(int id);
    public boolean add(Producto per);
    public boolean edit(Producto per);
    public boolean eliminar(int id);
}
