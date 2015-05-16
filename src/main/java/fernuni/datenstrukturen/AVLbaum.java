package fernuni.datenstrukturen;

/**
 * File: AVLbaum.java
 * @author Robert ?
 */
public class AVLbaum{
  AVLknoten Wurzel;        //Zeiger auf die Wurzel des AVL-Baumes
  AVLknoten z;             //Zeiger auf den neuen Knoten,an der Stelle um die
                           //rotiert wurde


//---Konstruktor------------------------------------------------------------------
 public AVLbaum(){
  Wurzel=null;
 }

//---Fügt einen neuen Schlüssel ein:----------------------------------------------
  public void einfuegen(int key){
    System.out.println(key+" einfuegen");

   //falls der Baum leer ist:
   if (Wurzel==null) {Wurzel=new AVLknoten(key,null,null,null,0);return;}

   //sonst beginne bei der Wurzel:
   AVLknoten k=Wurzel;

  while (true){

     //Schluessel bereits im Baum enthalten:
     if (key==k.key) {System.out.println(">  Der Schluessel "+key+" ist bereits enthalten!");return;}

     //Schluessel einfuegen:
     if (key<=k.key) {
            if (k.l==null) {
              k.l=new AVLknoten(key,k,null,null,0);
              upin(k);
              return;
            } else k=k.l;
      }else{
            if (k.r==null) {
              k.r=new AVLknoten(key,k,null,null,0);
              upin(k);
              return;
            } else k=k.r;
      }
  }

}

//---geht rekursiv bis zur Wurzel hoch,und setzt die Balance Werte,und Rotiert falls noetig--
//k  :    Wurzel des Teilbaums,dessen Tiefe sich geaendert hat
//-------------------------------------------------------------------------------------------
public void upin(AVLknoten k){

//falls ich in der Wurzel bin:
 if (k==Wurzel){
  //Balancewerte anpassen:(vereinfacht)
    k.b=(Tiefe(k.r)-Tiefe(k.l));
  //eventuell Rotieren um die AVL-Bedingung widerherzustellen:
    if (Math.abs(k.b)>=2)  rotiere(k);
  return;
 }



 //Balancewerte anpassen:(vereinfacht)
    k.b=(Tiefe(k.r)-Tiefe(k.l));

 //eventuell Rotieren um die AVL-Bedingung widerherzustellen:
 if (Math.abs(k.b)>=2)  {
    rotiere(k);
    k=z;
 }

 //rekursiver Aufruf von upin für k.v:
 upin(k.v);

}



//--fuehrt die entsprechende Rotation in k durch------------------------------------
public void rotiere(AVLknoten k){
  if ((k.b==2)&&(k.r.b==1))    {Linksrotation(k);return;}
  if ((k.b==2)&&(k.r.b==-1))   {DoppelLinksrotation(k);return;}
  if ((k.b==-2)&&(k.l.b==-1))  {Rechtsrotation(k);return;}
  if ((k.b==-2)&&(k.l.b==1))   {DoppelRechtsrotation(k);return;}
 }


/*-----------------------------------------------------------------------------------
             v                      v
             |                      |
             k          =>          b
            /                        \
           b                          k
-----------------------------------------------------------------------------------*/
public void Rechtsrotation(AVLknoten k){
  System.out.println(">  Rechtsrotation in "+k.key);

  AVLknoten v=k.v;
  AVLknoten b=k.l;

  k.l=b.r;
  k.b=0;
  b.r=k;
  b.b=0;
  b.v=v;
  k.v=b;

  z=b;

  if (k==Wurzel) {Wurzel=b;return;}
  if (v.l==k) v.l=b; else v.r=b;
}


/*-----------------------------------------------------------------------------------
             v                      v
             |                      |
             k          =>          b
              \                    /
               b                  k
-----------------------------------------------------------------------------------*/
public void Linksrotation(AVLknoten k){
 System.out.println(">  Linksrotation in "+k.key);
  AVLknoten v=k.v;
  AVLknoten b=k.r;

  k.r=b.l;
  k.b=0;
  b.v=k;
  b.l=k;
  b.b=0;
  k.v=b;

  z=b;

  if (k==Wurzel) {Wurzel=b;return;}
  if (v.l==k) v.l=b; else v.r=b;
}

/*--------------------------------------------------------------------------------
              v                      v
              |                      |
              k                      c
            /                      /   \
           b            =>        b     k
            \
             c
--------------------------------------------------------------------------------*/
public void DoppelRechtsrotation(AVLknoten k){
  System.out.println(">  DoppelRechtsrotation in "+k.key);

   AVLknoten v=k.v;
   AVLknoten b=k.l;
   AVLknoten c=b.r;

   k.l=c.r;
   k.v=c;
   k.b=0;

   b.r=c.l;
   b.v=c;
   b.b=0;

   c.l=b;
   c.r=k;
   c.v=v;

   z=c;

   if (k==Wurzel) {Wurzel=c;return;}
   if (v.l==k) v.l=c; else v.r=c;
}


/*--------------------------------------------------------------------------------
              v                       v
              |                       |
              k                       c
               \                    /   \
                b         =>       k     b
               /
             c
--------------------------------------------------------------------------------*/
public void DoppelLinksrotation(AVLknoten k){
  System.out.println(">  DoppelLinksrotation in "+k.key);
   AVLknoten v=k.v;
   AVLknoten b=k.r;
   AVLknoten c=b.l;

   k.r=c.l;
   k.v=c;
   k.b=0;

   b.l=c.r;
   b.v=c;
   b.b=0;

   c.l=k;
   c.r=b;
   c.v=v;

   z=c;

   if (k==Wurzel) {Wurzel=c;return;}
   if (v.l==k) v.l=c; else v.r=c;
}


//---ermittelt die Tiefe eines Teilbaumes:----------------------------------------

 public int Tiefe(AVLknoten k){
   if (k==null) return 0;
   return 1+(int) Math.max(Tiefe(k.l),Tiefe(k.r));
 }


//---gibt den Baum in Preorder-Darstellung aus:-----------------------------------
 public void preorder(){
  System.out.print("preorder:");
  preorder(Wurzel);
  System.out.println("");
 }

 public void preorder(AVLknoten k){
    if (k!=null){
       System.out.print(k.key+" ");
       preorder(k.l);
       preorder(k.r);
    }
 }
 //---gibt den Baum in Inorder-Darstellung aus:-----------------------------------
 public void inorder(){
  System.out.print("inorder:");
  inorder(Wurzel);
  System.out.println("");
 }

 public void inorder(AVLknoten k){
    if (k!=null){
       inorder(k.l);
       System.out.print(k.key+" ");
       inorder(k.r);
    }
 }
 //---gibt den Baum in Postorder-Darstellung aus:---------------------------------
 public void postorder(){
  System.out.print("postorder:");
  postorder(Wurzel);
  System.out.println("");
 }

 public void postorder(AVLknoten k){
    if (k!=null){
       postorder(k.l);
       postorder(k.r);
       System.out.print(k.key+" ");
    }
 }

}

