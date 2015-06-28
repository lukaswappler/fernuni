package fernuni.obj.ea6.a4;

class NochEinThread extends EinThread {
    public NochEinThread(String s, Konto k) {
        super(s, k);
    }

    public void run() {
        while (true) {
            /*** 1 ***/
        	System.out.println("staatische Variable nummer: " + nummer);
        	
        	//Der Thread Pit und EVa bekommen beide eine Referenz desselben KontoObjectes
        	//Auf Nummer und name des Threads von Pit ist kein Zugriff
        	System.out.println("Pit konto: " + this.meinKonto.getKontoStand());
        	
        	//auf die Instanz-Variablen von TOM ist kein Zugriff möglich. Auf das Object kann von hier aus nicht zugegriffen werden.
        	//Die Instanzvariabel sind Objektvariablen, bis auf Nummer.  
        	        	
        	//eigenes Konto
        	System.out.println("Eigenes Konto also von Thread Eva: " + this.meinKonto.getKontoStand());
        	
        	
        	//auf bv aus der Run Methode von EinTread ist kein Zugriff möglich. 
        	//bv ist eine lokale Variable, die nur innerhalb von der run Methode des Threads "Ein Thread" lebt
        	
        	
        	this.meinKonto.einzahlen(200);
        	
            yield();
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
            }
        }
    }
}
