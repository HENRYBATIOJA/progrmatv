package progrmatv;

public class television {

	

		private int volumen_actual;
		private int canal_actual;
		private boolean encendido;
		
		public void establecerVolumen(int volumen){
			volumen_actual=volumen;
		}
		public void establecerCanal(int canal){
			canal_actual=canal;
		}
		
		public int obtenerVolumen(){
			return volumen_actual;
		}
		public int obtenerCanal(){
			return canal_actual;
		}
		
		public void encender(){
			encendido=true;
		}
	    public void apagar(){
			encendido=false;
		}
	    
	    public void SubirVolumen(){
	    	if(encendido && volumen_actual<=100)
	    	    volumen_actual++;
	    }
	    public void BajarVolumen(){
	    	if(encendido && volumen_actual>=0)
	    	    volumen_actual--;
	    }
	    
	    public void CambiarCanalArriba(){
	    	if(encendido && canal_actual<=50)
	    		canal_actual++;
	    }
	    public void CambiarCanalAbajo(){
	    	if(encendido && canal_actual>=1)
	            canal_actual--;
	    }
	    
	    
	    
	}
