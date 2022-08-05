package oop.inter.exercise.supplier;

import oop.inter.exercise.common.AboutMe;

public class AboutMeImpl2 implements AboutMe{

	@Override
	public String yourName() {
		return "권혁근";
	}

	@Override
	public String yourFavoriteCompany() {
		return "삼성";
	}

	@Override
	public String supportMessageToAll() {
		return "이번주도 잘 버텨봐요!";
	}

}
