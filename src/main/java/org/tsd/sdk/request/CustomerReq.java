package org.tsd.sdk.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerReq {
	
	@NotBlank(message = "User name is mandatory")
	private String username;
	
	@NotBlank(message = "Password is mandatory")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",message = "Password must be at least 8 characters long, contain at least one digit, one uppercase letter, one lowercase letter, and one special character.")
    private String password;
    
	private String userType;
    
    private boolean active;
    
    @NotBlank(message = "First name is mandatory")
    @Size(max=20)
    private String first_name;
    
    @NotBlank(message = "Last name is mandatory")
    @Size(max=20)
    private String last_name;
    
    @NotBlank(message = "Mobile number is mandatory")
    @Size(max=10)
	@Pattern(regexp="(^$|[0-9]{10})")
    private String mobile;
    
    @NotBlank(message = "Given Email is mandatory")
	@Size(max=20)
    private String email;
    
    @Pattern(regexp = "^[2-9]{1}[0-9]{11}$", message = "Invalid Aadhaar number")
    private String aadhar_card;
    
    private AddressReq addressReq;
    
    private Long distid;
    
    private String verification_expiry;
    
}
