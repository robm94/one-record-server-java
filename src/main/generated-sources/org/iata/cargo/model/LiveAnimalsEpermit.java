
package org.iata.cargo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import org.iata.cargo.Vocabulary;


/**
 * Epermit for Live Animals details
 * 
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_LiveAnimalsEpermit)
public class LiveAnimalsEpermit
    extends LogisticsObject
    implements Serializable
{

    /**
     * Consignee company details, including complete name and address (box 3)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_consignee_A_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Company consignee;
    /**
     * Reference to the pieces and properties linked to the Permit (box 7 to 12)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_consignments)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    protected Set<EpermitConsignment> consignments;
    /**
     * List of all the signatures of the Epermit (applicant box 4, issuing authority box 6, issuer box 13 and examining authority box 14)
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_signatures)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    protected Set<EpermitSignature> signatures;
    /**
     * Indicates if the permit is a copy (true) or an original (false) (box 1)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_permitCopyIndicator)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String permitCopyIndicator;
    /**
     * The original number is a unique number allocated to each document by the relevant Management Authority. (box 1)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_permitNumber)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1)
    })
    protected String permitNumber;
    /**
     * Code specifying the document name. (box 1)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_permitTypeCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1)
    })
    protected String permitTypeCode;
    /**
     * Description if TypeCode is Other (box 1)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_permitTypeOther)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String permitTypeOther;
    /**
     * Permit Valid from (box 2)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_permitValidFrom)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#dateTime", max = 1)
    })
    protected Date permitValidFrom;
    /**
     * Permit Valid until (box 2)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_permitValidUntil)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#dateTime", max = 1)
    })
    protected Date permitValidUntil;
    /**
     * Special conditions (box 5)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_specialConditions)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String specialConditions;
    /**
     * Code indicating the purpose of the transaction (box 5a)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_transactionPurposeCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1)
    })
    protected String transactionPurposeCode;
    /**
     * Purpose of the transaction in free text (box 5a)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_transactionPurposeText)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String transactionPurposeText;
    /**
     * Reference to the Air Waybill or other transport contract document (box 15)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_transportContractId)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1)
    })
    protected String transportContractId;
    /**
     * Code specifying the transport document name (box 15)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_transportContractTypeCode)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1)
    })
    protected String transportContractTypeCode;

    public void setConsignee(Company consignee) {
        this.consignee = consignee;
    }

    public Company getConsignee() {
        return consignee;
    }

    public void setConsignments(Set<EpermitConsignment> consignments) {
        this.consignments = consignments;
    }

    public Set<EpermitConsignment> getConsignments() {
        return consignments;
    }

    public void setSignatures(Set<EpermitSignature> signatures) {
        this.signatures = signatures;
    }

    public Set<EpermitSignature> getSignatures() {
        return signatures;
    }

    public void setPermitCopyIndicator(String permitCopyIndicator) {
        this.permitCopyIndicator = permitCopyIndicator;
    }

    public String getPermitCopyIndicator() {
        return permitCopyIndicator;
    }

    public void setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
    }

    public String getPermitNumber() {
        return permitNumber;
    }

    public void setPermitTypeCode(String permitTypeCode) {
        this.permitTypeCode = permitTypeCode;
    }

    public String getPermitTypeCode() {
        return permitTypeCode;
    }

    public void setPermitTypeOther(String permitTypeOther) {
        this.permitTypeOther = permitTypeOther;
    }

    public String getPermitTypeOther() {
        return permitTypeOther;
    }

    public void setPermitValidFrom(Date permitValidFrom) {
        this.permitValidFrom = permitValidFrom;
    }

    public Date getPermitValidFrom() {
        return permitValidFrom;
    }

    public void setPermitValidUntil(Date permitValidUntil) {
        this.permitValidUntil = permitValidUntil;
    }

    public Date getPermitValidUntil() {
        return permitValidUntil;
    }

    public void setSpecialConditions(String specialConditions) {
        this.specialConditions = specialConditions;
    }

    public String getSpecialConditions() {
        return specialConditions;
    }

    public void setTransactionPurposeCode(String transactionPurposeCode) {
        this.transactionPurposeCode = transactionPurposeCode;
    }

    public String getTransactionPurposeCode() {
        return transactionPurposeCode;
    }

    public void setTransactionPurposeText(String transactionPurposeText) {
        this.transactionPurposeText = transactionPurposeText;
    }

    public String getTransactionPurposeText() {
        return transactionPurposeText;
    }

    public void setTransportContractId(String transportContractId) {
        this.transportContractId = transportContractId;
    }

    public String getTransportContractId() {
        return transportContractId;
    }

    public void setTransportContractTypeCode(String transportContractTypeCode) {
        this.transportContractTypeCode = transportContractTypeCode;
    }

    public String getTransportContractTypeCode() {
        return transportContractTypeCode;
    }

}
