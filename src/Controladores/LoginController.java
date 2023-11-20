package Controladores;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import aplicacion.Main;
import conexion.Conexion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private Button btnIngresar;

    @FXML
    private TextField txtUsuario;

    @FXML
    private TextField txtcontrasenya;

	Conexion conexion = new Conexion();
	Connection con = conexion.conectar();

	private Main aplicacion;

	

    @FXML
    void Ingresar(ActionEvent event) {
    	String SQL = "SELECT * FROM Persona WHERE email = ? and contrasenya=?";
    	try {
    		PreparedStatement statement = con.prepareStatement(SQL);

           statement.setString(1, txtUsuario.getText());
           statement.setString(2, txtcontrasenya.getText());
           ResultSet resultSet = statement.executeQuery();
           if (resultSet.next()) {
        	   String tipoUsuario = resultSet.getString("rol");
        	   JOptionPane.showMessageDialog(null,"Inicio de sesi�n exitoso. �Bienvenido! ->" +tipoUsuario);
        	   if ("admin".equals(tipoUsuario)) {
        		   aplicacion.mostrarVentanaPrincipalEmpresa();
        	   }else {
            	   aplicacion.mostrarVentanaPrincipalCliente();
        	   }
        	   aplicacion.setIdUsuario(resultSet.getString(1));
           } else {
        	   JOptionPane.showMessageDialog(null,"Correo electr�nico. Por favor, int�ntalo de nuevo." +txtUsuario.getText() + "contra"+txtcontrasenya.getText());
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
	
    public Main getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(Main aplicacion) {
		this.aplicacion = aplicacion;
	}
	



}
