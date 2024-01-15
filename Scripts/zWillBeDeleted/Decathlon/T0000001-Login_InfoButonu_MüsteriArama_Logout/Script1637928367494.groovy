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

Mobile.startApplication('C:\\Users\\Hasan.Oral\\OneDrive - Logo\\Desktop\\app-DivaMobileSales-universal-release.apk', true)

'Info tuşuna tap işlemi'
Mobile.tap(findTestObject('LoginObjects/infoButton'), 0)

'Info\'ya bastıkttan sonra bilgiler (bu kısımda assertion için verify yap - IP bilgisinin olduğu component ile olabilir)'
Mobile.verifyElementExist(findTestObject('zWillBeDeleted/LoginObjects/Verify_Info'), 10)

Mobile.tap(findTestObject('zWillBeDeleted/LoginObjects/BackButton2'), 0)

WebUI.delay(2)

CustomKeywords.'decathlon.Login.DecLogin'(username, password)

Mobile.verifyElementNotExist(findTestObject('zWillBeDeleted/LoginObjects/Verify_Login'), 10)

CustomKeywords.'customer.Customer.SearchCustomer'(searchText)

Mobile.verifyElementExist(findTestObject('zWillBeDeleted/MusteriArama/Musteri_test ceren'), 10)

Mobile.tap(findTestObject('zWillBeDeleted/MusteriArama/Musteri_test ceren'), 0)

Mobile.tap(findTestObject('zWillBeDeleted/MusteriArama/DivaMusterisiDetay_GeriButonu'), 0)

Mobile.tap(findTestObject('zWillBeDeleted/MusteriArama/DivaMusteriAra_GeriButonu'), 0)

Mobile.tap(findTestObject('zWillBeDeleted/MusteriArama/MusteriAra_GeriButonu'), 0)

Mobile.tap(findTestObject('zWillBeDeleted/Home/HamburgerMenuButton'), 0)

Mobile.tap(findTestObject('zWillBeDeleted/LoginObjects/SignOutButton'), 0)

Mobile.closeApplication()