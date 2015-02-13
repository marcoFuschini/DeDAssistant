package DeDA.PROJ;

public class Caratteristiche {
	private int pFOR,pDES,pCOS,pINT,pSAG,pCAR;

	public static int Punteggio2Modificatore(int p){
		return p<10?(int) Math.round(((p-10)/2)-0.1):(int) Math.round(((p-10)/2));
	}
	
	
	public Caratteristiche(int pFOR,int pDES,int pCOS,int pINT,int pSAG,int pCAR) {
	
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
	
	
	public int[] getPunteggiCaratteristiche(){
		int[] ret = {pFOR,pDES,pCOS,pINT,pSAG,pCAR};
		return ret;
	}
	
	public int[] getModificatoriCaratteristiche(){
		int[] ret = {pFOR,pDES,pCOS,pINT,pSAG,pCAR};
		return ret;
	}
	
}
