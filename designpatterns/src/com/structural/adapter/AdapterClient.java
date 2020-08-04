package com.structural.adapter;

public class AdapterClient {

	public static void main(String[] args) {

		RoundHole rHole = new RoundHole(5);
		RoundPeg rPeg = new RoundPeg(5);
		System.out.println(rHole.fits(rPeg));
		
		SquarePeg sPeg = new SquarePeg(3);
		SquarePegAdapter sqPegAd = new SquarePegAdapter(sPeg);
		System.out.println(rHole.fits(sqPegAd));
	}

}
