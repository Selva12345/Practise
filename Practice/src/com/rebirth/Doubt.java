package com.rebirth;

public class Doubt {
public static void main(String[] args) {
	String s1=": \"TicketChangeEligibilityID\"";
	String s2=": \"TicketChangeEligibility\"";
System.out.println(s1);
	String uyh="{\r\n" + 
			"  \"TicketChangeEligibilityListResponse\" : {\r\n" + 
			"    \"TicketChangeEligibilityID\" : [\r\n" + 
			"	{\r\n" + 
			"      \"@type\" :\"TicketChangeEligibilityID\",\r\n" + 
			"      \"objID\" : \"ticketChangeEligibility_1\",\r\n" + 
			"      \"exchangeable\" : \"All\",\r\n" + 
			"      \"refundable\" : \"Some\",\r\n" + 
			"      \"automationNotSupportedInd\" : true,\r\n" + 
			"      \"Identifier\" : {\r\n" + 
			"        \"value\" : \"A0656EFF-FAF4-456F-B061-0161008D7C4E\",\r\n" + 
			"        \"authority\" : \"Travelport\"\r\n" + 
			"      },\r\n" + 
			"      \"Penalties\" : {\r\n" + 
			"        \"@type\" : \"Penalties\",\r\n" + 
			"        \"passengerTypeCodes\" : [ \"Example\", \"String\", \"Value\", \"Example\", \"String\", \"Value\", \"Example\", \"String\", \"Value\" ],\r\n" + 
			"        \"involuntaryInd\" : true,\r\n" + 
			"        \"Change\" : [ {\r\n" + 
			"          \"@type\" : \"Change\",\r\n" + 
			"          \"type\" : \"BeforeDeparture\",\r\n" + 
			"          \"notPermittedInd\" : true,\r\n" + 
			"          \"indeterminateInd\" : true,\r\n" + 
			"          \"Amount\" : {\r\n" + 
			"            \"value\" : 123.45,\r\n" + 
			"            \"code\" : \"USD\",\r\n" + 
			"            \"minorUnit\" : 2,\r\n" + 
			"            \"currencySource\" : \"Supplier\",\r\n" + 
			"            \"approximateInd\" : true\r\n" + 
			"          },\r\n" + 
			"          \"PenaltyAppliesTo\" : \"OneWay\"\r\n" + 
			"        }, {\r\n" + 
			"          \"@type\" : \"Change\",\r\n" + 
			"          \"type\" : \"AfterDeparture\",\r\n" + 
			"          \"notPermittedInd\" : true,\r\n" + 
			"          \"indeterminateInd\" : true,\r\n" + 
			"          \"Amount\" : {\r\n" + 
			"            \"value\" : 123.45,\r\n" + 
			"            \"code\" : \"USD\",\r\n" + 
			"            \"minorUnit\" : 2,\r\n" + 
			"            \"currencySource\" : \"Charged\",\r\n" + 
			"            \"approximateInd\" : true\r\n" + 
			"          },\r\n" + 
			"          \"PenaltyAppliesTo\" : \"RoundTrip\"\r\n" + 
			"        } ],\r\n" + 
			"        \"Refund\" : [ {\r\n" + 
			"          \"@type\" : \"Refund\",\r\n" + 
			"          \"type\" : \"Anytime\",\r\n" + 
			"          \"notPermittedInd\" : true,\r\n" + 
			"          \"indeterminateInd\" : true,\r\n" + 
			"          \"Amount\" : {\r\n" + 
			"            \"value\" : 123.45,\r\n" + 
			"            \"code\" : \"USD\",\r\n" + 
			"            \"minorUnit\" : 2,\r\n" + 
			"            \"currencySource\" : \"Requested\",\r\n" + 
			"            \"approximateInd\" : true\r\n" + 
			"          },\r\n" + 
			"          \"PenaltyAppliesTo\" : \"PerTicket\"\r\n" + 
			"        }, {\r\n" + 
			"          \"@type\" : \"Refund\",\r\n" + 
			"          \"type\" : \"NoShow\",\r\n" + 
			"          \"notPermittedInd\" : true,\r\n" + 
			"          \"indeterminateInd\" : true,\r\n" + 
			"          \"Amount\" : {\r\n" + 
			"            \"value\" : 123.45,\r\n" + 
			"            \"code\" : \"USD\",\r\n" + 
			"            \"minorUnit\" : 2,\r\n" + 
			"            \"currencySource\" : \"Supplier\",\r\n" + 
			"            \"approximateInd\" : true\r\n" + 
			"          },\r\n" + 
			"          \"PenaltyAppliesTo\" : \"PerCoupon\"\r\n" + 
			"        } ],\r\n" + 
			"        \"Waiver\" : \"DeathOfPassenger\"\r\n" + 
			"      },\r\n" + 
			"      \"PassengerTypeCode\" : \"Example String Value\"\r\n" + 
			"    }, {\r\n" + 
			"      \"@type\" : \"TicketChangeEligibilityID\",\r\n" + 
			"      \"objID\" : \"ticketChangeEligibility_2\",\r\n" + 
			"      \"exchangeable\" : \"None\",\r\n" + 
			"      \"refundable\" : \"All\",\r\n" + 
			"      \"automationNotSupportedInd\" : true,\r\n" + 
			"      \"Identifier\" : {\r\n" + 
			"        \"value\" : \"A0656EFF-FAF4-456F-B061-0161008D7C4E\",\r\n" + 
			"        \"authority\" : \"Travelport\"\r\n" + 
			"      },\r\n" + 
			"      \"Penalties\" : {\r\n" + 
			"        \"@type\" : \"Penalties\",\r\n" + 
			"        \"passengerTypeCodes\" : [ \"Example\", \"String\", \"Value\", \"Example\", \"String\", \"Value\", \"Example\", \"String\", \"Value\" ],\r\n" + 
			"        \"involuntaryInd\" : true,\r\n" + 
			"        \"Change\" : [ {\r\n" + 
			"          \"@type\" : \"Change\",\r\n" + 
			"          \"type\" : \"Minimum\",\r\n" + 
			"          \"notPermittedInd\" : true,\r\n" + 
			"          \"indeterminateInd\" : true,\r\n" + 
			"          \"Amount\" : {\r\n" + 
			"            \"value\" : 123.45,\r\n" + 
			"            \"code\" : \"USD\",\r\n" + 
			"            \"minorUnit\" : 2,\r\n" + 
			"            \"currencySource\" : \"Charged\",\r\n" + 
			"            \"approximateInd\" : true\r\n" + 
			"          },\r\n" + 
			"          \"PenaltyAppliesTo\" : \"PerDirectionOfTravel\"\r\n" + 
			"        }, {\r\n" + 
			"          \"@type\" : \"Change\",\r\n" + 
			"          \"type\" : \"Maximum\",\r\n" + 
			"          \"notPermittedInd\" : true,\r\n" + 
			"          \"indeterminateInd\" : true,\r\n" + 
			"          \"Amount\" : {\r\n" + 
			"            \"value\" : 123.45,\r\n" + 
			"            \"code\" : \"USD\",\r\n" + 
			"            \"minorUnit\" : 2,\r\n" + 
			"            \"currencySource\" : \"Requested\",\r\n" + 
			"            \"approximateInd\" : true\r\n" + 
			"          },\r\n" + 
			"          \"PenaltyAppliesTo\" : \"OneWay\"\r\n" + 
			"        } ],\r\n" + 
			"        \"Refund\" : [ {\r\n" + 
			"          \"@type\" : \"Refund\",\r\n" + 
			"          \"type\" : \"ExchangeRequired\",\r\n" + 
			"          \"notPermittedInd\" : true,\r\n" + 
			"          \"indeterminateInd\" : true,\r\n" + 
			"          \"Amount\" : {\r\n" + 
			"            \"value\" : 123.45,\r\n" + 
			"            \"code\" : \"USD\",\r\n" + 
			"            \"minorUnit\" : 2,\r\n" + 
			"            \"currencySource\" : \"Supplier\",\r\n" + 
			"            \"approximateInd\" : true\r\n" + 
			"          },\r\n" + 
			"          \"PenaltyAppliesTo\" : \"RoundTrip\"\r\n" + 
			"        }, {\r\n" + 
			"          \"@type\" : \"Refund\",\r\n" + 
			"          \"type\" : \"ExchangeNotRequired\",\r\n" + 
			"          \"notPermittedInd\" : true,\r\n" + 
			"          \"indeterminateInd\" : true,\r\n" + 
			"          \"Amount\" : {\r\n" + 
			"            \"value\" : 123.45,\r\n" + 
			"            \"code\" : \"USD\",\r\n" + 
			"            \"minorUnit\" : 2,\r\n" + 
			"            \"currencySource\" : \"Charged\",\r\n" + 
			"            \"approximateInd\" : true\r\n" + 
			"          },\r\n" + 
			"          \"PenaltyAppliesTo\" : \"PerTicket\"\r\n" + 
			"        } ],\r\n" + 
			"        \"Waiver\" : \"IllnessOfPassenger\"\r\n" + 
			"      },\r\n" + 
			"      \"PassengerTypeCode\" : \"Example String Value\"\r\n" + 
			"    } ],\r\n" + 
			"    \"transactionId\" : \"6570ed7b-89fe-4334-9c78-af282a977ba6\",\r\n" + 
			"    \"traceId\" : \"c009a53c-48f6-4084-b7b6-3043fa9fec67\"\r\n" + 
			"    \r\n" + 
			"  }\r\n" + 
			"}";
	 uyh = uyh.replaceAll(s1, s2);

	 System.out.println(uyh);
	 
}
}
