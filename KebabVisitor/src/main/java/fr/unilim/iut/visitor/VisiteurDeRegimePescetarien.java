package fr.unilim.iut.visitor;

import fr.unilim.iut.kebab.ingredients.Agneau;
import fr.unilim.iut.kebab.ingredients.Boeuf;
import fr.unilim.iut.kebab.ingredients.Crevette;
import fr.unilim.iut.kebab.ingredients.Fromage;
import fr.unilim.iut.kebab.ingredients.Oignon;
import fr.unilim.iut.kebab.ingredients.Pain;
import fr.unilim.iut.kebab.ingredients.Salade;
import fr.unilim.iut.kebab.ingredients.Sauce;
import fr.unilim.iut.kebab.ingredients.Thon;
import fr.unilim.iut.kebab.ingredients.Tomate;

public class VisiteurDeRegimePescetarien implements VisiteurDeRegime {

	public boolean visit(Agneau agneau) {
		return false;
	}

	public boolean visit(Boeuf boeuf) {
		return false;
	}

	public boolean visit(Crevette crevette) {
		return true;
	}

	public boolean visit(Fromage fromage) {
		return true;
	}

	public boolean visit(Oignon oignon) {
		return true;
	}

	public boolean visit(Pain pain) {
		return true;
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
