package Controladores;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import aplicacion.Main;
import conexion.Conexion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import objects.Categoria;

public class EmpresaControler {

	Conexion conexion = new Conexion();
	Connection con = conexion.conectar();

	private Main aplicacion;
	
    public Main getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(Main aplicacion) {
		this.aplicacion = aplicacion;
	}
	
	@FXML
    void initialize() {
		//categoriacomboBox_cargarCategoriaPadre();
    }
	
    @FXML
    private ComboBox<Categoria> cbox_categoriaPadre;
    

    @FXML
    private Button btnCategoriaActualizar;

    @FXML
    private Button btnCategoriaBuscar;

    @FXML
    private Button btnCategoriaEliminar;

    @FXML
    private Button btnCategoriaInsertar;

    @FXML
    private Button btnHospedajeEliminar;

    @FXML
    private Button btn_ActualizarHospedaje;

    @FXML
    private Button btn_AutomovilActualizar;

    @FXML
    private Button btn_AutomovilBuscar;

    @FXML
    private Button btn_AutomovilCrear;

    @FXML
    private Button btn_AutomovilEliminar;

    @FXML
    private Button btn_BuscarHospedaje;

    @FXML
    private Button btn_CrearHospedaje;

    @FXML
    private Button btn_DestinoCrear;

    @FXML
    private Button btn_InstalacvionCrear;

    @FXML
    private Button btn_PaqueteTuristicoActualizar;

    @FXML
    private Button btn_PaqueteTuristicoBuscar;

    @FXML
    private Button btn_PaqueteTuristicoCrear;

    @FXML
    private Button btn_PaqueteTuristicoEliminar;

    @FXML
    private Button btn_articuloActualizar;

    @FXML
    private Button btn_articuloBuscar;

    @FXML
    private Button btn_articuloCrear;

    @FXML
    private Button btn_destinoActualizar;

    @FXML
    private Button btn_destinoBuscar;

    @FXML
    private Button btn_destinoEliminar;

    @FXML
    private Button btn_habitacionActualizar;

    @FXML
    private Button btn_habitacionBuscar;

    @FXML
    private Button btn_habitacionCrerar;

    @FXML
    private Button btn_habitacionEliminar;

    @FXML
    private TextField btn_hospedajeDescripcion;

    @FXML
    private TextField btn_hospedajeTipo;

    @FXML
    private TextField btn_hospedajeUbicacion;

    @FXML
    private TextField btn_hospedajeestadoContrato;

    @FXML
    private TextField btn_hospedajenombre;

    @FXML
    private Button btn_instalacionActualizar;

    @FXML
    private Button btn_instalacionBuscar;

    @FXML
    private Button btn_instalacionEliminar;

    @FXML
    private Button btn_personaActualizar;

    @FXML
    private Button btn_personaBuscar;

    @FXML
    private Button btn_personaCrear;

    @FXML
    private Button btn_personaEliminar;

    @FXML
    private Button btn_politicaPaqueteActualizar;

    @FXML
    private Button btn_politicaPaqueteBuscar;

    @FXML
    private Button btn_politicaPaqueteCreacion;

    @FXML
    private Button btn_politicaPaqueteEliminar;

    @FXML
    private Button btn_politicasHospedajeActualizar;

    @FXML
    private Button btn_politicasHospedajeBuscar;

    @FXML
    private Button btn_politicasHospedajeCrear;

    @FXML
    private Button btn_politicasHospedajeEliminar;

    @FXML
    private TextField txt_ArticuloMarca;

    @FXML
    private TextField txt_ArticuloModelo;

    @FXML
    private TextField txt_AutomovilCilidraje;

    @FXML
    private TextField txt_AutomovilColor;

    @FXML
    private TextField txt_AutomovilDescripcion;

    @FXML
    private TextField txt_AutomovilFechaCreacion;

    @FXML
    private TextField txt_AutomovilGama;

    @FXML
    private TextField txt_AutomovilMarca;

    @FXML
    private TextField txt_AutomovilMatricula;

    @FXML
    private TextField txt_AutomovilModelo;

    @FXML
    private TextField txt_AutomovilPrecioDiaBase;

    @FXML
    private TextField txt_AutomovilPrecioGPS;

    @FXML
    private TextField txt_AutomovilPrecioSeguro;

    @FXML
    private TextField txt_AutomovilTipo;

    @FXML
    private TextField txt_AutomovilTransmision;

    @FXML
    private TextField txt_Automovilid;

    @FXML
    private TextArea txt_CategoriaDescripcion;

    @FXML
    private TextField txt_HabitacionCategoria;

    @FXML
    private TextField txt_HabitacionidHospedaje;

    @FXML
    private TextField txt_PaqueteTuristicoCantidadUsu;

    @FXML
    private TextField txt_PaqueteTuristicoDescuento;

    @FXML
    private TextField txt_PaqueteTuristicoDescuentoGrupo;

    @FXML
    private TextField txt_PaqueteTuristicoDuracion;

    @FXML
    private TextField txt_PaqueteTuristicoFechaInicio;

    @FXML
    private TextField txt_PaqueteTuristicoFechafin;

    @FXML
    private TextField txt_PaqueteTuristicoNombre;

    @FXML
    private TextField txt_PaqueteTuristicoPrecio;

    @FXML
    private TextField txt_PaqueteTuristicoRegimen;

    @FXML
    private TextField txt_PaqueteTuristicoTotal;

    @FXML
    private TextField txt_PaqueteTuristicoid;

    @FXML
    private TextField txt_PoliticasHospedajeCondicion;

    @FXML
    private TextField txt_PoliticasHospedajeValorEvaluar;

    @FXML
    private TextField txt_PoliticasHospedajedescripcion;

    @FXML
    private TextField txt_PoliticasHospedajeecampoEvaluar;

    @FXML
    private TextField txt_PoliticasHospedajeid;

    @FXML
    private TextField txt_PoliticasHospedajeidHospedaje;

    @FXML
    private TextField txt_articuloCalidad;

    @FXML
    private TextField txt_articuloCantidadStock;

    @FXML
    private TextField txt_articuloDescripcion;

    @FXML
    private Button txt_articuloEliminar;

    @FXML
    private TextField txt_articuloImagen;

    @FXML
    private TextField txt_articuloPreciounitario;

    @FXML
    private TextField txt_articuloPresentacion;

    @FXML
    private TextField txt_articuloid;

    @FXML
    private TextField txt_articulonombre;

    @FXML
    private TextField txt_categoriaNombre;

    @FXML
    private TextField txt_categoriaid;

    @FXML
    private TextField txt_destinoDescripcion;

    @FXML
    private TextField txt_destinoNombre;

    @FXML
    private TextField txt_destinoid;

    @FXML
    private TextField txt_habitacionCantPersonas;

    @FXML
    private TextField txt_habitacionDescripcion;

    @FXML
    private TextField txt_habitacionNombre;

    @FXML
    private TextField txt_habitacionPrecioNoche;

