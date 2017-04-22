
package juego.uno;

public class Carta {

	public String color;
	public Integer valor;
        public String efecto;

	public Carta(String color, Integer valor, String efecto){
		this.color = color;
		this.valor = valor;
                this.efecto = efecto;
	}
        
        public void ImprimirCarta(){
            System.out.println("Color: "+color+" Valor: "+valor+" Efecto: "+efecto);
        }
        
        public String getColor(){
            return color;
        }
        
        public Integer getValor(){
            return valor;
        }
        
        public String getEfecto(){
            return efecto;
        }
}
