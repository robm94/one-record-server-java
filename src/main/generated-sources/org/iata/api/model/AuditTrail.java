
package org.iata.api.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import org.iata.api.Vocabulary;


/**
 * Audit trail of a Logistics Object
 * 
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_AuditTrail)
public class AuditTrail
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
    /**
     * List of change requests that were sent as PATCH on for a Logistics Object
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_changeRequests)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    protected Set<ChangeRequest> changeRequests;
    /**
     * Non mandatory error details
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_errors)
    protected Set<Error> errors;
    /**
     * Initial content of the Logistics Object at the creation moment, represented via a Memento
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_loInitialSnapshot)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    protected Memento loInitialSnapshot;
    /**
     * Logistics Object Reference for which the audit trail applies
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_logisticsObjectRef)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected LogisticsObjectRef logisticsObjectRef;
    /**
     * Latest revision of the Logistics Object
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_latestRevision)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#nonNegativeInteger", max = 1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#nonNegativeInteger", min = 1, max = -1)
    })
    protected Integer latestRevision;

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
        return ((((("AuditTrail {"+ name)+"<")+ id)+">")+"}");
    }

    public void setChangeRequests(Set<ChangeRequest> changeRequests) {
        this.changeRequests = changeRequests;
    }

    public Set<ChangeRequest> getChangeRequests() {
        return changeRequests;
    }

    public void setErrors(Set<Error> errors) {
        this.errors = errors;
    }

    public Set<Error> getErrors() {
        return errors;
    }

    public void setLoInitialSnapshot(Memento loInitialSnapshot) {
        this.loInitialSnapshot = loInitialSnapshot;
    }

    public Memento getLoInitialSnapshot() {
        return loInitialSnapshot;
    }

    public void setLogisticsObjectRef(LogisticsObjectRef logisticsObjectRef) {
        this.logisticsObjectRef = logisticsObjectRef;
    }

    public LogisticsObjectRef getLogisticsObjectRef() {
        return logisticsObjectRef;
    }

    public void setLatestRevision(Integer latestRevision) {
        this.latestRevision = latestRevision;
    }

    public Integer getLatestRevision() {
        return latestRevision;
    }

}
