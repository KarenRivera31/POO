
public class Cuenta {
	private String nombre; //del titular de la cuenta
	private float saldo; // que tiene esta cuenta 
	private int pin; //que se utiliza para acceder al saldo de la cuenta
	
	public Cuenta() {};
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setSaldo(float saldo) {
		this.saldo=saldo;
	}
	
	public void setPin(int pin) {
		this.pin=pin;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public int getPin() {
		return pin;
	}
}
