
public class Quadrato extends Rettangolo{
	
	public Quadrato(int x, int y, int lato){
		super(x,y,lato,lato);
	}

	public double perimetro(){
		return base*4;
	}
	
	public double area(){
		return super.area();
	}
}
