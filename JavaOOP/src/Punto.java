
public class Punto extends Figure{
	private int x = 0;
	private int y = 0;
	static private int conta = 0;
	
	//Constructor
	public Punto (int x, int y){
		super();
		this.x = x;
		this.y = y;
		conta++;
	}
	
	public Punto(int x){
		this(1,0);
	}
	
	public Punto(){
		this(0,0);
	}
	
	//Getters and Setters
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public short localizzaQuadrante(){
		if (x>0 && y>0)
			return 1;
		else
			if (x<0 && y>0)
				return 2;
			else
				if (x<0 && y<0)
					return 3;
				else
					if (x>0 && y<0)
						return 4;
					else
						return 99;
			
	}
	
	public String toString(){
		return "(" + this.x + "," + this.y + ")";
	}
	//Static Method or Class Method
	public static int getConta(){
		return conta;
	}
	
	public double area(){
		return 0;
	}

	double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}
