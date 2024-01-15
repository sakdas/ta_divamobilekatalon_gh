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

Mobile.startApplication('D:\\tmp\\app-DivaMobileSales-release.apk', true)

Mobile.tap(findTestObject('Mobile/Intro/android.widget.InfoButton'), 10)

Mobile.verifyElementExist(findTestObject('Mobile/Intro/Info/android.widget.AppInfoTitle'), 5)

Mobile.verifyElementExist(findTestObject('Mobile/Intro/Info/android.widget.DeviceAndAppInfo'), 5)

Mobile.verifyElementExist(findTestObject('Mobile/Intro/Info/android.widget.AppInfoBackBtn'), 5)

Mobile.tap(findTestObject('Mobile/Intro/Info/android.widget.AppInfoBackBtn'), 4)

Mobile.tap(findTestObject('Mobile/Intro/android.widget.DivaRetailUrlTxt'), 3)

Mobile.setText(findTestObject('Mobile/Intro/android.widget.DivaRetailUrlTxt'), GlobalVariable.DRURL, 3)

Mobile.tap(findTestObject('Mobile/Intro/android.widget.HomeContinue'), 1)

Mobile.setText(findTestObject('Mobile/LoginPage/android.widget.Username'), GlobalVariable.DRKasiyer1, 0)

Mobile.setText(findTestObject('Mobile/LoginPage/android.widget.Password'), GlobalVariable.DRKasiyerParola, 0)

Mobile.tap(findTestObject('Mobile/LoginPage/android.view.LoginButton'), 6)

Mobile.tap(findTestObject('Mobile/Home/android.view.SearchCustomerBtn'), 6)

Mobile.tap(findTestObject('Mobile/SearchCustomer/android.view.CreateNewDivaCustomerBtn'), 5)

//println('Customer Name param value 1: ' + CustomerName)
def CustomerName = CustomKeywords.'com.test.randomData.generateRandomData.generateRandomNameSurname'()

Mobile.setText(findTestObject('Mobile/RegisterCustomer/android.widget.EditText.NameSurname'), CustomerName, 1)

//println('Customer Name param value 2: ' + CustomerName)
Mobile.setText(findTestObject('Mobile/RegisterCustomer/android.widget.EditText.Email'), 'sinan.akdas@logo.com.tr', 2)

