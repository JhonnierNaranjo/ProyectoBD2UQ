package Controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import aplicacion.Main;
import conexion.Conexion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;


public class ClienteControler {
	
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
    private Button bt_crearVenta;
 @FXML
    private Button bt_buscarVenta;
 @FXML
    private Button bt_actualizarVenta;
 @FXML
    private Button bt_eliminarVenta;
	
	
	
	
	@FXML
    private Button bt_crearDetalleVenta;
 @FXML
    private Button bt_buscarDetalleVenta;
 @FXML
    private Button bt_actualizarDetalleVenta;
 @FXML
    private Button bt_eliminarDetalleVenta;
	
	
	@FXML
    private Button bt_reservarHab;
 @FXML
    private Button bt_buscarHab;
 @FXML
    private Button bt_actualizarHab;
 @FXML
    private Button bt_eliminarHab;
	
	
	 
	 @FXML
	    private Button bt_Reservar;
	 @FXML
	    private Button bt_Actualizar;
	 @FXML
	    private Button bt_Buscar;
	 @FXML
	    private Button bt_Eliminar;
	 
	 @FXML
	    private Button bt_reservarAuto;
	 @FXML
	    private Button bt_buscarAuto;
	 @FXML
	    private Button bt_actualizarAuto;
	 @FXML
	    private Button bt_eliminarAuto;
	 
	 @FXML
	    private TextField txt_idPersona;
	 
	 @FXML
	    private TextField txt_idreserva;
	 
	 @FXML
	    private TextField txt_fechaSolicitud;
	 
	 @FXML
	    private TextField txt_fechaViaje;
	 
	 @FXML
	    private TextField txt_idPaquete;
	 
	 @FXML
	    private TextField txt_estado;
	 
	 
	 @FXML
	    private TextField txt_precioDia;
	 @FXML
	    private TextField txt_adquiereSeguro;
	 @FXML
	    private TextField txt_adquiereGps;
	 @FXML
	    private TextField txt_descuentoGeneral;
	 @FXML
	    private TextField txt_total;
	 @FXML
	    private TextField txt_estadoAuto;
	 @FXML
	    private TextField txt_idReserva;
	 @FXML
	    private TextField txt_idAuto;
	 @FXML
	    private TextField txt_ciudadPickup;
	 @FXML
	    private TextField txt_fechaPickup;
	 @FXML
	    private TextField txt_fechaEntrega;
	 @FXML
	    private TextField txt_precioDiaRetraso;
	 
	 
	 @FXML
	    private TextField txt_idReservaHab;
	 @FXML
	    private TextField txt_idHab;
	 @FXML
	    private TextField txt_fechaInicio;
	 @FXML
	    private TextField txt_fechaFin;
	 @FXML
	    private TextField txt_descripcion;
	 @FXML
	    private TextField txt_regimen;
	 
	 
	     @FXML
	       private TextField txt_idArticuloDetalleventa;
		 @FXML
		    private TextField txt_idVentaDetalleVenta;
		 @FXML
		    private TextField txt_descripcionDetalleVenta;
		 @FXML
		    private TextField txt_dtoGenDetalleVenta;
		 @FXML
		    private TextField txt_fechaInicioDtoDetalleVenta;
		 @FXML
		    private TextField txt_finDtoDetalleVenta;
		 
		 @FXML
		    private TextField txt_fechaCompraDetalleVenta;
		 @FXML
		    private TextField txt_cantCompraDetalleVenta;
		 @FXML
		    private TextField txt_totalDetalleVenta;
		 @FXML
		    private TextField txt_estadoDetalleVenta;
		 
		 
		 @FXML
		    private TextField txt_idVenta;
		 @FXML
		    private TextField txt_idPersona1;
		 
		 @FXML
		    private TextField txt_fechaVenta;
		 @FXML
		    private TextField txt_impuestoVenta;
		 @FXML
		    private TextField txt_precioUnVenta;
		 @FXML
		    private TextField txt_estadoVenta;
	 
	 
	 
