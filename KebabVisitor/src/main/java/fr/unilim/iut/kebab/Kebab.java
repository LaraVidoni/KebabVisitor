package fr.unilim.iut.kebab;

import java.util.List;
import fr.unilim.iut.kebab.ingredients.Ingredient;
import fr.unilim.iut.visitor.VisiteurDeRegimePescetarien;
import fr.unilim.iut.visitor.VisiteurDeRegimeVegetarien;

public abstract class Kebab {
	public abstract List<Ingredient> getIngredients();

	public boolean isVegetarien() {
		VisiteurDeRegimeVegetarien visiteur = new VisiteurDeRegimeVegetarien();
		for (Ingredient ingredient : this.getIngredients()) {
			if (!ingredient.accept(visiteur))
				return false;
		}
		return true;
	}

	public boolean isPescetarien() {
		VisiteurDeRegimePescetarien visiteur = new VisiteurDeRegimePescetarien();
		for (Ingredient ingredient : this.getIngredients()) {
			if (!ingredient.accept(visiteur))
				return false;
		}
		return true;
	}
}
