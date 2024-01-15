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

Mobile.verifyElementNotExist(findTestObject('Object Repository/zWillBeDeleted/LoginObjects/Verify_Login'), 0)

CustomKeywords.'com.test.decathlon.ürünAraEkle.urunAra'(urun)

'ürün detaylarını görüntüledik'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000002-New/android.view.ViewGroup'), 0)

'ürün görseli görüntülenmesi'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000002-New/android.widget.ImageView'), 0)

'ürün görseli kapatıldı.'
Mobile.tap(findTestObject('zWillBeDeleted/UrunArama/UrunEklemeButonu'), 0)

'ürün sepete eklendi'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000002-New/android.widget.TextView - SEPETE EKLE'), 0)

'sepet ikonuna tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Home/SepetSimgesi'), 0)

'üç nokta tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/BasketPage/SeceneklerButonu'), 0)

'satış iptal ediliyor'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000002-New/android.widget.TextView - Sat ptal Et'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000002-New/android.widget.Button - TAMAM'), 0)

//*****************************************************************************************************

//Ürünü aradık.
CustomKeywords.'com.test.decathlon.ürünAraEkle.urunAra'(urun2)

'ürün detaylarını görüntüledik'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000002-New/android.view.ViewGroup'), 0)

'ürün görseli görüntülenmesi'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000002-New/android.widget.ImageView'), 0)

'ürün görseli kapatıldı.'
Mobile.tap(findTestObject('zWillBeDeleted/UrunArama/UrunEklemeButonu'), 0)

'ürün sepete eklendi'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000002-New/android.widget.TextView - SEPETE EKLE'), 0)

'random variable ile sepete eklenme'
CustomKeywords.'com.test.random.randomVars.randomSerialNumber'()

'üç nokta tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/BasketPage/SeceneklerButonu'), 0)

'satış iptal ediliyor'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000002-New/android.widget.TextView - Sat ptal Et'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000002-New/android.widget.Button - TAMAM'), 0)

'hamburger menuye tap'
CustomKeywords.'decathlon.Logout.goLogout'()


