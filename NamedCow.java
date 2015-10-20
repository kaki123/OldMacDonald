class NamedCow extends Cow
{
	private String myType;     
     private String mySound;      
     public Cow(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     }     
     public Cow()     {         
         myType = "Cows";         
         mySound = "moo";     
     }      
       
     public String getName(){return myName;} 
}