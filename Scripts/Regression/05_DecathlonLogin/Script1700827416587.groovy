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

Mobile.setText(findTestObject('Mobile/Intro/android.widget.DivaRetailUrlTxt'), GlobalVariable.DRDecathlonURL, 5)

Mobile.tap(findTestObject('Mobile/Intro/android.widget.HomeContinue'), 5)

Mobile.verifyElementVisible(findTestObject('Mobile/LoginDecathlon/android.widget.DecathlonLoginScreenLogoImg'), 5)

Mobile.setText(findTestObject('Mobile/LoginDecathlon/android.widget.UsernameTxt'), GlobalVariable.DRDecathlonKasiyer1, 5)

Mobile.setText(findTestObject('Mobile/LoginDecathlon/android.widget.PasswordTxt'), GlobalVariable.DRDecathlonKasiyerParola, 
    5)

Mobile.tap(findTestObject('Mobile/LoginDecathlon/android.view.SignOnBtn'), 5)

Mobile.closeApplication()

