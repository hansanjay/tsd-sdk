package org.tsd.sdk.request;

import java.time.LocalDate;

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
public class OrderReq {
	private int address_id;
	private Long subscriptionId;
	private Long customer_id;
	private Integer status;
	private LocalDate order_date;
	
}