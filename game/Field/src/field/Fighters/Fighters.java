
package field.Fighters;


public class Fighters {
    
String name,element;
int mana,level,health,attack,defence,speed;

  void versus(){System.out.println("VS");}
 void Fighters(String n,int hp,int mp,int lvl,int att , int def,int spd){
     health=hp;
     mana=mp;
     level=lvl;
     name=n;
     attack=att;
     defence=def;
     speed=spd;
          }
     
}
class WaterType extends Fighters{
       
void WaterType(String n,int hp,int mp,int lvl,int att , int def,int spd){
      name=n;
      health=hp;
      mana=mp;
      level=lvl;
      attack=att;
      defence=def;
      speed=spd;
}
void checkElement(){
        element="Water";
   System.out.println(this.element+" Figher:");
    }
    
     void displayFighter(){
    System.out.println("Name: "+name+"\n"+"Level: "+level+"\n"+"Health :"+health+"\n"+"Mana: "+mana+"\n"+"Attack: "+attack+"\n"+"Defence: "+defence+"\n"+"Speed: "+speed );
    }
}

class EarthType extends Fighters{

    void EarthType(String n,int hp,int mp,int lvl,int att , int def,int spd) {
               
       name=n;
      health=hp;
      mana=mp;
      level=lvl;
      attack=att;
      defence=def;
      speed=spd; 
    }
    void checkElement(){
        element="Earth";
   System.out.println(this.element+" Figher:");
    }
void displayFighter(){
    System.out.println("Name: "+name+"\n"+"Level: "+level+"\n"+"Health :"+health+"\n"+"Mana: "+mana+"\n"+"Attack: "+attack+"\n"+"Defence: "+defence+"\n"+"Speed: "+speed );
    }
          
    }

class ElectroType extends Fighters{

    void ElectroType(String n,int hp,int mp,int lvl,int att , int def,int spd) {
       name=n;
      health=hp;
      mana=mp;
      level=lvl;
      attack=att;
      defence=def;
      speed=spd;
    }
    void checkElement(){
        element="Electro";
   System.out.println(this.element+" Figher:");
    }

 void displayFighter(){
    System.out.println("Name: "+name+"\n"+"Level: "+level+"\n"+"Health :"+health+"\n"+"Mana: "+mana+"\n"+"Attack: "+attack+"\n"+"Defence: "+defence+"\n"+"Speed: "+speed );
    }

}
class WindType extends Fighters{

    void WindType(String n,int hp,int mp,int lvl,int att , int def,int spd) {
      name=n;
      health=hp;
      mana=mp;
      level=lvl;
      attack=att;
      defence=def;
      speed=spd;          
    }
    void checkElement(){
        element="Wind";
   System.out.println(this.element+" Figher:");
    }

 void displayFighter(){
    System.out.println("Name: "+name+"\n"+"Level: "+level+"\n"+"Health :"+health+"\n"+"Mana: "+mana+"\n"+"Attack: "+attack+"\n"+"Defence: "+defence+"\n"+"Speed: "+speed );
    }

}
class FireType extends Fighters{
    
    void FireType(String n,int hp,int mp,int lvl,int att , int def,int spd) {
      name=n;
      health=hp;
      mana=mp;
      level=lvl;
      attack=att;
      defence=def;
      speed=spd;
    }
    void checkElement(){
        element="Fire";
   System.out.println( this.element+" Figher:");
    }
   void displayFighter(){
    System.out.println("Name: "+name+"\n"+"Level: "+level+"\n"+"Health :"+health+"\n"+"Mana: "+mana+"\n"+"Attack: "+attack+"\n"+"Defence: "+defence+"\n"+"Speed: "+speed );
    }
}




