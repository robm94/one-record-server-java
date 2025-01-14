
package org.iata.api.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import org.iata.api.Vocabulary;


/**
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_LogisticsObject)
public class LogisticsObject
    implements Serializable
{

    @Id(generated = true)
    protected String id;
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    protected String name;
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Types
    protected Set<String> types;
    @Properties
    protected Map<String, Set<String>> properties;
    @Id(generated = true)
    protected String id1;
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    protected String name1;
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description1;
    @Types
    protected Set<String> types1;
    @Properties
    protected Map<String, Set<String>> properties1;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setProperties(Map<String, Set<String>> properties) {
        this.properties = properties;
    }

    public Map<String, Set<String>> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return ((((("LogisticsObject {"+ name)+"<")+ id)+">")+"}");
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public String getId1() {
        return id1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName1() {
        return name1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getDescription1() {
        return description1;
    }

    public void setTypes1(Set<String> types1) {
        this.types1 = types1;
    }

    public Set<String> getTypes1() {
        return types1;
    }

    public void setProperties1(Map<String, Set<String>> properties1) {
        this.properties1 = properties1;
    }

    public Map<String, Set<String>> getProperties1() {
        return properties1;
    }


}
