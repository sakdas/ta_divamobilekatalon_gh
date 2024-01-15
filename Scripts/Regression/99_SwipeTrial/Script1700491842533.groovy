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

Mobile.tap(findTestObject('Mobile/Intro/android.widget.DivaRetailUrlTxt'), 5)

Mobile.setText(findTestObject('Mobile/Intro/android.widget.DivaRetailUrlTxt'), GlobalVariable.DRURL, 3)

Mobile.tap(findTestObject('Mobile/Intro/android.widget.HomeContinue'), 5)

Mobile.setText(findTestObject('Mobile/LoginPage/android.widget.Username'), GlobalVariable.DRKasiyer1, 3)

Mobile.setText(findTestObject('Mobile/LoginPage/android.widget.Password'), GlobalVariable.DRKasiyerParola, 3)

Mobile.tap(findTestObject('Mobile/LoginPage/android.view.LoginButton'), 6)

Mobile.tap(findTestObject('Mobile/Home/android.widget.Top.InvoiceQueueBtn'), 6)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.toolkit.toolkit.swipeElement'('Mobile/CartQueue/android.view.ViewGroup.CartQueueElement1')

Mobile.tap(findTestObject('Mobile/CartQueue/android.view.SwipeCancelHoldDocumentBtn'), 4)

Mobile.tap(findTestObject('Mobile/CartQueue/android.widget.SwipeCancelHoldDocumentConfirmBtn'), 4)

//Bu noktaya bir assertion eklemek gerek, sepetin gerçekten iptal edilip edilmedi ile ilgili
//ama pratik bir yöntem düşünemedim. İncelemek gerek.
Mobile.checkElement(findTestObject('Mobile/Home/android.view.BottomCart'), 4)

Mobile.closeApplication()

