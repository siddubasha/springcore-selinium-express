package com.siddu.SpringObjectInjection;

public class AnotherStudent {

	private MathCheat mathCheat;
	
	
	
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}



	public void startCheat() {
		mathCheat.mathCheat();
	}
}
