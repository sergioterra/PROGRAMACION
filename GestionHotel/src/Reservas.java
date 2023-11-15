import com.sergiot.hotel.entidades.Habitacion;

public class Reservas {

	public void reservarHabitacion(Cliente cliente, Habitacion habitacion) {
	
		
		cliente.setHabitacion(habitacion);
		habitacion.setestaocupada(true);
		
		System.out.println("La reserva de la habitacion: " + habitacion.getnumeroHabitacion()+" al cliente: "+ cliente.getNombre() + " " + cliente.getApellido());
	}
		
		public void anularReserva (Cliente cliente, Habitacion habitacion){
			cliente.setHabitacion(null);
			habitacion.setestaocupada(false);
			System.out.println("La reserva de la habitacion: " + habitacion.getnumeroHabitacion()+ "al cliente : " + 
			cliente.getNombre()+ " " +  cliente.getApellido() + "ha quedado anulada");
		}
	
	
	
	
	}
	

