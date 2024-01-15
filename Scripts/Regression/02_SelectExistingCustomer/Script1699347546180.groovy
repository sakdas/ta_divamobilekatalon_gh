import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode

Mobile.startApplication('D:\\tmp\\app-DivaMobileSales-release.apk', true)

Mobile.tap(findTestObject('Mobile/Intro/android.widget.DivaRetailUrlTxt'), 1)

Mobile.setText(findTestObject('Mobile/Intro/android.widget.DivaRetailUrlTxt'), GlobalVariable.DRURL, 1)

Mobile.tap(findTestObject('Mobile/Intro/android.widget.HomeContinue'), 0)

Mobile.setText(findTestObject('Mobile/LoginPage/android.widget.Username'), 'mobile.kasiyer01', 0)

Mobile.setText(findTestObject('Mobile/LoginPage/android.widget.Password'), '1', 0)

Mobile.tap(findTestObject('Mobile/LoginPage/android.view.LoginButton'), 4)

Mobile.tap(findTestObject('Mobile/Home/android.view.SearchCustomerBtn'), 4)

Mobile.tap(findTestObject('Mobile/SearchCustomer/android.view.SearchBox'), 4)

Mobile.setText(findTestObject('Mobile/SearchCustomer/android.widget.CustomerSearchBox3'), 'İbrahim Akdaş', 2)

Mobile.tap(findTestObject('Mobile/SearchCustomer/android.view.CustomerSelectBtn'), 2)

Mobile.tap(findTestObject('Mobile/SearchCustomer/android.view.CustomerSelectBtn'), 5)

Mobile.tap(findTestObject('Mobile/Home/android.view.BottomCustomer'), 5)

Mobile.tap(findTestObject('Mobile/RegisterCustomer/android.widget.RemoveSelectedCustomerBtn'), 5)

Mobile.tap(findTestObject('Mobile/RegisterCustomer/android.widget.RemoveSelectedCustomerConfirmBtn'), 5)

Mobile.verifyElementVisible(findTestObject('Mobile/SearchCustomer/android.view.CreateNewDivaCustomerBtn'), 5)

Mobile.tap(findTestObject('Mobile/SearchCustomer/android.view.SearchBox'), 5)

Mobile.setText(findTestObject('Mobile/SearchCustomer/android.widget.CustomerSearchBox3'), 'Semra Akdaş', 2)

Mobile.tap(findTestObject('Mobile/SearchCustomer/android.view.CustomerSelectBtn'), 2)

Mobile.tap(findTestObject('Mobile/SearchCustomer/android.view.CustomerSelectBtn'), 2)

Mobile.verifyElementVisible(findTestObject('Mobile/Cart/android.view.CartSearchAddProductBtn'), 5)

Mobile.tap(findTestObject('Mobile/Home/android.view.BottomCustomer'), 2)

Mobile.verifyElementText(findTestObject('Mobile/RegisterCustomer/android.widget.EditText.NameSurname'), 'Semra Akdaş')

Mobile.tap(findTestObject('Mobile/Home/android.view.BottomCart'), 3)

Mobile.setText(findTestObject('Mobile/Cart/android.widget.EnterBarcodeText'), '5901234500029', 2)

Mobile.tap(findTestObject('Mobile/Cart/android.view.CartSearchAddProductKeyboardBtn'), 3)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

driver.pressKeyCode(AndroidKeyCode.ENTER)

Mobile.tap(findTestObject('Mobile/Cart/android.view.ConfirmCartBtn'), 3)

Mobile.tap(findTestObject('Mobile/Payment/android.view.PaymentCreditCard3Btn'), 3)

Mobile.hideKeyboard()

Mobile.checkElement(findTestObject('Mobile/Payment/android.widget.PaymentCreditCardOfflineCheckBox'), 3)

Mobile.tap(findTestObject('Mobile/Payment/android.view.PaymentAcceptBtn'), 3)

Mobile.tap(findTestObject('Mobile/Payment/android.widget.BankListDdl'), 3)

Mobile.tap(findTestObject('Mobile/Payment/android.widget.BankListDdl_Akbank'), 3)

Mobile.tap(findTestObject('Mobile/Payment/android.widget.OfflineBankListConfirmBtn'), 3)

Mobile.verifyElementVisible(findTestObject('Mobile/Payment/android.view.PaymentConfirmedContinueBtn'), 2)

Mobile.tap(findTestObject('Mobile/Payment/android.view.PaymentConfirmedContinueBtn'), 3)

Mobile.tap(findTestObject('Mobile/Payment/android.view.PaymentCompleteSaleBtn'), 3)

Mobile.verifyElementVisible(findTestObject('Mobile/Payment/android.widget.PaymentSaleSuccessfulImg'), 3)

Mobile.tap(findTestObject('Mobile/Payment/android.widget.SaleComleteMoveToNextSaleBtn'), 3)

Mobile.verifyElementVisible(findTestObject('Mobile/Home/android.view.SearchCustomerBtn'), 3)

Mobile.closeApplication()

