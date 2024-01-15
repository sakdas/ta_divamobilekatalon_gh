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

CustomKeywords.'com.test.decathlon.ürünAraEkle.urunAraEkle'(urun)

'sepet ikonuna tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000004-New/android.widget.TextView - (1)'), 0)

'üç noktaya tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000004-New/android.widget.TextView - (2)'), 0)

'satışı askıya al\'a tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000004-New/android.widget.TextView - Sat Askya Al'), 0)

Mobile.setText(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000004-New/android.widget.EditText - Mteri bilgisi'), 'denemeMusteri', 
    0)

'askıya alındı'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000004-New/android.widget.Button - ASKIYA AL'), 0)

'askı simgesine tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000004-New/android.widget.ImageView'), 0)

'filtre ikonuna tap'
Mobile.tap(findTestObject('zWillBeDeleted/Filtreleme/FiltreButonu'), 0)

'son 1 saat seçildi'
Mobile.tap(findTestObject('zWillBeDeleted/Filtreleme/Son1Saat'), 0)

'filtreyi uyguladık'
Mobile.tap(findTestObject('zWillBeDeleted/Filtreleme/FiltreleriUygula'), 0)

'filtre ikonuna tap'
Mobile.tap(findTestObject('zWillBeDeleted/Filtreleme/FiltreButonu'), 0)

'son 15 dakika seçildi'
Mobile.tap(findTestObject('zWillBeDeleted/Filtreleme/Son15dk'), 0)

'filtre uygulandı'
Mobile.tap(findTestObject('zWillBeDeleted/Filtreleme/FiltreleriUygula'), 0)

'filtre ikonuna tap'
Mobile.tap(findTestObject('zWillBeDeleted/Filtreleme/FiltreButonu'), 0)

'bugün seçildi'
Mobile.tap(findTestObject('zWillBeDeleted/Filtreleme/Bugün'), 0)

'filtre uygulandı'
Mobile.tap(findTestObject('zWillBeDeleted/Filtreleme/FiltreleriUygula'), 0)

'askıdaki ürünü sileceğiz'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000004-New/android.widget.TextView - denemeMusteri'), 0)

'askıdan çağırıyoruz'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000004-New/android.widget.TextView - ASKIDAN AIR'), 0)

'askıdan çağırdık'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000004-New/android.widget.Button - ASKIDAN AIR'), 0)

'üç noktaya tap'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/BasketPage/SeceneklerButonu'), 0)

'satışı iptal ediyoruz'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000004-New/android.widget.TextView - Sat ptal Et'), 0)

Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000004-New/android.widget.Button - TAMAM'), 0)

'geri tuşuna bastık'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000004-New/android.widget.ImageView (1)'), 0)

'geri tuşuna bastık'
Mobile.tap(findTestObject('Object Repository/zWillBeDeleted/Decathlon/T00000004-New/android.widget.ImageView (2)'), 0)

'hamburger menuye tap'
CustomKeywords.'decathlon.Logout.goLogout'()


