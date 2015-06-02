
public class Rettangolo extends Figure{

	protected int base = 0;
	protected int altezza = 0;
	protected Punto puntoAltoSx = null;
	
	//Contructors
	public Rettangolo(int x, int y, int base, int altezza){
		super();
		puntoAltoSx = new Punto(x,y);
		this.base = base;
		this.altezza = altezza;
	}
	
	public Rettangolo (){
		this(0,1,2,1);
	}
	
	public Rettangolo (Punto p, int x2, int y2){
		this(p.getX(), p.getY(), x2-p.getX(), y2-p.getY());
		
	}
	
	public double perimetro(){
		return (base + altezza) * 2;
	}
	
	public double area(){
		return base * altezza;
		
	}

	public int getBase() {
		return base;
	}

	public int getAltezza() {
		return altezza;
	}

	public Punto getPuntoAltoSx() {
		return puntoAltoSx;
	}
	
	
}
