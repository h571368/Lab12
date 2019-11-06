package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;


public class Blogg {
	
private Innlegg[] alleInnlegg;
private int nesteLedige;
private int antall;


	
	public Blogg() {
		alleInnlegg = new Innlegg[20];
		nesteLedige = 0;
		antall = 0;
	

	}

	public Blogg(int lengde) {
		alleInnlegg = new Innlegg[lengde];	
	}
	
	

	public int getAntall() {
		return this.antall;
	}
	
	public Innlegg[] getSamling() {
		return this.alleInnlegg;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		Innlegg[] samling = getSamling();
		
		int i = 0;
		int x = 0;
		while(i < samling.length) {
			
			if(samling[i] == innlegg) {
				x = i;
			}
			else {
				x = -1;
			}
			i++;
		}
		
		return x;

	}

	public boolean finnes(Innlegg innlegg) {
		Innlegg[] samling = getSamling();
		
		int i = 0;
		boolean x = false;
		while(i < samling.length) {
			
			if(samling[i] == innlegg) {
				x = true;
			}
		
			i++;
		}
		
		return x;

	}

	public boolean ledigPlass() {
		Innlegg[] samling = getSamling();
		
		int i = 0;
		boolean x = false;
		while(i < samling.length) {
			if(samling[i] == null) {
				x = true;
			}
			i++;
		}
		
		return x;
			
		}

	
	public boolean leggTil(Innlegg innlegg) {

		Innlegg[] samling = getSamling();
		
		int i = 0;
		boolean x = false;
		while(i < samling.length) {
			if(samling[i].getId() == innlegg.getId()) {
				x = true;
			}
			i++;
		}
		
		return x;
			
		}
	
	
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}