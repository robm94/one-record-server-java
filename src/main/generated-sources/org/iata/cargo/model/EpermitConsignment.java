
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Types;
import io.swagger.annotations.ApiModelProperty;
import org.iata.cargo.Vocabulary;


/**
 * Details of the pieces (Live animals) of the permit and specific information such as quantity measured and used to date quota
 * 
 * This class was generated by OWL2Java 0.16.4
 * 
 */
@OWLClass(iri = Vocabulary.s_c_EpermitConsignment)
public class EpermitConsignment
    extends LogisticsObject
    implements Serializable
{

    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_EpermitConsignment)
    protected Set<String> types;


    /**
     * Reference to te pieces (Live Animals) of the permit
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_consignmentItems)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    @JsonProperty(Vocabulary.s_p_consignmentItems)
    protected PieceLiveAnimals consignmentItems;
    /**
     * Quatity measured by the examining authority (box 14)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_examiningQuantity)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_examiningQuantity)
    protected Value examiningQuantity;
    /**
     * total number of specimens exported in the current calendar year and the current annuela quota for the species concerned (box 11a)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_usedToDateQuotaQuantity)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#integer", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_usedToDateQuotaQuantity)
    protected Integer usedToDateQuotaQuantity;

    public void setConsignmentItems(PieceLiveAnimals consignmentItems) {
        this.consignmentItems = consignmentItems;
    }

    public PieceLiveAnimals getConsignmentItems() {
        return consignmentItems;
    }

    public void setExaminingQuantity(Value examiningQuantity) {
        this.examiningQuantity = examiningQuantity;
    }

    public Value getExaminingQuantity() {
        return examiningQuantity;
    }

    public void setUsedToDateQuotaQuantity(Integer usedToDateQuotaQuantity) {
        this.usedToDateQuotaQuantity = usedToDateQuotaQuantity;
    }

    public Integer getUsedToDateQuotaQuantity() {
        return usedToDateQuotaQuantity;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }
}