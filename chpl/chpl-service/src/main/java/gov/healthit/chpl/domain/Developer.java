package gov.healthit.chpl.domain;

import gov.healthit.chpl.dto.DeveloperDTO;

public class Developer {
	private Long developerId;
	private String developerCode;
	private String name;
	private String website;
	private Address address;
	private Contact contact;
	private String lastModifiedDate;
	private Boolean transparencyAttestation = null;
	private String transparencyAttestationUrl = null;
	
	public Developer() {}
	
	public Developer(DeveloperDTO dto) {
		this.developerId = dto.getId();
		this.developerCode = dto.getDeveloperCode();
		this.name = dto.getName();
		this.website = dto.getWebsite();
		if(dto.getAddress() != null) {
			this.address = new Address(dto.getAddress());
		}
		if(dto.getContact() != null) {
			this.contact = new Contact(dto.getContact());
		}
		this.lastModifiedDate = dto.getLastModifiedDate().getTime()+"";
		this.transparencyAttestation = dto.getTransparencyAttestation();
		this.transparencyAttestationUrl = dto.getTransparencyAttestationUrl();
	}
	public Long getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(Long developerId) {
		this.developerId = developerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getDeveloperCode() {
		return developerCode;
	}

	public void setDeveloperCode(String developerCode) {
		this.developerCode = developerCode;
	}

	public Boolean getTransparencyAttestation() {
		return transparencyAttestation;
	}

	public void setTransparencyAttestation(Boolean transparencyAttestation) {
		this.transparencyAttestation = transparencyAttestation;
	}

	public String getTransparencyAttestationUrl() {
		return transparencyAttestationUrl;
	}

	public void setTransparencyAttestationUrl(String transparencyAttestationUrl) {
		this.transparencyAttestationUrl = transparencyAttestationUrl;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
}
