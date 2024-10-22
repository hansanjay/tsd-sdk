package org.tsd.sdk.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressReq {
	
	private String short_name;
	private String line1;
	private String line2;
	
    private String geo_tag;
    private boolean is_default;
    private Long journey_id;
    
    private boolean verifiedAddress;
    private Long mobile;
    
    @NotBlank(message = "Address is mandatory")
    private String address;
    
    @NotBlank(message = "Country mandatory")
    private String country;
    
    @NotBlank(message = "State mandatory")
    private String state_name;
    
    private String city;
    
    @NotBlank(message = "Locality is mandatory")
    private String localityId;
    
    @NotBlank(message = "Pincode is mandatory")
    private String pin_code;
	
}
