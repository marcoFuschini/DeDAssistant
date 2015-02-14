package DeDA.PROJ;

public class Caratteristiche {
	private int pFOR,pDES,pCOS,pINT,pSAG,pCAR;

	public static int Punteggio2Modificatore(int p){
		return p<10?(int) -(((10-(float)p)/2)+0.5):(int) Math.round(((p-10)/2));
	}
	
	//Per aumentare definitivamente le caratteristiche, bisogna istanziare un nuovo oggetto con le nuove caratteristiche
	public Caratteristiche(int pFOR,int pDES,int pCOS,int pINT,int pSAG,int pCAR) {
		this.pFOR=pFOR;
		this.pDES=pDES;
		this.pCOS=pCOS;
		this.pINT=pINT;
		this.pSAG=pSAG;
		this.pCAR=pCAR;
	}
	
	public int getpFOR() {
		return pFOR;
	}

	public int getpDES() {
		return pDES;
	}

	public int getpCOS() {
		return pCOS;
	}

	public int getpINT() {
		return pINT;
	}

	public int getpSAG() {
		return pSAG;
	}

	public int getpCAR() {
		return pCAR;
	}
	
	public int getModFOR(){
		return Punteggio2Modificatore(pFOR);
	}
	
	public int getModDES(){
		return Punteggio2Modificatore(pDES);
	}
	
	public int getModCOS(){
		return Punteggio2Modificatore(pCOS);
	}
	
	public int getModINT(){
		return Punteggio2Modificatore(pINT);
	}
	
	public int getModSAG(){
		return Punteggio2Modificatore(pSAG);
	}
	
	public int getModCAR(){
		return Punteggio2Modificatore(pCAR);
	}
	
	
	public int[] getPunteggiCaratteristiche(){
		int[] ret = {pFOR,pDES,pCOS,pINT,pSAG,pCAR};
		return ret;
	}
	
	public int[] getModificatoriCaratteristiche(){
		int[] ret = {getModFOR(),getModDES(),getModCOS(),getModINT(),getModSAG(),getModCAR()};
		return ret;
	}
	
}
