package org.tsd.sdk.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductReq {
	private String rating;
	
	private String brandId;
	private String title;
	private String mrp;
	
	private String prdType;
	private String category;
	private String subCategory;
	
	private String shelfLife;
	private String unitDisplay;
	private String unit;
	private String ssu;
	private String discount;
	
	private String packagingType;
	private String return_policy;
	private String features;
}