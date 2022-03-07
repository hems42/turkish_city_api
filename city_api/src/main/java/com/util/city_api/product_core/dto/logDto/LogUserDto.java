package com.util.city_api.product_core.dto.logDto;

import java.time.LocalDateTime;

import com.util.city_api.entity._core.User;
import com.util.city_api.product_core.enums.EnumLogOperatıons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogUserDto {
	
	private String logUserId;

    private EnumLogOperatıons transactionType;

    private User user;

    private User PerformingTransactionBy;

    private LocalDateTime createdDate;

}