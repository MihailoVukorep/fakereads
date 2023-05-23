package wpproject.project.dto;

import wpproject.project.model.Account;
import wpproject.project.model.Account_Role;
import wpproject.project.model.Shelf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AccountDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String mailAddress;
    private String password;
    private LocalDate dateOfBirth;
    private String profilePicture;
    private String description;
    private Account_Role accountRole;
    private List<Shelf> shelvesDTO = new ArrayList<>();

    public AccountDTO(Account user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.username = user.getUsername();
        this.mailAddress = user.getMailAddress();
        this.password = user.getPassword();
        this.dateOfBirth = user.getDateOfBirth();
        this.profilePicture = user.getProfilePicture();
        this.description = user.getDescription();
        this.accountRole = user.getAccountRole();
//      convertToDTOList(user.getShelves());
        this.shelvesDTO = user.getShelves();
    }

    private void convertToDTOList(List<Shelf> originalList) {
        this.shelvesDTO = new ArrayList<>(originalList.size());

        for (int i = 0; i < originalList.size(); i++) {
            this.shelvesDTO.get(i).setId(originalList.get(i).getId());
            this.shelvesDTO.get(i).setName(originalList.get(i).getName());
            this.shelvesDTO.get(i).setPrimary(originalList.get(i).isPrimary());
        }
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getMailAddress() {
        return mailAddress;
    }
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getProfilePicture() {
        return profilePicture;
    }
    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Account_Role getAccountRole() {
        return accountRole;
    }
    public void setAccountRole(Account_Role accountRole) {
        this.accountRole = accountRole;
    }
    public List<Shelf> getShelves() {
        return shelvesDTO;
    }
    public void setShelves(List<Shelf> shelvesDTO) {
        this.shelvesDTO = shelvesDTO;
    }
}