    @FXML
    private TextField txt_habitacionid;

    @FXML
    private TextField txt_hospedajeid;

    @FXML
    private TextField txt_instalacionAltura;

    @FXML
    private TextField txt_instalacionAncho;

    @FXML
    private TextField txt_instalacionDescripcion;

    @FXML
    private TextField txt_instalacionId;

    @FXML
    private TextField txt_instalacionNombre;

    @FXML
    private TextField txt_personaApellido;

    @FXML
    private TextField txt_personaContrasenya;

    @FXML
    private TextField txt_personaDireccion;

    @FXML
    private TextField txt_personaEmail;

    @FXML
    private TextField txt_personaNumeroDocumento;

    @FXML
    private TextField txt_personaRol;

    @FXML
    private TextField txt_personaTelefono;

    @FXML
    private TextField txt_personaTipoDocumento;

    @FXML
    private TextField txt_personaid;

    @FXML
    private TextField txt_personanombre;

    @FXML
    private TextField txt_politicaPaqueteCondicion;

    @FXML
    private TextField txt_politicaPaqueteDescripcion;

    @FXML
    private TextField txt_politicaPaqueteValorEvaluar;

    @FXML
    private TextField txt_politicaPaqueteid;

    @FXML
    private TextField txt_politicaPaqueteidpaquete;

    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //*****************************CATEGORIA**********************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************

