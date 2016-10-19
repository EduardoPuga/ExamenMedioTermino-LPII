
public class Hilos extends Thread{

	String mensaje;
	boolean isAlive;
	
	public boolean getAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	public Hilos(String msg){

		super(msg);
	}

	public void run(){

		System.out.println(isAlive);
		while(isAlive){
			
			System.out.println(mensaje);

			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		System.out.println("------FIN DEL PROCESO: " + this.getName());
		
	}

	public void setMensaje(String msj){

        this.mensaje = msj;

    }
}
