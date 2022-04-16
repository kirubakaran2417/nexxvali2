package Interfaces;

public class shape implements Area,Area2{

	public float calculateArea(float x, float y) {
		float areaofcircle=pi*x*y;
		return areaofcircle;
	}

	public int calculatearea(int a) {
		int areaofsquare=a*a;
		return areaofsquare;
	}

}
