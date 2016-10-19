package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

public class NaturalNumberManager {
	NaturalNumber naturalNumber;
	NaturalNumberCreator naturalNumberCreator;
	
	public NaturalNumber createNaturalNumber(int value){
		return naturalNumberCreator.createNaturalNumber(value);
	}
	
	public void setNaturalNumberCreator(NaturalNumberCreator naturalNumberCreator){
		this.naturalNumberCreator = naturalNumberCreator;
	}

}