Mobile.scrollToText('Cep Telefonu', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mobile/RegisterCustomer/android.widget.EditText.PhoneNumber2'), '5321141414', 2)

Mobile.tap(findTestObject('Mobile/RegisterCustomer/android.view.AddCustomerBtn'), 2)

Mobile.tap(findTestObject('Mobile/Home/android.view.BottomCustomer'), 2)

Mobile.tap(findTestObject('Mobile/Home/android.view.BottomCustomer'), 2)

Mobile.tap(findTestObject('Mobile/RegisterCustomer/android.widget.RemoveSelectedCustomerBtn'), 4)

Mobile.tap(findTestObject('Mobile/RegisterCustomer/android.widget.RemoveSelectedCustomerConfirmBtn'), 4)

Mobile.tap(findTestObject('Mobile/SearchCustomer/android.view.SearchBox'), 4)

Mobile.setText(findTestObject('Mobile/SearchCustomer/android.widget.CustomerSearchBox3'), CustomerName, 2)

Mobile.tap(findTestObject('Mobile/SearchCustomer/android.view.CustomerSearchListItem0'), 5)

Mobile.tap(findTestObject('Mobile/SearchCustomer/android.view.CustomerSearchListItem0'), 5)

Mobile.scrollToText('Cep Telefonu', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mobile/RegisterCustomer/android.widget.EditText.PhoneNumber3'), '5321141415', 5)

Mobile.tap(findTestObject('Mobile/RegisterCustomer/android.view.UpdateCustomerBtn'), 5)

Mobile.tap(findTestObject('Mobile/Home/android.view.BottomCart'), 5)

Mobile.tap(findTestObject('Mobile/Home/android.view.BottomCustomer'), 5)

Mobile.tap(findTestObject('Mobile/SearchCustomer/android.view.SearchBox'), 4)

Mobile.setText(findTestObject('Mobile/SearchCustomer/android.widget.CustomerSearchBox3'), CustomerName, 5)

Mobile.tap(findTestObject('Mobile/SearchCustomer/android.view.CustomerSearchListItem0'), 5)

Mobile.tap(findTestObject('Mobile/SearchCustomer/android.view.CustomerSearchListItem0'), 5)

Mobile.scrollToText('Cep Telefonu', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Mobile/RegisterCustomer/android.widget.EditText.PhoneNumber3'), '5321141415', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/Home/android.view.BottomCart'), 5)

Mobile.tap(findTestObject('Mobile/Home/android.view.BottomCustomer'), 5)

Mobile.tap(findTestObject('Mobile/SearchCustomer/android.view.SearchBox'), 4)

Mobile.setText(findTestObject('Mobile/SearchCustomer/android.widget.CustomerSearchBox3'), CustomerName, 2)

Mobile.tap(findTestObject('Mobile/SearchCustomer/android.view.CustomerSelectBtn'), 5)

Mobile.tap(findTestObject('Mobile/SearchCustomer/android.view.CustomerSelectBtn'), 5)

Mobile.tap(findTestObject('Mobile/Cart/android.view.CartSearchAddProductBtn'), 5)

Mobile.setText(findTestObject('Mobile/SearchProduct/android.widget.SearchProductText'), '5901234500012', 5)

Mobile.tap(findTestObject('Mobile/SearchProduct/android.view.ProductListAddBtn'), 5)

Mobile.tap(findTestObject('Mobile/SearchProduct/android.view.ProductListAddBtn'), 5)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.toolkit.toolkit.swipeElement'('Mobile/Cart/android.view.CartProductListItem0')

Mobile.tap(findTestObject('Mobile/Cart/android.view.CartItemCancelBtn'), 5)

Mobile.tap(findTestObject('Mobile/Home/android.view.BottomHome'), 5)

Mobile.tap(findTestObject('Mobile/Home/android.view.SearchProductBtn'), 5)

Mobile.setText(findTestObject('Mobile/SearchProduct/android.widget.SearchProductText'), '5901234500036', 5)

Mobile.tap(findTestObject('Mobile/SearchProduct/android.view.ProductListAddBtn'), 5)

Mobile.tap(findTestObject('Mobile/SearchProduct/android.view.ProductListAddBtn'), 5)

Mobile.tap(findTestObject('Mobile/Home/android.view.BottomCart'), 5)

Mobile.tap(findTestObject('Mobile/Cart/android.view.CartOptionsBtn'), 5)

Mobile.tap(findTestObject('Mobile/Cart/android.view.CartHold'), 5)

Mobile.tap(findTestObject('Mobile/Cart/android.widget.CartHoldConfirm'), 5)

Mobile.tap(findTestObject('Mobile/Home/android.widget.Top.InvoiceQueueBtn'), 5)

Mobile.verifyElementText(findTestObject('Mobile/CartQueue/android.widget.CustomerNameCheckPoint2'), CustomerName)

Mobile.tap(findTestObject('Mobile/CartQueue/android.view.ViewGroup.CartQueueElement1'), 5)

Mobile.tap(findTestObject('Mobile/CartQueue/android.view.ViewGroup.CartQueueElement1'), 5)

Mobile.tap(findTestObject('Mobile/CartQueue/android.view.RecallFromCartQueueBtn'), 5)

Mobile.tap(findTestObject('Mobile/CartQueue/android.widget.RecallFromCartQueueConfirmBtn'), 5)

Mobile.tap(findTestObject('Mobile/Cart/android.view.CartOptionsBtn'), 5)

Mobile.tap(findTestObject('Mobile/Cart/android.view.CartCancel'), 5)

Mobile.tap(findTestObject('Mobile/Cart/android.widget.CartCancelConfirmBtn'), 5)

Mobile.verifyElementVisible(findTestObject('Mobile/Home/android.view.SearchCustomerBtn'), 5)

Mobile.closeApplication()

