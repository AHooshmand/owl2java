package de.incunabulum.owl4java.jmodel.utils;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntProperty;
import com.hp.hpl.jena.ontology.Restriction;

public class DebugUtils {

	public static String logClass(OntClass cls) {
		String log = NamingUtils.toLogName(cls) + " -> " + "anon: " + cls.isAnon() + ", complement: "
				+ cls.isComplementClass() + ", intersection: " + cls.isIntersectionClass() + ", union: "
				+ cls.isUnionClass() + ", enumerated: " + cls.isEnumeratedClass();
		return log;
	}

	public static String logProperty(OntProperty prop) {

		String log = NamingUtils.toLogName(prop) + " -> " + "functional: " + prop.isFunctionalProperty()
				+ ", inverse: " + prop.isFunctionalProperty() + ", inverse functional: "
				+ prop.isInverseFunctionalProperty() + ", datatype prop: " + prop.isDatatypeProperty()
				+ ", object prop: " + prop.isObjectProperty() + ", symmetric: " + prop.isSymmetricProperty()
				+ ", transitive: " + prop.isTransitiveProperty();
		return log;
	}

	public static String logRestriction(Restriction res) {
		String log = "Restriction -> " + "all values: " + res.isAllValuesFromRestriction() + ", some values: "
				+ res.isSomeValuesFromRestriction() + ", has value: " + res.isHasValueRestriction()
				+ ", max cardinality: " + res.isMaxCardinalityRestriction() + ", min cardinality: "
				+ res.isMinCardinalityRestriction() + ")";
		return log;
	}

	public static String logPropertyOnClass(OntClass cls, OntProperty prop) {
		return NamingUtils.toLogName(cls) + "->" + NamingUtils.toLogName(prop);
	}
}
