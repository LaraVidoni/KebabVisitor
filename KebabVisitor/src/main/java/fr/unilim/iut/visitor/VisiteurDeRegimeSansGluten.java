package fr.unilim.iut.visitor;

import fr.unilim.iut.kebab.ingredients.Agneau;
import fr.unilim.iut.kebab.ingredients.Boeuf;
import fr.unilim.iut.kebab.ingredients.Crevette;
import fr.unilim.iut.kebab.ingredients.Fromage;
import fr.unilim.iut.kebab.ingredients.GaletteDeSarrasin;
import fr.unilim.iut.kebab.ingredients.Oignon;
import fr.unilim.iut.kebab.ingredients.Pain;
import fr.unilim.iut.kebab.ingredients.Salade;
import fr.unilim.iut.kebab.ingredients.Sauce;
import fr.unilim.iut.kebab.ingredients.Thon;
import fr.unilim.iut.kebab.ingredients.Tomate;

public class VisiteurDeRegimeSansGluten implements VisiteurDeRegime {

	public boolean visit(Agneau agneau) {
		return true;
	}

	public boolean visit(Boeuf boeuf) {
		return true;
	}

	public boolean visit(Crevette crevette) {
		return true;
	}

	public boolean visit(Fromage fromage) {
		return true;
	}
	public boolean visit(GaletteDeSarrasin galetteDeSarrasin) {
		return true;
	}
	public boolean visit(Oignon oignon) {
		return true;
	}

	public boolean visit(Pain pain) {
		return false;
	}

	public boolean visit(Salade salade) {
		return true;
	}

	public boolean visit(Sauce sauce) {
		return true;
	}

	public boolean visit(Thon thon) {
		return true;
	}

	public boolean visit(Tomate tomate) {
		return true;
	}

}
