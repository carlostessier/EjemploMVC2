package org.mvc.modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ComidaDAOSqlite implements ComidaDAO {
    
    Connection connection;

    public ComidaDAOSqlite()   {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:bbdd/comidas.db");
            System.out.println("Conectado a la base de datos");
            crearTablaComida();
        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos");
            System.err.println(e.getMessage());
        }
    }

    private void crearTablaComida() {
        try (Statement statement = connection.createStatement()){
            String crearTablar ="CREATE TABLE IF NOT EXISTS comida("
                    +"id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    +"nombre TEXT NOT NULL UNIQUE)";
            statement.executeUpdate(crearTablar);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void guardar(Comida comida) {
        try(Statement st = connection.createStatement()){
            String insertarComida = "INSERT INTO comida(nombre) VALUES('"+comida.getNombre()+"')";
            st.executeUpdate(insertarComida);
        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void borrar(Comida comida) {

    }

    @Override
    public void buscar(Comida comida) {

    }

    @Override
    public void modificar(Comida comida) {

    }

    @Override
    public List<Comida> listar() {
        ArrayList<Comida> comidas = new ArrayList<>();

        try(Statement st = connection.createStatement()){
            ResultSet rs;
            String consulta = "SELECT * FROM comida";
            rs = st.executeQuery(consulta);
            while(rs.next()){
                comidas.add(new Comida(rs.getString("nombre")));
            }
        } catch (SQLException e){
            System.err.println(e.getMessage());
        }

        return comidas;
    }
}
