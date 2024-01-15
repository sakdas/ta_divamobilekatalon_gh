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

Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000010/android.widget.EditText'), 'GSAY28', 0)

Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T0000010/android.widget.EditText (1)'), 'decathlon', 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/LoginObjects/SignOnButton'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/zWillBeDeleted/Home/MusteriAra'), 10)

Mobile.closeApplication()

Mobile.startApplication('C:\\Users\\Hasan.Oral\\OneDrive - Logo\\Desktop\\app-DivaMobileSales-universal-release.apk', true)

Mobile.verifyElementExist(findTestObject('Object Repository/zWillBeDeleted/Home/MusteriAra'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/zWillBeDeleted/Home/HamburgerMenuButton'), 10)

Mobile.verifyElementExist(findTestObject('Object Repository/zWillBeDeleted/Home/MusteriSekmesi'), 10)

Mobile.tap(findTestObject('zWillBeDeleted/Home/HamburgerMenuButton'), 0)

Mobile.tap(findTestObject('zWillBeDeleted/LoginObjects/SignOutButton'), 0)

Mobile.closeApplication()

