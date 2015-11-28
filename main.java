package progrmatv;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        television tv1;
    tv1=new television();
        tv1.establecerCanal(100);
    tv1.establecerVolumen(8);
        
    television tv2;
    tv2=new television();
        
        System.out.println(tv1);
        System.out.println(tv2);
    
        television tv31;
	tv31=new television();
	tv31.encender();

            
            tv31.SubirVolumen();
	tv31.SubirVolumen();
	tv31.SubirVolumen();
	tv31.CambiarCanalArriba();
	tv31.CambiarCanalArriba();
	System.out.println("Volumen: "+tv31.obtenerVolumen());
	System.out.println("Canal: "+tv31.obtenerCanal());
	
	System.out.println("");
	television tv=new television();
	tv2.encender();
	tv2.establecerCanal(50);
	tv2.establecerVolumen(89);
	System.out.println("Volumen: "+tv2.obtenerVolumen());
	System.out.println("Canal: "+tv2.obtenerCanal());
	
	System.out.println("");
	television tv4;
        tv31 = tv2;
	tv31.SubirVolumen();
	tv31.SubirVolumen();
	System.out.println("Volumen: "+tv2.obtenerVolumen());
	System.out.println("Volumen: "+tv31.obtenerVolumen());

        
        
}



}


