package DeDA.PROJ.Utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.StringTokenizer;

import org.apache.commons.lang3.StringUtils;

public class Dadi {

	public static int formulaDadi(String formula) throws InvalidFormulaException{
		
		if(formula==null) throw new InvalidFormulaException();
		if(StringUtils.isEmpty(formula))throw new InvalidFormulaException();
		
		StringTokenizer st = new StringTokenizer(formula,"+-",true);
		
		ArrayList<String> positivi,negativi;
		positivi=new ArrayList<String>();
		negativi = new ArrayList<String>();
		positivi.add(st.nextToken());
		while(st.hasMoreTokens()){
			String segno=st.nextToken();
			if(segno.equals("+")){
				positivi.add(st.nextToken());
			}else{
				negativi.add(st.nextToken());
			}
		}		
		
		int tot=0;
		for(String lancio:positivi){
			st=new StringTokenizer(lancio, "d");
			int n=Integer.parseInt(st.nextToken());
			int x=Integer.parseInt(st.nextToken());
			for(int i=0;i<n;i++){
				tot+=lancia1dx(x);
			}
		}
		for(String lancio:negativi){
			st=new StringTokenizer(lancio, "d");
			int n=Integer.parseInt(st.nextToken());
			int x=Integer.parseInt(st.nextToken());
			for(int i=0;i<n;i++){
				tot-=lancia1dx(x);
			}
		}
		
		return tot;
	}
	
	public static int lancia1dx(int x){
		if(x==0) return 0;
		//lancio 1 dado a X facce
		//ritorna 1 numero pseudocasuale compreso tra 1(incluso) e x(incluso)
		Random r=new Random();
		return r.nextInt(x)+1;
	}
}
