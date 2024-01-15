import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
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

Mobile.tap(findTestObject('Mobile/Intro/android.widget.DivaRetailUrlTxt'), 3)

Mobile.setText(findTestObject('Mobile/Intro/android.widget.DivaRetailUrlTxt'), GlobalVariable.DRURL, 3)

Mobile.tap(findTestObject('Mobile/Intro/android.widget.HomeContinue'), 1)

Mobile.setText(findTestObject('Mobile/LoginPage/android.widget.Username'), GlobalVariable.DRKasiyer1, 0)

Mobile.setText(findTestObject('Mobile/LoginPage/android.widget.Password'), GlobalVariable.DRKasiyerParola, 0)

Mobile.tap(findTestObject('Mobile/LoginPage/android.view.LoginButton'), 6)

Mobile.tap(findTestObject('Mobile/Home/android.view.SearchProductBtn'), 6)

Mobile.setText(findTestObject('Mobile/SearchProduct/android.widget.SearchProductText'), '5901234500036', 5)

Mobile.tap(findTestObject('Mobile/SearchProduct/android.view.ProductListAddBtn'), 3)

Mobile.tap(findTestObject('Mobile/SearchProduct/android.view.ProductListAddBtn'), 3)

Mobile.tap(findTestObject('Mobile/Home/android.view.BottomCustomer'), 3)

Mobile.tap(findTestObject('Mobile/SearchCustomer/android.view.SearchBox'), 4)

Mobile.setText(findTestObject('Mobile/SearchCustomer/android.widget.CustomerSearchBox3'), 'İbrahim Akdaş', 5)

Mobile.tap(findTestObject('Mobile/SearchCustomer/android.view.CustomerSelectBtn'), 5)

Mobile.tap(findTestObject('Mobile/SearchCustomer/android.view.CustomerSelectBtn'), 5)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.pressHome()

Mobile.startExistingApplication('com.divamobilesales', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Mobile/Cart/android.widget.PaslanmazCelikTencereSetiTxt'), 5)

Mobile.tap(findTestObject('Mobile/Home/android.view.BottomCustomer'), 5)

Mobile.verifyElementText(findTestObject('Mobile/RegisterCustomer/android.widget.EditText.NameSurname'), 'İbrahim Akdaş')

Mobile.closeApplication()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

