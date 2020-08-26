
package ModeloDAO;

import Config.Conexion;
import Intefaces.CRUD;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ProductoDAO implements CRUD {

    
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Producto p=new Producto();
    
    @Override
    public List listar() {
        ArrayList<Producto>list=new ArrayList<>();
        String sql="select * from producto";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Producto pro=new Producto();
                pro.setId(rs.getInt("Id"));
                pro.setCod(rs.getString("Codigo"));
                pro.setNom(rs.getString("Nombres"));
                list.add(pro);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Producto list(int id) {
        String sql="select * from producto where Id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                p.setId(rs.getInt("Id"));
                p.setCod(rs.getString("Codigo"));
                p.setNom(rs.getString("Nombres"));
                
            }
        } catch (Exception e) {
        }
        return p;
    }

    @Override
    public boolean add(Producto pro) {
        String sql="insert into producto(Codigo, Nombres)values('"+pro.getCod()+"','"+pro.getNom()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Producto pro) {
         String sql="update persona set Codigo='"+pro.getCod()+"',Nombres='"+pro.getNom()+"'where Id="+pro.getId();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
       String sql="delete from producto where Id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    
    }
   
}
