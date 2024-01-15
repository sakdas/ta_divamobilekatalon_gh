<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>BeymenApiSaveVoucher</name>
   <tag></tag>
   <elementGuidId>179d5ffe-ea7a-4e51-8a0d-134bf2a679c1</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>${GlobalVariable.BeymenApiToken}</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\t\&quot;Date\&quot;: \&quot;${GlobalVariable.VoucherDateTime}\&quot;,\n\t\&quot;DateStr\&quot;: \&quot;${GlobalVariable.VoucherDateTime}\&quot;,\n\t\&quot;Type\&quot;: \&quot;1\&quot;,\n\t\&quot;SubType\&quot;: \&quot;1\&quot;,\n\t\&quot;CashBoxCode\&quot;: \&quot;999\&quot;,\n\t\&quot;BranchCode\&quot;: \&quot;1330\&quot;,\n\t\&quot;ItemDetails\&quot;: [\n\t\t{\n\t\t\t\&quot;ProductBarcode\&quot;: \&quot;2110066006606\&quot;,\n\t\t\t\&quot;Quantity\&quot;: 1,\n\t\t\t\&quot;Salesman\&quot;: {\n\t\t\t\t\&quot;Code\&quot;: \&quot;77719\&quot;,\n\t\t\t\t\&quot;Name\&quot;: \&quot;77719\&quot;\n\t\t\t},\n\t\t\t\&quot;CustomFields\&quot;: {\n\t\t\t\t\&quot;IsRequestModify\&quot;: false,\n\t\t\t\t\&quot;HasDeliveryAddress\&quot;: false,\n\t\t\t\t\&quot;FutureDeliveryDetails\&quot;: \&quot;\&quot;,\n\t\t\t\t\&quot;GiftNote\&quot;: \&quot;\&quot;,\n\t\t\t\t\&quot;WillDeliveredToTheStore\&quot;: false,\n\t\t\t\t\&quot;StoreCodeToDelivered\&quot;: \&quot;0\&quot;,\n\t\t\t\t\&quot;FutureDeliveryPhone\&quot;: \&quot;\&quot;,\n\t\t\t\t\&quot;FutureDeliveryEmail\&quot;: \&quot;\&quot;\n\t\t\t}\n\t\t}\n\t],\n\t\&quot;Salesman\&quot;: {\n\t\t\&quot;Name\&quot;: \&quot;77719\&quot;,\n\t\t\&quot;Code\&quot;: \&quot;77719\&quot;\n\t},\n\t\&quot;LoyaltyCustomer\&quot;: [\n\t\t{\n\t\t\t\&quot;IntegrationType\&quot;: \&quot;28\&quot;,\n\t\t\t\&quot;IdentifierType\&quot;: \&quot;5\&quot;,\n\t\t\t\&quot;LoyaltyIdentifier\&quot;: \&quot;36283922\&quot;,\n\t\t\t\&quot;ExternalCustomerId\&quot;: \&quot;36283922\&quot;,\n\t\t\t\&quot;AdditionalCustomerData\&quot;: \&quot;\&quot;,\n\t\t\t\&quot;LoyaltyTransaction\&quot;: \&quot;\&quot;,\n\t\t\t\&quot;AvailableDiscountCredit\&quot;: 1125116.24,\n\t\t\t\&quot;AvailableLoyaltyCredit\&quot;: 836374.41,\n\t\t\t\&quot;AvailableLoyaltyCampaigns\&quot;: [\n\t\t\t\t\&quot;W0000000000000000000|23097\&quot;\n\t\t\t],\n\t\t\t\&quot;CanUsePointViaSms\&quot;: false\n\t\t}\n\t],\n\t\&quot;CustomFields\&quot;: {\n\t\t\&quot;PaymentAccountNo\&quot;: \&quot;\&quot;,\n\t\t\&quot;PublicEnterprise\&quot;: false,\n\t\t\&quot;MobilePaymentQR\&quot;: \&quot;\&quot;,\n\t\t\&quot;IsEInvoiceCustomer\&quot;: false,\n\t\t\&quot;InStore\&quot;: false\n\t},\n\t\&quot;IntegrationExtRef\&quot;: \&quot;${GlobalVariable.BeymenSalesInvoiceExtRef}\&quot;,\n\t\&quot;User\&quot;: {\n\t\t\&quot;UserId\&quot;: \&quot;77719\&quot;,\n\t\t\&quot;Code\&quot;: \&quot;77719\&quot;,\n\t\t\&quot;UserName\&quot;: \&quot;77719\&quot;\n\t},\n\t\&quot;VoucherAddress\&quot;: {\n\t\t\&quot;Title\&quot;: \&quot;ESRA DOĞAN\&quot;,\n\t\t\&quot;Country\&quot;: \&quot;TR\&quot;,\n\t\t\&quot;City\&quot;: \&quot;İZMİR\&quot;,\n\t\t\&quot;Type\&quot;: \&quot;7\&quot;,\n\t\t\&quot;Detail\&quot;: \&quot;\&quot;,\n\t\t\&quot;District\&quot;: \&quot;URLA/URLA\&quot;,\n\t\t\&quot;Zipcode\&quot;: \&quot;\&quot;\n\t},\n\t\&quot;InsertedDate\&quot;: \&quot;${GlobalVariable.VoucherDateTime}\&quot;,\n\t\&quot;InsertedBy\&quot;: \&quot;77719\&quot;,\n\t\&quot;CancelExistingVoucher\&quot;: false,\n\t\&quot;Descriptions\&quot;: [\n\t\t{\n\t\t\t\&quot;DescriptionTypeName\&quot;: \&quot;CampaignApprovedCustomer\&quot;,\n\t\t\t\&quot;Description\&quot;: \&quot;0\&quot;\n\t\t}\n\t],\n\t\&quot;InvoiceInfo\&quot;: {\n\t\t\&quot;MiscAccountName\&quot;: \&quot;ESRA DOĞAN\&quot;,\n\t\t\&quot;MiscTaxOffice\&quot;: \&quot;\&quot;,\n\t\t\&quot;MiscTaxNumber\&quot;: \&quot;\&quot;,\n\t\t\&quot;MiscIdentityNumber\&quot;: \&quot;\&quot;,\n\t\t\&quot;MiscMobilePhone\&quot;: \&quot;\&quot;,\n\t\t\&quot;MiscEMail\&quot;: \&quot;ESRA.DOGAN@LOGO.COM.TR\&quot;\n\t}\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>ed092062-3b83-4311-9864-7b5d36349bf4</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>DivaRetailToken</name>
      <type>Main</type>
      <value>${GlobalVariable.DivaRetailApiBeymenToken}</value>
      <webElementGuid>65319ec8-55b5-46de-ba63-3376ae7bc86c</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${GlobalVariable.BeymenApiToken}</value>
      <webElementGuid>56b12c4c-3fc2-4740-8b14-4ac7920111a5</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.6</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${GlobalVariable.BeymenApiURL}/Api/saveVoucher</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()



WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
