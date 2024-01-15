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


CustomKeywords.'decathlon.Login.DecLogin'(username, password)


'sepet ikonuna tap'
Mobile.tap(findTestObject('zWillBeDeleted/Home/SepetSimgesi'), 0)

'barkod input'
Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/BasketPage/BarkodOkut_EditText'), '01036084190004562122244466', 
    0)

'+ butonuna tap'
Mobile.tap(findTestObject('zWillBeDeleted/BasketPage/UrunEkleButonu'), 0)

'fiyat girişi'
Mobile.setText(findTestObject('zWillBeDeleted/Decathlon/T0000005/android.widget.EditText - 0.00'), '0.50', 0)

'TAMAM butonu'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000005/android.widget.TextView - TAMAM'), 0)

Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000005/android.view.ViewGroup'), 0)

'üç noktaya tap'
Mobile.tap(findTestObject('zWillBeDeleted/BasketPage/SeceneklerButonu'), 0)

'satışı iptal et tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/BasketPage/SatisIptalEt_SecenekMenusunden'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/BasketPage/SatisIptalOnay'), 0)

'hamburger menuye tap işlemi'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Home/HamburgerMenuButton'), 0)

'logout olundu'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/LoginObjects/SignOutButton'), 0)

Mobile.closeApplication()

