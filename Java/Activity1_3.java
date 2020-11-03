
public class Activity1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double seconds = 1000000000;
     double Mercuryseconds = 0.2408467;
     double Venusseconds = 0.61519726;
     double Earthseconds = 31557600;
     double Marsseconds = 1.8808158;
     double Jupiterseconds = 11.862615;
     double Saturnseconds = 29.447498;
     double Uranusseconds = 84.016846;
     double Neptuneseconds = 164.79132;
     double  Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune ;
     
      Mercury= (seconds / Earthseconds / Mercuryseconds );
      Venus= (seconds / Earthseconds / Venusseconds ) ;
      Earth= (seconds / Earthseconds );
     Mars= (seconds / Earthseconds / Marsseconds );
      Jupiter= (seconds / Earthseconds / Jupiterseconds );
      Saturn= (seconds / Earthseconds / Saturnseconds );
      Uranus= (seconds / Earthseconds / Uranusseconds );
      Neptune= (seconds / Earthseconds / Neptuneseconds );
    										  
    		  
     
      
     System.out.println("Age on mercury is " + Mercury);
  //   System.out.println("Age on mercury is " + Venus);
     System.out.println("Age on venus is " + Venus);
     System.out.println("Age on earth is " + Earth );
     System.out.println("Age on mars is " + seconds / Earthseconds / Mars);
     System.out.println("Age on jupiter is " +  Jupiter);
     System.out.println("Age on saturn is " +  Saturn);
     System.out.println("Age on uranus is " +  Uranus);
     System.out.println("Age on neptune is " +  Neptune);
    
	}

}
