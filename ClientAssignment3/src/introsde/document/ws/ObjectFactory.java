
package introsde.document.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.document.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HealthProfile_QNAME = new QName("http://ws.document.introsde/", "healthProfile");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://ws.document.introsde/", "deletePersonResponse");
    private final static QName _UpdatePersonMeasureResponse_QNAME = new QName("http://ws.document.introsde/", "updatePersonMeasureResponse");
    private final static QName _ReadMeasureTypesResponse_QNAME = new QName("http://ws.document.introsde/", "readMeasureTypesResponse");
    private final static QName _UpdatePersonHealthProfileResponse_QNAME = new QName("http://ws.document.introsde/", "updatePersonHealthProfileResponse");
    private final static QName _UpdatePersonHealthProfile_QNAME = new QName("http://ws.document.introsde/", "updatePersonHealthProfile");
    private final static QName _ReadPersonMeasure_QNAME = new QName("http://ws.document.introsde/", "readPersonMeasure");
    private final static QName _ReadPersonMeasureResponse_QNAME = new QName("http://ws.document.introsde/", "readPersonMeasureResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://ws.document.introsde/", "updatePerson");
    private final static QName _GetPeopleList_QNAME = new QName("http://ws.document.introsde/", "getPeopleList");
    private final static QName _ReadPersonHistoryResponse_QNAME = new QName("http://ws.document.introsde/", "readPersonHistoryResponse");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://ws.document.introsde/", "updatePersonResponse");
    private final static QName _ReadPersonHistory_QNAME = new QName("http://ws.document.introsde/", "readPersonHistory");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://ws.document.introsde/", "readPersonResponse");
    private final static QName _GetPeopleListResponse_QNAME = new QName("http://ws.document.introsde/", "getPeopleListResponse");
    private final static QName _Person_QNAME = new QName("http://ws.document.introsde/", "person");
    private final static QName _ReadPerson_QNAME = new QName("http://ws.document.introsde/", "readPerson");
    private final static QName _HealthProfileHistory_QNAME = new QName("http://ws.document.introsde/", "healthProfile-history");
    private final static QName _CreatePerson_QNAME = new QName("http://ws.document.introsde/", "createPerson");
    private final static QName _MeasureTypes_QNAME = new QName("http://ws.document.introsde/", "measureTypes");
    private final static QName _ReadMeasureTypes_QNAME = new QName("http://ws.document.introsde/", "readMeasureTypes");
    private final static QName _People_QNAME = new QName("http://ws.document.introsde/", "people");
    private final static QName _UpdatePersonMeasure_QNAME = new QName("http://ws.document.introsde/", "updatePersonMeasure");
    private final static QName _CurrentHealth_QNAME = new QName("http://ws.document.introsde/", "currentHealth");
    private final static QName _DeletePerson_QNAME = new QName("http://ws.document.introsde/", "deletePerson");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://ws.document.introsde/", "createPersonResponse");
    private final static QName _SavePersonMeasure_QNAME = new QName("http://ws.document.introsde/", "savePersonMeasure");
    private final static QName _SavePersonMeasureResponse_QNAME = new QName("http://ws.document.introsde/", "savePersonMeasureResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.document.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadMeasureTypesResponse }
     * 
     */
    public ReadMeasureTypesResponse createReadMeasureTypesResponse() {
        return new ReadMeasureTypesResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonHealthProfileResponse }
     * 
     */
    public UpdatePersonHealthProfileResponse createUpdatePersonHealthProfileResponse() {
        return new UpdatePersonHealthProfileResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasureResponse }
     * 
     */
    public UpdatePersonMeasureResponse createUpdatePersonMeasureResponse() {
        return new UpdatePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link HealthProfile }
     * 
     */
    public HealthProfile createHealthProfile() {
        return new HealthProfile();
    }

    /**
     * Create an instance of {@link CurrentHealth }
     * 
     */
    public CurrentHealth createCurrentHealth() {
        return new CurrentHealth();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link SavePersonMeasure }
     * 
     */
    public SavePersonMeasure createSavePersonMeasure() {
        return new SavePersonMeasure();
    }

    /**
     * Create an instance of {@link SavePersonMeasureResponse }
     * 
     */
    public SavePersonMeasureResponse createSavePersonMeasureResponse() {
        return new SavePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link MeasureHistory }
     * 
     */
    public MeasureHistory createMeasureHistory() {
        return new MeasureHistory();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link MeasureTypeList }
     * 
     */
    public MeasureTypeList createMeasureTypeList() {
        return new MeasureTypeList();
    }

    /**
     * Create an instance of {@link ReadMeasureTypes }
     * 
     */
    public ReadMeasureTypes createReadMeasureTypes() {
        return new ReadMeasureTypes();
    }

    /**
     * Create an instance of {@link People_Type }
     * 
     */
    public People_Type createPeople_Type() {
        return new People_Type();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasure }
     * 
     */
    public UpdatePersonMeasure createUpdatePersonMeasure() {
        return new UpdatePersonMeasure();
    }

    /**
     * Create an instance of {@link ReadPersonHistoryResponse }
     * 
     */
    public ReadPersonHistoryResponse createReadPersonHistoryResponse() {
        return new ReadPersonHistoryResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonHistory }
     * 
     */
    public ReadPersonHistory createReadPersonHistory() {
        return new ReadPersonHistory();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link GetPeopleListResponse }
     * 
     */
    public GetPeopleListResponse createGetPeopleListResponse() {
        return new GetPeopleListResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link UpdatePersonHealthProfile }
     * 
     */
    public UpdatePersonHealthProfile createUpdatePersonHealthProfile() {
        return new UpdatePersonHealthProfile();
    }

    /**
     * Create an instance of {@link ReadPersonMeasure }
     * 
     */
    public ReadPersonMeasure createReadPersonMeasure() {
        return new ReadPersonMeasure();
    }

    /**
     * Create an instance of {@link ReadPersonMeasureResponse }
     * 
     */
    public ReadPersonMeasureResponse createReadPersonMeasureResponse() {
        return new ReadPersonMeasureResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link GetPeopleList }
     * 
     */
    public GetPeopleList createGetPeopleList() {
        return new GetPeopleList();
    }

    /**
     * Create an instance of {@link Measure }
     * 
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HealthProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "healthProfile")
    public JAXBElement<HealthProfile> createHealthProfile(HealthProfile value) {
        return new JAXBElement<HealthProfile>(_HealthProfile_QNAME, HealthProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "updatePersonMeasureResponse")
    public JAXBElement<UpdatePersonMeasureResponse> createUpdatePersonMeasureResponse(UpdatePersonMeasureResponse value) {
        return new JAXBElement<UpdatePersonMeasureResponse>(_UpdatePersonMeasureResponse_QNAME, UpdatePersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readMeasureTypesResponse")
    public JAXBElement<ReadMeasureTypesResponse> createReadMeasureTypesResponse(ReadMeasureTypesResponse value) {
        return new JAXBElement<ReadMeasureTypesResponse>(_ReadMeasureTypesResponse_QNAME, ReadMeasureTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonHealthProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "updatePersonHealthProfileResponse")
    public JAXBElement<UpdatePersonHealthProfileResponse> createUpdatePersonHealthProfileResponse(UpdatePersonHealthProfileResponse value) {
        return new JAXBElement<UpdatePersonHealthProfileResponse>(_UpdatePersonHealthProfileResponse_QNAME, UpdatePersonHealthProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonHealthProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "updatePersonHealthProfile")
    public JAXBElement<UpdatePersonHealthProfile> createUpdatePersonHealthProfile(UpdatePersonHealthProfile value) {
        return new JAXBElement<UpdatePersonHealthProfile>(_UpdatePersonHealthProfile_QNAME, UpdatePersonHealthProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readPersonMeasure")
    public JAXBElement<ReadPersonMeasure> createReadPersonMeasure(ReadPersonMeasure value) {
        return new JAXBElement<ReadPersonMeasure>(_ReadPersonMeasure_QNAME, ReadPersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readPersonMeasureResponse")
    public JAXBElement<ReadPersonMeasureResponse> createReadPersonMeasureResponse(ReadPersonMeasureResponse value) {
        return new JAXBElement<ReadPersonMeasureResponse>(_ReadPersonMeasureResponse_QNAME, ReadPersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "getPeopleList")
    public JAXBElement<GetPeopleList> createGetPeopleList(GetPeopleList value) {
        return new JAXBElement<GetPeopleList>(_GetPeopleList_QNAME, GetPeopleList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readPersonHistoryResponse")
    public JAXBElement<ReadPersonHistoryResponse> createReadPersonHistoryResponse(ReadPersonHistoryResponse value) {
        return new JAXBElement<ReadPersonHistoryResponse>(_ReadPersonHistoryResponse_QNAME, ReadPersonHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readPersonHistory")
    public JAXBElement<ReadPersonHistory> createReadPersonHistory(ReadPersonHistory value) {
        return new JAXBElement<ReadPersonHistory>(_ReadPersonHistory_QNAME, ReadPersonHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "getPeopleListResponse")
    public JAXBElement<GetPeopleListResponse> createGetPeopleListResponse(GetPeopleListResponse value) {
        return new JAXBElement<GetPeopleListResponse>(_GetPeopleListResponse_QNAME, GetPeopleListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "healthProfile-history")
    public JAXBElement<MeasureHistory> createHealthProfileHistory(MeasureHistory value) {
        return new JAXBElement<MeasureHistory>(_HealthProfileHistory_QNAME, MeasureHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "measureTypes")
    public JAXBElement<MeasureTypeList> createMeasureTypes(MeasureTypeList value) {
        return new JAXBElement<MeasureTypeList>(_MeasureTypes_QNAME, MeasureTypeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readMeasureTypes")
    public JAXBElement<ReadMeasureTypes> createReadMeasureTypes(ReadMeasureTypes value) {
        return new JAXBElement<ReadMeasureTypes>(_ReadMeasureTypes_QNAME, ReadMeasureTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link People_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "people")
    public JAXBElement<People_Type> createPeople(People_Type value) {
        return new JAXBElement<People_Type>(_People_QNAME, People_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "updatePersonMeasure")
    public JAXBElement<UpdatePersonMeasure> createUpdatePersonMeasure(UpdatePersonMeasure value) {
        return new JAXBElement<UpdatePersonMeasure>(_UpdatePersonMeasure_QNAME, UpdatePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentHealth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "currentHealth")
    public JAXBElement<CurrentHealth> createCurrentHealth(CurrentHealth value) {
        return new JAXBElement<CurrentHealth>(_CurrentHealth_QNAME, CurrentHealth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "savePersonMeasure")
    public JAXBElement<SavePersonMeasure> createSavePersonMeasure(SavePersonMeasure value) {
        return new JAXBElement<SavePersonMeasure>(_SavePersonMeasure_QNAME, SavePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "savePersonMeasureResponse")
    public JAXBElement<SavePersonMeasureResponse> createSavePersonMeasureResponse(SavePersonMeasureResponse value) {
        return new JAXBElement<SavePersonMeasureResponse>(_SavePersonMeasureResponse_QNAME, SavePersonMeasureResponse.class, null, value);
    }

}
