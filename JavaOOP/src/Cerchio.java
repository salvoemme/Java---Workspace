
public class Cerchio extends Figure{
	int	xCentro = 0;
	int yCentro = 0;
	int raggio = 0;
	
	public Cerchio(int x, int y, int raggio){
		super();
		this.xCentro = x;
		this.yCentro = y;
		this.raggio = raggio;
	}
	
	public double perimetro(){
		return (2*this.raggio*Math.PI);
	}
	
	public double area(){
		return (this.raggio*this.raggio*Math.PI);
	}
}
