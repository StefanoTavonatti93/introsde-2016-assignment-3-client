
package introsde.document.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPeopleListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPeopleListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="people" type="{http://ws.document.introsde/}people" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPeopleListResponse", propOrder = {
    "people"
})
public class GetPeopleListResponse {

    protected People_Type people;

    /**
     * Gets the value of the people property.
     * 
     * @return
     *     possible object is
     *     {@link People_Type }
     *     
     */
    public People_Type getPeople() {
        return people;
    }

    /**
     * Sets the value of the people property.
     * 
     * @param value
     *     allowed object is
     *     {@link People_Type }
     *     
     */
    public void setPeople(People_Type value) {
        this.people = value;
    }

}
