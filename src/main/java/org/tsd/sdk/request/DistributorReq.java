package org.tsd.sdk.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class DistributorReq {
	
	@NotBlank(message = "First name is mandatory")
	@Size(max=20)
	private String first_name;
	
	@NotBlank(message = "Last name is mandatory")
	@Size(max=20)
    private String last_name;
    
	@NotBlank(message = "User name is mandatory")
	@Size(max=20)
    private String userName;
	
	@NotBlank(message = "Password is mandatory")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",message = "Password must be at least 8 characters long, contain at least one digit, one uppercase letter, one lowercase letter, and one special character.")
    private String password;
	
    private String securityQuestion;
    private String securityAnswer;
    
    @Column(name="company_code")
    private String companyCode;
    
    @NotBlank(message = "Company name is mandatory")
    private String companyName;
    
    @NotBlank(message = "Contact person name is mandatory")
    @Size(max=20)
    private String contactPersonName;
    
    @NotBlank(message = "Mobile number is mandatory")
    @Size(max=10)
	@Pattern(regexp="(^$|[0-9]{10})")
    private String mobile;
    
    @NotBlank(message = "Given Email is mandatory")
	@Size(max=20)
    private String email;
    
    @NotBlank(message = "Pan number is mandatory")
    @Pattern(regexp = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$", message = "Invalid PAN number")
    private String pannum;
    
    @NotBlank(message = "GST number is mandatory")
    @Pattern(regexp = "^[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[A-Z0-9]{1}Z[A-Z0-9]{1}$", message = "Invalid GSTIN format")
    private String gstin;
    
    private boolean active;
    
    private boolean enabled;
    
    private AddressReq addressReq;
    
    private String created_by;
    private String last_updated_by;
    
}