	   //***********************************************************************************************************************************************************************************************************************
	    //***********************************************************************************************************************************************************************************************************************
	    //*************************************************RESERVA********************************************************************************************************************************************
	    //***********************************************************************************************************************************************************************************************************************
	    //***********************************************************************************************************************************************************************************************************************

	 
	 @FXML
	    void crearReserva(ActionEvent event) {
	         String sql = "INSERT INTO reserva (idPersona, idReserva, fechaSolicitud, fechaViaje, idPaqueteT, estado) VALUES (?, ?, ?, ?, ?, ? )";
	         
	         try (PreparedStatement preparedStatement = con.prepareStatement(sql)){
	        	 // Establecer los valores de los par�metros
	             preparedStatement.setString(1, txt_idPersona.getText());
	             preparedStatement.setString(2, txt_idreserva.getText());
	             preparedStatement.setString(3, txt_fechaSolicitud.getText());
	             preparedStatement.setString(4, txt_fechaViaje.getText());
	             preparedStatement.setString(5, txt_idPaquete.getText());
	             preparedStatement.setString(6, txt_estado.getText());

	             // Ejecutar la inserci�n
	             int filasAfectadas = preparedStatement.executeUpdate();

	             if (filasAfectadas > 0) {
	                 System.out.println("Inserci�n exitosa en la tabla Hospedaje");
	             } else {
	                 System.out.println("La inserci�n en la tabla Hospedaje no tuvo �xito");
	             }
	        	 
			} catch (Exception e) {
				// TODO: handle exception
			}
	 }
	 
	 @FXML
	    void actualizarReserva(ActionEvent event) {
    	 String sql = "UPDATE reserva SET fechaViaje=?, idPaquete=? where idReserva = ?";
    	 
    	 try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
             // Establecer los valores de los par�metros
             preparedStatement.setString(1, txt_fechaViaje.getText());
             preparedStatement.setString(2, txt_idPaquete.getText());
             preparedStatement.setString(3, txt_idreserva.getText());
             
             int filasAfectadas = preparedStatement.executeUpdate();

             if (filasAfectadas > 0) {
                 System.out.println("Actualizacion exitosa");
             } else {
                 System.out.println("La actualizacion no tuvo exito");
             }
         } catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	 
	 @FXML
	 
	    void eliminarReserva(ActionEvent event) {
 	 String sql = "DELETE reserva WHERE idReserva = ?";
 	 
 	try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {

        preparedStatement.setString(1, txt_idreserva.getText());


        int filasAfectadas = preparedStatement.executeUpdate();

        if (filasAfectadas > 0) {
            System.out.println("eliminacion exitosa");
        } else {
            System.out.println("La inserci�n no tuvo �xito");
        }
    } catch (SQLException e) {
		e.printStackTrace();
	}
	 }
	 
