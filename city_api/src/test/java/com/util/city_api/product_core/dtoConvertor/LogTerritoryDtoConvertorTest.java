package com.util.city_api.product_core.dtoConvertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.util.city_api.baseMockModel.BaseEntityAndDtoTestModel;
import com.util.city_api.entity.log.LogTerritory;
import com.util.city_api.product_core.dto.logDto.LogTerritoryDto;

public class LogTerritoryDtoConvertorTest extends BaseEntityAndDtoTestModel{

 	private LogTerritoryDtoConvertor logTerritoryDtoConvertor;
	private LogTerritory logTerritory;
	private LogTerritoryDto logTerritoryDto;
	
	@BeforeEach
	void setup()
	{
		this.logTerritoryDtoConvertor = Mockito.mock(LogTerritoryDtoConvertor.class);
		logTerritory = super.getLogTerritory();
		logTerritoryDto = super.getLogTerritoryDto();
	}
 
    @Test
	void WhenLogTerritoryConvertedToLogTerritoryDtoThenReturnLogTerritoryDtoThatAllParametersMustBeSameWithLogTerritoryParamaters() {
    	
    	Mockito.when(logTerritoryDtoConvertor.convert(logTerritory)).thenReturn(logTerritoryDto);
    	
    	LogTerritoryDto logTerritoryDtoResult = logTerritoryDtoConvertor.convert(logTerritory);
    	
    	assertEquals(logTerritoryDtoResult.getLogTerritoryId(), logTerritory.getLogTerritoryId());
    	assertEquals(logTerritoryDtoResult.getTransactionType(), logTerritory.getTransactionType());
    	assertEquals(logTerritoryDtoResult.getTerritory(), logTerritory.getTerritory());
    	assertEquals(logTerritoryDtoResult.getPerformingTransactionBy(), logTerritory.getPerformingTransactionBy());
    	assertEquals(logTerritoryDtoResult.getCreatedDate(), logTerritory.getCreatedDate());
    }
	
   @Test
    void WhenLogTerritoryDtoConvertedToLogTerritoryThenReturnLogTerritoryThatAllParametersMustBeSameWithLogTerritoryDtoParamaters() {
	   
	   Mockito.when(logTerritoryDtoConvertor.convert(logTerritoryDto)).thenReturn(logTerritory);
   	
   	   LogTerritory logTerritoryResult = logTerritoryDtoConvertor.convert(logTerritoryDto);
   	
   	   assertEquals(logTerritoryResult.getLogTerritoryId(), logTerritoryDto.getLogTerritoryId());
   	   assertEquals(logTerritoryResult.getTransactionType(), logTerritoryDto.getTransactionType());
   	   assertEquals(logTerritoryResult.getTerritory(), logTerritoryDto.getTerritory());
   	   assertEquals(logTerritoryResult.getPerformingTransactionBy(), logTerritoryDto.getPerformingTransactionBy());
   	   assertEquals(logTerritoryResult.getCreatedDate(), logTerritoryDto.getCreatedDate());

   }
}
