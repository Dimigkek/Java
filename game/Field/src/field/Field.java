package field.Fighters;

import java.util.Scanner;


public class Field {
    

   static {System.out.println("^In Field^");}
  
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      Fighters vs=new Fighters();
      FireType fire = new FireType();
      FireType fire1 = new FireType();
      FireType fire2 = new FireType();
      FireType fire3 = new FireType();
      FireType fire4 = new FireType();
      FireType fire5 = new FireType();
      fire5.FireType("Hellium",1800,1200,15,80,40,45);
      fire1.FireType("Archlight",2600,2500,20,190,80,85);
      fire2.FireType("Bellum",2000,1200,18,120,60,65);
      fire3.FireType("Ysy",1400,800,12,60,25,60);
      fire4.FireType("Tso",1000,500,10,55,30,45);
      fire.FireType("Hellium",1800,1200,15,80,40,45);
      WaterType water= new WaterType();
      WaterType water1= new WaterType();
      WaterType water2= new WaterType();
      WaterType water3= new WaterType();
      WaterType water4= new WaterType();
      WaterType water5= new WaterType();
      water.WaterType("Quarin",2030,1500,15,65,80,75);
      water1.WaterType("Alberto", 1800,1000,12,75,34,80);
      water2.WaterType("Deelon", 2500,2000,18,100,80,80);
      water3.WaterType("Acherron",3000,2500,20,150,100,75);
      water4.WaterType("Eurl",1500, 500, 10, 50, 50, 55);
      water5.WaterType("Quarin",2030,1500,15,65,80,75);
      WindType wind=new WindType();
      EarthType earth =new EarthType();
      ElectroType electro =new ElectroType();
      System.out.println("Select Fighter:");
      int w=in.nextInt();
      System.out.println("Select Fighter:");
      int f=in.nextInt();
      
       switch (w) {
           case 0:
               water=water5;
               break;
           case 1:
               water=water1;
               break;
           case 2:
               water=water2;
               break;
           case 3:
               water=water3;
               break;
           case 4:
               water=water4;
               break;
           default:
               System.out.println("Pick between 0 and 4.");
               break;
       }
      
       switch (f) {
           case 0:
               fire=fire5;
               break;
           case 1:
               fire=fire1;
               break;
           case 2:
               fire=fire2;
               break;
           case 3:
               fire=fire3;
               break;
           case 4:
               fire=fire4;
               break;
           default:
               System.out.println("Pick between 0 and 4.");
               break;
       }
      
      
      water.checkElement();
      water.displayFighter();
      vs.versus();
      fire.checkElement();
      fire.displayFighter();
      
               System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~!Let's Battle!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      
      
      
      
   
      
          
          
      
      
        int counth=0;
        int countq=0;
     for(int i=0;i<3;i++){ 
         int hp1=water.health;
         int hp2=fire.health;
         
         
      do{
         int RandomAttack = (int) (Math.random() * 4);
          if(fire.speed>water.speed){
             
         switch(RandomAttack){
             case 1 : 
                water.health= water.health-fire.attack;
                System.out.println(water.name+" "+water.health);
                fire.health=fire.health-water.attack;
                System.out.println(fire.name+" "+fire.health);
                water.speed=1;
             case 2:
                 System.out.println(water.name+" Parried!!");
                 fire.attack=fire.attack-water.defence;
                 water.health= water.health-fire.attack;
                 System.out.println(water.name+" "+water.health);
                 fire.health=fire.health-water.attack;
                 System.out.println(fire.name+" "+fire.health);
                 fire.attack=fire.attack+water.defence;
                 fire.speed=0;
                 water.speed=1;
             case 3:
                 System.out.println(water.name+" Dodged!!");
                 System.out.println(water.name+" "+water.health);
                 fire.health=fire.health-water.attack;
                 System.out.println(fire.name+" "+fire.health);
                 fire.speed=0;
                 water.speed=1;
             case 4 :
                 System.out.println(fire.name+" CRITICAL HIT!!!");
                 fire.attack=fire.attack*2;
                 water.health=water.health-fire.attack;
                 System.out.println(water.name+" "+water.health);
                 fire.attack=fire.attack/2;
         }
         
      
      }else{
         switch(RandomAttack){
             case 1: 
                 fire.health=fire.health-water.attack;
                 System.out.println(fire.name+" "+fire.health);
                 water.health= water.health-fire.attack;
                 System.out.println(water.name+" "+water.health);
                 fire.speed=1;
             case 2:
                 System.out.println(fire.name+" Parried!!");
                 water.attack=water.attack-fire.defence;
                 fire.health=fire.health-water.attack;
                 System.out.println(fire.name+" "+fire.health);
                 water.health= water.health-fire.attack;
                 System.out.println(water.name+" "+water.health);
                 water.attack=water.attack+fire.defence;
                 fire.speed=1;
                 water.speed=0;
             case 3:
                 System.out.println(fire.name+" Dodged!!");
                 System.out.println(fire.name+" "+fire.health);
                 water.health= water.health-fire.attack;
                 System.out.println(water.name+" "+water.health);
                 fire.speed=1;
                 water.speed=0;
              case 4 :
                 System.out.println(water.name+" CRITICAL HIT!!!");
                 water.attack=water.attack*2;
                 fire.health=fire.health-water.attack;
                 System.out.println(water.name+" "+water.health);
                 water.attack=water.attack/2;
         }
             
             
     
     
     }}
      while(water.health>0 && fire.health>0);
     
     
          if(water.health>fire.health){
         System.out.println(water.name+" <<<------------------------- Winner!");}
       
         else{System.out.println(fire.name+" <<---------------------- Winner!");}
     
     if(water.health>fire.health){
         countq=countq+1;}
     else{
         counth=counth+1;
               }
      System.out.println("Score: Q:"+countq+" H: "+counth);
      water.health=hp1;
      fire.health=hp2;
     }
       
     
    }
      }
