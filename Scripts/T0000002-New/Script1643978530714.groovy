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

Mobile.startApplication('C:\\Users\\Hasan.Oral\\OneDrive - Logo\\Desktop\\1101_decahtlon.apk', true)

CustomKeywords.'decathlon.Login.DecLogin'(username, password)

CustomKeywords.'com.test.decathlon.ürünAraEkle.urunAra'(urun)

'ürün detayları görüntüleme'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000002-New2/android.widget.TextView - BUYUK POSET'), 0)

'ürün resmi görüntülendi.'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000002-New2/android.widget.ImageView'), 0)

'ürün resmi kapatıldı'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000002-New2/android.widget.TextView -'), 0)

'ürün sepete eklendi'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000002-New2/android.widget.TextView - SEPETE EKLE'), 0)

'sepet ikonuna tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Home/SepetSimgesi'), 0)

'üç noktaya tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/BasketPage/SeceneklerButonu'), 0)

'satışı iptal ediyoruz'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000002-New2/android.widget.TextView - Sat ptal Et'), 0)

Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000002-New2/android.widget.Button - TAMAM'), 0)

CustomKeywords.'com.test.decathlon.ürünAraEkle.urunAra'(urun2)

'ürün detayı görüntüleme'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000002-New2/android.widget.TextView - Light 500 Su Geirmez Avc Mon'), 
    0)

'ürün görseli görüntüleme'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000002-New2/android.widget.ImageView'), 0)

'ürün görseli kapatıldı'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000002-New2/android.widget.TextView - (3)'), 0)

Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000002-New2/android.widget.TextView - SEPETE EKLE'), 0)

CustomKeywords.'com.test.random.randomVars.randomSerialNumber'()

'ürün seri no girildi'

'üç noktaya tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/BasketPage/SeceneklerButonu'), 0)

'satışı iptal ediyoruz'
Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000002-New2/android.widget.TextView - Sat ptal Et'), 0)

Mobile.tap(findTestObject('zWillBeDeleted/Decathlon/T0000002-New2/android.widget.Button - TAMAM'), 0)

'hamgurger menuye tap'
CustomKeywords.'decathlon.Logout.goLogout'()


