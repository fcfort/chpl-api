package gov.healthit.chpl.domain;

import gov.healthit.chpl.dto.VendorDTO;

public class Vendor {
	private Long vendorId;
	private String name;
	private String website;
	private Address address;
	private String lastModifiedDate;
	
	public Vendor() {}
	
	public Vendor(VendorDTO dto) {
		this.vendorId = dto.getId();
		this.name = dto.getName();
		this.website = dto.getWebsite();
		if(dto.getAddress() != null) {
			this.address = new Address(dto.getAddress());
		}
		this.lastModifiedDate = dto.getLastModifiedDate().getTime()+"";
	}
	public Long getVendorId() {
		return vendorId;
	}
	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
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
}