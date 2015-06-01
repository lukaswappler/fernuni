package fernuni.datenstrukturen;

/**
 * File: AVLknoten.java
 * @author Robert ?
 */
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//                                avlknoten-Klasse
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
public class AVLknoten {
  int key;              //Schluessel
  AVLknoten l,r,v;      //linker,-rechter Sohn,Vater
  int b;                //Ballance

  //---Konstruktor----------------------------------------------------------------
  public AVLknoten(int key, AVLknoten v, AVLknoten l, AVLknoten r, int b){
   this.key=key;
   this.v=v;
   this.l=l;
   this.r=r;
   this.b=b;
  }
}