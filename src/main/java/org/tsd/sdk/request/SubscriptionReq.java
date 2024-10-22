package org.tsd.sdk.request;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
public class SubscriptionReq {
	
	private int brandId;
	private int productType;
	private int category;
	private int subCategory;
	private int quantity;
	private int type;
	private int status;
	private String customerId;
	private String distributorId;
	private boolean permanent;
    private boolean visible;
    private LocalDate start;
    private LocalDate stop;
    private String day_of_week;
    private String day_of_month;
	
}