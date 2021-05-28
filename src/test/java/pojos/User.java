package pojos;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class User {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("login")
    private String login;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("activated")
    private Boolean activated;
    @JsonProperty("langKey")
    private String langKey;
    @JsonProperty("imageUrl")
    private Object imageUrl;
    @JsonProperty("resetDate")
    private Object resetDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    @JsonProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("activated")
    public Boolean getActivated() {
        return activated;
    }

    @JsonProperty("activated")
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    @JsonProperty("langKey")
    public String getLangKey() {
        return langKey;
    }

    @JsonProperty("langKey")
    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    @JsonProperty("imageUrl")
    public Object getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("imageUrl")
    public void setImageUrl(Object imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("resetDate")
    public Object getResetDate() {
        return resetDate;
    }

    @JsonProperty("resetDate")
    public void setResetDate(Object resetDate) {
        this.resetDate = resetDate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public User() {
    }

    public User(Integer id, String login, String firstName, String lastName, String email, Boolean activated, String langKey, Object imageUrl, Object resetDate) {
        this.id = id;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.activated = activated;
        this.langKey = langKey;
        this.imageUrl = imageUrl;
        this.resetDate = resetDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("login", login).append("firstName", firstName).append("lastName", lastName).append("email", email).append("activated", activated).append("langKey", langKey).append("imageUrl", imageUrl).append("resetDate", resetDate).append("additionalProperties", additionalProperties).toString();
    }

}