	  void buscarReserva(ActionEvent event) {
		  String sql = "SELECT * FROM reserva WHERE idReserva=?";
	 
		  try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
	 
	            preparedStatement.setString(1,  txt_idreserva.getText());


	            ResultSet resultSet = preparedStatement.executeQuery();

	            if (resultSet.next()) {
	   
	                String idPersona = resultSet.getString("idPersona");
	                String idReserva = resultSet.getString("idReserva");
	                String fechaSolicitud = resultSet.getString("fechaSolicitud");
	                String fechaViaje = resultSet.getString("fechaViaje");
	                String idPaquete = resultSet.getString("idPaquete");
	                String estado = resultSet.getString("estado");

	                txt_idPersona.setText(idPersona);
	                txt_idreserva.setText(idReserva);
	                txt_fechaSolicitud.setText(fechaSolicitud);
	                txt_fechaViaje.setText(fechaViaje);
	                txt_idPaquete.setText(idPaquete);
	                txt_estado.setText(estado);
	               
	                System.out.println("Hospedaje encontrado y valores llenados en campos.");
	            } else {
	                System.out.println("Hospedaje no encontrado para el idHospedaje proporcionado.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	  }
	   //***********************************************************************************************************************************************************************************************************************
	    //***********************************************************************************************************************************************************************************************************************
	    //*************************************************RESERVA AUTOMOVIL********************************************************************************************************************************************
	    //***********************************************************************************************************************************************************************************************************************
	    //***********************************************************************************************************************************************************************************************************************

	  @FXML
	    void crearReservacionAuto(ActionEvent event) {
	         String sql = "INSERT INTO reservaAutomovil (idReserva, idAutomovil,  ciudadPickup, fechaPickup, fechaEntrega, precioDiaRetraso, precioDia, adquiereSeguro, adquiereGPS, descuentoGeneral, total, estado) VALUES (?, ?, ?, ?, ?, ?, ? , ?, ?, ?, ?, ?  )";
	         
	         try (PreparedStatement preparedStatement = con.prepareStatement(sql)){
	        	 // Establecer los valores de los par�metros
	             preparedStatement.setString(1, txt_idReserva.getText());
	             preparedStatement.setString(2, txt_idAuto.getText());
	             preparedStatement.setString(3, txt_ciudadPickup.getText());
	             preparedStatement.setString(4, txt_fechaPickup.getText());
	             preparedStatement.setString(5, txt_fechaEntrega.getText());
	             preparedStatement.setString(6, txt_precioDiaRetraso.getText());
	             preparedStatement.setString(7, txt_precioDia.getText());
	             preparedStatement.setString(8, txt_adquiereSeguro.getText());
	             preparedStatement.setString(9, txt_adquiereGps.getText());
	             preparedStatement.setString(10, txt_descuentoGeneral.getText());
	             preparedStatement.setString(11, txt_total.getText());
	             preparedStatement.setString(12, txt_estadoAuto.getText());
	         
	             // Ejecutar la inserci�n
	             int filasAfectadas = preparedStatement.executeUpdate();

	             if (filasAfectadas > 0) {
	                 System.out.println("Inserci�n exitosa en la tabla Hospedaje");
	             } else {
	                 System.out.println("La inserci�n en la tabla Hospedaje no tuvo �xito");
	             }
	        	 
			} catch (Exception e) {
				// TODO: handle exception
			}
	 }
	  
	  @FXML
	    void actualizarReservaAuto(ActionEvent event) {
  	 String sql = "UPDATE reservaAutomovil SET idAutomovil=?, ciudadPickup=?, fechaPickup=?, fechaEntrega=?, precioDiaRestraso=?, precioDia=?, adquiereSeguro=?, adquiereGPS=?, descuentoGeneral=?, total=? estado=? where idReserva = ?";
  	 
  	 try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
           // Establecer los valores de los par�metros
           preparedStatement.setString(1, txt_idAuto.getText());
           preparedStatement.setString(2, txt_ciudadPickup.getText());
           preparedStatement.setString(3, txt_fechaPickup.getText());
           preparedStatement.setString(4, txt_fechaEntrega.getText());
           preparedStatement.setString(5, txt_precioDiaRetraso.getText());
           preparedStatement.setString(6, txt_precioDia.getText());
           preparedStatement.setString(7, txt_adquiereSeguro.getText());
           preparedStatement.setString(8, txt_adquiereGps.getText());
           preparedStatement.setString(9, txt_descuentoGeneral.getText());
           preparedStatement.setString(10, txt_total.getText());
           preparedStatement.setString(11, txt_estadoAuto.getText());	
           preparedStatement.setString(12, txt_idReserva.getText());

           
           int filasAfectadas = preparedStatement.executeUpdate();

           if (filasAfectadas > 0) {
               System.out.println("Actualizacion exitosa");
           } else {
               System.out.println("La actualizacion no tuvo exito");
           }
       } catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	  
	    void eliminarReservaAuto(ActionEvent event) {
	    	
	 String sql = "DELETE reservaAutomovil WHERE idReserva = ?";
	 
		try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {

	        preparedStatement.setString(1, txt_idReserva.getText());


	        int filasAfectadas = preparedStatement.executeUpdate();

	        if (filasAfectadas > 0) {
	            System.out.println("eliminacion exitosa");
	        } else {
	            System.out.println("La inserci�n no tuvo �xito");
	        }
	    } catch (SQLException e) {
			e.printStackTrace();
		}
	    }
	    
	    void buscarReservaAuto(ActionEvent event) {
			  String sql = "SELECT * FROM reservaAutomovil WHERE idReserva=?";
			  
			  
			  try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
					 
		            preparedStatement.setString(1,  txt_idReserva.getText());


		            ResultSet resultSet = preparedStatement.executeQuery();

		            if (resultSet.next()) {
		   
		                String idReserva = resultSet.getString("idReserva");
		                String idAutomovil = resultSet.getString("idAutomovil");
		                String ciudadPickUp = resultSet.getString("ciudadPickUp");
		                String fechaPickUp = resultSet.getString("fechaPickUp");
		                String fechaEntrega = resultSet.getString("fechaEntrega");
		                String precioDiaRetraso = resultSet.getString("precioDiaRetraso");              
		                String precioDia = resultSet.getString("precioDia");
		                String adquiereSeguro = resultSet.getString("adquiereSeguro");
		   
		                String adquiereGPS = resultSet.getString("adquiereGPS");
		                String descuentoGeneral = resultSet.getString("descuentoGeneral");
		                String total = resultSet.getString("total");
		                String estado = resultSet.getString("estado");

		                txt_idReserva.setText(idReserva);
		                txt_idAuto.setText(idAutomovil);
		                txt_ciudadPickup.setText(ciudadPickUp);
		                txt_fechaPickup.setText(fechaPickUp);
		                txt_fechaEntrega.setText(fechaEntrega);
		                txt_precioDiaRetraso.setText(precioDiaRetraso);
		                txt_precioDia.setText(precioDia);
		                txt_adquiereSeguro.setText(adquiereSeguro);
		                txt_adquiereGps.setText(adquiereGPS);
		                txt_descuentoGeneral.setText(descuentoGeneral);
		                txt_total.setText(total);
		                txt_estadoAuto.setText(estado);
		               
		                System.out.println("Hospedaje encontrado y valores llenados en campos.");
		            } else {
		                System.out.println("Hospedaje no encontrado para el idHospedaje proporcionado.");
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
	    }
	    
	    
		   //***********************************************************************************************************************************************************************************************************************
		    //***********************************************************************************************************************************************************************************************************************
		    //*************************************************RESERVA HABITACION********************************************************************************************************************************************
		    //***********************************************************************************************************************************************************************************************************************
		    //***********************************************************************************************************************************************************************************************************************

	    @FXML
	    void crearReservaHabitacion(ActionEvent event) {
	         String sql = "INSERT INTO ReservaHabitacion (idReserva, idHabitacion, fechaInicio, fechaFin, descripcion, regimen) VALUES (?, ?, ?, ?, ?, ? )";
	         
	         try (PreparedStatement preparedStatement = con.prepareStatement(sql)){
	        	 // Establecer los valores de los par�metros
	             preparedStatement.setString(1, txt_idReservaHab.getText());
	             preparedStatement.setString(2, txt_idHab.getText());
	             preparedStatement.setString(3, txt_fechaInicio.getText());
	             preparedStatement.setString(4, txt_fechaFin.getText());
	             preparedStatement.setString(5, txt_descripcion.getText());
	             preparedStatement.setString(6, txt_regimen.getText());

	             // Ejecutar la inserci�n
	             int filasAfectadas = preparedStatement.executeUpdate();

	             if (filasAfectadas > 0) {
	                 System.out.println("Inserci�n exitosa en la tabla Hospedaje");
	             } else {
	                 System.out.println("La inserci�n en la tabla Hospedaje no tuvo �xito");
	             }
	        	 
			} catch (Exception e) {
				// TODO: handle exception
			}
	 }
	    
	    @FXML
	    void actualizarReservaHabitacion(ActionEvent event) {
    	 String sql = "UPDATE ReservaHabitacion SET idHabitacion=?, fechaInicio=?, fechaFin=?,descripcion=?,regimen=?  where idReserva = ?";
    	 
    	 try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
             // Establecer los valores de los par�metros
             preparedStatement.setString(1, txt_idHab.getText());
             preparedStatement.setString(2, txt_fechaInicio.getText());
             preparedStatement.setString(3, txt_fechaFin.getText());
             preparedStatement.setString(4, txt_descripcion.getText());
             preparedStatement.setString(5, txt_regimen.getText());
             preparedStatement.setString(6, txt_idReservaHab.getText());
            
             
             int filasAfectadas = preparedStatement.executeUpdate();

             if (filasAfectadas > 0) {
                 System.out.println("Actualizacion exitosa");
             } else {
                 System.out.println("La actualizacion no tuvo exito");
             }
         } catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	    
	    void eliminarReservaHabitacion(ActionEvent event) {
	   	 String sql = "DELETE ReservaHabitacion WHERE idReserva = ?";
	   	 
	   		try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {

	   	        preparedStatement.setString(1, txt_idReservaHab.getText());


	   	        int filasAfectadas = preparedStatement.executeUpdate();

	   	        if (filasAfectadas > 0) {
	   	            System.out.println("eliminacion exitosa");
	   	        } else {
	   	            System.out.println("La inserci�n no tuvo �xito");
	   	        }
	   	    } catch (SQLException e) {
	   			e.printStackTrace();
	   		}
	   	    }
	    
	    void buscarReservaHabitacion(ActionEvent event) {
			  String sql = "SELECT * FROM ReservaHabitacion WHERE idReserva=?";
		 
			  try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
		 
		            preparedStatement.setString(1,  txt_idReservaHab.getText());


		            ResultSet resultSet = preparedStatement.executeQuery();

		            if (resultSet.next()) {
		   
		                String idReserva = resultSet.getString("idReserva");
		                String idHabitacion = resultSet.getString("idHabitacion");
		                String fechaInicio = resultSet.getString("fechaInicio");
		                String fechaFin = resultSet.getString("fechaFin");
		                String descripcion = resultSet.getString("descripcion");
		                String regimen = resultSet.getString("regimen");

		                txt_idReservaHab.setText(idReserva);
		                txt_idHab.setText(idHabitacion);
		                txt_fechaInicio.setText(fechaInicio);
		                txt_fechaFin.setText(fechaFin);
		                txt_descripcion.setText(descripcion);
		                txt_regimen.setText(regimen);
		               
		                System.out.println("Hospedaje encontrado y valores llenados en campos.");
		            } else {
		                System.out.println("Hospedaje no encontrado para el idHospedaje proporcionado.");
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		  }
	    
		   //***********************************************************************************************************************************************************************************************************************
	    //***********************************************************************************************************************************************************************************************************************
	    //*************************************************DetalleVenta********************************************************************************************************************************************
	    //***********************************************************************************************************************************************************************************************************************
	    //***********************************************************************************************************************************************************************************************************************

	    @FXML
	    void crearDetalleVenta(ActionEvent event) {
	         String sql = "INSERT INTO DetalleVenta (idArticulo, idVenta, descripcion, descuentoGeneral, fechaInicioDescuento, fechafinDescuento, fechaCompra, cantidadComprada, total, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
	         
	         try (PreparedStatement preparedStatement = con.prepareStatement(sql)){
	        	 // Establecer los valores de los par�metros
	             preparedStatement.setString(1, txt_idArticuloDetalleventa.getText());
	             preparedStatement.setString(2, txt_idVentaDetalleVenta.getText());
	             preparedStatement.setString(3, txt_descripcionDetalleVenta.getText());
	             preparedStatement.setString(4, txt_dtoGenDetalleVenta.getText());
	             preparedStatement.setString(5, txt_fechaInicioDtoDetalleVenta.getText());
	             preparedStatement.setString(6, txt_finDtoDetalleVenta.getText());
	             
	             preparedStatement.setString(7, txt_fechaCompraDetalleVenta.getText());
	             preparedStatement.setString(8, txt_cantCompraDetalleVenta.getText());
	             preparedStatement.setString(9, txt_totalDetalleVenta.getText());
	             preparedStatement.setString(10, txt_estadoDetalleVenta.getText());
	             
	             

	             // Ejecutar la inserci�n
	             int filasAfectadas = preparedStatement.executeUpdate();

	             if (filasAfectadas > 0) {
	                 System.out.println("Inserci�n exitosa en la tabla Hospedaje");
	             } else {
	                 System.out.println("La inserci�n en la tabla Hospedaje no tuvo �xito");
	             }
	        	 
			} catch (Exception e) {
				// TODO: handle exception
			}
	 }
	    @FXML
	    void actualizarDetalleVenta(ActionEvent event) {
    	 String sql = "UPDATE DetalleVenta SET idHabitacion=?, fechaInicio=?, fechaFin=?,descripcion=?,regimen=?  where idVenta=?";
    	 
    	 try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
             // Establecer los valores de los par�metros
             preparedStatement.setString(1, txt_idArticuloDetalleventa.getText());
             preparedStatement.setString(2, txt_idVentaDetalleVenta.getText());
             preparedStatement.setString(3, txt_descripcionDetalleVenta.getText());
             preparedStatement.setString(4, txt_dtoGenDetalleVenta.getText());
             preparedStatement.setString(5, txt_fechaInicioDtoDetalleVenta.getText());
             preparedStatement.setString(6, txt_finDtoDetalleVenta.getText());
             
             preparedStatement.setString(7, txt_fechaCompraDetalleVenta.getText());
             preparedStatement.setString(8, txt_cantCompraDetalleVenta.getText());
             preparedStatement.setString(9, txt_totalDetalleVenta.getText());
             preparedStatement.setString(10, txt_idArticuloDetalleventa.getText());
            
             
             int filasAfectadas = preparedStatement.executeUpdate();

             if (filasAfectadas > 0) {
                 System.out.println("Actualizacion exitosa");
             } else {
                 System.out.println("La actualizacion no tuvo exito");
             }
         } catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	    
	    void eliminarDetalleVenta(ActionEvent event) {
		   	 String sql = "DELETE DetalleVenta WHERE idArticulo = ? AND idVenta=?";
		   	 
		   		try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {

		   	        preparedStatement.setString(1, txt_idArticuloDetalleventa.getText());
		   	        preparedStatement.setString(2, txt_idVentaDetalleVenta.getText());


		   	        int filasAfectadas = preparedStatement.executeUpdate();

		   	        if (filasAfectadas > 0) {
		   	            System.out.println("eliminacion exitosa");
		   	        } else {
		   	            System.out.println("La inserci�n no tuvo �xito");
		   	        }
		   	    } catch (SQLException e) {
		   			e.printStackTrace();
		   		}
		   	    }
	    
	    void buscarDetalleVenta(ActionEvent event) {
			  String sql = "SELECT * FROM DetalleVenta WHERE idVenta=?";
		 
			  try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
		 
		            preparedStatement.setString(1,  txt_idVentaDetalleVenta.getText());


		            ResultSet resultSet = preparedStatement.executeQuery();

		            if (resultSet.next()) {
		   
		                String idArticulo = resultSet.getString("idArticulo");
		                String idVenta = resultSet.getString("idVenta");
		                String descripcion = resultSet.getString("descripcion");
		                String descuentoGeneral = resultSet.getString("descuentoGeneral");
		                String fechaInicioDescuento = resultSet.getString("fechaInicioDescuento");
		                String fechafinDescuento = resultSet.getString("fechafinDescuento");	
		                
		                String fechaCompra = resultSet.getString("fechaCompra");
		                String cantidadComprada = resultSet.getString("cantidadComprada");
		                String total = resultSet.getString("total");
		                String estado = resultSet.getString("estado");	

		                txt_idArticuloDetalleventa.setText(idArticulo);
		                txt_idVentaDetalleVenta.setText(idVenta);
		                txt_descripcionDetalleVenta.setText(descripcion);
		                txt_dtoGenDetalleVenta.setText(descuentoGeneral);
		                txt_fechaInicioDtoDetalleVenta.setText(fechaInicioDescuento);
		                txt_finDtoDetalleVenta.setText(fechafinDescuento);
		                
		                txt_fechaCompraDetalleVenta.setText(fechaCompra);
		                txt_cantCompraDetalleVenta.setText(cantidadComprada);
		                txt_totalDetalleVenta.setText(total);
		                txt_estadoDetalleVenta.setText(estado);
		               
		                System.out.println("Hospedaje encontrado y valores llenados en campos.");
		            } else {
		                System.out.println("Hospedaje no encontrado para el idHospedaje proporcionado.");
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		  }
	    
	    
	    
	    //***********************************************************************************************************************************************************************************************************************
	    //***********************************************************************************************************************************************************************************************************************
	    //*************************************************VENTA********************************************************************************************************************************************
	    //***********************************************************************************************************************************************************************************************************************
	    //***********************
	    
	    @FXML
	    void crearVenta(ActionEvent event) {
	         String sql = "INSERT INTO Venta (idVenta, idPersona, fecha, impuesto, precioUnitario, estado) VALUES (?, ?, ?, ?, ?, ?)";
	         
	         try (PreparedStatement preparedStatement = con.prepareStatement(sql)){
	        	 // Establecer los valores de los par�metros
	             preparedStatement.setString(1, txt_idVenta.getText());
	             preparedStatement.setString(2, txt_idPersona.getText());
	             preparedStatement.setString(3, txt_fechaVenta.getText());
	             preparedStatement.setString(4, txt_impuestoVenta.getText());
	             preparedStatement.setString(5, txt_precioUnVenta.getText());
	             preparedStatement.setString(6, txt_estadoVenta.getText());
	            
	            
	             // Ejecutar la inserci�n
	             int filasAfectadas = preparedStatement.executeUpdate();

	             if (filasAfectadas > 0) {
	                 System.out.println("Inserci�n exitosa en la tabla Hospedaje");
	             } else {
	                 System.out.println("La inserci�n en la tabla Hospedaje no tuvo �xito");
	             }
	        	 
			} catch (Exception e) {
				// TODO: handle exception
			}
	 }
	    
	    @FXML
	    void actualizarVenta(ActionEvent event) {
    	 String sql = "UPDATE Venta SET idPersona=?, fecha=?, impuesto=?,precioUnitario=?,estado=?  where idVenta = ?";
    	 
    	 try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
             // Establecer los valores de los par�metros
            
             preparedStatement.setString(1, txt_idPersona1.getText());
             preparedStatement.setString(2, txt_fechaVenta.getText());
             preparedStatement.setString(3, txt_impuestoVenta.getText());
             preparedStatement.setString(4, txt_precioUnVenta.getText());
             preparedStatement.setString(5, txt_estadoVenta.getText());
             preparedStatement.setString(6, txt_idVenta.getText());
            
             
             int filasAfectadas = preparedStatement.executeUpdate();

             if (filasAfectadas > 0) {
                 System.out.println("Actualizacion exitosa");
             } else {
                 System.out.println("La actualizacion no tuvo exito");
             }
         } catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	    
	    
	    void eliminarVenta(ActionEvent event) {
	   	 String sql = "DELETE Venta WHERE idVenta = ?";
	   	 
	   		try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {

	   	        preparedStatement.setString(1, txt_idVenta.getText());


	   	        int filasAfectadas = preparedStatement.executeUpdate();

	   	        if (filasAfectadas > 0) {
	   	            System.out.println("eliminacion exitosa");
	   	        } else {
	   	            System.out.println("La inserci�n no tuvo �xito");
	   	        }
	   	    } catch (SQLException e) {
	   			e.printStackTrace();
	   		}
	   	    }
	    
	    void buscarVenta(ActionEvent event) {
			  String sql = "SELECT * FROM venta WHERE idVenta=?";
		 
			  try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
		 
		            preparedStatement.setString(1,  txt_idVenta.getText());


		            ResultSet resultSet = preparedStatement.executeQuery();

		            if (resultSet.next()) {
		   
		                String idVenta = resultSet.getString("idVenta");
		                String idPersona = resultSet.getString("idPersona");
		                String fecha = resultSet.getString("fecha");
		                String impuesto = resultSet.getString("impuesto");
		                String impuestoVenta = resultSet.getString("impuesto");
		                String estado = resultSet.getString("estado");	

		                txt_idVenta.setText(idVenta);
		                txt_idPersona.setText(idVenta);
		                txt_fechaVenta.setText(fecha);
		                txt_impuestoVenta.setText(impuesto);
		                txt_precioUnVenta.setText(impuestoVenta);
		                txt_estadoVenta.setText(estado);
		               
		                System.out.println("Hospedaje encontrado y valores llenados en campos.");
		            } else {
		                System.out.println("Hospedaje no encontrado para el idHospedaje proporcionado.");
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		  }
	 
	 
}
