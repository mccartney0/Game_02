package com.traduvertgames.world;

public class Camera {

	public static int x = 0;
	public static int y = 0;

	public static int clamp(int Atual, int Min, int Max) {
		if (Atual < Min) {
			
			Atual = Min;
		}
		else if (Atual > Max) {
			Atual = Max;
		}

		return Atual;
	}
}
