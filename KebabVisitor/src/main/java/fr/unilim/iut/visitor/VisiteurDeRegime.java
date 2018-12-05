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

public interface VisiteurDeRegime {

	public boolean visit(Agneau agneau);

	public boolean visit(Boeuf boeuf);

	public boolean visit(Crevette crevette);

	public boolean visit(Fromage fromage);

	public boolean visit(Oignon oignon);

	public boolean visit(Pain pain);

	public boolean visit(Salade salade);

	public boolean visit(Sauce sauce);

	public boolean visit(Thon thon);

	public boolean visit(Tomate tomate);

}
