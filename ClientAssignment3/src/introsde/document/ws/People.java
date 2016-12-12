
package introsde.document.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "People", targetNamespace = "http://ws.document.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface People {


    /**
     * 
     * @param personId
     * @return
     *     returns introsde.document.ws.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPersonResponse")
    @Action(input = "http://ws.document.introsde/People/readPersonRequest", output = "http://ws.document.introsde/People/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @return
     *     returns introsde.document.ws.People_Type
     */
    @WebMethod
    @WebResult(name = "people", targetNamespace = "")
    @RequestWrapper(localName = "getPeopleList", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.GetPeopleList")
    @ResponseWrapper(localName = "getPeopleListResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.GetPeopleListResponse")
    @Action(input = "http://ws.document.introsde/People/getPeopleListRequest", output = "http://ws.document.introsde/People/getPeopleListResponse")
    public People_Type getPeopleList();

    /**
     * 
     * @param person
     */
    @WebMethod
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.CreatePersonResponse")
    @Action(input = "http://ws.document.introsde/People/createPersonRequest", output = "http://ws.document.introsde/People/createPersonResponse")
    public void createPerson(
        @WebParam(name = "person", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Person> person);

    /**
     * 
     * @param person
     */
    @WebMethod
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.UpdatePersonResponse")
    @Action(input = "http://ws.document.introsde/People/updatePersonRequest", output = "http://ws.document.introsde/People/updatePersonResponse")
    public void updatePerson(
        @WebParam(name = "person", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Person> person);

    /**
     * 
     * @param personId
     */
    @WebMethod
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.DeletePersonResponse")
    @Action(input = "http://ws.document.introsde/People/deletePersonRequest", output = "http://ws.document.introsde/People/deletePersonResponse")
    public void deletePerson(
        @WebParam(name = "personId", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Integer> personId);

    /**
     * 
     * @param personId
     * @param healthProfile
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "hpId", targetNamespace = "")
    @RequestWrapper(localName = "updatePersonHealthProfile", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.UpdatePersonHealthProfile")
    @ResponseWrapper(localName = "updatePersonHealthProfileResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.UpdatePersonHealthProfileResponse")
    @Action(input = "http://ws.document.introsde/People/updatePersonHealthProfileRequest", output = "http://ws.document.introsde/People/updatePersonHealthProfileResponse")
    public int updatePersonHealthProfile(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "healthProfile", targetNamespace = "")
        HealthProfile healthProfile);

    /**
     * 
     * @param personId
     * @param measureType
     * @return
     *     returns introsde.document.ws.MeasureHistory
     */
    @WebMethod
    @WebResult(name = "MeasureHistory", targetNamespace = "")
    @RequestWrapper(localName = "readPersonHistory", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPersonHistory")
    @ResponseWrapper(localName = "readPersonHistoryResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPersonHistoryResponse")
    @Action(input = "http://ws.document.introsde/People/readPersonHistoryRequest", output = "http://ws.document.introsde/People/readPersonHistoryResponse")
    public MeasureHistory readPersonHistory(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType);

    /**
     * 
     * @return
     *     returns introsde.document.ws.MeasureTypeList
     */
    @WebMethod
    @WebResult(name = "MeasureTypes", targetNamespace = "")
    @RequestWrapper(localName = "readMeasureTypes", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadMeasureTypes")
    @ResponseWrapper(localName = "readMeasureTypesResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadMeasureTypesResponse")
    @Action(input = "http://ws.document.introsde/People/readMeasureTypesRequest", output = "http://ws.document.introsde/People/readMeasureTypesResponse")
    public MeasureTypeList readMeasureTypes();

    /**
     * 
     * @param mid
     * @param id
     * @param measureType
     * @return
     *     returns introsde.document.ws.Measure
     */
    @WebMethod
    @WebResult(name = "measure", targetNamespace = "")
    @RequestWrapper(localName = "readPersonMeasure", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPersonMeasure")
    @ResponseWrapper(localName = "readPersonMeasureResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.ReadPersonMeasureResponse")
    @Action(input = "http://ws.document.introsde/People/readPersonMeasureRequest", output = "http://ws.document.introsde/People/readPersonMeasureResponse")
    public Measure readPersonMeasure(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType,
        @WebParam(name = "mid", targetNamespace = "")
        int mid);

    /**
     * 
     * @param id
     * @param m
     * @return
     *     returns introsde.document.ws.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "savePersonMeasure", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.SavePersonMeasure")
    @ResponseWrapper(localName = "savePersonMeasureResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.SavePersonMeasureResponse")
    @Action(input = "http://ws.document.introsde/People/savePersonMeasureRequest", output = "http://ws.document.introsde/People/savePersonMeasureResponse")
    public Person savePersonMeasure(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "m", targetNamespace = "")
        Measure m);

    /**
     * 
     * @param measure
     * @param personId
     */
    @WebMethod
    @RequestWrapper(localName = "updatePersonMeasure", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.UpdatePersonMeasure")
    @ResponseWrapper(localName = "updatePersonMeasureResponse", targetNamespace = "http://ws.document.introsde/", className = "introsde.document.ws.UpdatePersonMeasureResponse")
    @Action(input = "http://ws.document.introsde/People/updatePersonMeasureRequest", output = "http://ws.document.introsde/People/updatePersonMeasureResponse")
    public void updatePersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measure", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Measure> measure);

}