    @FXML
    void crearCategoria(ActionEvent event) {
         String sql = "INSERT INTO categoria (idCategoria, nombre, descripcion) VALUES (?, ?, ? )";

         try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
             // Establecer los valores de los parámetros
             preparedStatement.setString(1, txt_categoriaid.getText());
             preparedStatement.setString(2, txt_categoriaNombre.getText());
             preparedStatement.setString(3, txt_CategoriaDescripcion.getText());
           //  preparedStatement.setInt(4, cbox_categoriaPadre.getValue().getIdCategoria());
            // preparedStatement.setString(4, null);
           //  preparedStatement.setString(5, "Bien");

             // Ejecutar la inserción
             int filasAfectadas = preparedStatement.executeUpdate();

             if (filasAfectadas > 0) {
                 System.out.println("Inserción exitosa");
             } else {
                 System.out.println("La inserción no tuvo éxito");
             }
         } catch (SQLException e) {
			e.printStackTrace();
		}
    //	categoriacomboBox_cargarCategoriaPadre();
    }

    @FXML
    void buscarCategoria(ActionEvent event) {
   
    	 String sql = "SELECT * FROM Categoria WHERE idCategoria=?";
         try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
             // Establecer el idCategoria como parámetro
             preparedStatement.setString(1, txt_categoriaid.getText());

             // Ejecutar la consulta
             ResultSet resultSet = preparedStatement.executeQuery();

             // Verificar si se encontró la categoría
             if (resultSet.next()) {
                 // Obtener los valores de las columnas
                 String nombre = resultSet.getString("nombre");
                 String descripcion = resultSet.getString("descripcion");
                 int idCategoriaPadre = resultSet.getInt("idCategoriaPadre");
                 // Llenar los valores en campos (reemplaza esto con tu lógica específica)
                 txt_categoriaNombre.setText(nombre);
                 txt_CategoriaDescripcion.setText(descripcion);
                 //cbox_categoriaPadre.setText(String.valueOf(idCategoriaPadre));
                
                 System.out.println("Categoría encontrada y valores llenados en campos.");
             } else {
                 System.out.println("Categoría no encontrada para el idCategoria proporcionado.");
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
    }

    @FXML
    void actualizarCategoria(ActionEvent event) {
    	 String sql = "UPDATE categoria SET nombre=?, descripcion = ? where idCategoria = ?";

         try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
             // Establecer los valores de los parámetros
             preparedStatement.setString(1, txt_categoriaNombre.getText());
             preparedStatement.setString(2, txt_CategoriaDescripcion.getText());
             preparedStatement.setString(3, txt_categoriaid.getText());
             //  preparedStatement.setInt(4, cbox_categoriaPadre.getValue().getIdCategoria());
             int filasAfectadas = preparedStatement.executeUpdate();

             if (filasAfectadas > 0) {
                 System.out.println("Inserción exitosa");
             } else {
                 System.out.println("La inserción no tuvo éxito");
             }
         } catch (SQLException e) {
			e.printStackTrace();
		}
    }

    @FXML
    void eliminarCategoria(ActionEvent event) {
    	  String sql = "DELETE categoria where idCategoria= ? ";
          try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
              // Establecer los valores de los parámetros
              preparedStatement.setString(1, txt_categoriaid.getText());

              // Ejecutar la inserción
              int filasAfectadas = preparedStatement.executeUpdate();

              if (filasAfectadas > 0) {
                  System.out.println("eliminacion exitosa");
              } else {
                  System.out.println("La inserción no tuvo éxito");
              }
          } catch (SQLException e) {
 			e.printStackTrace();
 		}
    }   
	
   //*******************************************
    private void categoriacomboBox_cargarCategoriaPadre() {
    	//Connection con = conexion.conectar();
    	cbox_categoriaPadre.getItems().clear();
        String sql = "SELECT idCategoria, nombre FROM Categoria WHERE ROWNUM <= 5"; // Consulta SQL para obtener datos de Oracle
        try (PreparedStatement preparedStatement = con.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            List<Categoria> categorias = new ArrayList<>();// Lista para almacenar los datos de la consulta
            while (resultSet.next()) {  // Iterar sobre los resultados y agregarlos a la lista
            	 int id = resultSet.getInt("idCategoria");
                 String nombre = resultSet.getString("nombre");
                 categorias.add(new Categoria(id, nombre));
            }
            cbox_categoriaPadre.getItems().addAll(categorias);// Agregar los datos al ComboBox
        } catch (SQLException e) {
            e.printStackTrace();
        }
     //	conexion.desconectar(con);
    }

    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //*********************************************ARTICULO*********************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    
    @FXML
    void articuloBuscar(ActionEvent event) {
    	String sql = "SELECT * FROM Articulo WHERE idArticulo=?";
        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer el idArticulo como parámetro
            preparedStatement.setString(1, txt_articuloid.getText());
            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();
            // Verificar si se encontró el artículo
            if (resultSet.next()) {
                // Obtener los valores de las columnas
                String nombre = resultSet.getString("nombre");
                int precioUnitario = resultSet.getInt("precioUnitario");
                int cantidadStock = resultSet.getInt("cantidadStock");
                String descripcion = resultSet.getString("descripcion");
                String marca = resultSet.getString("marca");
                String modelo = resultSet.getString("modelo");
                String presentacion = resultSet.getString("presentacion");
                String imagen = resultSet.getString("imagen");
                String calidad = resultSet.getString("calidad");

                // Llenar los valores en campos (reemplaza esto con tu lógica específica)
                txt_articulonombre.setText(nombre);
                txt_articuloPreciounitario.setText(String.valueOf(precioUnitario));
                txt_articuloCantidadStock.setText(String.valueOf(cantidadStock));
                txt_articuloDescripcion.setText(descripcion);
                txt_ArticuloMarca.setText(marca);
                txt_ArticuloModelo.setText(modelo);
                txt_articuloPresentacion.setText(presentacion);
                txt_articuloImagen.setText(imagen);
                txt_articuloCalidad.setText(calidad);

                System.out.println("Artículo encontrado y valores llenados en campos.");
            } else {
                System.out.println("Artículo no encontrado para el idArticulo proporcionado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void articuloCrear(ActionEvent event) {
    	String sql = "INSERT INTO Articulo (idArticulo, nombre, precioUnitario, cantidadStock, descripcion, marca, modelo, presentacion, imagen, calidad ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer los valores de los parámetros
            preparedStatement.setString(1, txt_articuloid.getText());
            preparedStatement.setString(2, txt_articulonombre.getText());
            preparedStatement.setString(3, txt_articuloPreciounitario.getText());
            preparedStatement.setString(4, txt_articuloCantidadStock.getText());
            preparedStatement.setString(5, txt_articuloDescripcion.getText());
            preparedStatement.setString(6, txt_ArticuloMarca.getText());
            preparedStatement.setString(7, txt_ArticuloModelo.getText());
            preparedStatement.setString(8, txt_articuloPresentacion.getText());
            preparedStatement.setString(9, txt_articuloImagen.getText());
            preparedStatement.setString(10, txt_articuloCalidad.getText());
            int filasAfectadas = preparedStatement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Inserción exitosa");
            } else {
                System.out.println("La inserción no tuvo éxito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void articuloEliminar(ActionEvent event) {
    	 String sql = "DELETE FROM Articulo WHERE idArticulo = ?";

         try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
             // Establecer el valor del parámetro
             preparedStatement.setString(1, txt_articuloid.getText());

             // Ejecutar la eliminación
             int filasAfectadas = preparedStatement.executeUpdate();

             if (filasAfectadas > 0) {
                 System.out.println("Eliminación exitosa");
             } else {
                 System.out.println("La eliminación no tuvo éxito");
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
    }
    
    @FXML
    void ArticuloActualizar(ActionEvent event) {
    	String sql = "UPDATE Articulo SET nombre=?, precioUnitario=?, cantidadStock=?, descripcion=?, " +
                "marca=?, modelo=?, presentacion=?, imagen=?, calidad=? WHERE idArticulo=?";

		   try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
			   
		       preparedStatement.setString(1, txt_articulonombre.getText());
		       preparedStatement.setString(2, txt_articuloPreciounitario.getText());
		       preparedStatement.setString(3, txt_articuloCantidadStock.getText());
		       preparedStatement.setString(4, txt_articuloDescripcion.getText());
		       preparedStatement.setString(5, txt_ArticuloMarca.getText());
		       preparedStatement.setString(6, txt_ArticuloModelo.getText());
		       preparedStatement.setString(7, txt_articuloPresentacion.getText());
		       preparedStatement.setString(8, txt_articuloImagen.getText());
		       preparedStatement.setString(9, txt_articuloCalidad.getText());
		       preparedStatement.setString(10, txt_articuloid.getText());
		       
		       int filasAfectadas = preparedStatement.executeUpdate();
		
		       if (filasAfectadas > 0) {
		           System.out.println("Actualización exitosa");
		       } else {
		           System.out.println("La actualización no tuvo éxito");
		       }
		   } catch (SQLException e) {
		       e.printStackTrace();
		   }
    }
    
    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //*************************************************HOSPEDAJE********************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************

    @FXML
    void hospedajeCrear(ActionEvent event) {
    	String sql = "INSERT INTO Hospedaje (idHospedaje, nombre, descripcion, ubicacion, estadoContrato, tipo) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer los valores de los parámetros
            preparedStatement.setString(1, txt_hospedajeid.getText());
            preparedStatement.setString(2, btn_hospedajenombre.getText());
            preparedStatement.setString(3, btn_hospedajeDescripcion.getText());
            preparedStatement.setString(4, btn_hospedajeUbicacion.getText());
            preparedStatement.setString(5, btn_hospedajeestadoContrato.getText());
            preparedStatement.setString(6, btn_hospedajeTipo.getText());

            // Ejecutar la inserción
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Inserción exitosa en la tabla Hospedaje");
            } else {
                System.out.println("La inserción en la tabla Hospedaje no tuvo éxito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void hospedajeBuscar(ActionEvent event) {
    	String sql = "SELECT * FROM Hospedaje WHERE idHospedaje=?";
        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer el idHospedaje como parámetro
            preparedStatement.setString(1, txt_hospedajeid.getText());

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();

            // Verificar si se encontró el hospedaje
            if (resultSet.next()) {
                // Obtener los valores de las columnas
                String nombre = resultSet.getString("nombre");
                String descripcion = resultSet.getString("descripcion");
                String ubicacion = resultSet.getString("ubicacion");
                String estadoContrato = resultSet.getString("estadoContrato");
                String tipo = resultSet.getString("tipo");

                // Llenar los valores en campos (reemplaza esto con tu lógica específica)
                btn_hospedajenombre.setText(nombre);
                btn_hospedajeDescripcion.setText(descripcion);
                btn_hospedajeUbicacion.setText(ubicacion);
                btn_hospedajeestadoContrato.setText(estadoContrato);
                btn_hospedajeTipo.setText(tipo);

                System.out.println("Hospedaje encontrado y valores llenados en campos.");
            } else {
                System.out.println("Hospedaje no encontrado para el idHospedaje proporcionado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    void hospedajeActualizar(ActionEvent event) {
    	String sql = "UPDATE Hospedaje SET nombre=?, descripcion=?, ubicacion=?, estadoContrato=?, tipo=? WHERE idHospedaje=?";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer los valores de los parámetros
            preparedStatement.setString(1, btn_hospedajenombre.getText());
            preparedStatement.setString(2, btn_hospedajeDescripcion.getText());
            preparedStatement.setString(3, btn_hospedajeUbicacion.getText());
            preparedStatement.setString(4, btn_hospedajeestadoContrato.getText());
            preparedStatement.setString(5, btn_hospedajeTipo.getText());
            preparedStatement.setString(6, txt_hospedajeid.getText());

            // Ejecutar la actualización
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Actualización exitosa en la tabla Hospedaje");
            } else {
                System.out.println("La actualización en la tabla Hospedaje no tuvo éxito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void hospedajeEliminar(ActionEvent event) {
    	String sql = "DELETE FROM Hospedaje WHERE idHospedaje=?";
        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            preparedStatement.setString(1, txt_hospedajeid.getText());
            int filasAfectadas = preparedStatement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Eliminación exitosa en la tabla Hospedaje");
            } else {
                System.out.println("La eliminación en la tabla Hospedaje no tuvo éxito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //*****************************HABITACION**********************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************

    @FXML
    void CrearHabitacion(ActionEvent event) {
    	String sql = "INSERT INTO Habitacion (idHabitacion, idHospedaje, nombre, categoria, cantidadPersonas, precioNoche, descripcion) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer los valores de los parámetros
            preparedStatement.setString(1, txt_habitacionid.getText());
            preparedStatement.setString(2, txt_HabitacionidHospedaje.getText()); //txt_HabitacionidHospedaje
            preparedStatement.setString(3, txt_habitacionNombre.getText());
            preparedStatement.setString(4, txt_HabitacionCategoria.getText());
            preparedStatement.setString(5, txt_habitacionCantPersonas.getText());
            preparedStatement.setString(6, txt_habitacionPrecioNoche.getText());
            preparedStatement.setString(7, txt_habitacionDescripcion.getText());
            int filasAfectadas = preparedStatement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Inserción exitosa en la tabla Habitacion");
            } else {
                System.out.println("La inserción en la tabla Habitacion no tuvo éxito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    void buscarHabitacion(ActionEvent event) {
    	String sql = "SELECT * FROM Habitacion WHERE idHabitacion=?";
        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer el idHabitacion como parámetro
            preparedStatement.setString(1, txt_habitacionid.getText());

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();

            // Verificar si se encontró la habitación
            if (resultSet.next()) {
                // Obtener los valores de las columnas
                String nombre = resultSet.getString("nombre");
                String categoria = resultSet.getString("categoria");
                int idHospedaje = resultSet.getInt("idHospedaje");
                int cantidadPersonas = resultSet.getInt("cantidadPersonas");
                int precioNoche = resultSet.getInt("precioNoche");
                String descripcion = resultSet.getString("descripcion");

                // Llenar los valores en campos (reemplaza esto con tu lógica específica)
                txt_habitacionNombre.setText(nombre);
                txt_HabitacionCategoria.setText(categoria);
                txt_HabitacionidHospedaje.setText(String.valueOf(idHospedaje));
                txt_habitacionCantPersonas.setText(String.valueOf(cantidadPersonas));
                txt_habitacionPrecioNoche.setText(String.valueOf(precioNoche));
                txt_habitacionDescripcion.setText(descripcion);

                System.out.println("Habitación encontrada y valores llenados en campos.");
            } else {
                System.out.println("Habitación no encontrada para el idHabitacion proporcionado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void actualizarHabitacion(ActionEvent event) {
    	String sql = "UPDATE Habitacion SET nombre=?, categoria=?, idHospedaje=?, cantidadPersonas=?, precioNoche=?, descripcion=? WHERE idHabitacion=?";
        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer los valores de los parámetros
            preparedStatement.setString(1, txt_habitacionNombre.getText());
            preparedStatement.setString(2, txt_HabitacionCategoria.getText());
            preparedStatement.setString(3, txt_HabitacionidHospedaje.getText());
            preparedStatement.setString(4, txt_habitacionCantPersonas.getText());
            preparedStatement.setString(5, txt_habitacionPrecioNoche.getText());
            preparedStatement.setString(6, txt_habitacionDescripcion.getText());
            preparedStatement.setString(7, txt_habitacionid.getText());

            // Ejecutar la actualización
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Actualización exitosa en la tabla Habitacion");
            } else {
                System.out.println("La actualización en la tabla Habitacion no tuvo éxito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void eliminarHabitacion(ActionEvent event) {
    	String sql = "DELETE FROM Habitacion WHERE idHabitacion=?";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer el valor del parámetro
            preparedStatement.setString(1, txt_habitacionid.getText());

            // Ejecutar la eliminación
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Eliminación exitosa en la tabla Habitacion");
            } else {
                System.out.println("La eliminación en la tabla Habitacion no tuvo éxito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   
    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //********************************* DESTINO ***************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    @FXML
    void DestinoCrear(ActionEvent event) {
    	String sql = "INSERT INTO Destino (idDestino, nombreDestino, descripcion) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            preparedStatement.setString(1, txt_destinoid.getText());
            preparedStatement.setString(2, txt_destinoNombre.getText());
            preparedStatement.setString(3, txt_destinoDescripcion.getText());
            
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Inserción exitosa en la tabla Destino");
            } else {
                System.out.println("La inserción en la tabla Destino no tuvo éxito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void btn_destinoBuscar(ActionEvent event) {
    	String sql = "SELECT * FROM Destino WHERE idDestino=?";
        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer el idDestino como parámetro
            preparedStatement.setString(1, txt_destinoid.getText());

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();

            // Verificar si se encontró el destino
            if (resultSet.next()) {
                // Obtener los valores de las columnas
                String nombreDestino = resultSet.getString("nombreDestino");
                String descripcion = resultSet.getString("descripcion");

                // Llenar los valores en campos (reemplaza esto con tu lógica específica)
                txt_destinoNombre.setText(nombreDestino);
                txt_destinoDescripcion.setText(descripcion);

                System.out.println("Destino encontrado y valores llenados en campos.");
            } else {
                System.out.println("Destino no encontrado para el idDestino proporcionado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    void btn_destinoActualizar(ActionEvent event) {
    	String sql = "UPDATE Destino SET nombreDestino=?, descripcion=? WHERE idDestino=?";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer los valores de los parámetros
            preparedStatement.setString(1, txt_destinoNombre.getText());
            preparedStatement.setString(2, txt_destinoDescripcion.getText());
            preparedStatement.setString(3, txt_destinoid.getText());

            // Ejecutar la actualización
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Actualización exitosa en la tabla Destino");
            } else {
                System.out.println("La actualización en la tabla Destino no tuvo éxito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void destinoEliminar(ActionEvent event) {
    	String sql = "DELETE FROM Destino WHERE idDestino=?";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer el valor del parámetro
            preparedStatement.setString(1, txt_destinoid.getText());

            // Ejecutar la eliminación
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Eliminación exitosa en la tabla Destino");
            } else {
                System.out.println("La eliminación en la tabla Destino no tuvo éxito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //*****************************INSTALACION**********************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    
    @FXML
    void instalacionCrear(ActionEvent event) {
    	String sql = "INSERT INTO Instalacion (idInstalacion, nombre, alturaM2, anchoM2, descripcion) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer los valores de los parámetros
            preparedStatement.setString(1, txt_instalacionId.getText());
            preparedStatement.setString(2, txt_instalacionNombre.getText());
            preparedStatement.setString(3, txt_instalacionAltura.getText());
            preparedStatement.setString(4, txt_instalacionAncho.getText());
            preparedStatement.setString(5, txt_instalacionDescripcion.getText());

            // Ejecutar la inserción
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Inserción exitosa en la tabla Instalacion");
            } else {
                System.out.println("La inserción en la tabla Instalacion no tuvo éxito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void instalacionBuscar(ActionEvent event) {
    	String sql = "SELECT * FROM Instalacion WHERE idInstalacion=?";
        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer el idInstalacion como parámetro
            preparedStatement.setString(1, txt_instalacionId.getText());

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();

            // Verificar si se encontró la instalación
            if (resultSet.next()) {
                // Obtener los valores de las columnas
                String nombre = resultSet.getString("nombre");
                String altura = resultSet.getString("alturaM2");
                String ancho = resultSet.getString("anchoM2");
                String descripcion = resultSet.getString("descripcion");

                // Llenar los valores en campos (reemplaza esto con tu lógica específica)
                txt_instalacionNombre.setText(nombre);
                txt_instalacionAltura.setText(altura);
                txt_instalacionAncho.setText(ancho);
                txt_instalacionDescripcion.setText(descripcion);

                System.out.println("Instalación encontrada y valores llenados en campos.");
            } else {
                System.out.println("Instalación no encontrada para el idInstalacion proporcionado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    void instalacionActualizar(ActionEvent event) {
    	String sql = "UPDATE Instalacion SET nombre=?, alturaM2=?, anchoM2=?, descripcion=? WHERE idInstalacion=?";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer los valores de los parámetros
            preparedStatement.setString(1, txt_instalacionNombre.getText());
            preparedStatement.setString(2, txt_instalacionAltura.getText());
            preparedStatement.setString(3, txt_instalacionAncho.getText());
            preparedStatement.setString(4, txt_instalacionDescripcion.getText());
            preparedStatement.setString(5, txt_instalacionId.getText());

            // Ejecutar la actualización
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Actualización exitosa en la tabla Instalacion");
            } else {
                System.out.println("La actualización en la tabla Instalacion no tuvo éxito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void instalacionEliminar(ActionEvent event) {
    	// Primero, puedes realizar una verificación para asegurarte de que la instalación existe
        String sqlVerificar = "SELECT * FROM Instalacion WHERE idInstalacion=?";
        try (PreparedStatement preparedStatement = con.prepareStatement(sqlVerificar)) {
            // Establecer el idInstalacion como parámetro
            preparedStatement.setString(1, txt_instalacionId.getText());

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();

            // Verificar si se encontró la instalación
            if (!resultSet.next()) {
                System.out.println("Instalación no encontrada para el idInstalacion proporcionado.");
                return; // Salir del método si no se encuentra la instalación
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Si la instalación existe, proceder con la eliminación
        String sqlEliminar = "DELETE FROM Instalacion WHERE idInstalacion=?";
        try (PreparedStatement preparedStatement = con.prepareStatement(sqlEliminar)) {
            // Establecer el valor del parámetro
            preparedStatement.setString(1, txt_instalacionId.getText());

            // Ejecutar la eliminación
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Eliminación exitosa en la tabla Instalacion");
            } else {
                System.out.println("La eliminación en la tabla Instalacion no tuvo éxito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //********************************POLITICAS PAQUETE************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    
    @FXML
    void politicaPaqueteCreacion(ActionEvent event) {
    	String sql = "INSERT INTO PoliticasPaquete (idpolitca, idPaquete, descripcion, condicion, valorEvaluar) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            preparedStatement.setString(1, txt_politicaPaqueteid.getText());
            preparedStatement.setString(2, txt_politicaPaqueteidpaquete.getText());
            preparedStatement.setString(3, txt_politicaPaqueteDescripcion.getText());
            preparedStatement.setString(4, txt_politicaPaqueteCondicion.getText());
            preparedStatement.setString(5, txt_politicaPaqueteValorEvaluar.getText());
            int filasAfectadas = preparedStatement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Inserción exitosa en la tabla PoliticasPaquete");
            } else {
                System.out.println("La inserción en la tabla PoliticasPaquete no tuvo éxito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void politicaPaqueteBuscar(ActionEvent event) {
    	String sql = "SELECT * FROM PoliticasPaquete WHERE idpolitca=?";
        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            preparedStatement.setString(1, txt_politicaPaqueteid.getText());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String idPaquete = resultSet.getString("idPaquete");
                String descripcion = resultSet.getString("descripcion");
                String condicion = resultSet.getString("condicion");
                String valorEvaluar = resultSet.getString("valorEvaluar");
                txt_politicaPaqueteidpaquete.setText(idPaquete);
                txt_politicaPaqueteDescripcion.setText(descripcion);
                txt_politicaPaqueteCondicion.setText(condicion);
                txt_politicaPaqueteValorEvaluar.setText(valorEvaluar);
                System.out.println("Política de paquete encontrada y valores llenados en campos.");
            } else {
                System.out.println("Política de paquete no encontrada para el idpolitca proporcionado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    void politicaPaqueteActualizar(ActionEvent event) {
    	String sql = "UPDATE PoliticasPaquete SET idPaquete=?, descripcion=?, condicion=?, valorEvaluar=? WHERE idpolitca=?";
        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            preparedStatement.setString(1, txt_politicaPaqueteidpaquete.getText());
            preparedStatement.setString(2, txt_politicaPaqueteDescripcion.getText());
            preparedStatement.setString(3, txt_politicaPaqueteCondicion.getText());
            preparedStatement.setString(4, txt_politicaPaqueteValorEvaluar.getText());
            preparedStatement.setString(5, txt_politicaPaqueteid.getText());
            int filasAfectadas = preparedStatement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Actualización exitosa en la tabla PoliticasPaquete");
            } else {
                System.out.println("La actualización en la tabla PoliticasPaquete no tuvo éxito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void politicaPaqueteEliminar(ActionEvent event) {
    	 String sql = "DELETE FROM PoliticasPaquete WHERE idpolitca = ?";
         try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
             preparedStatement.setString(1, txt_politicaPaqueteid.getText());
             int filasAfectadas = preparedStatement.executeUpdate();
             if (filasAfectadas > 0) {
                 System.out.println("Eliminación exitosa en la tabla PoliticasPaquete");
             } else {
                 System.out.println("La eliminación en la tabla PoliticasPaquete no tuvo éxito");
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
    }
    
    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //*************************POLITICA HOSPEDAJE*****************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************

    @FXML
    void politicasHospedajeCrear(ActionEvent event) {
    	String sql = "INSERT INTO PoliticasHospedaje (idpolitca, idHospedaje, descripcion, campoEvaluar, condicion, valorEvaluar) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer los valores de los parámetros
            preparedStatement.setString(1, txt_PoliticasHospedajeid.getText());
            preparedStatement.setString(2, txt_PoliticasHospedajeidHospedaje.getText());
            preparedStatement.setString(3, txt_PoliticasHospedajedescripcion.getText());
            preparedStatement.setString(4, txt_PoliticasHospedajeecampoEvaluar.getText());
            preparedStatement.setString(5, txt_PoliticasHospedajeCondicion.getText());
            preparedStatement.setString(6, txt_PoliticasHospedajeValorEvaluar.getText());

            // Ejecutar la inserción
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Inserción exitosa en la tabla PoliticasHospedaje");
            } else {
                System.out.println("La inserción en la tabla PoliticasHospedaje no tuvo éxito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void politicasHospedajeBuscar(ActionEvent event) {
    	String sql = "SELECT * FROM PoliticasHospedaje WHERE idpolitca=?";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer el idpolitca como parámetro
            preparedStatement.setString(1, txt_PoliticasHospedajeid.getText());

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();

            // Verificar si se encontró la política de hospedaje
            if (resultSet.next()) {
                // Obtener los valores de las columnas
                String idHospedaje = resultSet.getString("idHospedaje");
                String descripcion = resultSet.getString("descripcion");
                String campoEvaluar = resultSet.getString("campoEvaluar");
                String condicion = resultSet.getString("condicion");
                String valorEvaluar = resultSet.getString("valorEvaluar");

                // Llenar los valores en campos (reemplaza esto con tu lógica específica)
                txt_PoliticasHospedajeidHospedaje.setText(idHospedaje);
                txt_PoliticasHospedajedescripcion.setText(descripcion);
                txt_PoliticasHospedajeecampoEvaluar.setText(campoEvaluar);
                txt_PoliticasHospedajeCondicion.setText(condicion);
                txt_PoliticasHospedajeValorEvaluar.setText(valorEvaluar);

                System.out.println("Política de Hospedaje encontrada y valores llenados en campos.");
            } else {
                System.out.println("Política de Hospedaje no encontrada para el idpolitca proporcionado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    void politicasHospedajeActualizar(ActionEvent event) {
    	String sql = "UPDATE PoliticasHospedaje SET idHospedaje=?, descripcion=?, campoEvaluar=?, condicion=?, valorEvaluar=? WHERE idpolitca=?";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer los valores de los parámetros
            preparedStatement.setString(1, txt_PoliticasHospedajeidHospedaje.getText());
            preparedStatement.setString(2, txt_PoliticasHospedajedescripcion.getText());
            preparedStatement.setString(3, txt_PoliticasHospedajeecampoEvaluar.getText());
            preparedStatement.setString(4, txt_PoliticasHospedajeCondicion.getText());
            preparedStatement.setString(5, txt_PoliticasHospedajeValorEvaluar.getText());
            preparedStatement.setString(6, txt_PoliticasHospedajeid.getText());

            // Ejecutar la actualización
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Actualización exitosa en la tabla PoliticasHospedaje");
            } else {
                System.out.println("La actualización en la tabla PoliticasHospedaje no tuvo éxito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void politicasHospedajeEliminar(ActionEvent event) {
    	String sql = "DELETE FROM PoliticasHospedaje WHERE idpolitca = ?";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer los valores de los parámetros
            preparedStatement.setString(1, txt_PoliticasHospedajeid.getText());

            // Ejecutar la eliminación
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Eliminación exitosa en la tabla PoliticasHospedaje");
            } else {
                System.out.println("La eliminación en la tabla PoliticasHospedaje no tuvo éxito");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //*****************************PERSONA**********************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    
    @FXML
    void personaCrear(ActionEvent event) {
    	String sql = "INSERT INTO Persona (idPersona, nombre, apellido, tipoDocumento, numDocumento, contrasenya, direccion, telefono, email, rol) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	   try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
	       // Establecer los valores de los parámetros
	       preparedStatement.setString(1, txt_personaid.getText());
	       preparedStatement.setString(2, txt_personanombre.getText());
	       preparedStatement.setString(3, txt_personaApellido.getText());
	       preparedStatement.setString(4, txt_personaTipoDocumento.getText());
	       preparedStatement.setInt(5, Integer.parseInt(txt_personaNumeroDocumento.getText()));
	       preparedStatement.setString(6, txt_personaContrasenya.getText());
	       preparedStatement.setString(7, txt_personaDireccion.getText());
	       preparedStatement.setString(8, txt_personaTelefono.getText());
	       preparedStatement.setString(9, txt_personaEmail.getText());
	       preparedStatement.setString(10, txt_personaRol.getText());
	
	       // Ejecutar la inserción
	       int filasAfectadas = preparedStatement.executeUpdate();
	
	       if (filasAfectadas > 0) {
	           System.out.println("Inserción exitosa en la tabla Persona");
	       } else {
	           System.out.println("La inserción en la tabla Persona no tuvo éxito");
	       }
	   } catch (SQLException e) {
	       e.printStackTrace();
	   }
    }

    @FXML
    void personaBuscar(ActionEvent event) {
    	String sql = "SELECT * FROM Persona WHERE idPersona=?";
        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer el idPersona como parámetro
            preparedStatement.setInt(1, Integer.parseInt(txt_personaid.getText()));

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();

            // Verificar si se encontró la persona
            if (resultSet.next()) {
                // Obtener los valores de las columnas
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String tipoDocumento = resultSet.getString("tipoDocumento");
                int numDocumento = resultSet.getInt("numDocumento");
                String contrasenya = resultSet.getString("contrasenya");
                String direccion = resultSet.getString("direccion");
                String telefono = resultSet.getString("telefono");
                String email = resultSet.getString("email");
                String rol = resultSet.getString("rol");

                // Llenar los valores en campos
                txt_personanombre.setText(nombre);
                txt_personaApellido.setText(apellido);
                txt_personaTipoDocumento.setText(tipoDocumento);
                txt_personaNumeroDocumento.setText(String.valueOf(numDocumento));
                txt_personaContrasenya.setText(contrasenya);
                txt_personaDireccion.setText(direccion);
                txt_personaTelefono.setText(telefono);
                txt_personaEmail.setText(email);
                txt_personaRol.setText(rol);

                System.out.println("Persona encontrada y valores llenados en campos.");
            } else {
                System.out.println("Persona no encontrada para el idPersona proporcionado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
       
    @FXML
    void personaActualizar(ActionEvent event) {
    	 String sql = "UPDATE Persona SET nombre=?, apellido=?, tipoDocumento=?, numDocumento=?, contrasenya=?, " +
                 "direccion=?, telefono=?, email=?, rol=? WHERE idPersona=?";

	    try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
	        // Establecer los valores de los parámetros
	        preparedStatement.setString(1, txt_personanombre.getText());
	        preparedStatement.setString(2, txt_personaApellido.getText());
	        preparedStatement.setString(3, txt_personaTipoDocumento.getText());
	        preparedStatement.setInt(4, Integer.parseInt(txt_personaNumeroDocumento.getText()));
	        preparedStatement.setString(5, txt_personaContrasenya.getText());
	        preparedStatement.setString(6, txt_personaDireccion.getText());
	        preparedStatement.setString(7, txt_personaTelefono.getText());
	        preparedStatement.setString(8, txt_personaEmail.getText());
	        preparedStatement.setString(9, txt_personaRol.getText());
	        preparedStatement.setInt(10, Integer.parseInt(txt_personaid.getText()));
	
	        // Ejecutar la actualización
	        int filasAfectadas = preparedStatement.executeUpdate();
	
	        if (filasAfectadas > 0) {
	            System.out.println("Actualización exitosa");
	        } else {
	            System.out.println("La actualización no tuvo éxito");
	        }
	    } catch (SQLException | NumberFormatException e) {
	        e.printStackTrace();
	    }
    }

    @FXML
    void personaEliminar(ActionEvent event) {
    	String sql = "DELETE FROM Persona WHERE idPersona = ?";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer el valor del parámetro
            preparedStatement.setInt(1, Integer.parseInt(txt_personaid.getText()));

            // Ejecutar la eliminación
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Eliminación exitosa");
            } else {
                System.out.println("La eliminación no tuvo éxito");
            }
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //****************************AUTOMOVIL***********************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    
    @FXML
    void AutomovilCrear(ActionEvent event) {
    	String sql = "INSERT INTO Automovil (idAutomovil, matricula, precioDiaBase, precioSeguro, precioGPS, transmision, descripcion, modelo, cilindraje, idMarca, tipo, gama, color, fechaCreacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            preparedStatement.setInt(1, Integer.parseInt(txt_Automovilid.getText()));
            preparedStatement.setString(2, txt_AutomovilMatricula.getText());
            preparedStatement.setDouble(3, Double.parseDouble(txt_AutomovilPrecioDiaBase.getText()));
            preparedStatement.setDouble(4, Double.parseDouble(txt_AutomovilPrecioSeguro.getText()));
            preparedStatement.setDouble(5, Double.parseDouble(txt_AutomovilPrecioGPS.getText()));
            preparedStatement.setString(6, txt_AutomovilTransmision.getText());
            preparedStatement.setString(7, txt_AutomovilDescripcion.getText());
            preparedStatement.setString(8, txt_AutomovilModelo.getText());
            preparedStatement.setInt(9, Integer.parseInt(txt_AutomovilCilidraje.getText()));
            preparedStatement.setString(10, txt_AutomovilMarca.getText());
            preparedStatement.setString(11, txt_AutomovilTipo.getText());
            preparedStatement.setString(12, txt_AutomovilGama.getText());
            preparedStatement.setString(13, txt_AutomovilColor.getText());

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date parsedDate = (Date) dateFormat.parse(txt_AutomovilFechaCreacion.getText());
            java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());
            preparedStatement.setDate(14, sqlDate);

            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Inserción exitosa");
            } else {
                System.out.println("La inserción no tuvo éxito");
            }
        } catch (SQLException | ParseException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void AutomovilBuscar(ActionEvent event) {
    	 String sql = "SELECT * FROM Automovil WHERE idAutomovil=?";
         try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
             preparedStatement.setInt(1, Integer.parseInt(txt_Automovilid.getText()));
             ResultSet resultSet = preparedStatement.executeQuery();
             if (resultSet.next()) {
                 String matricula = resultSet.getString("matricula");
                 double precioDiaBase = resultSet.getDouble("precioDiaBase");
                 double precioSeguro = resultSet.getDouble("precioSeguro");
                 double precioGPS = resultSet.getDouble("precioGPS");
                 String transmision = resultSet.getString("transmision");
                 String descripcion = resultSet.getString("descripcion");
                 String modelo = resultSet.getString("modelo");
                 int cilindraje = resultSet.getInt("cilindraje");
                 String marca = resultSet.getString("idMarca");
                 String tipo = resultSet.getString("tipo");
                 String gama = resultSet.getString("gama");
                 String color = resultSet.getString("color");
                 java.sql.Date fechaCreacion = resultSet.getDate("fechaCreacion");

                 txt_AutomovilMatricula.setText(matricula);
                 txt_AutomovilPrecioDiaBase.setText(String.valueOf(precioDiaBase));
                 txt_AutomovilPrecioSeguro.setText(String.valueOf(precioSeguro));
                 txt_AutomovilPrecioGPS.setText(String.valueOf(precioGPS));
                 txt_AutomovilTransmision.setText(transmision);
                 txt_AutomovilDescripcion.setText(descripcion);
                 txt_AutomovilModelo.setText(modelo);
                 txt_AutomovilCilidraje.setText(String.valueOf(cilindraje));
                 txt_AutomovilMarca.setText(marca);
                 txt_AutomovilTipo.setText(tipo);
                 txt_AutomovilGama.setText(gama);
                 txt_AutomovilColor.setText(color);
                 txt_AutomovilFechaCreacion.setText(fechaCreacion.toString());

                 System.out.println("Automóvil encontrado y valores llenados en campos.");
             } else {
                 System.out.println("Automóvil no encontrado para el idAutomovil proporcionado.");
             }
         } catch (SQLException | NumberFormatException e) {
             e.printStackTrace();
         }
    }

    @FXML
    void AutomovilActualizar(ActionEvent event) {
    	String sql = "UPDATE Automovil SET matricula=?, precioDiaBase=?, precioSeguro=?, precioGPS=?, transmision=?, descripcion=?, modelo=?, cilindraje=?, idMarca=?, tipo=?, gama=?, color=?, fechaCreacion=? WHERE idAutomovil=?";
        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            preparedStatement.setString(1, txt_AutomovilMatricula.getText());
            preparedStatement.setDouble(2, Double.parseDouble(txt_AutomovilPrecioDiaBase.getText()));
            preparedStatement.setDouble(3, Double.parseDouble(txt_AutomovilPrecioSeguro.getText()));
            preparedStatement.setDouble(4, Double.parseDouble(txt_AutomovilPrecioGPS.getText()));
            preparedStatement.setString(5, txt_AutomovilTransmision.getText());
            preparedStatement.setString(6, txt_AutomovilDescripcion.getText());
            preparedStatement.setString(7, txt_AutomovilModelo.getText());
            preparedStatement.setInt(8, Integer.parseInt(txt_AutomovilCilidraje.getText()));
            preparedStatement.setString(9, txt_AutomovilMarca.getText());
            preparedStatement.setString(10, txt_AutomovilTipo.getText());
            preparedStatement.setString(11, txt_AutomovilGama.getText());
            preparedStatement.setString(12, txt_AutomovilColor.getText());
            preparedStatement.setDate(13, java.sql.Date.valueOf(txt_AutomovilFechaCreacion.getText()));
            preparedStatement.setInt(14, Integer.parseInt(txt_Automovilid.getText()));
            int filasAfectadas = preparedStatement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Actualización exitosa");
            } else {
                System.out.println("La actualización no tuvo éxito");
            }
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    void AutomovilEliminar(ActionEvent event) {
    	 String sql = "DELETE FROM Automovil WHERE idAutomovil = ?";
         try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
             preparedStatement.setInt(1, Integer.parseInt(txt_Automovilid.getText()));
             int filasAfectadas = preparedStatement.executeUpdate();
             if (filasAfectadas > 0) {
                 System.out.println("Eliminación exitosa");
             } else {
                 System.out.println("La eliminación no tuvo éxito");
             }
         } catch (SQLException | NumberFormatException e) {
             e.printStackTrace();
         }
    }

    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //******************************PAQUETE TURISTICO**********************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************

    @FXML
    void PaqueteTuristicoCrear(ActionEvent event) {
    	 String sql = "INSERT INTO PaqueteTuristico (idPaqueteT, nombrePT, duracion, precio, regimen, fechaInicio, fechafin, cantidadUsuario, descuentoGrupo, descuento, total) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

         try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
             // Establecer los valores de los parámetros
             preparedStatement.setInt(1, Integer.parseInt(txt_PaqueteTuristicoid.getText()));
             preparedStatement.setString(2, txt_PaqueteTuristicoNombre.getText());
             preparedStatement.setInt(3, Integer.parseInt(txt_PaqueteTuristicoDuracion.getText()));
             preparedStatement.setDouble(4, Double.parseDouble(txt_PaqueteTuristicoPrecio.getText()));
             preparedStatement.setString(5, txt_PaqueteTuristicoRegimen.getText());

             SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
             Date fechaInicio = (Date) dateFormat.parse(txt_PaqueteTuristicoFechaInicio.getText());
             preparedStatement.setDate(6, new java.sql.Date(fechaInicio.getTime()));

             Date fechaFin = (Date) dateFormat.parse(txt_PaqueteTuristicoFechafin.getText());
             preparedStatement.setDate(7, new java.sql.Date(fechaFin.getTime()));

             preparedStatement.setInt(8, Integer.parseInt(txt_PaqueteTuristicoCantidadUsu.getText()));
             preparedStatement.setDouble(9, Double.parseDouble(txt_PaqueteTuristicoDescuentoGrupo.getText()));
             preparedStatement.setDouble(10, Double.parseDouble(txt_PaqueteTuristicoDescuento.getText()));
             preparedStatement.setDouble(11, Double.parseDouble(txt_PaqueteTuristicoTotal.getText()));

             int filasAfectadas = preparedStatement.executeUpdate();
             if (filasAfectadas > 0) {
                 System.out.println("Inserción exitosa");
             } else {
                 System.out.println("La inserción no tuvo éxito");
             }
         } catch (SQLException | NumberFormatException | ParseException e) {
             e.printStackTrace();
         }
    }
        
    @FXML
    void PaqueteTuristicoBuscar(ActionEvent event) {
    	String sql = "SELECT * FROM PaqueteTuristico WHERE idPaqueteT=?";
        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer el idPaqueteT como parámetro
            preparedStatement.setInt(1, Integer.parseInt(txt_PaqueteTuristicoid.getText()));

            // Ejecutar la consulta
            ResultSet resultSet = preparedStatement.executeQuery();

            // Verificar si se encontró el paquete turístico
            if (resultSet.next()) {
                // Obtener los valores de las columnas
                String nombre = resultSet.getString("nombrePT");
                int duracion = resultSet.getInt("duracion");
                double precio = resultSet.getDouble("precio");
                String regimen = resultSet.getString("regimen");
                java.sql.Date fechaInicio = resultSet.getDate("fechaInicio");
                java.sql.Date fechaFin = resultSet.getDate("fechafin");
                int cantidadUsuario = resultSet.getInt("cantidadUsuario");
                double descuentoGrupo = resultSet.getDouble("descuentoGrupo");
                double descuento = resultSet.getDouble("descuento");
                double total = resultSet.getDouble("total");

                // Llenar los valores en campos (reemplaza esto con tu lógica específica)
                txt_PaqueteTuristicoNombre.setText(nombre);
                txt_PaqueteTuristicoDuracion.setText(String.valueOf(duracion));
                txt_PaqueteTuristicoPrecio.setText(String.valueOf(precio));
                txt_PaqueteTuristicoRegimen.setText(regimen);
                txt_PaqueteTuristicoFechaInicio.setText(fechaInicio.toString());
                txt_PaqueteTuristicoFechafin.setText(fechaFin.toString());
                txt_PaqueteTuristicoCantidadUsu.setText(String.valueOf(cantidadUsuario));
                txt_PaqueteTuristicoDescuentoGrupo.setText(String.valueOf(descuentoGrupo));
                txt_PaqueteTuristicoDescuento.setText(String.valueOf(descuento));
                txt_PaqueteTuristicoTotal.setText(String.valueOf(total));

                System.out.println("Paquete turístico encontrado y valores llenados en campos.");
            } else {
                System.out.println("Paquete turístico no encontrado para el idPaqueteT proporcionado.");
            }
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

   
    @FXML
    void PaqueteTuristicoActualizar(ActionEvent event) {
    	String sql = "UPDATE PaqueteTuristico SET nombrePT=?, duracion=?, precio=?, regimen=?, fechaInicio=?, fechafin=?, cantidadUsuario=?, descuentoGrupo=?, descuento=?, total=? WHERE idPaqueteT=?";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            // Establecer los valores de los parámetros
            preparedStatement.setString(1, txt_PaqueteTuristicoNombre.getText());
            preparedStatement.setInt(2, Integer.parseInt(txt_PaqueteTuristicoDuracion.getText()));
            preparedStatement.setDouble(3, Double.parseDouble(txt_PaqueteTuristicoPrecio.getText()));
            preparedStatement.setString(4, txt_PaqueteTuristicoRegimen.getText());
            preparedStatement.setDate(5, java.sql.Date.valueOf(txt_PaqueteTuristicoFechaInicio.getText()));
            preparedStatement.setDate(6, java.sql.Date.valueOf(txt_PaqueteTuristicoFechafin.getText()));
            preparedStatement.setInt(7, Integer.parseInt(txt_PaqueteTuristicoCantidadUsu.getText()));
            preparedStatement.setDouble(8, Double.parseDouble(txt_PaqueteTuristicoDescuentoGrupo.getText()));
            preparedStatement.setDouble(9, Double.parseDouble(txt_PaqueteTuristicoDescuento.getText()));
            preparedStatement.setDouble(10, Double.parseDouble(txt_PaqueteTuristicoTotal.getText()));
            preparedStatement.setInt(11, Integer.parseInt(txt_PaqueteTuristicoid.getText()));

            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Actualización exitosa");
            } else {
                System.out.println("La actualización no tuvo éxito");
            }
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    void PaqueteTuristicoEliminar(ActionEvent event) {
    	 String sql = "DELETE FROM PaqueteTuristico WHERE idPaqueteT = ?";

         try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
             // Establecer los valores de los parámetros
             preparedStatement.setInt(1, Integer.parseInt(txt_PaqueteTuristicoid.getText()));

             // Ejecutar la eliminación
             int filasAfectadas = preparedStatement.executeUpdate();

             if (filasAfectadas > 0) {
                 System.out.println("Eliminación exitosa");
             } else {
                 System.out.println("La eliminación no tuvo éxito");
             }
         } catch (SQLException | NumberFormatException e) {
             e.printStackTrace();
         }
    }
    
    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //****************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    //***********************************************************************************************************************************************************************************************************************
    
}
